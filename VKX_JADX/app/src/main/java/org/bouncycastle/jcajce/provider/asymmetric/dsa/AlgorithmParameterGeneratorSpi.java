package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC8776l;
import defpackage.C0531l;
import defpackage.C11467l;
import defpackage.C12933l;
import defpackage.C18073l;
import defpackage.C2657l;
import defpackage.C8737l;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected C0531l params;
    protected SecureRandom random;
    protected int strength = 2048;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        C8737l c8737l = this.strength <= 1024 ? new C8737l() : new C8737l(new C2657l());
        if (this.random == null) {
            this.random = AbstractC8776l.loadAd();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i = this.strength;
        SecureRandom secureRandom = this.random;
        if (i == 1024) {
            C0531l c0531l = new C0531l(1024, 160, defaultCertainty, secureRandom);
            this.params = c0531l;
            c8737l.amazon(c0531l);
        } else if (i > 1024) {
            C0531l c0531l2 = new C0531l(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES, defaultCertainty, secureRandom);
            this.params = c0531l2;
            c8737l.amazon(c0531l2);
        } else {
            c8737l.crashlytics(i, defaultCertainty, secureRandom);
        }
        C12933l c12933lYandex = c8737l.yandex();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DSA");
            algorithmParametersCreateParametersInstance.init(new DSAParameterSpec(c12933lYandex.f25380l, c12933lYandex.f25381l, c12933lYandex.f25382l));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e) {
            C18073l.license(e.getMessage());
            return null;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            C11467l.license("strength must be from 512 - 3072");
            return;
        }
        if (i <= 1024 && i % 64 != 0) {
            C11467l.license("strength must be a multiple of 64 below 1024 bits.");
        } else if (i > 1024 && i % 1024 != 0) {
            C11467l.license("strength must be a multiple of 1024 above 1024 bits.");
        } else {
            this.strength = i;
            this.random = secureRandom;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
