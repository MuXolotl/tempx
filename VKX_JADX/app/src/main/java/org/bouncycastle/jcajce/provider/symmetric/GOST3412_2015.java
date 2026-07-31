package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C0800l;
import defpackage.C10348l;
import defpackage.C1196l;
import defpackage.C13155l;
import defpackage.C18017l;
import defpackage.C6469l;
import defpackage.C9729l;
import defpackage.InterfaceC10952l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3412_2015 {

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            C1196l c1196l = new C1196l(3);
            C6469l c6469l = new C6469l();
            c6469l.f13502l = false;
            c6469l.f13504l = 16;
            c6469l.f13503l = c1196l;
            super((InterfaceC10952l) c6469l, false, 128);
        }
    }

    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new C0800l(new C9729l(new C1196l(3))), true, 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C1196l(3));
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new C0800l(new C13155l(new C1196l(3), 128)), false, 128);
        }
    }

    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new C0800l(new C13155l(new C1196l(3), 8)), false, 128);
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C10348l(new C1196l(3)));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Mac", "Mac.GOST3412MAC", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.GOST3412-2015", AbstractC11043l.subs(str, "$CTR", "Cipher.GOST3412-2015/CTR", AbstractC11043l.subs(str, "$CBC", "Cipher.GOST3412-2015/CBC", AbstractC11043l.subs(str, "$OFB", "Cipher.GOST3412-2015/OFB", AbstractC11043l.subs(str, "$GCFB8", "Cipher.GOST3412-2015/CFB8", AbstractC11043l.subs(str, "$GCFB", "Cipher.GOST3412-2015/CFB", AbstractC11043l.subs(str, "$ECB", "Cipher.GOST3412-2015", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            C1196l c1196l = new C1196l(3);
            C9729l c9729l = new C9729l((InterfaceC10952l) c1196l);
            c9729l.f19847l = false;
            c9729l.f19849l = 16;
            c9729l.f19845l = c1196l;
            c9729l.f19844l = new byte[16];
            super(new C0800l(c9729l), false, 128);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("GOST3412-2015", i, new C18017l());
        }

        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }
}
