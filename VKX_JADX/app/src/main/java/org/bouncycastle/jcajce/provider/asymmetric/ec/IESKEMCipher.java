package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC16336l;
import defpackage.AbstractC17055l;
import defpackage.AbstractC2017l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC8859l;
import defpackage.C0045l;
import defpackage.C0361l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1838l;
import defpackage.C18725l;
import defpackage.C2193l;
import defpackage.C2657l;
import defpackage.C4148l;
import defpackage.C4422l;
import defpackage.C5911l;
import defpackage.C7633l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8374l;
import defpackage.C8470l;
import defpackage.C8582l;
import defpackage.InterfaceC11004l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC17797l;
import defpackage.InterfaceC2232l;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;

/* JADX INFO: loaded from: classes3.dex */
public class IESKEMCipher extends BaseCipherSpi {
    private static final C2193l converter = new C2193l();
    private final C4422l agreement;
    private C8582l engine;
    private AbstractC17055l engineSpec;
    private final InterfaceC2232l hMac;
    private int ivLength;
    private final C0045l kdf;
    private AbstractC8831l key;
    private final int macKeyLength;
    private final int macLength;
    private SecureRandom random;
    private final InterfaceC12575l helper = new C7633l();
    private int state = -1;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private AlgorithmParameters engineParam = null;
    private boolean dhaesMode = false;
    private AbstractC8831l otherKeyParameter = null;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.IESKEMCipher$1, reason: invalid class name */
    public class AnonymousClass1 implements InterfaceC17797l {
        final /* synthetic */ boolean val$usePointCompression;

        public AnonymousClass1(boolean z) {
            this.val$usePointCompression = z;
        }

        @Override // defpackage.InterfaceC17797l
        public byte[] getEncoded(AbstractC8831l abstractC8831l) {
            return ((C4148l) abstractC8831l).f8515l.admob(this.val$usePointCompression);
        }
    }

    public static class KEM extends IESKEMCipher {
        public KEM(InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2, int i, int i2) {
            super(new C4422l(), new C0045l(interfaceC16922l), new C0361l(interfaceC16922l2), i, i2);
        }
    }

    public static class KEMwithSHA256 extends KEM {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KEMwithSHA256() {
            super(new C2657l(), new C2657l(), 32, 16);
            int i = AbstractC14832l.yandex;
        }
    }

    public IESKEMCipher(C4422l c4422l, C0045l c0045l, InterfaceC2232l interfaceC2232l, int i, int i2) {
        this.agreement = c4422l;
        this.kdf = c0045l;
        this.hMac = interfaceC2232l;
        this.macKeyLength = i;
        this.macLength = i2;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        this.buffer.toByteArray();
        this.buffer.reset();
        AbstractC8831l abstractC8831l = this.key;
        C7838l c7838l = ((AbstractC2017l) abstractC8831l).f4542l;
        int i3 = this.state;
        if (i3 == 1 || i3 == 3) {
            SecureRandom secureRandom = this.random;
            c7838l.f16362l.bitLength();
            if (secureRandom == null) {
                AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            AbstractC16336l.amazon(c7838l.f16360l);
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            throw null;
        }
        if (i3 != 2 && i3 != 4) {
            throw new IllegalStateException("cipher not initialised");
        }
        C8374l c8374l = (C8374l) abstractC8831l;
        AbstractC11918l abstractC11918l = c8374l.f4542l.f16360l;
        int iSmaato = (abstractC11918l.smaato() + 7) / 8;
        if (bArr[i] == 4) {
            iSmaato *= 2;
        }
        int i4 = iSmaato + 1;
        int i5 = i2 - (this.macLength + i4);
        AbstractC8859l abstractC8859lMopub = abstractC11918l.mopub(AbstractC14024l.vip(i, i4 + i, bArr));
        this.agreement.init(this.key);
        C2193l c2193l = converter;
        BigInteger bigIntegerYandex = this.agreement.yandex(new C4148l(abstractC8859lMopub, c8374l.f4542l));
        AbstractC11918l abstractC11918l2 = c7838l.f16360l;
        c2193l.getClass();
        C2193l.yandex(abstractC11918l2.firebase(), bigIntegerYandex);
        byte[] bArr2 = new byte[i5 + this.macKeyLength];
        throw null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof InterfaceC11004l) {
            return ((InterfaceC11004l) key).getParameters().f25097l.smaato();
        }
        C8339l.metrica("not an EC key");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        AbstractC8831l abstractC8831l = this.key;
        if (abstractC8831l == null) {
            C8339l.smaato("cipher not initialised");
            return 0;
        }
        int i2 = this.engine.crashlytics.f1426l;
        int iSmaato = this.otherKeyParameter == null ? ((((AbstractC2017l) abstractC8831l).f4542l.f16360l.smaato() + 7) / 8) * 2 : 0;
        int size = this.buffer.size() + i;
        C8470l c8470l = this.engine.amazon;
        if (c8470l != null) {
            int i3 = this.state;
            if (i3 != 1 && i3 != 3) {
                if (i3 != 2 && i3 != 4) {
                    C8339l.smaato("cipher not initialised");
                    return 0;
                }
                size = (size - i2) - iSmaato;
            }
            size = c8470l.crashlytics(size);
        }
        int i4 = this.state;
        if (i4 == 1 || i4 == 3) {
            return i2 + iSmaato + size;
        }
        if (i4 == 2 || i4 == 4) {
            return size;
        }
        C8339l.smaato("cipher not initialised");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException {
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec != null) {
            C18725l.loadAd();
            return;
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof PublicKey)) {
                C18073l.smaato("must be passed recipient's public EC key for encryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            C18073l.smaato("must be passed EC key");
            return;
        } else {
            if (!(key instanceof PrivateKey)) {
                C18073l.smaato("must be passed recipient's private EC key for decryption");
                return;
            }
            abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = abstractC8831lGeneratePublicKeyParameter;
        this.random = secureRandom;
        this.state = i;
        this.buffer.reset();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(AbstractC14814l.startapp("can't support mode ", str));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException("padding not available with IESCipher");
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            C18262l.startapp(e.getMessage(), "cannot handle supplied parameter spec: ");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(C1838l.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(AbstractC5020l.ads(e, new StringBuilder("cannot recognise parameters: ")));
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }
}
