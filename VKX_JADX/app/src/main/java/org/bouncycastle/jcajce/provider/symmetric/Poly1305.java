package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C13516l;
import defpackage.C7626l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Poly1305 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C13516l(1));
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C7626l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$KeyGen", "KeyGenerator.POLY1305", AbstractC11043l.subs(str, "$Mac", "Mac.POLY1305", sb, configurableProvider), configurableProvider);
        }
    }

    private Poly1305() {
    }
}
