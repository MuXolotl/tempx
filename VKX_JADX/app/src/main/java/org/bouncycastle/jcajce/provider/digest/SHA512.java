package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC1821l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C10032l;
import defpackage.C17219l;
import defpackage.C17711l;
import defpackage.C18017l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C17711l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C17711l((C17711l) this.digest);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new C10032l(i, 0));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new C10032l((C10032l) this.digest);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C17711l()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new C0361l(new C10032l(224, 0)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new C0361l(new C10032l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0)));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA512", null);
        }
    }

    public static class KeyFactory224 extends BaseSecretKeyFactory {
        public KeyFactory224() {
            super("HmacSHA512/224", null);
        }
    }

    public static class KeyFactory256 extends BaseSecretKeyFactory {
        public KeyFactory256() {
            super("HmacSHA512/256", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new C18017l());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.SHA-512", sb, configurableProvider);
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(InterfaceC8134l.crashlytics, "SHA-512", str, AbstractC12900l.vip(configurableProvider, "Alg.Alias.MessageDigest.SHA512", "SHA-512", "Alg.Alias.MessageDigest."), configurableProvider), "$DigestT224", configurableProvider, "MessageDigest.SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(InterfaceC8134l.purchase, "SHA-512/224", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider), "$DigestT256", configurableProvider, "MessageDigest.SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", "SHA-512/256");
            StringBuilder sbIsVip = AbstractC4338l.isVip("$HashMac", "Mac.PBEWITHHMACSHA512", str, AbstractC4338l.isVip("$OldSHA512", "Mac.OLDHMACSHA512", str, AbstractC12900l.remoteconfig(InterfaceC8134l.billing, "SHA-512/256", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider), configurableProvider), configurableProvider);
            sbIsVip.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", sbIsVip.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            Cfor cfor = InterfaceC0543l.f1898l;
            addHMACAlias(configurableProvider, "SHA512", cfor);
            addHMACAlgorithm(configurableProvider, "SHA512/224", AbstractC12900l.firebase(str, "$HashMacT224"), AbstractC12900l.firebase(str, "$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", AbstractC12900l.firebase(str, "$HashMacT256"), AbstractC12900l.firebase(str, "$KeyGeneratorT256"));
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(cfor, "HMACSHA512", str, AbstractC4338l.signatures(str, "$KeyFactory", configurableProvider, "SecretKeyFactory.HMACSHA512", "Alg.Alias.SecretKeyFactory."), configurableProvider), "$KeyFactory224", configurableProvider, "SecretKeyFactory.HMACSHA512/224");
            AbstractC4338l.applovin(AbstractC12900l.remoteconfig(InterfaceC0543l.f1899l, "HMACSHA512/224", str, AbstractC12900l.vip(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(224)", "HMACSHA512/224", "Alg.Alias.SecretKeyFactory."), configurableProvider), "$KeyFactory256", configurableProvider, "SecretKeyFactory.HMACSHA512/256");
            AbstractC11043l.metrica(AbstractC12900l.vip(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(256)", "HMACSHA512/256", "Alg.Alias.SecretKeyFactory."), InterfaceC0543l.f1877l, configurableProvider, "HMACSHA512/256");
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new C17219l((AbstractC1821l) new C17711l()));
        }
    }

    private SHA512() {
    }
}
