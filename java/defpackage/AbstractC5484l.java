package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٌؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5484l {
    public static final HashMap loadAd;
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        loadAd = new HashMap();
        map.put("JPG", "image/jpeg");
        map.put("PNG", "image/png");
        map.put("GIF", "image/gif");
        map.put("BMP", "image/bmp");
        map.put("TIF", "image/tiff");
        map.put("PDF", "image/pdf");
        map.put("PIC", "image/x-pict");
        for (String str : map.keySet()) {
            loadAd.put((String) yandex.get(str), str);
        }
        loadAd.put("image/jpg", "JPG");
    }

    public static String amazon(byte[] bArr) {
        if (crashlytics(bArr)) {
            return "image/png";
        }
        if (loadAd(bArr)) {
            return "image/jpeg";
        }
        if (yandex(bArr)) {
            return "image/gif";
        }
        if (bArr.length >= 2 && 66 == (bArr[0] & 255) && 77 == (bArr[1] & 255)) {
            return "image/bmp";
        }
        if (bArr.length >= 4 && 37 == (bArr[0] & 255) && 80 == (bArr[1] & 255) && 68 == (bArr[2] & 255) && 70 == (bArr[3] & 255)) {
            return "image/pdf";
        }
        if (bArr.length < 4) {
            return null;
        }
        int i = bArr[0] & 255;
        if (73 == i && 73 == (bArr[1] & 255) && 42 == (bArr[2] & 255) && (bArr[3] & 255) == 0) {
            return "image/tiff";
        }
        if (77 == i && 77 == (bArr[1] & 255) && (bArr[2] & 255) == 0 && 42 == (bArr[3] & 255)) {
            return "image/tiff";
        }
        return null;
    }

    public static boolean crashlytics(byte[] bArr) {
        return bArr.length >= 4 && 137 == (bArr[0] & 255) && 80 == (bArr[1] & 255) && 78 == (bArr[2] & 255) && 71 == (bArr[3] & 255);
    }

    public static boolean loadAd(byte[] bArr) {
        return bArr.length >= 4 && 255 == (bArr[0] & 255) && 216 == (bArr[1] & 255) && 255 == (bArr[2] & 255) && 219 <= (bArr[3] & 255);
    }

    public static boolean yandex(byte[] bArr) {
        return bArr.length >= 3 && 71 == (bArr[0] & 255) && 73 == (bArr[1] & 255) && 70 == (bArr[2] & 255);
    }
}
