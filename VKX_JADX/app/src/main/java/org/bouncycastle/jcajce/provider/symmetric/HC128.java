package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12994l;
import defpackage.C14269l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class HC128 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "HC128 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            C14269l c14269l = new C14269l(2);
            c14269l.f27940l = new int[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
            c14269l.f27943l = new int[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
            c14269l.f27936l = 0;
            c14269l.f27941l = new byte[4];
            c14269l.f27937l = 0;
            super(c14269l, 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("HC128", 128, new C18017l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HC128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$AlgParams", "AlgorithmParameters.HC128", AbstractC11043l.subs(str, "$KeyGen", "KeyGenerator.HC128", AbstractC11043l.subs(str, "$Base", "Cipher.HC128", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private HC128() {
    }
}
