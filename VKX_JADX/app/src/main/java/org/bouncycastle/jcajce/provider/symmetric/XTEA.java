package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C18017l;
import defpackage.C4619l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class XTEA {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "XTEA IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            C4619l c4619l = new C4619l();
            c4619l.f9373l = new int[4];
            c4619l.f9372l = new int[32];
            c4619l.f9374l = new int[32];
            c4619l.f9370l = false;
            super(c4619l);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XTEA", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = XTEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.XTEA", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.XTEA", AbstractC11043l.subs(str, "$ECB", "Cipher.XTEA", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private XTEA() {
    }
}
