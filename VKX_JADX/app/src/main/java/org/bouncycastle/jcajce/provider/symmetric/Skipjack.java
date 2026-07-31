package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC4338l;
import defpackage.C1577l;
import defpackage.C18017l;
import defpackage.C18480l;
import defpackage.C1955l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Skipjack {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Skipjack IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C18480l(1));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Skipjack", 80, new C18017l());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C1955l(new C18480l(1)));
        }
    }

    public static class MacCFB8 extends BaseMac {
        public MacCFB8() {
            super(new C1577l(new C18480l(1)));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Skipjack.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Mac", "Mac.SKIPJACKMAC", AbstractC11043l.subs(str, "$AlgParams", "AlgorithmParameters.SKIPJACK", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.SKIPJACK", AbstractC11043l.subs(str, "$ECB", "Cipher.SKIPJACK", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.SKIPJACKMAC/CFB8", AbstractC4338l.advert("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC", configurableProvider, str, "$MacCFB8"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }

    private Skipjack() {
    }
}
