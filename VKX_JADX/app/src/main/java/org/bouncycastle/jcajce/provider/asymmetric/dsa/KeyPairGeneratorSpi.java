package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC8151l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C0531l;
import defpackage.C11467l;
import defpackage.C12933l;
import defpackage.C13649l;
import defpackage.C1638l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C2657l;
import defpackage.C4767l;
import defpackage.C7027l;
import defpackage.C8737l;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    C7027l engine;
    boolean initialised;
    C1638l param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new C7027l();
        this.strength = 2048;
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        C8737l c8737l;
        int i;
        if (!this.initialised) {
            Integer numValueOf = Integer.valueOf(this.strength);
            if (params.containsKey(numValueOf)) {
                this.param = (C1638l) params.get(numValueOf);
            } else {
                synchronized (lock) {
                    try {
                        if (params.containsKey(numValueOf)) {
                            this.param = (C1638l) params.get(numValueOf);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                            int i2 = this.strength;
                            if (i2 == 1024) {
                                c8737l = new C8737l();
                                if (AbstractC8151l.crashlytics("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                    i = this.strength;
                                    c8737l.crashlytics(i, defaultCertainty, this.random);
                                } else {
                                    c8737l.amazon(new C0531l(1024, 160, defaultCertainty, this.random));
                                }
                            } else if (i2 > 1024) {
                                C0531l c0531l = new C0531l(i2, PSKKeyManager.MAX_KEY_LENGTH_BYTES, defaultCertainty, this.random);
                                c8737l = new C8737l(new C2657l());
                                c8737l.amazon(c0531l);
                            } else {
                                c8737l = new C8737l();
                                i = this.strength;
                                c8737l.crashlytics(i, defaultCertainty, this.random);
                            }
                            C1638l c1638l = new C1638l(this.random, c8737l.yandex());
                            this.param = c1638l;
                            params.put(numValueOf, c1638l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCDSAPublicKey((C4767l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCDSAPrivateKey((C13649l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            C11467l.license("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
            return;
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i);
        if (dSADefaultParameters == null) {
            this.strength = i;
            this.random = secureRandom;
            this.initialised = false;
        } else {
            C1638l c1638l = new C1638l(secureRandom, new C12933l(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = c1638l;
            this.engine.mo274throws(c1638l);
            this.initialised = true;
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            C18073l.pro("parameter object not a DSAParameterSpec");
            return;
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        C1638l c1638l = new C1638l(secureRandom, new C12933l(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = c1638l;
        this.engine.mo274throws(c1638l);
        this.initialised = true;
    }
}
