package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC12900l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C3077l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC6796l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes3.dex */
public class MD5 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C3077l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C3077l((C3077l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C3077l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD5", 128, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.MD5", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC0543l.f1910l, "MD5", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "MD5", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "MD5", InterfaceC6796l.yandex);
        }
    }

    private MD5() {
    }
}
