package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C0655l;
import defpackage.C18017l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC6796l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0655l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C0655l((C0655l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C0655l()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA1", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.SHA-1", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", "SHA-1");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.MessageDigest.");
            Cfor cfor = InterfaceC4502l.billing;
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(cfor, "SHA-1", str, sb2, configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA1", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            Cfor cfor2 = InterfaceC0543l.f1905l;
            addHMACAlias(configurableProvider, "SHA1", cfor2);
            addHMACAlias(configurableProvider, "SHA1", InterfaceC6796l.loadAd);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA", str + "$SHA1Mac");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            AbstractC4338l.applovin(sb3, "$SHA1Mac", configurableProvider, "Mac.PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + cfor, "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("SecretKeyFactory.HMACSHA1", AbstractC4338l.advert("SecretKeyFactory.PBEWITHHMACSHA1", AbstractC4338l.advert("Alg.Alias.Mac." + cfor, "PBEWITHHMACSHA", configurableProvider, str, "$PBEWithMacKeyFactory"), configurableProvider, str, "$KeyFactory"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + cfor2, "HMACSHA1");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA1", null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new C0361l(new C0655l()));
        }
    }

    private SHA1() {
    }
}
