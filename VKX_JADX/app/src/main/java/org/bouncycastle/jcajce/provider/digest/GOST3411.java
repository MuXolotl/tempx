package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C13527l;
import defpackage.C18017l;
import defpackage.C18567l;
import defpackage.C18715l;
import defpackage.Cfor;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC18410l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3411 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C18567l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new C18567l((C18567l) this.digest);
            return digest;
        }
    }

    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new C13527l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new C13527l((C13527l) this.digest);
            return digest2012_256;
        }
    }

    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new C18715l());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new C18715l((C18715l) this.digest);
            return digest2012_512;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0361l(new C18567l()));
        }
    }

    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new C0361l(new C13527l()));
        }
    }

    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new C0361l(new C18715l()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new C18017l());
        }
    }

    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest", "MessageDigest.GOST3411", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.MessageDigest.");
            Cfor cfor = InterfaceC11987l.yandex;
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(cfor, "GOST3411", str, sb2, configurableProvider);
            sbRemoteconfig.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "GOST3411", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "GOST3411", cfor);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", str + "$Digest2012_256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            StringBuilder sbRemoteconfig2 = AbstractC12900l.remoteconfig(InterfaceC18410l.yandex, "GOST3411-2012-256", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig2.append("$HashMac2012_256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", sbRemoteconfig2.toString(), AbstractC12900l.firebase(str, "$KeyGenerator2012_256"));
            addHMACAlias(configurableProvider, "GOST3411-2012-256", InterfaceC18410l.crashlytics);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", str + "$Digest2012_512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            StringBuilder sbRemoteconfig3 = AbstractC12900l.remoteconfig(InterfaceC18410l.loadAd, "GOST3411-2012-512", str, new StringBuilder("Alg.Alias.MessageDigest."), configurableProvider);
            sbRemoteconfig3.append("$HashMac2012_512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", sbRemoteconfig3.toString(), AbstractC12900l.firebase(str, "$KeyGenerator2012_512"));
            addHMACAlias(configurableProvider, "GOST3411-2012-512", InterfaceC18410l.amazon);
            AbstractC11043l.metrica(AbstractC4338l.signatures(str, "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACGOST3411", "Alg.Alias.SecretKeyFactory."), cfor, configurableProvider, "PBEWITHHMACGOST3411");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
        }
    }

    private GOST3411() {
    }
}
