package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC1757l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2756l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC16281l;
import defpackage.InterfaceC16898l;
import defpackage.InterfaceC4502l;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof InterfaceC16898l) {
            return new BCElGamalPublicKey((InterfaceC16898l) key);
        }
        if (key instanceof InterfaceC16281l) {
            return new BCElGamalPrivateKey((InterfaceC16281l) key);
        }
        C18073l.smaato("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (cfor.ad(InterfaceC0543l.f1860abstract)) {
            return new BCElGamalPrivateKey(c2756l);
        }
        if (cfor.ad(InterfaceC15427l.f30146l)) {
            return new BCElGamalPrivateKey(c2756l);
        }
        if (cfor.ad(InterfaceC4502l.subs)) {
            return new BCElGamalPrivateKey(c2756l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (cfor.ad(InterfaceC0543l.f1860abstract)) {
            return new BCElGamalPublicKey(c17029l);
        }
        if (cfor.ad(InterfaceC15427l.f30146l)) {
            return new BCElGamalPublicKey(c17029l);
        }
        if (cfor.ad(InterfaceC4502l.subs)) {
            return new BCElGamalPublicKey(c17029l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
