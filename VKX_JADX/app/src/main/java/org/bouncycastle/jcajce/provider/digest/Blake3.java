package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.C8837l;
import defpackage.InterfaceC4787l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes3.dex */
public class Blake3 {

    public static class Blake3_256 extends BCMessageDigest implements Cloneable {
        public Blake3_256() {
            super(new C8837l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake3_256 blake3_256 = (Blake3_256) super.clone();
            blake3_256.digest = new C8837l((C8837l) this.digest);
            return blake3_256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("MessageDigest.BLAKE3-256", PREFIX + "$Blake3_256");
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.MessageDigest."), InterfaceC4787l.subscription, configurableProvider, "BLAKE3-256");
        }
    }

    private Blake3() {
    }
}
