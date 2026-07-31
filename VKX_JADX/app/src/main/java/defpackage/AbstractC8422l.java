package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًۧؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8422l {
    public static final int[] yandex = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public static final int[] loadAd = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            yandex[i2] = 1 << i2;
            i2++;
        }
        for (i = 8; i < 256; i++) {
            int[] iArr = yandex;
            iArr[i] = ((iArr[i - 4] ^ iArr[i - 5]) ^ iArr[i - 6]) ^ iArr[i - 8];
        }
        for (int i3 = 0; i3 < 255; i3++) {
            loadAd[yandex[i3]] = i3;
        }
    }

    public static int yandex(int i) {
        while (i < 0) {
            i += 255;
        }
        while (i >= 256) {
            i -= 255;
        }
        return yandex[i];
    }
}
