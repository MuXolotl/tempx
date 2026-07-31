package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC4338l;
import defpackage.C0361l;
import defpackage.C14599l;
import defpackage.C1483l;
import defpackage.C15671l;
import defpackage.C17951l;
import defpackage.C18017l;
import defpackage.C4604l;
import defpackage.Cfor;
import defpackage.InterfaceC8134l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class DigestParallelHash extends BCMessageDigest implements Cloneable {
        public DigestParallelHash(int i, int i2) {
            super(new C1483l(i, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C1483l((C1483l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestParallelHash128_256 extends DigestParallelHash {
        public DigestParallelHash128_256() {
            super(128, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class DigestParallelHash256_512 extends DigestParallelHash {
        public DigestParallelHash256_512() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new C4604l(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C4604l((C4604l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i, int i2) {
            super(new C17951l(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C17951l((C17951l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class DigestTupleHash extends BCMessageDigest implements Cloneable {
        public DigestTupleHash(int i, int i2) {
            super(new C14599l(i, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new C14599l((C14599l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestTupleHash128_256 extends DigestTupleHash {
        public DigestTupleHash128_256() {
            super(128, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class DigestTupleHash256_512 extends DigestTupleHash {
        public DigestTupleHash256_512() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new C0361l(new C4604l(i)));
        }
    }

    public static class KMac128 extends BaseMac {
        public KMac128() {
            super(new C15671l(128, new byte[0]));
        }
    }

    public static class KMac256 extends BaseMac {
        public KMac256() {
            super(new C15671l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new byte[0]));
        }
    }

    public static class KeyFactory224 extends KeyFactorySHA3 {
        public KeyFactory224() {
            super(224, InterfaceC8134l.remoteconfig);
        }
    }

    public static class KeyFactory256 extends KeyFactorySHA3 {
        public KeyFactory256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, InterfaceC8134l.vip);
        }
    }

    public static class KeyFactory384 extends KeyFactorySHA3 {
        public KeyFactory384() {
            super(384, InterfaceC8134l.metrica);
        }
    }

    public static class KeyFactory512 extends KeyFactorySHA3 {
        public KeyFactory512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, InterfaceC8134l.startapp);
        }
    }

    public static class KeyFactoryKMAC extends BaseSecretKeyFactory {
        public KeyFactoryKMAC(int i, Cfor cfor) {
            super(AbstractC0653l.vip(i, "KMAC"), cfor);
        }
    }

    public static class KeyFactoryKMAC128 extends KeyFactoryKMAC {
        public KeyFactoryKMAC128() {
            super(128, InterfaceC8134l.ads);
        }
    }

    public static class KeyFactoryKMAC256 extends KeyFactoryKMAC {
        public KeyFactoryKMAC256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES, InterfaceC8134l.subscription);
        }
    }

    public static class KeyFactorySHA3 extends BaseSecretKeyFactory {
        public KeyFactorySHA3(int i, Cfor cfor) {
            super(AbstractC0653l.vip(i, "HmacSHA3-"), cfor);
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super(AbstractC0653l.vip(i, "HMACSHA3-"), i, new C18017l());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$Digest512", "MessageDigest.SHA3-512", AbstractC11043l.subs(str, "$Digest384", "MessageDigest.SHA3-384", AbstractC11043l.subs(str, "$Digest256", "MessageDigest.SHA3-256", AbstractC11043l.subs(str, "$Digest224", "MessageDigest.SHA3-224", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            AbstractC11043l.adcel(configurableProvider, str, "$Digest224", "MessageDigest", InterfaceC8134l.mopub);
            AbstractC11043l.adcel(configurableProvider, str, "$Digest256", "MessageDigest", InterfaceC8134l.admob);
            AbstractC11043l.adcel(configurableProvider, str, "$Digest384", "MessageDigest", InterfaceC8134l.subs);
            configurableProvider.addAlgorithm("MessageDigest", InterfaceC8134l.isPro, str + "$Digest512");
            AbstractC11043l.vip(str, "$DigestShake128_256", "MessageDigest.SHAKE128-256", AbstractC11043l.subs(str, "$DigestShake256_512", "MessageDigest.SHAKE256-512", new StringBuilder(), configurableProvider), configurableProvider);
            AbstractC11043l.adcel(configurableProvider, str, "$DigestShake256_512", "MessageDigest", InterfaceC8134l.smaato);
            AbstractC11043l.adcel(configurableProvider, str, "$DigestShake128_256", "MessageDigest", InterfaceC8134l.firebase);
            addHMACAlgorithm(configurableProvider, "SHA3-224", AbstractC0653l.ads(AbstractC4338l.premium(configurableProvider, "Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512", "Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256"), str, "$HashMac224"), AbstractC12900l.firebase(str, "$KeyGenerator224"));
            Cfor cfor = InterfaceC8134l.remoteconfig;
            addHMACAlias(configurableProvider, "SHA3-224", cfor);
            StringBuilder sbRemoteconfig = AbstractC12900l.remoteconfig(cfor, "HMACSHA3-224", str, AbstractC4338l.signatures(str, "$KeyFactory224", configurableProvider, "SecretKeyFactory.HMACSHA3-224", "Alg.Alias.SecretKeyFactory."), configurableProvider);
            sbRemoteconfig.append("$HashMac256");
            addHMACAlgorithm(configurableProvider, "SHA3-256", sbRemoteconfig.toString(), AbstractC12900l.firebase(str, "$KeyGenerator256"));
            Cfor cfor2 = InterfaceC8134l.vip;
            addHMACAlias(configurableProvider, "SHA3-256", cfor2);
            StringBuilder sbRemoteconfig2 = AbstractC12900l.remoteconfig(cfor2, "HMACSHA3-256", str, AbstractC4338l.signatures(str, "$KeyFactory256", configurableProvider, "SecretKeyFactory.HMACSHA3-256", "Alg.Alias.SecretKeyFactory."), configurableProvider);
            sbRemoteconfig2.append("$HashMac384");
            addHMACAlgorithm(configurableProvider, "SHA3-384", sbRemoteconfig2.toString(), AbstractC12900l.firebase(str, "$KeyGenerator384"));
            Cfor cfor3 = InterfaceC8134l.metrica;
            addHMACAlias(configurableProvider, "SHA3-384", cfor3);
            StringBuilder sbRemoteconfig3 = AbstractC12900l.remoteconfig(cfor3, "HMACSHA3-384", str, AbstractC4338l.signatures(str, "$KeyFactory384", configurableProvider, "SecretKeyFactory.HMACSHA3-384", "Alg.Alias.SecretKeyFactory."), configurableProvider);
            sbRemoteconfig3.append("$HashMac512");
            addHMACAlgorithm(configurableProvider, "SHA3-512", sbRemoteconfig3.toString(), AbstractC12900l.firebase(str, "$KeyGenerator512"));
            Cfor cfor4 = InterfaceC8134l.startapp;
            addHMACAlias(configurableProvider, "SHA3-512", cfor4);
            StringBuilder sbRemoteconfig4 = AbstractC12900l.remoteconfig(cfor4, "HMACSHA3-512", str, AbstractC4338l.signatures(str, "$KeyFactory512", configurableProvider, "SecretKeyFactory.HMACSHA3-512", "Alg.Alias.SecretKeyFactory."), configurableProvider);
            sbRemoteconfig4.append("$KMac128");
            addKMACAlgorithm(configurableProvider, "128", sbRemoteconfig4.toString(), AbstractC12900l.firebase(str, "$KeyGenerator256"));
            StringBuilder sbRemoteconfig5 = AbstractC12900l.remoteconfig(InterfaceC8134l.tapsense, "KMAC128", str, AbstractC4338l.signatures(str, "$KeyFactoryKMAC128", configurableProvider, "SecretKeyFactory.KMAC128", "Alg.Alias.SecretKeyFactory."), configurableProvider);
            sbRemoteconfig5.append("$KMac256");
            addKMACAlgorithm(configurableProvider, "256", sbRemoteconfig5.toString(), AbstractC12900l.firebase(str, "$KeyGenerator512"));
            AbstractC4338l.applovin(AbstractC4338l.isVip("$DigestTupleHash256_512", "MessageDigest.TUPLEHASH256-512", str, AbstractC12900l.remoteconfig(InterfaceC8134l.Signature, "KMAC256", str, AbstractC4338l.signatures(str, "$KeyFactoryKMAC256", configurableProvider, "SecretKeyFactory.KMAC256", "Alg.Alias.SecretKeyFactory."), configurableProvider), configurableProvider), "$DigestTupleHash128_256", configurableProvider, "MessageDigest.TUPLEHASH128-256");
            AbstractC11043l.vip(str, "$DigestParallelHash128_256", "MessageDigest.PARALLELHASH128-256", AbstractC11043l.subs(str, "$DigestParallelHash256_512", "MessageDigest.PARALLELHASH256-512", AbstractC4338l.premium(configurableProvider, "Alg.Alias.MessageDigest.TUPLEHASH256", "TUPLEHASH256-512", "Alg.Alias.MessageDigest.TUPLEHASH128", "TUPLEHASH128-256"), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH256", "PARALLELHASH256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH128", "PARALLELHASH128-256");
        }
    }

    private SHA3() {
    }
}
