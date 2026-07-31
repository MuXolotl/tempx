package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.C3677l;
import defpackage.InterfaceC4787l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new C3677l(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new C3677l((C3677l) this.digest);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new C3677l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new C3677l((C3677l) this.digest);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new C3677l(384));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new C3677l((C3677l) this.digest);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new C3677l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new C3677l((C3677l) this.digest);
            return blake2b512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2b512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-512", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC4787l.vip, "BLAKE2B-512", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$Blake2b384");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-384", sbRemoteconfig.toString());
            StringBuilder sbRemoteconfig2 = AbstractC12900l.remoteconfig(InterfaceC4787l.remoteconfig, "BLAKE2B-384", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig2.append("$Blake2b256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-256", sbRemoteconfig2.toString());
            StringBuilder sbRemoteconfig3 = AbstractC12900l.remoteconfig(InterfaceC4787l.smaato, "BLAKE2B-256", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig3.append("$Blake2b160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-160", sbRemoteconfig3.toString());
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.MessageDigest."), InterfaceC4787l.firebase, configurableProvider, "BLAKE2B-160");
        }
    }

    private Blake2b() {
    }
}
