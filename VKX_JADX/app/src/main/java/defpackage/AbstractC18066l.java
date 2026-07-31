package defpackage;

/* JADX INFO: renamed from: lٍ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18066l {
    public static final int[] loadAd;
    public static final char[] yandex = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    static {
        int[] iArr = new int[128];
        for (int i = 0; i < 128; i++) {
            char[] cArr = yandex;
            char c = (char) i;
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (c == cArr[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
            iArr[i] = i2;
        }
        loadAd = iArr;
    }
}
