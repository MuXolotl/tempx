package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC15960l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC9008l;
import defpackage.AbstractC9361l;
import defpackage.C11104l;
import defpackage.C14685l;
import defpackage.C1561l;
import defpackage.C15654l;
import defpackage.C17951l;
import defpackage.C6254l;
import defpackage.C8339l;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private static String generateKeyFingerprint(byte[] bArr) {
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, bArr.length, bArr);
        int i = 160 / 8;
        byte[] bArr2 = new byte[i];
        c17951l.crashlytics(0, i, bArr2);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            if (i2 > 0) {
                sb.append(":");
            }
            int i3 = (bArr2[i2] >>> 4) & 15;
            char[] cArr = AbstractC0676l.yandex;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr2[i2] & 15]);
        }
        return sb.toString();
    }

    public static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static String keyToString(String str, String str2, AbstractC8831l abstractC8831l) {
        byte[] bArrCrashlytics;
        StringBuilder sb = new StringBuilder();
        String str3 = AbstractC9008l.yandex;
        if (abstractC8831l instanceof C14685l) {
            bArrCrashlytics = AbstractC14024l.crashlytics(((C14685l) abstractC8831l).f28737l);
        } else if (abstractC8831l instanceof C11104l) {
            byte[] bArr = new byte[57];
            AbstractC15960l.billing(((C11104l) abstractC8831l).f22309l, bArr, 0);
            bArrCrashlytics = bArr;
        } else {
            bArrCrashlytics = abstractC8831l instanceof C15654l ? AbstractC14024l.crashlytics(((C15654l) abstractC8831l).f30601l) : ((C6254l) abstractC8831l).getEncoded();
        }
        AbstractC9361l.appmetrica(sb, str2, " ", str, " [");
        AbstractC9361l.appmetrica(sb, generateKeyFingerprint(bArrCrashlytics), "]", str3, "    public data: ");
        C1561l c1561l = AbstractC8535l.yandex;
        sb.append(AbstractC8535l.purchase(0, bArrCrashlytics.length, bArrCrashlytics));
        sb.append(str3);
        return sb.toString();
    }
}
