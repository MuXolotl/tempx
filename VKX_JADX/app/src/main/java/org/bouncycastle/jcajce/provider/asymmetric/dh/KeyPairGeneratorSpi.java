package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C0833l;
import defpackage.C12029l;
import defpackage.C12631l;
import defpackage.C14063l;
import defpackage.C14698l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C2396l;
import defpackage.C7438l;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    C14698l engine;
    boolean initialised;
    C0833l param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DH");
        this.engine = new C14698l();
        this.strength = 2048;
        this.random = AbstractC8776l.loadAd();
        this.initialised = false;
    }

    private C0833l convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        if (dHParameterSpec instanceof C14063l) {
            return new C0833l(((C14063l) dHParameterSpec).yandex(), secureRandom);
        }
        return new C0833l(new C2396l(dHParameterSpec.getL(), dHParameterSpec.getP(), dHParameterSpec.getG()), secureRandom);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        C0833l c0833lConvertParams;
        if (!this.initialised) {
            Integer numValueOf = Integer.valueOf(this.strength);
            if (params.containsKey(numValueOf)) {
                c0833lConvertParams = (C0833l) params.get(numValueOf);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    c0833lConvertParams = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        try {
                            if (params.containsKey(numValueOf)) {
                                this.param = (C0833l) params.get(numValueOf);
                            } else {
                                C12631l c12631l = new C12631l();
                                int i = this.strength;
                                int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(i);
                                SecureRandom secureRandom = this.random;
                                c12631l.yandex = i;
                                c12631l.loadAd = defaultCertainty;
                                c12631l.crashlytics = secureRandom;
                                C0833l c0833l = new C0833l(c12631l.yandex(), secureRandom);
                                this.param = c0833l;
                                params.put(numValueOf, c0833l);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.engine.mo274throws(this.param);
                this.initialised = true;
            }
            this.param = c0833lConvertParams;
            this.engine.mo274throws(this.param);
            this.initialised = true;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCDHPublicKey((C7438l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCDHPrivateKey((C12029l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            C18073l.pro("parameter object not a DHParameterSpec");
            return;
        }
        try {
            C0833l c0833lConvertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.param = c0833lConvertParams;
            this.engine.mo274throws(c0833lConvertParams);
            this.initialised = true;
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
        this.initialised = false;
    }
}
