package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.C0361l;
import defpackage.C17695l;
import defpackage.C18017l;
import defpackage.InterfaceC6796l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class Tiger {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C17695l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C17695l((C17695l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C17695l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Tiger.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "TIGER", AbstractC0653l.ads(AbstractC11043l.subs(str, "$Digest", "MessageDigest.Tiger", AbstractC11043l.subs(str, "$Digest", "MessageDigest.TIGER", sb, configurableProvider), configurableProvider), str, "$HashMac"), AbstractC12900l.firebase(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "TIGER", InterfaceC6796l.crashlytics);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", str + "$PBEWithMacKeyFactory");
        }
    }

    public static class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new C0361l(new C17695l()), 2, 3, 192);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    public static class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new C0361l(new C17695l()));
        }
    }

    private Tiger() {
    }
}
