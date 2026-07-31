package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC12900l;
import defpackage.C0361l;
import defpackage.C17175l;
import defpackage.C18017l;
import defpackage.InterfaceC4368l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes3.dex */
public class RIPEMD128 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C17175l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C17175l((C17175l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C17175l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD128", 128, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD128", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC4368l.loadAd, "RIPEMD128", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD128", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
        }
    }

    private RIPEMD128() {
    }
}
