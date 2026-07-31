package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C4871l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC6796l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C4871l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C4871l((C4871l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C4871l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", 160, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD160", sb.toString());
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(InterfaceC4368l.yandex, "RIPEMD160", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "RIPEMD160", InterfaceC6796l.amazon);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", str + "$PBEWithHmacKeyFactory");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            AbstractC4338l.applovin(sb2, "$PBEWithHmac", configurableProvider, "Mac.PBEWITHHMACRIPEMD160");
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new C0361l(new C4871l()), 2, 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
