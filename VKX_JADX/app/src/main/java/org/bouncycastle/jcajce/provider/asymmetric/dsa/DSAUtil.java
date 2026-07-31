package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC8831l;
import defpackage.C12933l;
import defpackage.C13649l;
import defpackage.C17029l;
import defpackage.C17951l;
import defpackage.C18073l;
import defpackage.C8339l;
import defpackage.Cfor;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC4502l;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class DSAUtil {
    public static final Cfor[] dsaOids = {InterfaceC15427l.f30177l, InterfaceC4502l.mopub, InterfaceC15427l.f30158l};

    public static String generateKeyFingerprint(BigInteger bigInteger, DSAParams dSAParams) {
        byte[] bArrSubs = AbstractC14024l.subs(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray());
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, bArrSubs.length, bArrSubs);
        int i = 160 / 8;
        byte[] bArr = new byte[i];
        c17951l.crashlytics(0, i, bArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (i2 > 0) {
                sb.append(":");
            }
            int i3 = (bArr[i2] >>> 4) & 15;
            char[] cArr = AbstractC0676l.yandex;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new C13649l(dSAPrivateKey.getX(), new C12933l(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        C18073l.smaato("can't identify DSA private key.");
        return null;
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(C17029l.vip(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            throw new InvalidKeyException("can't identify DSA public key: ".concat(publicKey.getClass().getName()));
        }
    }

    public static boolean isDsaOid(Cfor cfor) {
        int i = 0;
        while (true) {
            Cfor[] cforArr = dsaOids;
            if (i == cforArr.length) {
                return false;
            }
            if (cfor.ad(cforArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static C12933l toDSAParameters(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new C12933l(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
