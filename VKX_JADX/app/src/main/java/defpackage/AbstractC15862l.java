package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15862l {
    public static final long[] crashlytics;
    public static final int[] loadAd;
    public static final int[] yandex;

    static {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        yandex = iArr;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 16) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < 16) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        loadAd = iArr3;
        long[] jArr = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 16) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < 16) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        crashlytics = jArr;
    }

    public static final int admob(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static final byte amazon(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = loadAd)[cCharAt]) < 0) {
            billing(i, str);
            throw null;
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        billing(i4, str);
        throw null;
    }

    public static final void billing(int i, String str) {
        StringBuilder sbSignature = AbstractC2812l.Signature("Expected a hexadecimal digit at index ", i, ", but was ");
        sbSignature.append(str.charAt(i));
        throw new NumberFormatException(sbSignature.toString());
    }

    public static final int crashlytics(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final long isPro(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    public static final void loadAd(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            mopub(i, i2, 1, str, "at least");
            throw null;
        }
        if (i3 > 8) {
            int i4 = (i3 + i) - 8;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Expected the hexadecimal digit '0' at index ", i, ", but was '");
                    sbSignature.append(str.charAt(i));
                    sbSignature.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbSignature.toString());
                }
                i++;
            }
        }
    }

    public static final void mopub(int i, int i2, int i3, String str, String str2) {
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + str.substring(i, i2) + "\" of length " + (i2 - i));
    }

    public static final int purchase(int i, String str) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 << 4;
            char cCharAt = str.charAt(i4);
            if ((cCharAt >>> '\b') != 0 || (i2 = loadAd[cCharAt]) < 0) {
                billing(i4, str);
                throw null;
            }
            i3 = i5 | i2;
        }
        return i3;
    }

    public static String subs(int i) {
        if (C11753l.crashlytics.loadAd.loadAd) {
            return new String(new char[]{"0123456789abcdef".charAt(0), "0123456789abcdef".charAt(0), "0123456789abcdef".charAt(0), "0123456789abcdef".charAt(0), "0123456789abcdef".charAt(0), "0123456789abcdef".charAt(0), "0123456789abcdef".charAt((i >> 4) & 15), "0123456789abcdef".charAt(i & 15)});
        }
        long j = i;
        int iYandex = yandex(8L);
        char[] cArr = new char[iYandex];
        int iAdmob = admob("", cArr, 0);
        int i2 = 32;
        int i3 = 0;
        while (i3 < 8) {
            i2 -= 4;
            cArr[iAdmob] = "0123456789abcdef".charAt((int) ((j >> i2) & 15));
            i3++;
            iAdmob++;
        }
        int iAdmob2 = admob("", cArr, iAdmob);
        return iAdmob2 == iYandex ? new String(cArr) : AbstractC16648l.startapp(cArr, 0, iAdmob2);
    }

    public static final int yandex(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        C18262l.startapp(C10882l.loadAd(j), "The resulting string length is too big: ");
        return 0;
    }
}
