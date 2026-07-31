package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC0586l;
import defpackage.AbstractC8776l;
import defpackage.C18073l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;
    private int l = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        SecureRandom secureRandomLoadAd = this.random;
        int i = this.strength;
        if (secureRandomLoadAd == null) {
            secureRandomLoadAd = AbstractC8776l.loadAd();
        }
        BigInteger bigInteger = AbstractC0586l.yandex(i, 20, secureRandomLoadAd)[0];
        BigInteger bigIntegerLoadAd = AbstractC0586l.loadAd(bigInteger, secureRandomLoadAd);
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("ElGamal");
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(bigInteger, bigIntegerLoadAd, this.l));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e) {
            C18073l.license(e.getMessage());
            return null;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            C18073l.pro("DH parameter generator requires a DHGenParameterSpec for initialisation");
            return;
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.strength = dHGenParameterSpec.getPrimeSize();
        this.l = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
