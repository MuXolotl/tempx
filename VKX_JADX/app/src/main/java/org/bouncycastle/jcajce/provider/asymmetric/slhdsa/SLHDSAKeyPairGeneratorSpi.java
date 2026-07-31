package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C11467l;
import defpackage.C1180l;
import defpackage.C15107l;
import defpackage.C16731l;
import defpackage.C18097l;
import defpackage.C18119l;
import defpackage.C18595l;
import defpackage.C6741l;
import defpackage.C9314l;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    C15107l engine;
    boolean initialised;
    C16731l param;
    SecureRandom random;

    public static class Hash extends SLHDSAKeyPairGeneratorSpi {
        public Hash() {
            super("HASH-SLH-DSA");
        }
    }

    public static class HashSha2_128f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_128f() {
            super(C6741l.f14139l);
        }
    }

    public static class HashSha2_128s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_128s() {
            super(C6741l.f14131l);
        }
    }

    public static class HashSha2_192f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_192f() {
            super(C6741l.f14124l);
        }
    }

    public static class HashSha2_192s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_192s() {
            super(C6741l.f14128l);
        }
    }

    public static class HashSha2_256f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_256f() {
            super(C6741l.f14140l);
        }
    }

    public static class HashSha2_256s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_256s() {
            super(C6741l.f14127l);
        }
    }

    public static class HashShake_128f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_128f() {
            super(C6741l.f14122l);
        }
    }

    public static class HashShake_128s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_128s() {
            super(C6741l.f14121l);
        }
    }

    public static class HashShake_192f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_192f() {
            super(C6741l.f14117l);
        }
    }

    public static class HashShake_192s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_192s() {
            super(C6741l.f14141l);
        }
    }

    public static class HashShake_256f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_256f() {
            super(C6741l.f14125l);
        }
    }

    public static class HashShake_256s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_256s() {
            super(C6741l.f14129l);
        }
    }

    public static class Pure extends SLHDSAKeyPairGeneratorSpi {
        public Pure() {
            super("SLH-DSA");
        }
    }

    public static class Sha2_128f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_128f() {
            super(C6741l.f14126l);
        }
    }

    public static class Sha2_128s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_128s() {
            super(C6741l.f14119l);
        }
    }

    public static class Sha2_192f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_192f() {
            super(C6741l.f14133l);
        }
    }

    public static class Sha2_192s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_192s() {
            super(C6741l.f14132l);
        }
    }

    public static class Sha2_256f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_256f() {
            super(C6741l.f14137l);
        }
    }

    public static class Sha2_256s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_256s() {
            super(C6741l.f14120l);
        }
    }

    public static class Shake_128f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_128f() {
            super(C6741l.f14123l);
        }
    }

    public static class Shake_128s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_128s() {
            super(C6741l.f14136l);
        }
    }

    public static class Shake_192f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_192f() {
            super(C6741l.f14130l);
        }
    }

    public static class Shake_192s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_192s() {
            super(C6741l.f14138l);
        }
    }

    public static class Shake_256f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_256f() {
            super(C6741l.f14135l);
        }
    }

    public static class Shake_256s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_256s() {
            super(C6741l.f14118l);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        C6741l c6741l = C6741l.f14126l;
        map.put("SLH-DSA-SHA2-128F", C18097l.amazon);
        Map map2 = parameters;
        C6741l c6741l2 = C6741l.f14126l;
        map2.put("SLH-DSA-SHA2-128S", C18097l.purchase);
        Map map3 = parameters;
        C6741l c6741l3 = C6741l.f14126l;
        map3.put("SLH-DSA-SHA2-192F", C18097l.billing);
        Map map4 = parameters;
        C6741l c6741l4 = C6741l.f14126l;
        map4.put("SLH-DSA-SHA2-192S", C18097l.mopub);
        Map map5 = parameters;
        C6741l c6741l5 = C6741l.f14126l;
        map5.put("SLH-DSA-SHA2-256F", C18097l.admob);
        Map map6 = parameters;
        C6741l c6741l6 = C6741l.f14126l;
        map6.put("SLH-DSA-SHA2-256S", C18097l.subs);
        Map map7 = parameters;
        C6741l c6741l7 = C6741l.f14126l;
        map7.put("SLH-DSA-SHAKE-128F", C18097l.isPro);
        Map map8 = parameters;
        C6741l c6741l8 = C6741l.f14126l;
        map8.put("SLH-DSA-SHAKE-128S", C18097l.firebase);
        Map map9 = parameters;
        C6741l c6741l9 = C6741l.f14126l;
        map9.put("SLH-DSA-SHAKE-192F", C18097l.smaato);
        Map map10 = parameters;
        C6741l c6741l10 = C6741l.f14126l;
        map10.put("SLH-DSA-SHAKE-192S", C18097l.remoteconfig);
        Map map11 = parameters;
        C6741l c6741l11 = C6741l.f14126l;
        map11.put("SLH-DSA-SHAKE-256F", C18097l.vip);
        Map map12 = parameters;
        C6741l c6741l12 = C6741l.f14126l;
        map12.put("SLH-DSA-SHAKE-256S", C18097l.metrica);
        Map map13 = parameters;
        C6741l c6741l13 = C6741l.f14126l;
        map13.put("SLH-DSA-SHA2-128F-WITH-SHA256", C18097l.startapp);
        Map map14 = parameters;
        C6741l c6741l14 = C6741l.f14126l;
        map14.put("SLH-DSA-SHA2-128S-WITH-SHA256", C18097l.adcel);
        Map map15 = parameters;
        C6741l c6741l15 = C6741l.f14126l;
        map15.put("SLH-DSA-SHA2-192F-WITH-SHA512", C18097l.ads);
        Map map16 = parameters;
        C6741l c6741l16 = C6741l.f14126l;
        map16.put("SLH-DSA-SHA2-192S-WITH-SHA512", C18097l.subscription);
        Map map17 = parameters;
        C6741l c6741l17 = C6741l.f14126l;
        map17.put("SLH-DSA-SHA2-256F-WITH-SHA512", C18097l.tapsense);
        Map map18 = parameters;
        C6741l c6741l18 = C6741l.f14126l;
        map18.put("SLH-DSA-SHA2-256S-WITH-SHA512", C18097l.Signature);
        Map map19 = parameters;
        C6741l c6741l19 = C6741l.f14126l;
        map19.put("SLH-DSA-SHAKE-128F-WITH-SHAKE128", C18097l.license);
        Map map20 = parameters;
        C6741l c6741l20 = C6741l.f14126l;
        map20.put("SLH-DSA-SHAKE-128S-WITH-SHAKE128", C18097l.pro);
        Map map21 = parameters;
        C6741l c6741l21 = C6741l.f14126l;
        map21.put("SLH-DSA-SHAKE-192F-WITH-SHAKE256", C18097l.ad);
        Map map22 = parameters;
        C6741l c6741l22 = C6741l.f14126l;
        map22.put("SLH-DSA-SHAKE-192S-WITH-SHAKE256", C18097l.advert);
        Map map23 = parameters;
        C6741l c6741l23 = C6741l.f14126l;
        map23.put("SLH-DSA-SHAKE-256F-WITH-SHAKE256", C18097l.isVip);
        Map map24 = parameters;
        C6741l c6741l24 = C6741l.f14126l;
        map24.put("SLH-DSA-SHAKE-256S-WITH-SHAKE256", C18097l.signatures);
    }

    public SLHDSAKeyPairGeneratorSpi(C6741l c6741l) {
        super("SLH-DSA-".concat(AbstractC9008l.mopub(c6741l.f14142l)));
        this.engine = new C15107l();
        SecureRandom secureRandomLoadAd = AbstractC8776l.loadAd();
        this.random = secureRandomLoadAd;
        this.initialised = false;
        C16731l c16731l = new C16731l(secureRandomLoadAd, (C18097l) parameters.get(c6741l.f14142l));
        this.param = c16731l;
        this.engine.mo274throws(c16731l);
        this.initialised = true;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof C6741l ? ((C6741l) algorithmParameterSpec).f14142l : AbstractC9008l.mopub((String) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 0)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            boolean zStartsWith = getAlgorithm().startsWith("HASH");
            SecureRandom secureRandom = this.random;
            this.param = zStartsWith ? new C16731l(secureRandom, C18097l.startapp) : new C16731l(secureRandom, C18097l.amazon);
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCSLHDSAPublicKey((C9314l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCSLHDSAPrivateKey((C1180l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            C11467l.pro(algorithmParameterSpec, "invalid ParameterSpec: ");
            return;
        }
        C18097l c18097l = (C18097l) parameters.get(nameFromParams);
        if (c18097l == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: ".concat(nameFromParams));
        }
        C16731l c16731l = new C16731l(secureRandom, c18097l);
        this.param = c16731l;
        this.engine.mo274throws(c16731l);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    public SLHDSAKeyPairGeneratorSpi(String str) {
        super(str);
        this.engine = new C15107l();
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
    }
}
