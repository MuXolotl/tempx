package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.C10224l;
import defpackage.C13516l;
import defpackage.C18017l;
import defpackage.C2283l;
import defpackage.C5501l;
import defpackage.C7626l;
import defpackage.InterfaceC10952l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class CAST6 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CAST6 IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.CAST6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public InterfaceC10952l get() {
                    return new C10224l();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C5501l(11, C2283l.isPro(new C10224l())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST6", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = CAST6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addGMacAlgorithm(configurableProvider, "CAST6", AbstractC0653l.ads(AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.CAST6", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.CAST6", AbstractC11043l.subs(str, "$ECB", "Cipher.CAST6", sb, configurableProvider), configurableProvider), configurableProvider), str, "$GMAC"), AbstractC12900l.firebase(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAST6", AbstractC12900l.firebase(str, "$Poly1305"), AbstractC12900l.firebase(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C7626l(new C10224l()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-CAST6", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    private CAST6() {
    }
}
