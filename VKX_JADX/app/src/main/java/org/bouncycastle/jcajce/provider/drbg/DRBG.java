package org.bouncycastle.jcajce.provider.drbg;

import defpackage.AbstractC10000l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC9008l;
import defpackage.C0361l;
import defpackage.C12418l;
import defpackage.C14735l;
import defpackage.C17711l;
import defpackage.C5991l;
import defpackage.C8339l;
import defpackage.InterfaceC13380l;
import defpackage.InterfaceC6118l;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static final EntropyDaemon ENTROPY_DAEMON = new EntropyDaemon();
    private static Thread ENTROPY_THREAD = null;

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class URLSeededEntropySourceProvider implements InterfaceC6118l {
        private final InputStream seedStream;

        public URLSeededEntropySourceProvider(final URL url) {
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        C8339l.smaato("unable to open random source");
                        return null;
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int privilegedRead(final byte[] bArr, final int i, final int i2) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededEntropySourceProvider.this.seedStream.read(bArr, i, i2));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // defpackage.InterfaceC6118l
        public InterfaceC13380l get(int i) {
            return new IncrementalEntropySource(i) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.3
                private final int numBytes;
                final /* synthetic */ int val$bitsRequired;

                {
                    this.val$bitsRequired = i;
                    this.numBytes = (i + 7) / 8;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
                public int entropySize() {
                    return this.val$bitsRequired;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
                public byte[] getEntropy(long j) throws InterruptedException {
                    int i2 = this.numBytes;
                    byte[] bArr = new byte[i2];
                    int i3 = 0;
                    while (i3 != i2) {
                        int iPrivilegedRead = URLSeededEntropySourceProvider.this.privilegedRead(bArr, i3, i2 - i3);
                        if (iPrivilegedRead <= -1) {
                            break;
                        }
                        i3 += iPrivilegedRead;
                        DRBG.sleep(j);
                    }
                    if (i3 == i2) {
                        return bArr;
                    }
                    throw new InternalError("unable to fully read random source");
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
                public boolean isPredictionResistant() {
                    return true;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
                public byte[] getEntropy() {
                    try {
                        return getEntropy(0L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        C8339l.smaato("initial entropy fetch interrupted");
                        return null;
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z) {
        if (AbstractC8151l.loadAd("org.bouncycastle.drbg.entropysource") != null) {
            return createBaseRandom(z, 128, createEntropySource());
        }
        if (!AbstractC8151l.crashlytics("org.bouncycastle.drbg.entropy_thread")) {
            return createBaseRandom(z, PSKKeyManager.MAX_KEY_LENGTH_BYTES, new InterfaceC6118l() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
                @Override // defpackage.InterfaceC6118l
                public InterfaceC13380l get(int i) {
                    return new OneShotHybridEntropySource(i);
                }
            });
        }
        initEntropyThread();
        return createBaseRandom(z, PSKKeyManager.MAX_KEY_LENGTH_BYTES, new InterfaceC6118l() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // defpackage.InterfaceC6118l
            public InterfaceC13380l get(int i) {
                return new HybridEntropySource(DRBG.ENTROPY_DAEMON, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC6118l createCoreEntropySourceProvider() {
        if (!((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", null) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue()) {
            return createInitialEntropySource();
        }
        SecureRandom secureRandom = (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.4
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", null).invoke(null, null);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        return secureRandom == null ? createInitialEntropySource() : new IncrementalEntropySourceProvider(secureRandom, true);
    }

    private static InterfaceC6118l createEntropySource() {
        final String strLoadAd = AbstractC8151l.loadAd("org.bouncycastle.drbg.entropysource");
        return (InterfaceC6118l) AccessController.doPrivileged(new PrivilegedAction<InterfaceC6118l>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.6
            @Override // java.security.PrivilegedAction
            public InterfaceC6118l run() {
                try {
                    return (InterfaceC6118l) ClassUtil.loadClass(DRBG.class, strLoadAd).newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("entropy source " + strLoadAd + " not created: " + e.getMessage(), e);
                }
            }
        });
    }

    private static InterfaceC6118l createInitialEntropySource() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.5
            @Override // java.security.PrivilegedAction
            public String run() {
                return Security.getProperty("securerandom.source");
            }
        });
        if (str == null) {
            return new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
        }
        try {
            return new URLSeededEntropySourceProvider(new URL(str));
        } catch (Exception unused) {
            return new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
        }
    }

    private static final Object[] findSource() {
        int i = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        byte[] bArrCrashlytics = AbstractC9008l.crashlytics("Default");
        byte[] bArr2 = new byte[8];
        AbstractC10000l.Signature(Thread.currentThread().getId(), bArr2, 0);
        byte[] bArr3 = new byte[8];
        AbstractC10000l.Signature(System.currentTimeMillis(), bArr3, 0);
        return AbstractC14024l.subs(bArrCrashlytics, bArr, bArr2, bArr3);
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        byte[] bArrCrashlytics = AbstractC9008l.crashlytics("Nonce");
        byte[] bArr2 = new byte[8];
        AbstractC10000l.pro(Thread.currentThread().getId(), bArr2, 0);
        byte[] bArr3 = new byte[8];
        AbstractC10000l.pro(System.currentTimeMillis(), bArr3, 0);
        return AbstractC14024l.subs(bArrCrashlytics, bArr, bArr2, bArr3);
    }

    private static byte[] generatePersonalizationString(boolean z, InterfaceC13380l interfaceC13380l) {
        byte[] entropy = interfaceC13380l.getEntropy();
        return z ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int get256BitsEffectiveEntropySize() {
        return ((AbstractC8151l.yandex(282, "org.bouncycastle.drbg.effective_256bits_entropy") + 7) / 8) * 8;
    }

    private static void initEntropyThread() {
        EntropyDaemon entropyDaemon = ENTROPY_DAEMON;
        synchronized (entropyDaemon) {
            try {
                if (ENTROPY_THREAD == null) {
                    Thread thread = new Thread(entropyDaemon, "BC Entropy Daemon");
                    ENTROPY_THREAD = thread;
                    thread.setDaemon(true);
                    ENTROPY_THREAD.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j) throws InterruptedException {
        if (j != 0) {
            Thread.sleep(j);
        }
    }

    public static class HybridEntropySource implements InterfaceC13380l {
        private final byte[] additionalInput;
        private final int bytesRequired;
        private final C14735l drbg;
        private final SignallingEntropySource entropySource;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public HybridEntropySource(EntropyDaemon entropyDaemon, int i) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            byte[] bArr = new byte[8];
            AbstractC10000l.Signature(System.currentTimeMillis(), bArr, 0);
            this.additionalInput = bArr;
            InterfaceC6118l interfaceC6118lCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i + 7) / 8;
            SignallingEntropySource signallingEntropySource = new SignallingEntropySource(entropyDaemon, atomicBoolean, interfaceC6118lCreateCoreEntropySourceProvider, DRBG.get256BitsEffectiveEntropySize());
            this.entropySource = signallingEntropySource;
            InterfaceC6118l interfaceC6118l = new InterfaceC6118l() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridEntropySource.1
                @Override // defpackage.InterfaceC6118l
                public InterfaceC13380l get(int i2) {
                    return HybridEntropySource.this.entropySource;
                }
            };
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(AbstractC9008l.crashlytics("Bouncy Castle Hybrid Entropy Source"));
            this.drbg = new C14735l(interfaceC6118l.get(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new C5991l(new C0361l(new C17711l()), signallingEntropySource.getEntropy(), bArrCrashlytics, 3), false);
        }

        @Override // defpackage.InterfaceC13380l
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // defpackage.InterfaceC13380l
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 128) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.yandex(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        public boolean isPredictionResistant() {
            return true;
        }

        public static class SignallingEntropySource implements IncrementalEntropySource {
            private final int byteLength;
            private final EntropyDaemon entropyDaemon;
            private final IncrementalEntropySource entropySource;
            private final AtomicBoolean seedAvailable;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            public SignallingEntropySource(EntropyDaemon entropyDaemon, AtomicBoolean atomicBoolean, InterfaceC6118l interfaceC6118l, int i) {
                this.entropyDaemon = entropyDaemon;
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) interfaceC6118l.get(i);
                this.byteLength = (i + 7) / 8;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j) {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j);
                }
                this.scheduled.set(false);
                return bArr;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                this.entropyDaemon.addTask(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    C8339l.smaato("initial entropy fetch interrupted");
                    return null;
                }
            }
        }
    }

    public static class OneShotHybridEntropySource implements InterfaceC13380l {
        private final byte[] additionalInput;
        private final int bytesRequired;
        private final C14735l drbg;
        private final OneShotSignallingEntropySource entropySource;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public OneShotHybridEntropySource(int i) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            byte[] bArr = new byte[8];
            AbstractC10000l.Signature(System.currentTimeMillis(), bArr, 0);
            this.additionalInput = bArr;
            InterfaceC6118l interfaceC6118lCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i + 7) / 8;
            OneShotSignallingEntropySource oneShotSignallingEntropySource = new OneShotSignallingEntropySource(atomicBoolean, interfaceC6118lCreateCoreEntropySourceProvider, DRBG.get256BitsEffectiveEntropySize());
            this.entropySource = oneShotSignallingEntropySource;
            InterfaceC6118l interfaceC6118l = new InterfaceC6118l() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.OneShotHybridEntropySource.1
                @Override // defpackage.InterfaceC6118l
                public InterfaceC13380l get(int i2) {
                    return OneShotHybridEntropySource.this.entropySource;
                }
            };
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(AbstractC9008l.crashlytics("Bouncy Castle Hybrid Entropy Source"));
            this.drbg = new C14735l(interfaceC6118l.get(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new C5991l(new C0361l(new C17711l()), oneShotSignallingEntropySource.getEntropy(), bArrCrashlytics, 3), false);
        }

        @Override // defpackage.InterfaceC13380l
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // defpackage.InterfaceC13380l
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 1024) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.yandex(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        public boolean isPredictionResistant() {
            return true;
        }

        public static class OneShotSignallingEntropySource implements IncrementalEntropySource {
            private final int byteLength;
            private final IncrementalEntropySource entropySource;
            private final AtomicBoolean seedAvailable;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            public OneShotSignallingEntropySource(AtomicBoolean atomicBoolean, InterfaceC6118l interfaceC6118l, int i) {
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) interfaceC6118l.get(i);
                this.byteLength = (i + 7) / 8;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j) {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j);
                }
                this.scheduled.set(false);
                return bArr;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                Thread thread = new Thread(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
                thread.setDaemon(true);
                thread.start();
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource, defpackage.InterfaceC13380l
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    C8339l.smaato("initial entropy fetch interrupted");
                    return null;
                }
            }
        }
    }

    private static SecureRandom createBaseRandom(boolean z, int i, InterfaceC6118l interfaceC6118l) {
        InterfaceC13380l interfaceC13380l = interfaceC6118l.get(i);
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(generatePersonalizationString(z, interfaceC13380l));
        return new C14735l(interfaceC6118l.get(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new C12418l(new C17711l(), interfaceC13380l.getEntropy(), bArrCrashlytics, 4), z);
    }
}
