package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: lَٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10276l {
    public int admob;
    public boolean amazon;
    public int[] billing;
    public int mopub;
    public boolean purchase;
    public Rect subs;
    public long loadAd = -9223372036854775807L;
    public long crashlytics = -9223372036854775807L;
    public final int[] yandex = new int[4];
    public int isPro = -1;
    public int firebase = -1;

    public static int crashlytics(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public static int yandex(int[] iArr, int i) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public final void loadAd(C5257l c5257l, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int iMopub = 0;
                while (true) {
                    if (iMopub >= i6 || i6 > 64) {
                        i = iMopub & 3;
                        if (iMopub >= 4) {
                            i2 = iMopub >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (c5257l.loadAd() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        iMopub = (iMopub << 4) | c5257l.mopub(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.yandex[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            c5257l.crashlytics();
        }
    }
}
