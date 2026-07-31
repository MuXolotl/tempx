package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC5720l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.C0272l;
import defpackage.C0562l;
import defpackage.C0707l;
import defpackage.C0800l;
import defpackage.C10314l;
import defpackage.C10348l;
import defpackage.C10352l;
import defpackage.C10423l;
import defpackage.C10556l;
import defpackage.C10754l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C11758l;
import defpackage.C12963l;
import defpackage.C13237l;
import defpackage.C13463l;
import defpackage.C13886l;
import defpackage.C13975l;
import defpackage.C15461l;
import defpackage.C15655l;
import defpackage.C16023l;
import defpackage.C16303l;
import defpackage.C16795l;
import defpackage.C17651l;
import defpackage.C18073l;
import defpackage.C18390l;
import defpackage.C18617l;
import defpackage.C2283l;
import defpackage.C2294l;
import defpackage.C2862l;
import defpackage.C4998l;
import defpackage.C5332l;
import defpackage.C6114l;
import defpackage.C6717l;
import defpackage.C7203l;
import defpackage.C7244l;
import defpackage.C7383l;
import defpackage.C7727l;
import defpackage.C7963l;
import defpackage.C7972l;
import defpackage.C8339l;
import defpackage.C8470l;
import defpackage.C8936l;
import defpackage.C9484l;
import defpackage.C9786l;
import defpackage.C9912l;
import defpackage.Cstrictfp;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC12684l;
import defpackage.InterfaceC9719l;
import defpackage.appmetrica;
import defpackage.firebase;
import defpackage.isPro;
import defpackage.remoteconfig;
import defpackage.smaato;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class[] availableSpecs = {RC2ParameterSpec.class, RC5ParameterSpec.class, GcmSpecUtil.gcmSpecClass, C7244l.class, IvParameterSpec.class, PBEParameterSpec.class};
    private remoteconfig aeadParams;
    private InterfaceC10952l baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private C0272l ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private firebase cipher;

        static {
            Class clsLoadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = clsLoadClass != null ? findExceptionConstructor(clsLoadClass) : null;
        }

        public AEADGenericBlockCipher(firebase firebaseVar) {
            this.cipher = firebaseVar;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (C10352l e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            firebase firebaseVar = this.cipher;
            return firebaseVar instanceof isPro ? ((isPro) firebaseVar).getUnderlyingCipher().getAlgorithmName() : firebaseVar.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public InterfaceC10952l getUnderlyingCipher() {
            firebase firebaseVar = this.cipher;
            if (firebaseVar instanceof isPro) {
                return ((isPro) firebaseVar).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, InterfaceC9719l interfaceC9719l) {
            this.cipher.init(z, interfaceC9719l);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.yandex(i, i2, bArr);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private AbstractC5720l cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        public BufferedFPEBlockCipher(AbstractC5720l abstractC5720l) {
            this.cipher = abstractC5720l;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) {
            try {
                AbstractC5720l abstractC5720l = this.cipher;
                this.eOut.getBuf();
                this.eOut.size();
                abstractC5720l.getClass();
                throw new IllegalStateException("FPE engine not initialized");
            } catch (Throwable th) {
                this.eOut.erase();
                throw th;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.yandex();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.eOut.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public InterfaceC10952l getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, InterfaceC9719l interfaceC9719l) {
            this.cipher.loadAd(z, interfaceC9719l);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws IOException {
            this.eOut.write(b);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
            this.eOut.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i);

        String getAlgorithmName();

        int getOutputSize(int i);

        InterfaceC10952l getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, InterfaceC9719l interfaceC9719l);

        int processByte(byte b, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(int i, isPro ispro) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = i;
        this.baseEngine = ispro.getUnderlyingCipher();
        this.ivLength = ispro.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.license();
        this.cipher = new AEADGenericBlockCipher(ispro);
    }

    private InterfaceC9719l adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, InterfaceC9719l interfaceC9719l) {
        if (interfaceC9719l instanceof C0272l) {
            InterfaceC9719l interfaceC9719l2 = ((C0272l) interfaceC9719l).f1272l;
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                C0272l c0272l = new C0272l(interfaceC9719l2, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = c0272l;
                return c0272l;
            }
            if (algorithmParameterSpec instanceof C7244l) {
                C7244l c7244l = (C7244l) algorithmParameterSpec;
                byte[] bArr = c7244l.f15069l;
                C2294l c2294l = new C2294l(interfaceC9719l, AbstractC14024l.crashlytics(c7244l.f15068l));
                if (AbstractC14024l.crashlytics(bArr) == null || this.ivLength == 0) {
                    return c2294l;
                }
                C0272l c0272l2 = new C0272l(interfaceC9719l2, AbstractC14024l.crashlytics(bArr));
                this.ivParam = c0272l2;
                return c0272l2;
            }
        } else {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                C0272l c0272l3 = new C0272l(interfaceC9719l, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = c0272l3;
                return c0272l3;
            }
            if (algorithmParameterSpec instanceof C7244l) {
                C7244l c7244l2 = (C7244l) algorithmParameterSpec;
                byte[] bArr2 = c7244l2.f15069l;
                C2294l c2294l2 = new C2294l(interfaceC9719l, AbstractC14024l.crashlytics(c7244l2.f15068l));
                return (AbstractC14024l.crashlytics(bArr2) == null || this.ivLength == 0) ? c2294l2 : new C0272l(c2294l2, AbstractC14024l.crashlytics(bArr2));
            }
        }
        return interfaceC9719l;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, ShortBufferException {
        byte[] bArr3;
        int i4;
        int iProcessBytes;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                bArr3 = bArr2;
                i4 = i3;
                iProcessBytes = this.cipher.processBytes(bArr, i, i2, bArr3, i4);
            } catch (C7727l e) {
                throw new IllegalBlockSizeException(e.getMessage());
            } catch (C10314l e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            bArr3 = bArr2;
            i4 = i3;
            iProcessBytes = 0;
        }
        return iProcessBytes + this.cipher.doFinal(bArr3, i4 + iProcessBytes);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        InterfaceC10952l interfaceC10952l = this.baseEngine;
        if (interfaceC10952l == null) {
            return -1;
        }
        return interfaceC10952l.license();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        remoteconfig remoteconfigVar = this.aeadParams;
        if (remoteconfigVar != null) {
            return AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
        }
        C0272l c0272l = this.ivParam;
        if (c0272l != null) {
            return c0272l.f1273l;
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = algorithmParametersCreateParametersInstance;
                    algorithmParametersCreateParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance2 = createParametersInstance(InterfaceC0543l.f1880l.inmobi());
                        this.engineParams = algorithmParametersCreateParametersInstance2;
                        algorithmParametersCreateParametersInstance2.init(new C11327l(AbstractC14024l.crashlytics(this.aeadParams.f36560l)).getEncoded());
                    } catch (Exception e) {
                        C10754l.Signature(e);
                        return null;
                    }
                } else {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = algorithmParametersCreateParametersInstance3;
                        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.aeadParams.f36560l);
                        int i = this.aeadParams.f36562l / 8;
                        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArrCrashlytics);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        appmetrica appmetricaVar = new appmetrica(2, 0);
                        appmetricaVar.purchase(new C11327l(bArrCrashlytics2));
                        if (i != 12) {
                            appmetricaVar.purchase(Cstrictfp.m4580private(i));
                        }
                        C11138l c11138l = new C11138l(appmetricaVar);
                        c11138l.f22357l = -1;
                        c11138l.metrica(new C7972l(2, byteArrayOutputStream), true);
                        algorithmParametersCreateParametersInstance3.init(byteArrayOutputStream.toByteArray());
                    } catch (Exception e2) {
                        C10754l.Signature(e2);
                        return null;
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = algorithmParametersCreateParametersInstance4;
                    algorithmParametersCreateParametersInstance4.init(new IvParameterSpec(this.ivParam.f1273l));
                } catch (Exception e3) {
                    C10754l.Signature(e3);
                    return null;
                }
            }
        }
        return this.engineParams;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02fc A[PHI: r6
  0x02fc: PHI (r6v15 lٍٟٞ) = (r6v14 lٍٟٞ), (r6v14 lٍٟٞ), (r6v16 lٍٟٞ), (r6v16 lٍٟٞ) binds: [B:179:0x0388, B:181:0x038c, B:155:0x02ec, B:157:0x02f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:222:0x040f  */
    /* JADX WARN: Code duplicated, block: B:228:0x042c  */
    /* JADX WARN: Code duplicated, block: B:229:0x042e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x0430 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0433 A[Catch: Exception -> 0x047f, IllegalArgumentException -> 0x048a, TRY_ENTER, TryCatch #3 {IllegalArgumentException -> 0x048a, Exception -> 0x047f, blocks: (B:232:0x0433, B:233:0x0449, B:234:0x044a, B:236:0x0455, B:238:0x045b, B:240:0x045f, B:235:0x0450), top: B:252:0x042a }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0450 A[Catch: Exception -> 0x047f, IllegalArgumentException -> 0x048a, TryCatch #3 {IllegalArgumentException -> 0x048a, Exception -> 0x047f, blocks: (B:232:0x0433, B:233:0x0449, B:234:0x044a, B:236:0x0455, B:238:0x045b, B:240:0x045f, B:235:0x0450), top: B:252:0x042a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[PHI: r8
  0x008b: PHI (r8v53 lٍٟٞ) = (r8v61 lٍٟٞ), (r8v62 lٍٟٞ), (r8v63 lٍٟٞ) binds: [B:53:0x0107, B:37:0x00bf, B:29:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x013e A[PHI: r8
  0x013e: PHI (r8v16 lٍٟٞ) = (r8v86 lٍٟٞ), (r8v87 lٍٟٞ) binds: [B:100:0x01f2, B:60:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:232:0x0433, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        InterfaceC9719l interfaceC9719lMakePBEParameters;
        InterfaceC9719l param;
        InterfaceC9719l interfaceC9719l;
        InterfaceC9719l c13886l;
        InterfaceC9719l c9484l;
        C0272l c0272l;
        InterfaceC9719l interfaceC9719l2;
        InterfaceC9719l c6114l;
        GenericBlockCipher genericBlockCipher;
        SecureRandom secureRandomLoadAd;
        remoteconfig remoteconfigVarExtractAeadParameters;
        InterfaceC9719l interfaceC9719lMakePBEParameters2;
        InterfaceC9719l interfaceC9719lMakePBEParameters3;
        InterfaceC9719l interfaceC9719l3;
        InterfaceC10952l interfaceC10952l;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Key for algorithm "), key != null ? key.getAlgorithm() : null, " not suitable for symmetric enryption."));
        }
        if (algorithmParameterSpec == null && (interfaceC10952l = this.baseEngine) != null && interfaceC10952l.getAlgorithmName().startsWith("RC5-64")) {
            C18073l.pro("RC5 requires an RC5ParametersSpec to be passed in.");
            return;
        }
        int i2 = this.scheme;
        if (i2 == 2 || (key instanceof C16023l)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z = secretKey instanceof PBEKey;
                if (z && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        C18073l.pro("PBEKey requires parameters to specify salt");
                        return;
                    }
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z) {
                    C18073l.smaato("Algorithm requires a PBE key");
                    return;
                }
                if (key instanceof BCPBEKey) {
                    param = ((BCPBEKey) key).getParam();
                    if (!(param instanceof C0272l)) {
                        if (param != null) {
                            C18073l.smaato("Algorithm requires a PBE key suitable for PKCS12");
                            return;
                        }
                        interfaceC9719lMakePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                } else {
                    interfaceC9719lMakePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                interfaceC9719lMakePBEParameters = param;
                boolean z2 = interfaceC9719lMakePBEParameters instanceof C0272l;
                c13886l = interfaceC9719lMakePBEParameters;
                interfaceC9719l = interfaceC9719lMakePBEParameters;
                if (z2) {
                    c13886l = interfaceC9719lMakePBEParameters2;
                    interfaceC9719l = interfaceC9719lMakePBEParameters2;
                    this.ivParam = (C0272l) interfaceC9719l;
                    c13886l = interfaceC9719l;
                }
            } catch (Exception unused) {
                C18073l.smaato("PKCS12 requires a SecretKey/PBEKey");
                return;
            }
        } else if (key instanceof C13463l) {
            C13463l c13463l = (C13463l) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            InterfaceC9719l interfaceC9719lMakePBEParameters4 = PBE.Util.makePBEParameters(c13463l.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z3 = interfaceC9719lMakePBEParameters4 instanceof C0272l;
            interfaceC9719l3 = interfaceC9719lMakePBEParameters4;
            c13886l = interfaceC9719lMakePBEParameters4;
            if (z3) {
                this.ivParam = (C0272l) interfaceC9719l3;
                c13886l = interfaceC9719l3;
            }
        } else if (key instanceof C2862l) {
            C2862l c2862l = (C2862l) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            InterfaceC9719l interfaceC9719lMakePBEParameters5 = PBE.Util.makePBEParameters(c2862l.getEncoded(), 1, 9, this.keySizeInBits, 0, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z4 = interfaceC9719lMakePBEParameters5 instanceof C0272l;
            interfaceC9719l3 = interfaceC9719lMakePBEParameters5;
            c13886l = interfaceC9719lMakePBEParameters5;
            if (z4) {
                this.ivParam = (C0272l) interfaceC9719l3;
                c13886l = interfaceC9719l3;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().inmobi() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                interfaceC9719lMakePBEParameters3 = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C18073l.pro("PBE requires PBE parameters to be set.");
                return;
            } else {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                interfaceC9719lMakePBEParameters3 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z5 = interfaceC9719lMakePBEParameters3 instanceof C0272l;
            interfaceC9719l3 = interfaceC9719lMakePBEParameters3;
            c13886l = interfaceC9719lMakePBEParameters3;
            if (z5) {
                this.ivParam = (C0272l) interfaceC9719l3;
                c13886l = interfaceC9719l3;
            }
        } else if (key instanceof PBEKey) {
            this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            interfaceC9719lMakePBEParameters2 = PBE.Util.makePBEParameters(((PBEKey) key).getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            if (interfaceC9719lMakePBEParameters2 instanceof C0272l) {
                c13886l = interfaceC9719lMakePBEParameters2;
                interfaceC9719l = interfaceC9719lMakePBEParameters2;
                this.ivParam = (C0272l) interfaceC9719l;
                c13886l = interfaceC9719l;
            }
        } else {
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 5) {
                C18073l.smaato("Algorithm requires a PBE key");
                return;
            }
            c13886l = new C13886l(key.getEncoded());
        }
        c13886l = interfaceC9719lMakePBEParameters2;
        interfaceC9719l = interfaceC9719lMakePBEParameters2;
        try {
            if (!(algorithmParameterSpec instanceof smaato)) {
                if (algorithmParameterSpec instanceof IvParameterSpec) {
                    if (this.ivLength != 0) {
                        IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                        if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                            throw new InvalidAlgorithmParameterException(AbstractC14814l.remoteconfig(this.ivLength, " bytes long.", new StringBuilder("IV must be ")));
                        }
                        C0272l c0272l2 = c13886l instanceof C0272l ? new C0272l(((C0272l) c13886l).f1272l, ivParameterSpec.getIV()) : new C0272l(c13886l, ivParameterSpec.getIV());
                        this.ivParam = c0272l2;
                        interfaceC9719l2 = c0272l2;
                    } else {
                        String str = this.modeName;
                        if (str != null && str.equals("ECB")) {
                            interfaceC9719l2 = c13886l;
                            interfaceC9719l2 = c13886l;
                            C18073l.pro("ECB mode does not use an IV");
                            return;
                        }
                    }
                } else if (algorithmParameterSpec instanceof C7244l) {
                    C7244l c7244l = (C7244l) algorithmParameterSpec;
                    byte[] bArr = c7244l.f15069l;
                    C2294l c2294l = new C2294l(new C13886l(key.getEncoded()), AbstractC14024l.crashlytics(c7244l.f15068l));
                    if (AbstractC14024l.crashlytics(bArr) == null || this.ivLength == 0) {
                        interfaceC9719l2 = c2294l;
                    } else {
                        c0272l = new C0272l(c2294l, AbstractC14024l.crashlytics(bArr));
                        this.ivParam = c0272l;
                        interfaceC9719l2 = c0272l;
                    }
                } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                    RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                    c9484l = new C10556l(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                    if (rC2ParameterSpec.getIV() == null || this.ivLength == 0) {
                        interfaceC9719l2 = c9484l;
                    } else {
                        c0272l = new C0272l(c9484l, rC2ParameterSpec.getIV());
                        this.ivParam = c0272l;
                        interfaceC9719l2 = c0272l;
                    }
                } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                    RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                    c9484l = new C9484l(key.getEncoded(), rC5ParameterSpec.getRounds());
                    if (!this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                        C18073l.pro("RC5 parameters passed to a cipher that is not RC5.");
                        return;
                    }
                    if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                        if (rC5ParameterSpec.getWordSize() != 32) {
                            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + ".");
                        }
                    } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                        throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
                    }
                    if (rC5ParameterSpec.getIV() == null || this.ivLength == 0) {
                        interfaceC9719l2 = c9484l;
                    } else {
                        c0272l = new C0272l(c9484l, rC5ParameterSpec.getIV());
                        this.ivParam = c0272l;
                        interfaceC9719l2 = c0272l;
                    }
                } else if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                    if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                        interfaceC9719l2 = c13886l;
                        C18073l.pro("GCMParameterSpec can only be used with AEAD modes.");
                        return;
                    } else {
                        interfaceC9719l2 = c13886l;
                        interfaceC9719l2 = c13886l;
                        remoteconfigVarExtractAeadParameters = GcmSpecUtil.extractAeadParameters(c13886l instanceof C0272l ? (C13886l) ((C0272l) c13886l).f1272l : (C13886l) c13886l, algorithmParameterSpec);
                    }
                } else if (algorithmParameterSpec != null) {
                    interfaceC9719l2 = c13886l;
                    if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        C18073l.pro("unknown parameter type.");
                        return;
                    }
                }
                interfaceC9719l2 = c13886l;
                interfaceC9719l2 = c13886l;
                interfaceC9719l2 = c13886l;
                c6114l = interfaceC9719l2;
                if (this.ivLength != 0 && !(interfaceC9719l2 instanceof C0272l) && !(interfaceC9719l2 instanceof remoteconfig)) {
                    if (secureRandom == null) {
                        secureRandomLoadAd = AbstractC8776l.loadAd();
                    } else {
                        secureRandomLoadAd = secureRandom;
                    }
                    if (i != 1 || i == 3) {
                        int i3 = this.ivLength;
                        byte[] bArr2 = new byte[i3];
                        secureRandomLoadAd.nextBytes(bArr2);
                        C0272l c0272l3 = new C0272l(interfaceC9719l2, bArr2, 0, i3);
                        this.ivParam = c0272l3;
                        c6114l = c0272l3;
                    } else if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                        c6114l = interfaceC9719l2;
                        C18073l.pro("no IV set when one expected");
                        return;
                    }
                }
                if (secureRandom != null && this.padded) {
                    c6114l = new C6114l(c6114l, secureRandom);
                }
                if (i == 1) {
                    this.cipher.init(true, c6114l);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            this.cipher.init(true, c6114l);
                        } else if (i != 4) {
                            throw new InvalidParameterException("unknown opmode " + i + " passed");
                        }
                    }
                    this.cipher.init(false, c6114l);
                }
                genericBlockCipher = this.cipher;
                if ((genericBlockCipher instanceof AEADGenericBlockCipher) || this.aeadParams != null) {
                    return;
                }
                this.aeadParams = new remoteconfig((C13886l) this.ivParam.f1272l, ((AEADGenericBlockCipher) genericBlockCipher).cipher.loadAd().length * 8, this.ivParam.f1273l, null);
                return;
            }
            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                C18073l.pro("AEADParameterSpec can only be used with AEAD modes.");
                return;
            } else {
                smaato smaatoVar = (smaato) algorithmParameterSpec;
                remoteconfigVarExtractAeadParameters = new remoteconfig(c13886l instanceof C0272l ? (C13886l) ((C0272l) c13886l).f1272l : (C13886l) c13886l, smaatoVar.f36569l, smaatoVar.getIV(), AbstractC14024l.crashlytics(smaatoVar.f36570l));
            }
            if (i == 1) {
                this.cipher.init(true, c6114l);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        this.cipher.init(true, c6114l);
                    } else if (i != 4) {
                        throw new InvalidParameterException("unknown opmode " + i + " passed");
                    }
                }
                this.cipher.init(false, c6114l);
            }
            genericBlockCipher = this.cipher;
            if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                return;
            } else {
                return;
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        } catch (Exception e2) {
            throw new BaseWrapCipher.InvalidKeyOrParametersException(e2.getMessage(), e2);
        }
        this.aeadParams = remoteconfigVarExtractAeadParameters;
        interfaceC9719l2 = remoteconfigVarExtractAeadParameters;
        interfaceC9719l2 = c13886l;
        interfaceC9719l2 = c13886l;
        interfaceC9719l2 = c13886l;
        c6114l = interfaceC9719l2;
        if (this.ivLength != 0) {
            if (secureRandom == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                secureRandomLoadAd = secureRandom;
            }
            if (i != 1) {
                int i4 = this.ivLength;
                byte[] bArr3 = new byte[i4];
                secureRandomLoadAd.nextBytes(bArr3);
                C0272l c0272l4 = new C0272l(interfaceC9719l2, bArr3, 0, i4);
                this.ivParam = c0272l4;
                c6114l = c0272l4;
            } else {
                int i5 = this.ivLength;
                byte[] bArr4 = new byte[i5];
                secureRandomLoadAd.nextBytes(bArr4);
                C0272l c0272l5 = new C0272l(interfaceC9719l2, bArr4, 0, i5);
                this.ivParam = c0272l5;
                c6114l = c0272l5;
            }
        }
        if (secureRandom != null) {
            c6114l = new C6114l(c6114l, secureRandom);
        }
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [byte[], java.io.Serializable] */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String strMopub = AbstractC9008l.mopub(str);
        this.modeName = strMopub;
        if (strMopub.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.license();
            this.cipher = new BufferedGenericBlockCipher(new C4998l(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.license();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new C9786l(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                InterfaceC10952l interfaceC10952l = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new C9786l(interfaceC10952l, interfaceC10952l.license() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.license();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new C6717l(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                InterfaceC10952l interfaceC10952l2 = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new C6717l(interfaceC10952l2, interfaceC10952l2.license() * 8));
                return;
            }
        }
        boolean zStartsWith = this.modeName.startsWith("PGPCFB");
        String str2 = this.modeName;
        if (zStartsWith) {
            boolean zEquals = str2.equals("PGPCFBWITHIV");
            if (!zEquals && this.modeName.length() != 6) {
                throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
            }
            this.ivLength = this.baseEngine.license();
            InterfaceC10952l interfaceC10952l3 = this.baseEngine;
            C16795l c16795l = new C16795l();
            c16795l.f32822l = interfaceC10952l3;
            c16795l.f32824l = zEquals;
            int iLicense = interfaceC10952l3.license();
            c16795l.f32818l = iLicense;
            c16795l.f32821l = new byte[iLicense];
            c16795l.f32820l = new byte[iLicense];
            c16795l.f32817l = new byte[iLicense];
            c16795l.f32823l = new byte[iLicense];
            this.cipher = new BufferedGenericBlockCipher(c16795l);
            return;
        }
        if (str2.equals("OPENPGPCFB")) {
            this.ivLength = 0;
            InterfaceC10952l interfaceC10952l4 = this.baseEngine;
            C17651l c17651l = new C17651l();
            c17651l.f34335l = interfaceC10952l4;
            int iLicense2 = interfaceC10952l4.license();
            c17651l.f34336l = iLicense2;
            c17651l.f34339l = new byte[iLicense2];
            c17651l.f34338l = new byte[iLicense2];
            c17651l.f34340l = new byte[iLicense2];
            this.cipher = new BufferedGenericBlockCipher(c17651l);
            return;
        }
        if (this.modeName.equals("FF1")) {
            this.ivLength = 0;
            InterfaceC10952l interfaceC10952l5 = this.baseEngine;
            C0562l c0562l = new C0562l(interfaceC10952l5, 0);
            if (interfaceC10952l5.license() != 16) {
                C8339l.metrica("base cipher needs to be 128 bits");
                return;
            } else if (AbstractC8151l.crashlytics("org.bouncycastle.fpe.disable") || AbstractC8151l.crashlytics("org.bouncycastle.fpe.disable_ff1")) {
                C10754l.ads("FF1 encryption disabled");
                return;
            } else {
                this.cipher = new BufferedFPEBlockCipher(c0562l);
                return;
            }
        }
        if (this.modeName.equals("FF3-1")) {
            this.ivLength = 0;
            InterfaceC10952l interfaceC10952l6 = this.baseEngine;
            C0562l c0562l2 = new C0562l(interfaceC10952l6, 1);
            if (interfaceC10952l6.license() != 16) {
                C8339l.metrica("base cipher needs to be 128 bits");
                return;
            } else if (AbstractC8151l.crashlytics("org.bouncycastle.fpe.disable")) {
                C10754l.ads("FPE disabled");
                return;
            } else {
                this.cipher = new BufferedFPEBlockCipher(c0562l2);
                return;
            }
        }
        if (this.modeName.equals("SIC")) {
            int iLicense3 = this.baseEngine.license();
            this.ivLength = iLicense3;
            if (iLicense3 < 16) {
                C8339l.metrica("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                return;
            } else {
                this.fixedIv = false;
                this.cipher = new BufferedGenericBlockCipher(new C15461l(new C9786l(this.baseEngine)));
                return;
            }
        }
        if (this.modeName.equals("CTR")) {
            this.ivLength = this.baseEngine.license();
            this.fixedIv = false;
            InterfaceC10952l interfaceC10952l7 = this.baseEngine;
            if (interfaceC10952l7 instanceof C7963l) {
                this.cipher = new BufferedGenericBlockCipher(new C15461l(new C5332l(interfaceC10952l7)));
                return;
            } else {
                this.cipher = new BufferedGenericBlockCipher(new C15461l(new C9786l(interfaceC10952l7)));
                return;
            }
        }
        if (this.modeName.equals("GOFB")) {
            this.ivLength = this.baseEngine.license();
            this.cipher = new BufferedGenericBlockCipher(new C15461l(new C0707l(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("GCFB")) {
            this.ivLength = this.baseEngine.license();
            this.cipher = new BufferedGenericBlockCipher(new C15461l(new C18390l(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTS")) {
            this.ivLength = this.baseEngine.license();
            this.cipher = new BufferedGenericBlockCipher(new C10423l(new C4998l(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CCM")) {
            this.ivLength = 12;
            if (this.baseEngine instanceof C7963l) {
                this.cipher = new AEADGenericBlockCipher(new C18617l(this.baseEngine));
                return;
            } else {
                this.cipher = new AEADGenericBlockCipher(C7383l.purchase(this.baseEngine));
                return;
            }
        }
        if (this.modeName.equals("OCB")) {
            if (this.engineProvider == null) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(str));
            }
            this.ivLength = 15;
            InterfaceC10952l interfaceC10952l8 = this.baseEngine;
            InterfaceC10952l interfaceC10952l9 = this.engineProvider.get();
            C16303l c16303l = new C16303l();
            c16303l.subs = null;
            c16303l.isPro = new byte[24];
            c16303l.firebase = new byte[16];
            c16303l.tapsense = new byte[16];
            if (interfaceC10952l8 == null) {
                C8339l.metrica("'hashCipher' cannot be null");
                return;
            }
            if (interfaceC10952l8.license() != 16) {
                C8339l.metrica("'hashCipher' must have a block size of 16");
                return;
            }
            if (interfaceC10952l9 == null) {
                C8339l.metrica("'mainCipher' cannot be null");
                return;
            }
            if (interfaceC10952l9.license() != 16) {
                C8339l.metrica("'mainCipher' must have a block size of 16");
                return;
            } else {
                if (!interfaceC10952l8.getAlgorithmName().equals(interfaceC10952l9.getAlgorithmName())) {
                    C8339l.metrica("'hashCipher' and 'mainCipher' must be the same algorithm");
                    return;
                }
                c16303l.yandex = interfaceC10952l8;
                c16303l.loadAd = interfaceC10952l9;
                this.cipher = new AEADGenericBlockCipher(c16303l);
                return;
            }
        }
        if (this.modeName.equals("EAX")) {
            this.ivLength = this.baseEngine.license();
            InterfaceC10952l interfaceC10952l10 = this.baseEngine;
            C11758l c11758l = new C11758l();
            int iLicense4 = interfaceC10952l10.license();
            c11758l.crashlytics = iLicense4;
            C10348l c10348l = new C10348l(interfaceC10952l10);
            c11758l.amazon = c10348l;
            c11758l.mopub = new byte[iLicense4];
            int i = c10348l.f21135l;
            c11758l.billing = new byte[i];
            c11758l.purchase = new byte[i];
            c11758l.yandex = new C9786l(interfaceC10952l10);
            this.cipher = new AEADGenericBlockCipher(c11758l);
            return;
        }
        if (this.modeName.equals("GCM-SIV")) {
            this.ivLength = 12;
            this.cipher = new AEADGenericBlockCipher(new C7203l(this.baseEngine));
        } else {
            if (!this.modeName.equals("GCM")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(str));
            }
            InterfaceC10952l interfaceC10952l11 = this.baseEngine;
            if (interfaceC10952l11 instanceof C7963l) {
                this.ivLength = ((C7963l) interfaceC10952l11).f16601l << 3;
                this.cipher = new AEADGenericBlockCipher(new C13237l(this.baseEngine));
            } else {
                this.ivLength = 12;
                this.cipher = new AEADGenericBlockCipher(C2283l.isPro(this.baseEngine));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                this.cipher = new BufferedGenericBlockCipher(new C15461l(this.cipher.getUnderlyingCipher()));
                return;
            }
            return;
        }
        if (strMopub.equals("WITHCTS") || strMopub.equals("CTSPADDING") || strMopub.equals("CS3PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(new C10423l(this.cipher.getUnderlyingCipher()));
            return;
        }
        this.padded = true;
        if (isAEADModeName(this.modeName)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (strMopub.equals("PKCS5PADDING") || strMopub.equals("PKCS7PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (strMopub.equals("ZEROBYTEPADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new C15655l(14));
            return;
        }
        if (strMopub.equals("ISO10126PADDING") || strMopub.equals("ISO10126-2PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new C12963l(0));
            return;
        }
        if (strMopub.equals("X9.23PADDING") || strMopub.equals("X923PADDING")) {
            InterfaceC10952l underlyingCipher = this.cipher.getUnderlyingCipher();
            C12963l c12963l = new C12963l(1);
            c12963l.f25413l = null;
            this.cipher = new BufferedGenericBlockCipher(underlyingCipher, c12963l);
            return;
        }
        if (strMopub.equals("ISO7816-4PADDING") || strMopub.equals("ISO9797-1PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new C9912l(3));
        } else {
            if (!strMopub.equals("TBCPADDING")) {
                throw new NoSuchPaddingException(AbstractC15560l.Signature("Padding ", str, " unknown."));
            }
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new C13975l(12));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int iProcessBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        if (iProcessBytes == 0) {
            return null;
        }
        if (iProcessBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iProcessBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, iProcessBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iRemaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (iRemaining <= 512) {
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, iRemaining);
            Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int iMin = Math.min(512, iRemaining);
            byteBuffer.get(bArr2, 0, iMin);
            engineUpdateAAD(bArr2, 0, iMin);
            iRemaining -= iMin;
        } while (iRemaining > 0);
        Arrays.fill(bArr2, (byte) 0);
    }

    public static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private C0800l cipher;

        public BufferedGenericBlockCipher(InterfaceC10952l interfaceC10952l, InterfaceC12684l interfaceC12684l) {
            this.cipher = new C8470l(interfaceC10952l, interfaceC12684l);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws BadPaddingException {
            try {
                return this.cipher.yandex(bArr, i);
            } catch (C10352l e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.amazon().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.crashlytics(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public InterfaceC10952l getUnderlyingCipher() {
            return this.cipher.amazon();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.purchase(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, InterfaceC9719l interfaceC9719l) {
            this.cipher.billing(z, interfaceC9719l);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.admob(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.subs(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof C10423l);
        }

        public BufferedGenericBlockCipher(InterfaceC10952l interfaceC10952l) {
            this(interfaceC10952l, new C9912l(7));
        }

        public BufferedGenericBlockCipher(C0800l c0800l) {
            this.cipher = c0800l;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        } catch (C10314l e) {
            C8936l.subs(e);
            return 0;
        }
    }

    public BaseBlockCipher(int i, isPro ispro, boolean z, int i2) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = i;
        this.baseEngine = ispro.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i2;
        this.cipher = new AEADGenericBlockCipher(ispro);
    }

    public BaseBlockCipher(int i, InterfaceC10952l interfaceC10952l, int i2) {
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = i;
        this.baseEngine = interfaceC10952l;
        this.fixedIv = true;
        this.cipher = new BufferedGenericBlockCipher(interfaceC10952l);
        this.ivLength = i2 / 8;
    }

    public BaseBlockCipher(int i, C0800l c0800l, int i2) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.keySizeInBits = i;
        this.baseEngine = c0800l.amazon();
        this.cipher = new BufferedGenericBlockCipher(c0800l);
        this.fixedIv = true;
        this.ivLength = i2 / 8;
    }

    public BaseBlockCipher(int i, BlockCipherProvider blockCipherProvider) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.keySizeInBits = i;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    public BaseBlockCipher(isPro ispro) {
        this(0, ispro);
    }

    public BaseBlockCipher(isPro ispro, boolean z, int i) {
        this(0, ispro, z, i);
    }

    public BaseBlockCipher(firebase firebaseVar, boolean z, int i) {
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(firebaseVar);
    }

    public BaseBlockCipher(InterfaceC10952l interfaceC10952l) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = interfaceC10952l;
        this.cipher = new BufferedGenericBlockCipher(interfaceC10952l);
    }

    public BaseBlockCipher(InterfaceC10952l interfaceC10952l, int i) {
        this(interfaceC10952l, true, i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException {
        int iEngineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[iEngineGetOutputSize];
        int iProcessBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.cipher.doFinal(bArr2, iProcessBytes);
            if (iDoFinal == iEngineGetOutputSize) {
                return bArr2;
            }
            if (iDoFinal > iEngineGetOutputSize) {
                throw new IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (C10314l e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public BaseBlockCipher(InterfaceC10952l interfaceC10952l, int i, int i2, int i3, int i4) {
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = interfaceC10952l;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(interfaceC10952l);
    }

    public BaseBlockCipher(InterfaceC10952l interfaceC10952l, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = interfaceC10952l;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(interfaceC10952l);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(C0800l c0800l, int i) {
        this(c0800l, true, i);
    }

    public BaseBlockCipher(C0800l c0800l, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = c0800l.amazon();
        this.cipher = new BufferedGenericBlockCipher(c0800l);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpecExtractSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpecExtractSpec = SpecUtil.extractSpec(algorithmParameters, availableSpecs);
            if (algorithmParameterSpecExtractSpec == null) {
                C8339l.remoteconfig(algorithmParameters);
                return;
            }
        } else {
            algorithmParameterSpecExtractSpec = null;
        }
        engineInit(i, key, algorithmParameterSpecExtractSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }
}
