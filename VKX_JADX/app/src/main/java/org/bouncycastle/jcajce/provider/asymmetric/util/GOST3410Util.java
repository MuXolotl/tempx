package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC8831l;
import defpackage.C0277l;
import defpackage.C0419l;
import defpackage.C18073l;
import defpackage.C4598l;
import defpackage.C6230l;
import defpackage.C9669l;
import defpackage.InterfaceC2320l;
import defpackage.InterfaceC9920l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410Util {
    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof InterfaceC2320l)) {
            C18073l.smaato("can't identify GOST3410 private key.");
            return null;
        }
        InterfaceC2320l interfaceC2320l = (InterfaceC2320l) privateKey;
        C0419l c0419l = ((C6230l) interfaceC2320l.getParameters()).f13162l;
        return new C4598l(interfaceC2320l.getX(), new C0277l(c0419l.yandex, c0419l.loadAd, c0419l.crashlytics));
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof InterfaceC9920l)) {
            throw new InvalidKeyException("can't identify GOST3410 public key: ".concat(publicKey.getClass().getName()));
        }
        InterfaceC9920l interfaceC9920l = (InterfaceC9920l) publicKey;
        C0419l c0419l = ((C6230l) interfaceC9920l.getParameters()).f13162l;
        return new C9669l(interfaceC9920l.getY(), new C0277l(c0419l.yandex, c0419l.loadAd, c0419l.crashlytics));
    }
}
