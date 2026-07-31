package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC12900l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C2339l;
import defpackage.InterfaceC0543l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes3.dex */
public class MD4 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C2339l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C2339l((C2339l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C2339l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD4", 128, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.MD4", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC0543l.f1893l, "MD4", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "MD4", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
        }
    }

    private MD4() {
    }
}
