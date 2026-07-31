package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC0653l;
import defpackage.C18073l;
import defpackage.C18725l;
import defpackage.Cfor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    protected String algName;
    protected Cfor algOid;

    public BaseSecretKeyFactory(String str, Cfor cfor) {
        this.algName = str;
        this.algOid = cfor;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.algName);
        }
        C18073l.subscription("Invalid KeySpec");
        return null;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        String str;
        if (cls == null) {
            str = "keySpec parameter is null";
        } else {
            if (secretKey != null) {
                if (SecretKeySpec.class.isAssignableFrom(cls)) {
                    return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                }
                try {
                    return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
                } catch (Exception e) {
                    C18725l.amazon(e);
                    return null;
                }
            }
            str = "key parameter is null";
        }
        C18073l.subscription(str);
        return null;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            C18073l.smaato("key parameter is null");
            return null;
        }
        if (secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        throw new InvalidKeyException(AbstractC0653l.ads(new StringBuilder("Key not of type "), this.algName, "."));
    }
}
