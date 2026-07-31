package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.C12663l;
import defpackage.C12720l;
import defpackage.C18017l;
import defpackage.InterfaceC18706l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i) {
            super(new C12663l(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C12663l((C12663l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new C12720l(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new C12720l(384));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new C12720l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new C18017l());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest512", "MessageDigest.DSTU7564-512", AbstractC11043l.subs(str, "$Digest384", "MessageDigest.DSTU7564-384", AbstractC11043l.subs(str, "$Digest256", "MessageDigest.DSTU7564-256", sb, configurableProvider), configurableProvider), configurableProvider);
            AbstractC11043l.adcel(configurableProvider, str, "$Digest256", "MessageDigest", InterfaceC18706l.crashlytics);
            AbstractC11043l.adcel(configurableProvider, str, "$Digest384", "MessageDigest", InterfaceC18706l.amazon);
            configurableProvider.addAlgorithm("MessageDigest", InterfaceC18706l.purchase, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", AbstractC0653l.ads(new StringBuilder(), str, "$HashMac256"), AbstractC12900l.firebase(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", AbstractC12900l.firebase(str, "$HashMac384"), AbstractC12900l.firebase(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", AbstractC12900l.firebase(str, "$HashMac512"), AbstractC12900l.firebase(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "DSTU7564-256", InterfaceC18706l.billing);
            addHMACAlias(configurableProvider, "DSTU7564-384", InterfaceC18706l.mopub);
            addHMACAlias(configurableProvider, "DSTU7564-512", InterfaceC18706l.admob);
        }
    }

    private DSTU7564() {
    }
}
