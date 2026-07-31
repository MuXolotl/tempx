package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import defpackage.AbstractC1757l;
import defpackage.C12726l;
import defpackage.C14287l;
import defpackage.C17029l;
import defpackage.C18262l;
import defpackage.C2756l;
import defpackage.C8838l;
import defpackage.Cfor;
import defpackage.InterfaceC11987l;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof C14287l) {
            return new BCECGOST3410PrivateKey((C14287l) keySpec);
        }
        return keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof C8838l) {
            return new BCECGOST3410PublicKey((C8838l) keySpec, BouncyCastleProvider.CONFIGURATION);
        }
        return keySpec instanceof ECPublicKeySpec ? new BCECGOST3410PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C12726l ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25096l), ecImplicitlyCa));
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
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
        if (!cls.isAssignableFrom(C14287l.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
        if (eCPrivateKey2.getParams() != null) {
            return new C14287l(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
        }
        return new C14287l(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (cfor.ad(InterfaceC11987l.smaato)) {
            return new BCECGOST3410PrivateKey(c2756l);
        }
        if (cfor.ad(InterfaceC11987l.advert)) {
            return new BCECGOST3410PrivateKey(c2756l);
        }
        if (cfor.ad(InterfaceC11987l.ad)) {
            return new BCECGOST3410PrivateKey(c2756l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (cfor.ad(InterfaceC11987l.smaato)) {
            return new BCECGOST3410PublicKey(c17029l);
        }
        if (cfor.ad(InterfaceC11987l.advert)) {
            return new BCECGOST3410PublicKey(c17029l);
        }
        if (cfor.ad(InterfaceC11987l.ad)) {
            return new BCECGOST3410PublicKey(c17029l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
