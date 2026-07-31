package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC12396l;
import defpackage.AbstractC12492l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.C12933l;
import defpackage.C13649l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2444l;
import defpackage.C2756l;
import defpackage.C4767l;
import defpackage.C6972l;
import defpackage.C8339l;
import defpackage.Cfor;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof C6972l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        AbstractC8831l abstractC8831lLoadAd = AbstractC12492l.loadAd(((C6972l) keySpec).getEncoded());
        if (!(abstractC8831lLoadAd instanceof C13649l)) {
            C8339l.metrica("openssh private key is not dsa privare key");
            return null;
        }
        C13649l c13649l = (C13649l) abstractC8831lLoadAd;
        BigInteger bigInteger = c13649l.f26673l;
        C12933l c12933l = (C12933l) c13649l.f16541l;
        return engineGeneratePrivate(new DSAPrivateKeySpec(bigInteger, c12933l.f25380l, c12933l.f25381l, c12933l.f25382l));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException(AbstractC12900l.admob(e, new StringBuilder("invalid KeySpec: "))) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        }
        if (!(keySpec instanceof C2444l)) {
            return super.engineGeneratePublic(keySpec);
        }
        AbstractC8831l abstractC8831lBilling = AbstractC12396l.billing(((C2444l) keySpec).getEncoded());
        if (!(abstractC8831lBilling instanceof C4767l)) {
            C8339l.metrica("openssh public key is not dsa public key");
            return null;
        }
        C4767l c4767l = (C4767l) abstractC8831lBilling;
        BigInteger bigInteger = c4767l.f9785l;
        C12933l c12933l = (C12933l) c4767l.f16541l;
        return engineGeneratePublic(new DSAPublicKeySpec(bigInteger, c12933l.f25380l, c12933l.f25381l, c12933l.f25382l));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        StringBuilder sb;
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (cls.isAssignableFrom(C2444l.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new C2444l(AbstractC12396l.purchase(new C4767l(dSAPublicKey2.getY(), new C12933l(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder("unable to produce encoding: ");
            }
        } else {
            if (!cls.isAssignableFrom(C6972l.class) || !(key instanceof DSAPrivateKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new C6972l(AbstractC12492l.yandex(new C13649l(dSAPrivateKey2.getX(), new C12933l(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e2) {
                e = e2;
                sb = new StringBuilder("unable to produce encoding: ");
            }
        }
        C8339l.metrica(AbstractC5020l.adcel(e, sb));
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        C18073l.smaato("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (DSAUtil.isDsaOid(cfor)) {
            return new BCDSAPrivateKey(c2756l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (DSAUtil.isDsaOid(cfor)) {
            return new BCDSAPublicKey(c17029l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
