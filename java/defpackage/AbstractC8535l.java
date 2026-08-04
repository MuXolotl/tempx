package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: lٌؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8535l {
    public static final C1561l yandex = new C1561l();

    public static byte[] amazon(int i, int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1561l c1561l = yandex;
            c1561l.getClass();
            if (i2 >= 0) {
                byte[] bArr2 = new byte[72];
                while (i2 > 0) {
                    int iMin = Math.min(36, i2);
                    int i3 = i + iMin;
                    int i4 = 0;
                    while (i < i3) {
                        int i5 = i + 1;
                        byte b = bArr[i];
                        int i6 = i4 + 1;
                        byte[] bArr3 = c1561l.yandex;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i2 -= iMin;
                    i = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("exception encoding Hex string: ")), e, 2);
        }
    }

    public static byte[] crashlytics(String str) {
        try {
            return yandex.loadAd(0, str.length(), str);
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("exception decoding Hex string: ")), e, 1);
        }
    }

    public static byte[] loadAd(int i, String str) {
        int i2 = 1;
        try {
            return yandex.loadAd(1, i, str);
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("exception decoding Hex string: ")), e, i2);
        }
    }

    public static String purchase(int i, int i2, byte[] bArr) {
        return AbstractC9008l.yandex(amazon(i, i2, bArr));
    }

    public static byte[] yandex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            yandex.yandex(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("exception decoding Hex string: ")), e, 1);
        }
    }
}
