package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C14269l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class HC256 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "HC256 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            C14269l c14269l = new C14269l(3);
            c14269l.f27940l = new int[1024];
            c14269l.f27943l = new int[1024];
            c14269l.f27936l = 0;
            c14269l.f27941l = new byte[4];
            c14269l.f27937l = 0;
            super(c14269l, 32);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("HC256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HC256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.HC256", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.HC256", AbstractC11043l.subs(str, "$Base", "Cipher.HC256", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private HC256() {
    }
}
