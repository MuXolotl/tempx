package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC8831l;
import defpackage.C12029l;
import defpackage.C18073l;
import defpackage.C2396l;
import defpackage.C7438l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class DHUtil {
    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            C18073l.smaato("can't identify DH private key.");
            return null;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new C12029l(dHPrivateKey.getX(), new C2396l(dHPrivateKey.getParams().getL(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        if (!(publicKey instanceof DHPublicKey)) {
            C18073l.smaato("can't identify DH public key.");
            return null;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new C7438l(dHPublicKey.getY(), new C2396l(dHPublicKey.getParams().getL(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }
}
