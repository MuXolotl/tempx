package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C2657l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SHA256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C2657l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            InterfaceC16922l interfaceC16922l = this.digest;
            if (!(interfaceC16922l instanceof C2657l)) {
                throw new IllegalArgumentException("receiver digest not available for input type ".concat(interfaceC16922l != null ? interfaceC16922l.getClass().getName() : "null"));
            }
            digest.digest = new C2657l((C2657l) interfaceC16922l);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C2657l()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA256", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.SHA-256", sb, configurableProvider);
            StringBuilder sbVip = AbstractC12900l.vip(configurableProvider, "Alg.Alias.MessageDigest.SHA256", "SHA-256", "Alg.Alias.MessageDigest.");
            Cfor cfor = InterfaceC8134l.yandex;
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor, "SHA-256", str, sbVip, configurableProvider), "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACSHA256");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            addHMACAlgorithm(configurableProvider, "SHA256", AbstractC4338l.advert("Mac.PBEWITHHMACSHA256", AbstractC4338l.advert("Alg.Alias.SecretKeyFactory." + cfor, "PBEWITHHMACSHA256", configurableProvider, str, "$HashMac"), configurableProvider, str, "$HashMac"), AbstractC12900l.firebase(str, "$KeyGenerator"));
            Cfor cfor2 = InterfaceC0543l.f1881l;
            addHMACAlias(configurableProvider, "SHA256", cfor2);
            addHMACAlias(configurableProvider, "SHA256", cfor);
            AbstractC11043l.metrica(AbstractC4338l.signatures(str, "$KeyFactory", configurableProvider, "SecretKeyFactory.HMACSHA256", "Alg.Alias.SecretKeyFactory."), cfor2, configurableProvider, "HMACSHA256");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
        }
    }

    private SHA256() {
    }
}
