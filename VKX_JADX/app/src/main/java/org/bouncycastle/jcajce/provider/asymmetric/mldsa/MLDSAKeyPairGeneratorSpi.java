package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C11467l;
import defpackage.C13812l;
import defpackage.C16791l;
import defpackage.C18119l;
import defpackage.C18595l;
import defpackage.C4124l;
import defpackage.C7083l;
import defpackage.C7633l;
import defpackage.C8339l;
import defpackage.C8729l;
import defpackage.C9957l;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    C7083l engine;
    boolean initialised;
    private final C13812l mldsaParameters;
    C9957l param;
    SecureRandom random;

    public static class Hash extends MLDSAKeyPairGeneratorSpi {
        public Hash() {
            super("HASH-ML-DSA");
        }
    }

    public static class MLDSA44 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44() {
            super(C16791l.f32811l);
        }
    }

    public static class MLDSA44withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44withSHA512() {
            super(C16791l.f32812l);
        }
    }

    public static class MLDSA65 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65() {
            super(C16791l.f32808l);
        }
    }

    public static class MLDSA65withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65withSHA512() {
            super(C16791l.f32814l);
        }
    }

    public static class MLDSA87 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87() {
            super(C16791l.f32813l);
        }
    }

    public static class MLDSA87withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87withSHA512() {
            super(C16791l.f32809l);
        }
    }

    public static class Pure extends MLDSAKeyPairGeneratorSpi {
        public Pure() {
            super("ML-DSA");
        }
    }

    public MLDSAKeyPairGeneratorSpi(C16791l c16791l) {
        super(AbstractC9008l.mopub(c16791l.f32815l));
        this.engine = new C7083l();
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
        C13812l parameters = Utils.getParameters(c16791l.f32815l);
        this.mldsaParameters = parameters;
        if (this.param == null) {
            this.param = new C9957l(parameters, this.random);
        }
        this.engine.mo274throws(this.param);
        this.initialised = true;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof C16791l ? ((C16791l) algorithmParameterSpec).f32815l : AbstractC9008l.mopub((String) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 0)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            boolean zStartsWith = getAlgorithm().startsWith("HASH");
            SecureRandom secureRandom = this.random;
            this.param = zStartsWith ? new C9957l(C13812l.subs, secureRandom) : new C9957l(C13812l.billing, secureRandom);
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCMLDSAPublicKey((C4124l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCMLDSAPrivateKey((C8729l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            C11467l.pro(algorithmParameterSpec, "invalid ParameterSpec: ");
            return;
        }
        C13812l parameters = Utils.getParameters(nameFromParams);
        if (parameters == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: ".concat(nameFromParams));
        }
        this.param = new C9957l(parameters, secureRandom);
        C13812l c13812l = this.mldsaParameters;
        if (c13812l != null && !parameters.loadAd.equals(c13812l.loadAd)) {
            throw new InvalidAlgorithmParameterException("key pair generator locked to ".concat(C16791l.yandex(this.mldsaParameters.loadAd).f32815l));
        }
        this.engine.mo274throws(this.param);
        this.initialised = true;
    }

    public MLDSAKeyPairGeneratorSpi(String str) {
        super(str);
        this.engine = new C7083l();
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
        this.mldsaParameters = null;
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            initialize(algorithmParameterSpec, SecureRandom.getInstance("DEFAULT", (Provider) new C7633l().f16631l));
        } catch (NoSuchAlgorithmException unused) {
            C8339l.smaato("unable to find DEFAULT DRBG");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
