package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC0676l;
import defpackage.C17951l;
import defpackage.C6554l;
import defpackage.C6963l;
import defpackage.C8339l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC18049l;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class RSAUtil {
    public static final Cfor[] rsaOids = {InterfaceC0543l.f1922throw, InterfaceC18049l.f35345l, InterfaceC0543l.f1866continue, InterfaceC0543l.f1918static};

    public static String generateExponentFingerprint(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (32 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, byteArray.length, byteArray);
        int i = 32 / 8;
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

    public static String generateKeyFingerprint(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, byteArray.length, byteArray);
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

    public static C6963l generatePrivateKeyParameter(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof BCRSAPrivateKey) {
            return ((BCRSAPrivateKey) rSAPrivateKey).engineGetKeyParameters();
        }
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new C6963l(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent(), false);
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new C6554l(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient(), false);
    }

    public static C6963l generatePublicKeyParameter(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey instanceof BCRSAPublicKey ? ((BCRSAPublicKey) rSAPublicKey).engineGetKeyParameters() : new C6963l(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent(), false);
    }

    public static boolean isRsaOid(Cfor cfor) {
        int i = 0;
        while (true) {
            Cfor[] cforArr = rsaOids;
            if (i == cforArr.length) {
                return false;
            }
            if (cfor.ad(cforArr[i])) {
                return true;
            }
            i++;
        }
    }
}
