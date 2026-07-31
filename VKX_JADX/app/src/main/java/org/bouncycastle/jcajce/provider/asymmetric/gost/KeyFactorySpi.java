package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.AbstractC1757l;
import defpackage.C0419l;
import defpackage.C11853l;
import defpackage.C13266l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C2756l;
import defpackage.C6230l;
import defpackage.Cfor;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC2320l;
import defpackage.InterfaceC9920l;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof C13266l ? new BCGOST3410PrivateKey((C13266l) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof C11853l ? new BCGOST3410PublicKey((C11853l) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(C11853l.class) && (key instanceof InterfaceC9920l)) {
            InterfaceC9920l interfaceC9920l = (InterfaceC9920l) key;
            C0419l c0419l = ((C6230l) interfaceC9920l.getParameters()).f13162l;
            BigInteger y = interfaceC9920l.getY();
            BigInteger bigInteger = c0419l.yandex;
            BigInteger bigInteger2 = c0419l.loadAd;
            BigInteger bigInteger3 = c0419l.crashlytics;
            C11853l c11853l = new C11853l();
            c11853l.f23679l = y;
            c11853l.f23678l = bigInteger;
            c11853l.f23677l = bigInteger2;
            c11853l.f23680l = bigInteger3;
            return c11853l;
        }
        if (!cls.isAssignableFrom(C13266l.class) || !(key instanceof InterfaceC2320l)) {
            return super.engineGetKeySpec(key, cls);
        }
        InterfaceC2320l interfaceC2320l = (InterfaceC2320l) key;
        C0419l c0419l2 = ((C6230l) interfaceC2320l.getParameters()).f13162l;
        BigInteger x = interfaceC2320l.getX();
        BigInteger bigInteger4 = c0419l2.yandex;
        BigInteger bigInteger5 = c0419l2.loadAd;
        BigInteger bigInteger6 = c0419l2.crashlytics;
        C13266l c13266l = new C13266l();
        c13266l.f26044l = x;
        c13266l.f26043l = bigInteger4;
        c13266l.f26042l = bigInteger5;
        c13266l.f26045l = bigInteger6;
        return c13266l;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof InterfaceC9920l) {
            return new BCGOST3410PublicKey((InterfaceC9920l) key);
        }
        if (key instanceof InterfaceC2320l) {
            return new BCGOST3410PrivateKey((InterfaceC2320l) key);
        }
        C18073l.smaato("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(C2756l c2756l) throws IOException {
        Cfor cfor = c2756l.f5961l.f20787l;
        if (cfor.ad(InterfaceC11987l.firebase)) {
            return new BCGOST3410PrivateKey(c2756l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(C17029l c17029l) throws IOException {
        Cfor cfor = c17029l.f33175l.f20787l;
        if (cfor.ad(InterfaceC11987l.firebase)) {
            return new BCGOST3410PublicKey(c17029l);
        }
        C18262l.metrica(AbstractC1757l.m1037private("algorithm identifier ", cfor, " in key not recognised"));
        return null;
    }
}
