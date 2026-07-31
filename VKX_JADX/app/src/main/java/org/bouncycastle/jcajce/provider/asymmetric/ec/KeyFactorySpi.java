package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC12396l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.C10198l;
import defpackage.C12726l;
import defpackage.C14287l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2444l;
import defpackage.C2756l;
import defpackage.C4148l;
import defpackage.C6972l;
import defpackage.C7154l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8838l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.InterfaceC15427l;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String algorithm;
    ProviderConfiguration configuration;

    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C14287l) {
            return new BCECPrivateKey(this.algorithm, (C14287l) keySpec, this.configuration);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (!(keySpec instanceof C6972l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C7154l c7154lVip = C7154l.vip(((C6972l) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.algorithm, new C2756l(new C10198l(InterfaceC15427l.f30173l, c7154lVip.ads(0, -1)), c7154lVip, (Cinterface) null, (byte[]) null), this.configuration);
        } catch (IOException e) {
            throw new InvalidKeySpecException(AbstractC5020l.adcel(e, new StringBuilder("bad encoding: ")));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof C8838l) {
                return new BCECPublicKey(this.algorithm, (C8838l) keySpec, this.configuration);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (!(keySpec instanceof C2444l)) {
                return super.engineGeneratePublic(keySpec);
            }
            AbstractC8831l abstractC8831lBilling = AbstractC12396l.billing(((C2444l) keySpec).getEncoded());
            if (!(abstractC8831lBilling instanceof C4148l)) {
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            C7838l c7838l = ((C4148l) abstractC8831lBilling).f4542l;
            return engineGeneratePublic(new C8838l(((C4148l) abstractC8831lBilling).f8515l, new C12726l(c7838l.f16360l, c7838l.f16358l, c7838l.f16362l, c7838l.f16361l, AbstractC14024l.crashlytics(c7838l.f16359l))));
        } catch (Exception e) {
            throw new InvalidKeySpecException(AbstractC12900l.admob(e, new StringBuilder("invalid KeySpec: ")), e);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        IOException iOException;
        StringBuilder sb;
        String strConcat;
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C12726l ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25096l), ecImplicitlyCa));
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPrivateKeySpec.class)) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C12726l ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.f25097l, ecImplicitlyCa2.f25096l), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(C8838l.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C8838l(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new C8838l(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(C14287l.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new C14287l(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new C14287l(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(C2444l.class) && (key instanceof ECPublicKey)) {
            if (key instanceof BCECPublicKey) {
                BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
                C12726l parameters = bCECPublicKey.getParameters();
                try {
                    return new C2444l(AbstractC12396l.purchase(new C4148l(bCECPublicKey.getQ(), new C7838l(parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l))));
                } catch (IOException e) {
                    iOException = e;
                    sb = new StringBuilder("unable to produce encoding: ");
                    strConcat = AbstractC5020l.adcel(iOException, sb);
                    C8339l.metrica(strConcat);
                    return null;
                }
            }
            strConcat = "invalid key type: ".concat(key.getClass().getName());
        } else {
            if (!cls.isAssignableFrom(C6972l.class) || !(key instanceof ECPrivateKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            if (key instanceof BCECPrivateKey) {
                try {
                    Ccase ccaseAds = C2756l.vip(key.getEncoded()).ads();
                    ccaseAds.getClass();
                    return new C6972l(ccaseAds.getEncoded());
                } catch (IOException e2) {
                    iOException = e2;
                    sb = new StringBuilder("cannot encoded key: ");
                    strConcat = AbstractC5020l.adcel(iOException, sb);
                    C8339l.metrica(strConcat);
                    return null;
                }
            }
            strConcat = "invalid key type: ".concat(key.getClass().getName());
        }
        C8339l.metrica(strConcat);
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.configuration);
        }
        C18073l.smaato("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (cfor.ad(InterfaceC15427l.f30173l)) {
            return new BCECPrivateKey(this.algorithm, c2756l, this.configuration);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (cfor.ad(InterfaceC15427l.f30173l)) {
            return new BCECPublicKey(this.algorithm, c17029l, this.configuration);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
