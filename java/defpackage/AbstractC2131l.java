package defpackage;

/* JADX INFO: renamed from: lْؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2131l {
    public static final byte[] loadAd;
    public static final char[] yandex = new char[64];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            yandex[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            yandex[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            yandex[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = yandex;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        loadAd = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = loadAd;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            loadAd[yandex[i3]] = (byte) i3;
        }
    }

    public static char[] yandex(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = ((length * 4) + 2) / 3;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = i6 + 1;
            byte b = bArr[i6];
            int i9 = b & 255;
            if (i8 < length) {
                i = i6 + 2;
                i2 = bArr[i8] & 255;
            } else {
                i = i8;
                i2 = 0;
            }
            if (i < length) {
                i3 = i + 1;
                i4 = bArr[i] & 255;
            } else {
                i3 = i;
                i4 = 0;
            }
            int i10 = ((b & 3) << 4) | (i2 >>> 4);
            int i11 = ((i2 & 15) << 2) | (i4 >>> 6);
            int i12 = i4 & 63;
            char[] cArr2 = yandex;
            cArr[i7] = cArr2[i9 >>> 2];
            int i13 = i7 + 2;
            cArr[i7 + 1] = cArr2[i10];
            char c = '=';
            cArr[i13] = i13 < i5 ? cArr2[i11] : '=';
            int i14 = i7 + 3;
            if (i14 < i5) {
                c = cArr2[i12];
            }
            cArr[i14] = c;
            i7 += 4;
            i6 = i3;
        }
        return cArr;
    }
}
