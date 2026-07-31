package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC9008l;
import defpackage.C0272l;
import defpackage.C0800l;
import defpackage.C10012l;
import defpackage.C10314l;
import defpackage.C10352l;
import defpackage.C10423l;
import defpackage.C10556l;
import defpackage.C10754l;
import defpackage.C13886l;
import defpackage.C1540l;
import defpackage.C18073l;
import defpackage.C4998l;
import defpackage.C5740l;
import defpackage.C6717l;
import defpackage.C8339l;
import defpackage.C8470l;
import defpackage.C9484l;
import defpackage.C9786l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC9719l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private C0800l cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private C0272l ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new C4998l(new C1540l()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new C4998l(new C1540l()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new C4998l(new C10012l()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new C4998l(new C10012l()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new C4998l(new C10012l()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new C4998l(new C5740l()), 3, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    public BrokenJCEBlockCipher(InterfaceC10952l interfaceC10952l, int i, int i2, int i3, int i4) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new C8470l(interfaceC10952l);
        this.pbeType = i;
        this.pbeHash = i2;
        this.pbeKeySize = i3;
        this.pbeIvSize = i4;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int iSubs = i2 != 0 ? this.cipher.subs(bArr, i, i2, bArr2, 0) : 0;
        try {
            int iYandex = iSubs + this.cipher.yandex(bArr2, iSubs);
            byte[] bArr3 = new byte[iYandex];
            System.arraycopy(bArr2, 0, bArr3, 0, iYandex);
            return bArr3;
        } catch (C10314l e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (C10352l e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.cipher.loadAd();
    }

    public byte[] engineGetIV() {
        C0272l c0272l = this.ivParam;
        if (c0272l != null) {
            return c0272l.f1273l;
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i) {
        return this.cipher.crashlytics(i);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.amazon().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.f1273l);
            } catch (Exception e) {
                C10754l.Signature(e);
                return null;
            }
        }
        return this.engineParams;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c A[PHI: r0
  0x008c: PHI (r0v2 lٍٟٞ) = (r0v1 lٍٟٞ), (r0v1 lٍٟٞ), (r0v3 lٍٟٞ), (r0v3 lٍٟٞ) binds: [B:31:0x00ae, B:33:0x00b2, B:20:0x007a, B:22:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
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
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        InterfaceC9719l c9484l;
        InterfaceC9719l interfaceC9719l;
        C0272l c0272l;
        InterfaceC9719l c13886l;
        InterfaceC9719l interfaceC9719lMakePBEParameters;
        if (key instanceof BCPBEKey) {
            interfaceC9719lMakePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.amazon().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            if (this.pbeIvSize != 0) {
                interfaceC9719l = interfaceC9719lMakePBEParameters;
                this.ivParam = (C0272l) interfaceC9719lMakePBEParameters;
                interfaceC9719l = interfaceC9719lMakePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                c13886l = new C13886l(key.getEncoded());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                if (this.ivLength != 0) {
                    C0272l c0272l2 = new C0272l(new C13886l(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.ivParam = c0272l2;
                    c13886l = c0272l2;
                } else {
                    c13886l = new C13886l(key.getEncoded());
                }
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                c9484l = new C10556l(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                if (rC2ParameterSpec.getIV() == null || this.ivLength == 0) {
                    interfaceC9719l = c9484l;
                } else {
                    c0272l = new C0272l(c9484l, rC2ParameterSpec.getIV());
                    this.ivParam = c0272l;
                    interfaceC9719l = c0272l;
                }
            } else {
                if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                    C18073l.pro("unknown parameter type.");
                    return;
                }
                RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                c9484l = new C9484l(key.getEncoded(), rC5ParameterSpec.getRounds());
                if (rC5ParameterSpec.getWordSize() != 32) {
                    C8339l.metrica("can only accept RC5 word size 32 (at the moment...)");
                    return;
                } else if (rC5ParameterSpec.getIV() == null || this.ivLength == 0) {
                    interfaceC9719l = c9484l;
                } else {
                    c0272l = new C0272l(c9484l, rC5ParameterSpec.getIV());
                    this.ivParam = c0272l;
                    interfaceC9719l = c0272l;
                }
            }
            interfaceC9719l = c13886l;
        }
        interfaceC9719l = interfaceC9719lMakePBEParameters;
        InterfaceC9719l interfaceC9719l2 = interfaceC9719l;
        if (this.ivLength != 0 && !(interfaceC9719l instanceof C0272l)) {
            if (secureRandom == null) {
                secureRandom = AbstractC8776l.loadAd();
            }
            if (i != 1 && i != 3) {
                C18073l.pro("no IV set when one expected");
                return;
            }
            int i2 = this.ivLength;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            C0272l c0272l3 = new C0272l(interfaceC9719l, bArr, 0, i2);
            this.ivParam = c0272l3;
            interfaceC9719l2 = c0272l3;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C8339l.metrica(AbstractC0653l.vip(i, "unknown opmode: "));
                        return;
                    }
                }
            }
            this.cipher.billing(false, interfaceC9719l2);
            return;
        }
        this.cipher.billing(true, interfaceC9719l2);
    }

    public void engineSetMode(String str) {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new C8470l(this.cipher.amazon());
            return;
        }
        if (strMopub.equals("CBC")) {
            this.ivLength = this.cipher.amazon().license();
            this.cipher = new C8470l(new C4998l(this.cipher.amazon()));
            return;
        }
        if (strMopub.startsWith("OFB")) {
            this.ivLength = this.cipher.amazon().license();
            if (strMopub.length() == 3) {
                this.cipher = new C8470l(new C9786l(this.cipher.amazon(), this.cipher.loadAd() * 8));
                return;
            } else {
                this.cipher = new C8470l(new C9786l(this.cipher.amazon(), Integer.parseInt(strMopub.substring(3))));
                return;
            }
        }
        if (!strMopub.startsWith("CFB")) {
            C8339l.metrica("can't support mode ".concat(str));
            return;
        }
        this.ivLength = this.cipher.amazon().license();
        if (strMopub.length() == 3) {
            this.cipher = new C8470l(new C6717l(this.cipher.amazon(), this.cipher.loadAd() * 8));
        } else {
            this.cipher = new C8470l(new C6717l(this.cipher.amazon(), Integer.parseInt(strMopub.substring(3))));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String strMopub = AbstractC9008l.mopub(str);
        if (strMopub.equals("NOPADDING")) {
            this.cipher = new C0800l(this.cipher.amazon());
            return;
        }
        if (strMopub.equals("PKCS5PADDING") || strMopub.equals("PKCS7PADDING") || strMopub.equals("ISO10126PADDING")) {
            this.cipher = new C8470l(this.cipher.amazon());
        } else {
            if (!strMopub.equals("WITHCTS")) {
                throw new NoSuchPaddingException(AbstractC15560l.Signature("Padding ", str, " unknown."));
            }
            this.cipher = new C10423l(this.cipher.amazon());
        }
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(AbstractC0653l.vip(i, "Unknown key type "));
            } catch (NoSuchAlgorithmException e) {
                throw new InvalidKeyException("Unknown key type " + e.getMessage());
            } catch (NoSuchProviderException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            } catch (InvalidKeySpecException e3) {
                throw new InvalidKeyException("Unknown key type " + e3.getMessage());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int iPurchase = this.cipher.purchase(i2);
        if (iPurchase <= 0) {
            this.cipher.subs(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[iPurchase];
        this.cipher.subs(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            C18073l.smaato("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.cipher.subs(bArr, i, i2, bArr2, i3);
    }

    public BrokenJCEBlockCipher(InterfaceC10952l interfaceC10952l) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new C8470l(interfaceC10952l);
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr3;
        int i4;
        int iSubs;
        if (i2 != 0) {
            bArr3 = bArr2;
            i4 = i3;
            iSubs = this.cipher.subs(bArr, i, i2, bArr3, i4);
        } else {
            bArr3 = bArr2;
            i4 = i3;
            iSubs = 0;
        }
        try {
            return iSubs + this.cipher.yandex(bArr3, i4 + iSubs);
        } catch (C10314l e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (C10352l e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            C8339l.metrica(e.getMessage());
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (parameterSpec == null) {
                C8339l.remoteconfig(algorithmParameters);
                return;
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }
}
