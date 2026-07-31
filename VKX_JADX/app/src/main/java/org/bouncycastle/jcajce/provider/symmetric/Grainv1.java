package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C14269l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Grainv1 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Grainv1 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            C14269l c14269l = new C14269l(1);
            c14269l.f27937l = 2;
            c14269l.f27942l = false;
            super(c14269l, 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grainv1", 80, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Grainv1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.Grainv1", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.Grainv1", AbstractC11043l.subs(str, "$Base", "Cipher.Grainv1", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private Grainv1() {
    }
}
