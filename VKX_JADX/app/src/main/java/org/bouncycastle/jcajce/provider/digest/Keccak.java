package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.C0361l;
import defpackage.C18017l;
import defpackage.C5394l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new C5394l(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C5394l((C5394l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new C0361l(new C5394l(224)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new C0361l(new C5394l(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new C0361l(new C5394l(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new C0361l(new C5394l(384)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new C0361l(new C5394l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new C18017l());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new C18017l());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", 384, new C18017l());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "KECCAK224", AbstractC0653l.ads(AbstractC11043l.subs(str, "$Digest512", "MessageDigest.KECCAK-512", AbstractC11043l.subs(str, "$Digest384", "MessageDigest.KECCAK-384", AbstractC11043l.subs(str, "$Digest256", "MessageDigest.KECCAK-256", AbstractC11043l.subs(str, "$Digest288", "MessageDigest.KECCAK-288", AbstractC11043l.subs(str, "$Digest224", "MessageDigest.KECCAK-224", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$HashMac224"), AbstractC12900l.firebase(str, "$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", AbstractC12900l.firebase(str, "$HashMac256"), AbstractC12900l.firebase(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", AbstractC12900l.firebase(str, "$HashMac288"), AbstractC12900l.firebase(str, "$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", AbstractC12900l.firebase(str, "$HashMac384"), AbstractC12900l.firebase(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", AbstractC12900l.firebase(str, "$HashMac512"), AbstractC12900l.firebase(str, "$KeyGenerator512"));
        }
    }

    private Keccak() {
    }
}
