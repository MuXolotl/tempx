package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC9361l;
import defpackage.C17029l;
import defpackage.C18262l;
import defpackage.C18725l;
import defpackage.C2756l;
import defpackage.Cfor;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePQCKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final Cfor keyOid;
    private final Set<Cfor> keyOids;

    public BasePQCKeyFactorySpi(Cfor cfor) {
        this.keyOid = cfor;
        this.keyOids = null;
    }

    private void checkAlgorithm(Cfor cfor) throws InvalidKeySpecException {
        Cfor cfor2 = this.keyOid;
        if (cfor2 != null) {
            if (!cfor2.ad(cfor)) {
                throw new InvalidKeySpecException(AbstractC9361l.license("incorrect algorithm OID for key: ", cfor));
            }
        } else if (!this.keyOids.contains(cfor)) {
            throw new InvalidKeySpecException(AbstractC9361l.license("incorrect algorithm OID for key: ", cfor));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C2756l c2756lVip = C2756l.vip(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(c2756lVip.f5961l.f20787l);
            return generatePrivate(c2756lVip);
        } catch (IllegalStateException e) {
            throw new InvalidKeySpecException(e.getMessage());
        } catch (InvalidKeySpecException e2) {
            throw e2;
        } catch (Exception e3) {
            C18725l.amazon(e3);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            C18262l.vip(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            C17029l c17029lVip = C17029l.vip(((X509EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(c17029lVip.f33175l.f20787l);
            return generatePublic(c17029lVip);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (Exception e2) {
            C18725l.amazon(e2);
            return null;
        }
    }

    public BasePQCKeyFactorySpi(Set<Cfor> set) {
        this.keyOid = null;
        this.keyOids = set;
    }
}
