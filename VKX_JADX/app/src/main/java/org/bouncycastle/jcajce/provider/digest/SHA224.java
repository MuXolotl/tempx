package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C9102l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C9102l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C9102l((C9102l) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C9102l()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA224", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.SHA-224", sb, configurableProvider);
            StringBuilder sbIsVip = AbstractC4338l.isVip("$HashMac", "Mac.PBEWITHHMACSHA224", str, AbstractC12900l.remoteconfig(InterfaceC8134l.amazon, "SHA-224", str, AbstractC12900l.vip(configurableProvider, "Alg.Alias.MessageDigest.SHA224", "SHA-224", "Alg.Alias.MessageDigest."), configurableProvider), configurableProvider);
            sbIsVip.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", sbIsVip.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            Cfor cfor = InterfaceC0543l.f1883l;
            addHMACAlias(configurableProvider, "SHA224", cfor);
            AbstractC11043l.metrica(AbstractC4338l.signatures(str, "$KeyFactory", configurableProvider, "SecretKeyFactory.HMACSHA224", "Alg.Alias.SecretKeyFactory."), cfor, configurableProvider, "HMACSHA224");
        }
    }

    private SHA224() {
    }
}
