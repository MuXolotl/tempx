package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C10198l;
import defpackage.C14998l;
import defpackage.C16673l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C2422l;
import defpackage.C6554l;
import defpackage.C6963l;
import defpackage.InterfaceC0543l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final C10198l PKCS_ALGID = new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l);
    private static final C10198l PSS_ALGID = new C10198l(InterfaceC0543l.f1918static);
    static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    C10198l algId;
    C16673l engine;
    C2422l param;

    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.PSS_ALGID);
        }
    }

    public KeyPairGeneratorSpi(String str, C10198l c10198l) {
        super(str);
        this.algId = c10198l;
        this.engine = new C16673l();
        C2422l c2422l = new C2422l(defaultPublicExponent, AbstractC8776l.loadAd(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = c2422l;
        this.engine.mo274throws(c2422l);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        C18595l c18595lPurchase = this.engine.purchase();
        return new KeyPair(new BCRSAPublicKey(this.algId, (C6963l) ((AbstractC8831l) c18595lPurchase.f36317l)), new BCRSAPrivateCrtKey(this.algId, (C6554l) ((AbstractC8831l) c18595lPurchase.f36316l)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            C18073l.pro("parameter object not a RSAKeyGenParameterSpec");
            return;
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        C2422l c2422l = new C2422l(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = c2422l;
        this.engine.mo274throws(c2422l);
    }

    public KeyPairGeneratorSpi() {
        this("RSA", PKCS_ALGID);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        C2422l c2422l = new C2422l(defaultPublicExponent, secureRandom, i, PrimeCertaintyCalculator.getDefaultCertainty(i));
        this.param = c2422l;
        this.engine.mo274throws(c2422l);
    }
}
