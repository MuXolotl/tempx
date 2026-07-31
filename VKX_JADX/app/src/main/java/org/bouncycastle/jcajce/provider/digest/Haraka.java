package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.C13098l;
import defpackage.C4185l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes3.dex */
public class Haraka {

    public static class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new C13098l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new C13098l((C13098l) this.digest);
            return digest256;
        }
    }

    public static class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new C4185l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new C4185l((C4185l) this.digest);
            return digest512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest512", "MessageDigest.HARAKA-512", AbstractC11043l.subs(str, "$Digest256", "MessageDigest.HARAKA-256", sb, configurableProvider), configurableProvider);
        }
    }

    private Haraka() {
    }
}
