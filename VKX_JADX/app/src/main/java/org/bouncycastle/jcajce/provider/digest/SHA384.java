package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC1821l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C17219l;
import defpackage.C18017l;
import defpackage.C5153l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class SHA384 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C5153l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C5153l((C5153l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C5153l()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA384", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", 384, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.SHA-384", sb, configurableProvider);
            StringBuilder sbIsVip = AbstractC4338l.isVip("$HashMac", "Mac.PBEWITHHMACSHA384", str, AbstractC4338l.isVip("$OldSHA384", "Mac.OLDHMACSHA384", str, AbstractC12900l.remoteconfig(InterfaceC8134l.loadAd, "SHA-384", str, AbstractC12900l.vip(configurableProvider, "Alg.Alias.MessageDigest.SHA384", "SHA-384", "Alg.Alias.MessageDigest."), configurableProvider), configurableProvider), configurableProvider);
            sbIsVip.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", sbIsVip.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            Cfor cfor = InterfaceC0543l.f1906l;
            addHMACAlias(configurableProvider, "SHA384", cfor);
            AbstractC11043l.metrica(AbstractC4338l.signatures(str, "$KeyFactory", configurableProvider, "SecretKeyFactory.HMACSHA384", "Alg.Alias.SecretKeyFactory."), cfor, configurableProvider, "HMACSHA384");
        }
    }

    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new C17219l((AbstractC1821l) new C5153l()));
        }
    }

    private SHA384() {
    }
}
