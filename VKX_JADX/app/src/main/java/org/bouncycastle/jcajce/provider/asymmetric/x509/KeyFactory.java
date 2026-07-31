package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.C17029l;
import defpackage.C18725l;
import defpackage.C2756l;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        try {
            C2756l c2756lVip = C2756l.vip(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(c2756lVip);
            if (privateKey != null) {
                return privateKey;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + c2756lVip.f5961l.f20787l);
        } catch (Exception e) {
            C18725l.amazon(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        try {
            C17029l c17029lVip = C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded());
            PublicKey publicKey = BouncyCastleProvider.getPublicKey(c17029lVip);
            if (publicKey != null) {
                return publicKey;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + c17029lVip.f33175l.f20787l);
        } catch (Exception e) {
            C18725l.amazon(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("not implemented yet " + key);
    }
}
