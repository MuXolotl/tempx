package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC12396l;
import defpackage.AbstractC12492l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.C15860l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2444l;
import defpackage.C2756l;
import defpackage.C6554l;
import defpackage.C6963l;
import defpackage.C6972l;
import defpackage.C8339l;
import defpackage.Cfor;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(C2756l.vip(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                try {
                    return new BCRSAPrivateCrtKey(C15860l.vip(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception unused) {
                    throw new ExtendedInvalidKeySpecException(AbstractC5020l.ads(e, new StringBuilder("unable to process key spec: ")), e);
                }
            }
        }
        if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        }
        if (keySpec instanceof RSAPrivateKeySpec) {
            return new BCRSAPrivateKey((RSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof C6972l)) {
            throw new InvalidKeySpecException("unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        AbstractC8831l abstractC8831lLoadAd = AbstractC12492l.loadAd(((C6972l) keySpec).getEncoded());
        if (abstractC8831lLoadAd instanceof C6554l) {
            return new BCRSAPrivateCrtKey((C6554l) abstractC8831lLoadAd);
        }
        C18073l.subscription("open SSH public key is not RSA private key");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new BCRSAPublicKey((RSAPublicKeySpec) keySpec);
        }
        if (!(keySpec instanceof C2444l)) {
            return super.engineGeneratePublic(keySpec);
        }
        AbstractC8831l abstractC8831lBilling = AbstractC12396l.billing(((C2444l) keySpec).getEncoded());
        if (abstractC8831lBilling instanceof C6963l) {
            return new BCRSAPublicKey((C6963l) abstractC8831lBilling);
        }
        C18073l.subscription("Open SSH public key is not RSA public key");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        IOException iOException;
        StringBuilder sb;
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPublicKeySpec.class)) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPrivateCrtKeySpec.class)) && (key instanceof RSAPrivateCrtKey)) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPrivateKeySpec.class)) && (key instanceof RSAPrivateKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (cls.isAssignableFrom(C2444l.class) && (key instanceof RSAPublicKey)) {
            try {
                return new C2444l(AbstractC12396l.purchase(new C6963l(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent(), false)));
            } catch (IOException e) {
                iOException = e;
                sb = new StringBuilder("unable to produce encoding: ");
            }
        } else {
            if (!cls.isAssignableFrom(C6972l.class) || !(key instanceof RSAPrivateCrtKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            try {
                return new C6972l(AbstractC12492l.yandex(new C6554l(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient(), false)));
            } catch (IOException e2) {
                iOException = e2;
                sb = new StringBuilder("unable to produce encoding: ");
            }
        }
        C8339l.metrica(AbstractC5020l.adcel(iOException, sb));
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey) key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey) key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey) key);
        }
        C18073l.smaato("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (RSAUtil.isRsaOid(cfor)) {
            C15860l c15860lVip = C15860l.vip(c2756l.ads());
            return c15860lVip.f31128l.intValue() == 0 ? new BCRSAPrivateKey(c2756l.f5961l, c15860lVip) : new BCRSAPrivateCrtKey(c2756l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (RSAUtil.isRsaOid(cfor)) {
            return new BCRSAPublicKey(c17029l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
