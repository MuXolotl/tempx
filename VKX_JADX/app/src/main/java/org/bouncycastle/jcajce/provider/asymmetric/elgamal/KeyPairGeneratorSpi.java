package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC0586l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C10183l;
import defpackage.C12425l;
import defpackage.C14060l;
import defpackage.C14223l;
import defpackage.C1795l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C8266l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    int certainty;
    C8266l engine;
    boolean initialised;
    C10183l param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.engine = new C8266l();
        this.strength = 1024;
        this.certainty = 20;
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
            if (dHDefaultParameters != null) {
                this.param = new C10183l(this.random, new C12425l(dHDefaultParameters.getL(), dHDefaultParameters.getP(), dHDefaultParameters.getG()));
            } else {
                int i = this.strength;
                int i2 = this.certainty;
                SecureRandom secureRandom = this.random;
                BigInteger bigInteger = AbstractC0586l.yandex(i, i2, secureRandom)[0];
                this.param = new C10183l(secureRandom, new C12425l(0, bigInteger, AbstractC0586l.loadAd(bigInteger, secureRandom)));
            }
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCElGamalPublicKey((C14223l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCElGamalPrivateKey((C1795l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        C10183l c10183l;
        boolean z = algorithmParameterSpec instanceof C14060l;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            C18073l.pro("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
            return;
        }
        if (z) {
            C14060l c14060l = (C14060l) algorithmParameterSpec;
            c10183l = new C10183l(secureRandom, new C12425l(0, c14060l.f27407l, c14060l.f27406l));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            c10183l = new C10183l(secureRandom, new C12425l(dHParameterSpec.getL(), dHParameterSpec.getP(), dHParameterSpec.getG()));
        }
        this.param = c10183l;
        this.engine.mo274throws(this.param);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
