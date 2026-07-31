package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9361l;
import defpackage.C0277l;
import defpackage.C17951l;
import defpackage.C8339l;
import java.math.BigInteger;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
class GOSTUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, C0277l c0277l) {
        byte[] bArrAdmob = AbstractC14024l.admob(bigInteger.toByteArray(), c0277l.f1277l.toByteArray(), c0277l.f1275l.toByteArray());
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, bArrAdmob.length, bArrAdmob);
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

    public static String privateKeyToString(String str, BigInteger bigInteger, C0277l c0277l) {
        StringBuilder sb = new StringBuilder();
        String str2 = AbstractC9008l.yandex;
        BigInteger bigIntegerModPow = c0277l.f1275l.modPow(bigInteger, c0277l.f1277l);
        sb.append(str);
        sb.append(" Private Key [");
        AbstractC9361l.appmetrica(sb, generateKeyFingerprint(bigIntegerModPow, c0277l), "]", str2, "                  Y: ");
        sb.append(bigIntegerModPow.toString(16));
        sb.append(str2);
        return sb.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, C0277l c0277l) {
        StringBuilder sb = new StringBuilder();
        String str2 = AbstractC9008l.yandex;
        sb.append(str);
        sb.append(" Public Key [");
        AbstractC9361l.appmetrica(sb, generateKeyFingerprint(bigInteger, c0277l), "]", str2, "                 Y: ");
        sb.append(bigInteger.toString(16));
        sb.append(str2);
        return sb.toString();
    }
}
