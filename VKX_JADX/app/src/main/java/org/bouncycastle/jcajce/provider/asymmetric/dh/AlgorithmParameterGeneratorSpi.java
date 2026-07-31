package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC8776l;
import defpackage.C12631l;
import defpackage.C18073l;
import defpackage.C2396l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 2048;
    private int l = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        C12631l c12631l = new C12631l();
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i = this.strength;
        SecureRandom secureRandomLoadAd = this.random;
        if (secureRandomLoadAd == null) {
            secureRandomLoadAd = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        c12631l.yandex = i;
        c12631l.loadAd = defaultCertainty;
        c12631l.crashlytics = secureRandomLoadAd;
        C2396l c2396lYandex = c12631l.yandex();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DH");
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(c2396lYandex.f5158l, c2396lYandex.f5159l, this.l));
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
