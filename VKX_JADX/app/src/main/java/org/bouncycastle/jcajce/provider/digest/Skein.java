package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.C0361l;
import defpackage.C13161l;
import defpackage.C17040l;
import defpackage.C18017l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new C17040l(1024, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C17040l((C17040l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new C17040l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C17040l((C17040l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C17040l((C17040l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new C18017l());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new C18017l());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new C18017l());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new C18017l());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new C18017l());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new C18017l());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new C0361l(new C17040l(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new C0361l(new C17040l(1024, 384)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new C0361l(new C17040l(1024, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new C0361l(new C17040l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new C0361l(new C17040l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new C0361l(new C17040l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new C0361l(new C17040l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 224)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 384)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new C0361l(new C17040l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i, int i2) {
            String strPremium = AbstractC12589l.premium(i, i2, "Skein-MAC-", "-");
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$SkeinMac_");
            sb.append(i);
            sb.append("_");
            sb.append(i2);
            configurableProvider.addAlgorithm("Mac.".concat(strPremium), sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.Skein-MAC" + i + "/" + i2, strPremium);
            configurableProvider.addAlgorithm("KeyGenerator.".concat(strPremium), str + "$SkeinMacKeyGenerator_" + i + "_" + i2);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i + "/" + i2, strPremium);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "Skein-256-128", AbstractC0653l.ads(AbstractC11043l.subs(str, "$Digest_1024_1024", "MessageDigest.Skein-1024-1024", AbstractC11043l.subs(str, "$Digest_1024_512", "MessageDigest.Skein-1024-512", AbstractC11043l.subs(str, "$Digest_1024_384", "MessageDigest.Skein-1024-384", AbstractC11043l.subs(str, "$Digest_512_512", "MessageDigest.Skein-512-512", AbstractC11043l.subs(str, "$Digest_512_384", "MessageDigest.Skein-512-384", AbstractC11043l.subs(str, "$Digest_512_256", "MessageDigest.Skein-512-256", AbstractC11043l.subs(str, "$Digest_512_224", "MessageDigest.Skein-512-224", AbstractC11043l.subs(str, "$Digest_512_160", "MessageDigest.Skein-512-160", AbstractC11043l.subs(str, "$Digest_512_128", "MessageDigest.Skein-512-128", AbstractC11043l.subs(str, "$Digest_256_256", "MessageDigest.Skein-256-256", AbstractC11043l.subs(str, "$Digest_256_224", "MessageDigest.Skein-256-224", AbstractC11043l.subs(str, "$Digest_256_160", "MessageDigest.Skein-256-160", AbstractC11043l.subs(str, "$Digest_256_128", "MessageDigest.Skein-256-128", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$HashMac_256_128"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_256_128"));
            addHMACAlgorithm(configurableProvider, "Skein-256-160", AbstractC12900l.firebase(str, "$HashMac_256_160"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_256_160"));
            addHMACAlgorithm(configurableProvider, "Skein-256-224", AbstractC12900l.firebase(str, "$HashMac_256_224"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_256_224"));
            addHMACAlgorithm(configurableProvider, "Skein-256-256", AbstractC12900l.firebase(str, "$HashMac_256_256"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_256_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-128", AbstractC12900l.firebase(str, "$HashMac_512_128"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_128"));
            addHMACAlgorithm(configurableProvider, "Skein-512-160", AbstractC12900l.firebase(str, "$HashMac_512_160"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_160"));
            addHMACAlgorithm(configurableProvider, "Skein-512-224", AbstractC12900l.firebase(str, "$HashMac_512_224"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_224"));
            addHMACAlgorithm(configurableProvider, "Skein-512-256", AbstractC12900l.firebase(str, "$HashMac_512_256"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-384", AbstractC12900l.firebase(str, "$HashMac_512_384"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_384"));
            addHMACAlgorithm(configurableProvider, "Skein-512-512", AbstractC12900l.firebase(str, "$HashMac_512_512"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_512_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", AbstractC12900l.firebase(str, "$HashMac_1024_384"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_1024_384"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", AbstractC12900l.firebase(str, "$HashMac_1024_512"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", AbstractC12900l.firebase(str, "$HashMac_1024_1024"), AbstractC12900l.firebase(str, "$HMacKeyGenerator_1024_1024"));
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 128);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 160);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 224);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 384);
            addSkeinMacAlgorithm(configurableProvider, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            addSkeinMacAlgorithm(configurableProvider, 1024, 384);
            addSkeinMacAlgorithm(configurableProvider, 1024, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new C18017l());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new C13161l(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new C13161l(1024, 384));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new C13161l(1024, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new C13161l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new C13161l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new C13161l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new C13161l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 224));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 384));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new C13161l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    private Skein() {
    }
}
