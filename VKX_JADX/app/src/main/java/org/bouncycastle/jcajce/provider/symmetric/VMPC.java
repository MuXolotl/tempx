package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C18017l;
import defpackage.C18173l;
import defpackage.C6834l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class VMPC {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C18173l(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC", 128, new C18017l());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            C6834l c6834l = new C6834l();
            c6834l.f14284l = (byte) 0;
            c6834l.f14281l = null;
            c6834l.f14288l = (byte) 0;
            super(c6834l);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPC.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Mac", "Mac.VMPCMAC", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.VMPC", AbstractC11043l.subs(str, "$Base", "Cipher.VMPC", sb, configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }

    private VMPC() {
    }
}
