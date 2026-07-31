package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC8831l;
import defpackage.C12425l;
import defpackage.C14223l;
import defpackage.C1795l;
import defpackage.C18073l;
import defpackage.InterfaceC16281l;
import defpackage.InterfaceC16898l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalUtil {
    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof InterfaceC16281l) {
            InterfaceC16281l interfaceC16281l = (InterfaceC16281l) privateKey;
            return new C1795l(interfaceC16281l.getX(), new C12425l(0, interfaceC16281l.getParameters().f27407l, interfaceC16281l.getParameters().f27406l));
        }
        if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new C1795l(dHPrivateKey.getX(), new C12425l(0, dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        }
        C18073l.smaato("can't identify private key for El Gamal.");
        return null;
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof InterfaceC16898l) {
            InterfaceC16898l interfaceC16898l = (InterfaceC16898l) publicKey;
            return new C14223l(interfaceC16898l.getY(), new C12425l(0, interfaceC16898l.getParameters().f27407l, interfaceC16898l.getParameters().f27406l));
        }
        if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new C14223l(dHPublicKey.getY(), new C12425l(0, dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        }
        C18073l.smaato("can't identify public key for El Gamal.");
        return null;
    }
}
