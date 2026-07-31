package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.C2854l;
import defpackage.InterfaceC4787l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Blake2s {

    public static class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new C2854l(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.digest = new C2854l((C2854l) this.digest);
            return blake2s128;
        }
    }

    public static class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new C2854l(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.digest = new C2854l((C2854l) this.digest);
            return blake2s160;
        }
    }

    public static class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new C2854l(224));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.digest = new C2854l((C2854l) this.digest);
            return blake2s224;
        }
    }

    public static class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new C2854l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.digest = new C2854l((C2854l) this.digest);
            return blake2s256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2s256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-256", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC4787l.ads, "BLAKE2S-256", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$Blake2s224");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-224", sbRemoteconfig.toString());
            StringBuilder sbRemoteconfig2 = AbstractC12900l.remoteconfig(InterfaceC4787l.adcel, "BLAKE2S-224", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig2.append("$Blake2s160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-160", sbRemoteconfig2.toString());
            StringBuilder sbRemoteconfig3 = AbstractC12900l.remoteconfig(InterfaceC4787l.startapp, "BLAKE2S-160", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig3.append("$Blake2s128");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-128", sbRemoteconfig3.toString());
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.MessageDigest."), InterfaceC4787l.metrica, configurableProvider, "BLAKE2S-128");
        }
    }

    private Blake2s() {
    }
}
