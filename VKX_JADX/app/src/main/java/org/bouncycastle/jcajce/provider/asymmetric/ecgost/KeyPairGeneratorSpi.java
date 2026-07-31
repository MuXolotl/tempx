package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import defpackage.AbstractC11696l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9361l;
import defpackage.C0429l;
import defpackage.C1054l;
import defpackage.C10825l;
import defpackage.C11467l;
import defpackage.C12726l;
import defpackage.C18073l;
import defpackage.C18595l;
import defpackage.C2542l;
import defpackage.C4148l;
import defpackage.C6051l;
import defpackage.C6265l;
import defpackage.C6895l;
import defpackage.C7100l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8374l;
import defpackage.Cfor;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    C6265l engine;
    boolean initialised;
    C1054l param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410");
        this.ecParams = null;
        this.engine = new C6265l();
        this.algorithm = "ECGOST3410";
        this.strength = 239;
        this.random = null;
        this.initialised = false;
    }

    private void init(C0429l c0429l, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        Cfor cfor = c0429l.f1561l;
        C7100l c7100lAmazon = AbstractC11696l.amazon(cfor);
        if (c7100lAmazon == null) {
            throw new InvalidAlgorithmParameterException(AbstractC9361l.license("unknown curve: ", cfor));
        }
        this.ecParams = new C10825l(AbstractC11696l.purchase(cfor), c7100lAmazon.f14871l.f6465l, c7100lAmazon.f14870l.vip(), c7100lAmazon.f14874l, c7100lAmazon.f14873l, c7100lAmazon.metrica());
        C2542l c2542l = new C2542l(c7100lAmazon);
        c2542l.f5539l = cfor;
        C1054l c1054l = new C1054l(new C6895l(c2542l, cfor, c0429l.f1560l, null), secureRandom);
        this.param = c1054l;
        this.engine.mo274throws(c1054l);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            C8339l.smaato("EC Key Pair Generator not initialised");
            return null;
        }
        C18595l c18595lPurchase = this.engine.purchase();
        C4148l c4148l = (C4148l) ((AbstractC8831l) c18595lPurchase.f36317l);
        C8374l c8374l = (C8374l) ((AbstractC8831l) c18595lPurchase.f36316l);
        Object obj = this.ecParams;
        if (obj instanceof C12726l) {
            C12726l c12726l = (C12726l) obj;
            BCECGOST3410PublicKey bCECGOST3410PublicKey = new BCECGOST3410PublicKey(this.algorithm, c4148l, c12726l);
            return new KeyPair(bCECGOST3410PublicKey, new BCECGOST3410PrivateKey(this.algorithm, c8374l, bCECGOST3410PublicKey, c12726l));
        }
        if (obj == null) {
            return new KeyPair(new BCECGOST3410PublicKey(this.algorithm, c4148l), new BCECGOST3410PrivateKey(this.algorithm, c8374l));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new BCECGOST3410PublicKey(this.algorithm, c4148l, eCParameterSpec);
        return new KeyPair(bCECGOST3410PublicKey2, new BCECGOST3410PrivateKey(this.algorithm, c8374l, bCECGOST3410PublicKey2, eCParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof C0429l) {
            init((C0429l) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof C12726l) {
            C12726l c12726l = (C12726l) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            C1054l c1054l = new C1054l(new C7838l(c12726l.f25097l, c12726l.f25095l, c12726l.f25099l, c12726l.f25098l, null), secureRandom);
            this.param = c1054l;
            this.engine.mo274throws(c1054l);
            this.initialised = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            C1054l c1054l2 = new C1054l(new C7838l(abstractC11918lConvertCurve, EC5Util.convertPoint(abstractC11918lConvertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), null), secureRandom);
            this.param = c1054l2;
            this.engine.mo274throws(c1054l2);
            this.initialised = true;
            return;
        }
        boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
        if (z || (algorithmParameterSpec instanceof C6051l)) {
            init(new C0429l(z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((C6051l) algorithmParameterSpec).f12824l), secureRandom);
            return;
        }
        if (algorithmParameterSpec == null) {
            ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
            if (providerConfiguration.getEcImplicitlyCa() != null) {
                C12726l ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                this.ecParams = algorithmParameterSpec;
                C1054l c1054l3 = new C1054l(new C7838l(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25095l, ecImplicitlyCa.f25099l, ecImplicitlyCa.f25098l, null), secureRandom);
                this.param = c1054l3;
                this.engine.mo274throws(c1054l3);
                this.initialised = true;
                return;
            }
        }
        if (algorithmParameterSpec != null || BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() != null) {
            throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        C18073l.pro("null parameter passed but no implicitCA set");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        String str;
        this.strength = i;
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj != null) {
            try {
                initialize((ECGenParameterSpec) obj, secureRandom);
                return;
            } catch (InvalidAlgorithmParameterException unused) {
                str = "key size not configurable.";
            }
        } else {
            str = "unknown key size.";
        }
        C11467l.license(str);
    }
}
