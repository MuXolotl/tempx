package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C11919l;
import defpackage.C1196l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C2283l;
import defpackage.C4998l;
import defpackage.C5501l;
import defpackage.C7626l;
import defpackage.Cfor;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC5594l;
import defpackage.startapp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("Camellia");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Camellia IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C4998l(new C1196l(2)), 128);
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new C4998l(new C1196l(2)), 128);
        }
    }

    public static class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new C4998l(new C1196l(2)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C4998l(new C1196l(2)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C1196l(2);
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new C1196l(2))));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.CAMELLIA", sb, configurableProvider);
            Cfor cfor = InterfaceC5594l.yandex;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", cfor, "CAMELLIA");
            Cfor cfor2 = InterfaceC5594l.loadAd;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", cfor2, "CAMELLIA");
            Cfor cfor3 = InterfaceC5594l.crashlytics;
            AbstractC4338l.applovin(AbstractC5020l.signatures(configurableProvider, "Alg.Alias.AlgorithmParameters", "CAMELLIA", str, cfor3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", cfor2, "CAMELLIA");
            AbstractC11043l.vip(str, "$Wrap", "Cipher.CAMELLIAWRAP", AbstractC11043l.subs(str, "$RFC3211Wrap", "Cipher.CAMELLIARFC3211WRAP", AbstractC5020l.pro(cfor3, "$CBC256", "Cipher", AbstractC5020l.signatures(configurableProvider, "Cipher", AbstractC0653l.ads(AbstractC5020l.pro(cfor, "$CBC128", "Cipher", AbstractC4338l.isVip("$ECB", "Cipher.CAMELLIA", str, AbstractC5020l.signatures(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "CAMELLIA", str, cfor3), configurableProvider), configurableProvider), str, "$CBC192"), str, cfor2), configurableProvider), configurableProvider), configurableProvider);
            Cfor cfor4 = InterfaceC5594l.amazon;
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap128", "Cipher", cfor4);
            Cfor cfor5 = InterfaceC5594l.purchase;
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap192", "Cipher", cfor5);
            Cfor cfor6 = InterfaceC5594l.billing;
            configurableProvider.addAlgorithm("Cipher", cfor6, str + "$Wrap256");
            AbstractC11043l.vip(str, "$KeyFactory", "SecretKeyFactory.CAMELLIA", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", cfor2, "CAMELLIA");
            StringBuilder sbSignatures = AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor2, "$KeyGen192", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor6, "$KeyGen256", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC0653l.ads(AbstractC5020l.pro(cfor4, "$KeyGen128", "KeyGenerator", AbstractC4338l.isVip("$KeyGen", "KeyGenerator.CAMELLIA", str, AbstractC5020l.signatures(configurableProvider, "Alg.Alias.SecretKeyFactory", "CAMELLIA", str, cfor3), configurableProvider), configurableProvider), str, "$KeyGen192"), str, cfor5), configurableProvider), str, "$KeyGen128"), str, cfor), configurableProvider), str, "$KeyGen256"), str, cfor3);
            sbSignatures.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", sbSignatures.toString(), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C1196l(2)));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C11919l((InterfaceC10952l) new C1196l(2)), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new startapp(2));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(128, new startapp(2));
        }
    }

    public static class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(192, new startapp(2));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new startapp(2));
        }
    }

    private Camellia() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("Camellia", i, new C18017l());
        }

        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }
}
