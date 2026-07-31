package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.C18073l;
import defpackage.Cfor;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory implements PBE {
    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    public PBESecretKeyFactory(String str, Cfor cfor, boolean z, int i, int i2, int i3, int i4) {
        super(str, cfor);
        this.forCipher = z;
        this.scheme = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            C18073l.subscription("Invalid KeySpec");
            return null;
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
        }
        boolean z = this.forCipher;
        int i = this.scheme;
        return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, z ? PBE.Util.makePBEParameters(pBEKeySpec, i, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, i, this.digest, this.keySize));
    }
}
