package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC8776l;
import defpackage.C10348l;
import defpackage.C10551l;
import defpackage.C12507l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C18073l;
import defpackage.C2283l;
import defpackage.C5501l;
import defpackage.C7626l;
import defpackage.C7804l;
import defpackage.InterfaceC10952l;
import defpackage.InterfaceC13724l;
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
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SM4 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = AbstractC8776l.loadAd();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("SM4");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                C18073l.license(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SM4 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "SM4 IV";
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C10348l(new C12507l(0)));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SM4.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C12507l(0);
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new C12507l(0))));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SM4", 128, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SM4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addCMacAlgorithm(configurableProvider, "SM4", AbstractC0653l.ads(AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.SM4", AbstractC11043l.subs(str, "$ECB", "Cipher.SM4", AbstractC11043l.subs(str, "$AlgParamGen", "AlgorithmParameterGenerator.SM4", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.SM4", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$CMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SM4", AbstractC12900l.firebase(str, "$GMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SM4", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
            configurableProvider.addAlgorithm("Cipher.SM4WRAP", str + "$Wrap");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            AbstractC4338l.applovin(sb2, "$WrapPad", configurableProvider, "Cipher.SM4WRAPPAD");
            AbstractC11043l.adcel(configurableProvider, str, "$Wrap", "Cipher", InterfaceC13724l.yandex);
            AbstractC11043l.adcel(configurableProvider, str, "$WrapPad", "Cipher", InterfaceC13724l.loadAd);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C12507l(0)));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SM4", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class SM4WrapEngine extends C7804l {
        public SM4WrapEngine() {
            super(new C12507l(0));
        }
    }

    public static class SM4WrapPadEngine extends C10551l {
        public SM4WrapPadEngine() {
            super(new C12507l(0));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new SM4WrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new SM4WrapPadEngine());
        }
    }

    private SM4() {
    }
}
