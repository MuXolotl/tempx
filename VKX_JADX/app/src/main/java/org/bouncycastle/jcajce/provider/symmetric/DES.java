package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14715l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C0272l;
import defpackage.C10348l;
import defpackage.C11919l;
import defpackage.C13463l;
import defpackage.C13516l;
import defpackage.C13886l;
import defpackage.C14785l;
import defpackage.C1540l;
import defpackage.C1577l;
import defpackage.C18073l;
import defpackage.C18725l;
import defpackage.C1955l;
import defpackage.C4998l;
import defpackage.C5908l;
import defpackage.C9912l;
import defpackage.Cfor;
import defpackage.EnumC16675l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC9719l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class DES {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C1540l()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new C1955l(new C1540l()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C10348l(new C1540l()));
        }
    }

    public static class DES64 extends BaseMac {
        public DES64() {
            super(new C1955l(new C1540l(), 64, null));
        }
    }

    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new C1955l(new C1540l(), 64, new C9912l(3)));
        }
    }

    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new C5908l(new C1540l(), 64, null));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new C5908l(new C1540l(), 64, new C9912l(3)));
        }
    }

    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new C1577l(new C1540l()));
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, Cfor cfor, boolean z, int i, int i2, int i3, int i4) {
            super(str, cfor);
            this.forCipher = z;
            this.scheme = i;
            this.digest = i2;
            this.keySize = i3;
            this.ivSize = i4;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                C18073l.subscription("Invalid KeySpec");
                return null;
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                int i = this.scheme;
                if (i == 0 || i == 4) {
                    return new C13463l(pBEKeySpec.getPassword(), this.scheme == 0 ? EnumC16675l.f32698l : EnumC16675l.f32697l);
                }
                return new BCPBEKey(this.algName, this.algOid, i, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
            }
            boolean z = this.forCipher;
            int i2 = this.scheme;
            int i3 = this.digest;
            InterfaceC9719l interfaceC9719lMakePBEParameters = z ? PBE.Util.makePBEParameters(pBEKeySpec, i2, i3, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, i2, i3, this.keySize);
            AbstractC14715l.crashlytics((interfaceC9719lMakePBEParameters instanceof C0272l ? (C13886l) ((C0272l) interfaceC9719lMakePBEParameters).f1272l : (C13886l) interfaceC9719lMakePBEParameters).f27156l);
            return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, interfaceC9719lMakePBEParameters);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C1540l());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            String str;
            if (cls == null) {
                str = "keySpec parameter is null";
            } else if (secretKey == null) {
                str = "key parameter is null";
            } else {
                if (SecretKeySpec.class.isAssignableFrom(cls)) {
                    return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                }
                if (DESKeySpec.class.isAssignableFrom(cls)) {
                    try {
                        return new DESKeySpec(secretKey.getEncoded());
                    } catch (Exception e) {
                        C18725l.amazon(e);
                        return null;
                    }
                }
                str = "Invalid KeySpec";
            }
            C18073l.subscription(str);
            return null;
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new C13516l(0));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.loadAd(new C14785l(this.defaultKeySize, AbstractC8776l.loadAd()));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.yandex(), this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + cfor.inmobi(), str);
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + cfor.inmobi(), str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ECB", "Cipher.DES", sb, configurableProvider);
            Cfor cfor = InterfaceC4502l.loadAd;
            AbstractC11043l.adcel(configurableProvider, str, "$CBC", "Cipher", cfor);
            addAlias(configurableProvider, cfor, "DES");
            configurableProvider.addAlgorithm("Cipher.DESRFC3211WRAP", str + "$RFC3211");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            AbstractC4338l.applovin(AbstractC4338l.isVip("$CMAC", "Mac.DESCMAC", str, AbstractC4338l.isVip("$KeyFactory", "SecretKeyFactory.DES", str, AbstractC4338l.isVip("$KeyGenerator", "KeyGenerator.DES", str, sb2, configurableProvider), configurableProvider), configurableProvider), "$CBCMAC", configurableProvider, "Mac.DESMAC");
            AbstractC11043l.vip(str, "$DES64", "Mac.DESMAC64", AbstractC4338l.premium(configurableProvider, "Mac.DESMAC/CFB8", AbstractC4338l.advert("Alg.Alias.Mac.DES", "DESMAC", configurableProvider, str, "$DESCFB8"), "Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8"), configurableProvider);
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", AbstractC4338l.advert("Alg.Alias.Mac.DES64", "DESMAC64", configurableProvider, str, "$DES64with7816d4"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            AbstractC11043l.vip(str, "$DES9797Alg3", "Mac.DESWITHISO9797", AbstractC4338l.premium(configurableProvider, "Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING", "Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING"), configurableProvider);
            AbstractC11043l.vip(str, "$DES9797Alg3with7816d4", "Mac.ISO9797ALG3WITHISO7816-4PADDING", AbstractC4338l.premium(configurableProvider, "Mac.ISO9797ALG3MAC", AbstractC4338l.advert("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797", configurableProvider, str, "$DES9797Alg3"), "Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC"), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            StringBuilder sbSignatures = AbstractC5020l.signatures(configurableProvider, "Alg.Alias.AlgorithmParameters", "DES", str, cfor);
            sbSignatures.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DES", sbSignatures.toString());
            AbstractC4338l.applovin(AbstractC4338l.isVip("$PBEWithMD5", "Cipher.PBEWITHMD5ANDDES", str, AbstractC4338l.isVip("$PBEWithMD2", "Cipher.PBEWITHMD2ANDDES", str, AbstractC12900l.remoteconfig(cfor, "DES", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider), configurableProvider), configurableProvider), "$PBEWithSHA1", configurableProvider, "Cipher.PBEWITHSHA1ANDDES");
            Cfor cfor2 = InterfaceC0543l.f1874instanceof;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor2, "PBEWITHMD2ANDDES");
            Cfor cfor3 = InterfaceC0543l.f1870finally;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor3, "PBEWITHMD5ANDDES");
            Cfor cfor4 = InterfaceC0543l.f1924try;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor4, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            AbstractC11043l.vip(str, "$PBEWithSHA1KeyFactory", "SecretKeyFactory.PBEWITHSHA1ANDDES", AbstractC11043l.subs(str, "$PBEWithMD5KeyFactory", "SecretKeyFactory.PBEWITHMD5ANDDES", AbstractC11043l.subs(str, "$PBEWithMD2KeyFactory", "SecretKeyFactory.PBEWITHMD2ANDDES", AbstractC4338l.premium(configurableProvider, "Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES", "Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES"), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + cfor2, "PBEWITHMD2ANDDES");
            AbstractC11043l.metrica(AbstractC12900l.license(cfor3, "PBEWITHMD5ANDDES", "Alg.Alias.SecretKeyFactory.", new StringBuilder("Alg.Alias.SecretKeyFactory."), configurableProvider), cfor4, configurableProvider, "PBEWITHSHA1ANDDES");
        }
    }

    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new C4998l(new C1540l()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", InterfaceC0543l.f1874instanceof, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new C4998l(new C1540l()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", InterfaceC0543l.f1870finally, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new C4998l(new C1540l()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", InterfaceC0543l.f1924try, true, 0, 1, 64, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new C11919l((InterfaceC10952l) new C1540l()), 8);
        }
    }

    private DES() {
    }
}
