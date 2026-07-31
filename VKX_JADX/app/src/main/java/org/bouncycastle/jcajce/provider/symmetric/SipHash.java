package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC4338l;
import defpackage.C18017l;
import defpackage.C3734l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class SipHash {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new C18017l());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new C3734l());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new C3734l(0));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Mac24", "Mac.SIPHASH-2-4", sb, configurableProvider);
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", AbstractC4338l.advert("Mac.SIPHASH-4-8", AbstractC4338l.advert("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4", configurableProvider, str, "$Mac48"), configurableProvider, str, "$KeyGen"));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }

    private SipHash() {
    }
}
