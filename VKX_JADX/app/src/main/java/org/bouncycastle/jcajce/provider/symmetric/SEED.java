package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8776l;
import defpackage.C10348l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C2283l;
import defpackage.C4998l;
import defpackage.C5501l;
import defpackage.C7110l;
import defpackage.C7626l;
import defpackage.Cfor;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC1898l;
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
public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("SEED");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(128, new C4998l(new C7110l(1, false)), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C10348l(new C7110l(1, false)));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C7110l(1, false);
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new C7110l(1, false))));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SEED", sb.toString());
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            Cfor cfor = InterfaceC1898l.yandex;
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(cfor, "SEED", str, sb2, configurableProvider);
            sbRemoteconfig.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SEED", sbRemoteconfig.toString());
            AbstractC11043l.vip(str, "$Wrap", "Cipher.SEEDWRAP", AbstractC5020l.pro(cfor, "$CBC", "Cipher", AbstractC4338l.isVip("$ECB", "Cipher.SEED", str, AbstractC12900l.remoteconfig(cfor, "SEED", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            Cfor cfor2 = InterfaceC1898l.crashlytics;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", cfor2, "SEEDWRAP");
            AbstractC11043l.vip(str, "$KeyFactory", "SecretKeyFactory.SEED", AbstractC5020l.pro(cfor2, "$KeyGen", "KeyGenerator", AbstractC5020l.signatures(configurableProvider, "KeyGenerator", AbstractC4338l.advert("KeyGenerator.SEED", AbstractC4338l.advert("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP", configurableProvider, str, "$KeyGen"), configurableProvider, str, "$KeyGen"), str, cfor), configurableProvider), configurableProvider);
            StringBuilder sbSignatures = AbstractC5020l.signatures(configurableProvider, "Alg.Alias.SecretKeyFactory", "SEED", str, cfor);
            sbSignatures.append("$CMAC");
            addCMacAlgorithm(configurableProvider, "SEED", sbSignatures.toString(), AbstractC12900l.firebase(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SEED", AbstractC12900l.firebase(str, "$GMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SEED", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C7110l(1, false)));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(128, new startapp(new C7110l(1, false)));
        }
    }

    private SEED() {
    }
}
