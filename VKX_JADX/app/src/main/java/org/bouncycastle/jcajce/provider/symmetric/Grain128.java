package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C14269l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Grain128 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            C14269l c14269l = new C14269l(0);
            c14269l.f27937l = 4;
            c14269l.f27942l = false;
            super(c14269l, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grain128", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Grain128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$KeyGen", "KeyGenerator.Grain128", AbstractC11043l.subs(str, "$Base", "Cipher.Grain128", sb, configurableProvider), configurableProvider);
        }
    }

    private Grain128() {
    }
}
