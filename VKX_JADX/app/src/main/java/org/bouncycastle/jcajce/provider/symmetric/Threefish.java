package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12994l;
import defpackage.C10348l;
import defpackage.C1660l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Threefish {

    public static class AlgParams_1024 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    public static class AlgParams_256 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-256 IV";
        }
    }

    public static class AlgParams_512 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-512 IV";
        }
    }

    public static class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new C10348l(new C1660l(1024)));
        }
    }

    public static class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new C10348l(new C1660l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new C10348l(new C1660l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super(new C1660l(1024));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new C1660l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new C1660l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    public static class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", 1024, new C18017l());
        }
    }

    public static class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams_1024", "AlgorithmParameters.Threefish-1024", AbstractC11043l.subs(str, "$AlgParams_512", "AlgorithmParameters.Threefish-512", AbstractC11043l.subs(str, "$AlgParams_256", "AlgorithmParameters.Threefish-256", AbstractC11043l.subs(str, "$KeyGen_1024", "KeyGenerator.Threefish-1024", AbstractC11043l.subs(str, "$KeyGen_512", "KeyGenerator.Threefish-512", AbstractC11043l.subs(str, "$KeyGen_256", "KeyGenerator.Threefish-256", AbstractC11043l.subs(str, "$ECB_1024", "Cipher.Threefish-1024", AbstractC11043l.subs(str, "$ECB_512", "Cipher.Threefish-512", AbstractC11043l.subs(str, "$ECB_256", "Cipher.Threefish-256", AbstractC11043l.subs(str, "$CMAC_1024", "Mac.Threefish-1024CMAC", AbstractC11043l.subs(str, "$CMAC_512", "Mac.Threefish-512CMAC", AbstractC11043l.subs(str, "$CMAC_256", "Mac.Threefish-256CMAC", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private Threefish() {
    }
}
