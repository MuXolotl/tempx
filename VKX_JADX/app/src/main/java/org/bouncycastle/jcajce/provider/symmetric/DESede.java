package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC8776l;
import defpackage.C0655l;
import defpackage.C10012l;
import defpackage.C10348l;
import defpackage.C10973l;
import defpackage.C11919l;
import defpackage.C14785l;
import defpackage.C1577l;
import defpackage.C16754l;
import defpackage.C18073l;
import defpackage.C18725l;
import defpackage.C1955l;
import defpackage.C4998l;
import defpackage.C9912l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC4502l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class DESede {

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
            super(new C4998l(new C10012l()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new C1955l(new C10012l()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C10348l(new C10012l()));
        }
    }

    public static class DESede64 extends BaseMac {
        public DESede64() {
            super(new C1955l(new C10012l(), 64, null));
        }
    }

    public static class DESede64with7816d4 extends BaseMac {
        public DESede64with7816d4() {
            super(new C1955l(new C10012l(), 64, new C9912l(3)));
        }
    }

    public static class DESedeCFB8 extends BaseMac {
        public DESedeCFB8() {
            super(new C1577l(new C10012l()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C10012l());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DESede", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
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
                if (DESedeKeySpec.class.isAssignableFrom(cls)) {
                    byte[] encoded = secretKey.getEncoded();
                    try {
                        if (encoded.length != 16) {
                            return new DESedeKeySpec(encoded);
                        }
                        byte[] bArr = new byte[24];
                        System.arraycopy(encoded, 0, bArr, 0, 16);
                        System.arraycopy(encoded, 0, bArr, 16, 8);
                        return new DESedeKeySpec(bArr);
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
        private boolean keySizeSet;

        public KeyGenerator() {
            super("DESede", 192, new C16754l(0));
            this.keySizeSet = false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.loadAd(new C14785l(this.defaultKeySize, AbstractC8776l.loadAd()));
                this.uninitialised = false;
            }
            if (this.keySizeSet) {
                return new SecretKeySpec(this.engine.yandex(), this.algName);
            }
            byte[] bArrYandex = this.engine.yandex();
            System.arraycopy(bArrYandex, 0, bArrYandex, 16, 8);
            return new SecretKeySpec(bArrYandex, this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
            this.keySizeSet = true;
        }
    }

    public static class KeyGenerator3 extends BaseKeyGenerator {
        public KeyGenerator3() {
            super("DESede3", 192, new C16754l(0));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DESede.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$ECB", "Cipher.DESEDE", sb, configurableProvider);
            Cfor cfor = InterfaceC0543l.f1872implements;
            configurableProvider.addAlgorithm("Cipher", cfor, str + "$CBC");
            AbstractC11043l.vip(str, "$Wrap", "Cipher.DESEDEWRAP", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Cipher", InterfaceC0543l.f1891l, str + "$Wrap");
            AbstractC11043l.vip(str, "$RFC3211", "Cipher.DESEDERFC3211WRAP", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA-1")) {
                configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", str + "$PBEWithSHAAndDES3Key");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                AbstractC4338l.applovin(sb2, "$PBEWithSHAAndDES2Key", configurableProvider, "Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", InterfaceC0543l.f1895l, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", InterfaceC0543l.f1913l, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            }
            StringBuilder sbSignatures = AbstractC4338l.signatures(str, "$KeyGenerator", configurableProvider, "KeyGenerator.DESEDE", "KeyGenerator.");
            sbSignatures.append(cfor);
            configurableProvider.addAlgorithm(sbSignatures.toString(), str + "$KeyGenerator3");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            AbstractC4338l.applovin(AbstractC4338l.isVip("$KeyGenerator", "KeyGenerator.DESEDEWRAP", str, sb3, configurableProvider), "$KeyFactory", configurableProvider, "SecretKeyFactory.DESEDE");
            configurableProvider.addAlgorithm("SecretKeyFactory", InterfaceC4502l.purchase, str + "$KeyFactory");
            AbstractC11043l.vip(str, "$CBCMAC", "Mac.DESEDEMAC", AbstractC11043l.subs(str, "$CMAC", "Mac.DESEDECMAC", new StringBuilder(), configurableProvider), configurableProvider);
            AbstractC11043l.vip(str, "$DESede64", "Mac.DESEDEMAC64", AbstractC4338l.premium(configurableProvider, "Mac.DESEDEMAC/CFB8", AbstractC4338l.advert("Alg.Alias.Mac.DESEDE", "DESEDEMAC", configurableProvider, str, "$DESedeCFB8"), "Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8"), configurableProvider);
            configurableProvider.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", AbstractC4338l.advert("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64", configurableProvider, str, "$DESede64with7816d4"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor, "DESEDE");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DESEDE", str + "$AlgParamGen");
            AbstractC4338l.applovin(AbstractC4338l.isVip("$PBEWithSHAAndDES3KeyFactory", "SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", str, AbstractC12900l.remoteconfig(cfor, "DESEDE", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider), configurableProvider), "$PBEWithSHAAndDES2KeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
    }

    public static class PBEWithSHAAndDES2Key extends BaseBlockCipher {
        public PBEWithSHAAndDES2Key() {
            super(new C4998l(new C10012l()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAndDES2KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() {
            super("PBEwithSHAandDES2Key-CBC", InterfaceC0543l.f1913l, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAndDES3Key extends BaseBlockCipher {
        public PBEWithSHAAndDES3Key() {
            super(new C4998l(new C10012l()), 2, 1, 192, 8);
        }
    }

    public static class PBEWithSHAAndDES3KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() {
            super("PBEwithSHAandDES3Key-CBC", InterfaceC0543l.f1895l, true, 2, 1, 192, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new C11919l((InterfaceC10952l) new C10012l()), 8);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            C10973l c10973l = new C10973l((byte) 0, 1);
            int i = AbstractC14832l.yandex;
            c10973l.f22112l = new C0655l();
            c10973l.f22113l = new byte[20];
            super(c10973l);
        }
    }

    private DESede() {
    }
}
