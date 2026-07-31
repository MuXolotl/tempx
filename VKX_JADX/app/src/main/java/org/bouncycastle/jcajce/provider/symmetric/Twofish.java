package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C2283l;
import defpackage.C4998l;
import defpackage.C5501l;
import defpackage.C5740l;
import defpackage.C7626l;
import defpackage.InterfaceC10952l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Twofish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Twofish IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Twofish.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C5740l();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new C5740l())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Twofish", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Twofish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.Twofish", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.Twofish", AbstractC11043l.subs(str, "$ECB", "Cipher.Twofish", sb, configurableProvider), configurableProvider), configurableProvider);
            addGMacAlgorithm(configurableProvider, "Twofish", AbstractC0653l.ads(AbstractC11043l.subs(str, "$PBEWithSHAKeyFactory", "SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", AbstractC11043l.subs(str, "$PBEWithSHA", "Cipher.PBEWITHSHAANDTWOFISH-CBC", AbstractC4338l.premium(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE"), configurableProvider), configurableProvider), str, "$GMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "Twofish", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class PBEWithSHA extends BaseBlockCipher {
        public PBEWithSHA() {
            super(new C4998l(new C5740l()), 2, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 16);
        }
    }

    public static class PBEWithSHAKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAKeyFactory() {
            super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C5740l()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Twofish", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    private Twofish() {
    }
}
