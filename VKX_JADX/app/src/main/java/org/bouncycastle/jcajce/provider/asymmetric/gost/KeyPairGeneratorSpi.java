package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C0102l;
import defpackage.C0277l;
import defpackage.C0419l;
import defpackage.C10775l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C4598l;
import defpackage.C6230l;
import defpackage.C9669l;
import defpackage.InterfaceC11987l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    C0102l engine;
    C6230l gost3410Params;
    boolean initialised;
    C10775l param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.engine = new C0102l();
        this.strength = 1024;
        this.random = null;
        this.initialised = false;
    }

    private void init(C6230l c6230l, SecureRandom secureRandom) {
        C0419l c0419l = c6230l.f13162l;
        BigInteger bigInteger = c0419l.yandex;
        C0277l c0277l = new C0277l(bigInteger, c0419l.loadAd, c0419l.crashlytics);
        C10775l c10775l = new C10775l(bigInteger.bitLength() - 1, secureRandom);
        c10775l.f21798l = c0277l;
        this.param = c10775l;
        this.engine.mo274throws(c10775l);
        this.initialised = true;
        this.gost3410Params = c6230l;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            init(new C6230l(InterfaceC11987l.startapp.inmobi(), InterfaceC11987l.metrica.inmobi(), null), AbstractC8776l.loadAd());
        }
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCGOST3410PublicKey((C9669l) ((AbstractC8831l) c18595lPurchase.f36317l), this.gost3410Params), new BCGOST3410PrivateKey((C4598l) ((AbstractC8831l) c18595lPurchase.f36316l), this.gost3410Params));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof C6230l) {
            init((C6230l) algorithmParameterSpec, secureRandom);
        } else {
            C18073l.pro("parameter object not a GOST3410ParameterSpec");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
