package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.C10146l;
import defpackage.C11058l;
import defpackage.C11467l;
import defpackage.C1658l;
import defpackage.C18119l;
import defpackage.C18493l;
import defpackage.C18595l;
import defpackage.C3786l;
import defpackage.C7610l;
import defpackage.C7633l;
import defpackage.C8339l;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMKeyPairGeneratorSpi extends KeyPairGenerator {
    C3786l engine;
    boolean initialised;
    private C18493l mlkemParameters;
    C11058l param;
    SecureRandom random;

    public static class MLKEM1024 extends MLKEMKeyPairGeneratorSpi {
        public MLKEM1024() {
            super(C7610l.f15657l);
        }
    }

    public static class MLKEM512 extends MLKEMKeyPairGeneratorSpi {
        public MLKEM512() {
            super(C7610l.f15655l);
        }
    }

    public static class MLKEM768 extends MLKEMKeyPairGeneratorSpi {
        public MLKEM768() {
            super(C7610l.f15654l);
        }
    }

    public MLKEMKeyPairGeneratorSpi(C7610l c7610l) {
        super(AbstractC9008l.mopub(c7610l.f15658l));
        this.engine = new C3786l();
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
        C18493l parameters = Utils.getParameters(c7610l.f15658l);
        this.mlkemParameters = parameters;
        if (this.param == null) {
            this.param = new C11058l(this.random, parameters);
        }
        this.engine.mo274throws(this.param);
        this.initialised = true;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof C7610l ? ((C7610l) algorithmParameterSpec).f15658l : AbstractC9008l.mopub((String) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 0)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            C11058l c11058l = new C11058l(this.random, C18493l.f36121l);
            this.param = c11058l;
            this.engine.mo274throws(c11058l);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCMLKEMPublicKey((C1658l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCMLKEMPrivateKey((C10146l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            C11467l.pro(algorithmParameterSpec, "invalid ParameterSpec: ");
            return;
        }
        C18493l parameters = Utils.getParameters(nameFromParams);
        if (parameters == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: ".concat(nameFromParams));
        }
        C18493l c18493l = this.mlkemParameters;
        if (c18493l != null && !parameters.f36123l.equals(c18493l.f36123l)) {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + getAlgorithm());
        }
        C11058l c11058l = new C11058l(secureRandom, parameters);
        this.param = c11058l;
        this.engine.mo274throws(c11058l);
        this.initialised = true;
    }

    public MLKEMKeyPairGeneratorSpi() {
        super("ML-KEM");
        this.engine = new C3786l();
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
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
