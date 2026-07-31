package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: lؚؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736l {
    public static final C2859l amazon(C2859l c2859l) {
        if (!(c2859l instanceof C2859l)) {
            c2859l = null;
        }
        if (c2859l != null) {
            return c2859l;
        }
        AbstractC2032l.loadAd("Inconsistent composition");
        C17132l.firebase();
        return null;
    }

    public static final void billing() {
        throw new ConcurrentModificationException();
    }

    public static final void crashlytics(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int loadAd(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int purchase(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C12317l) arrayList.get(i4)).yandex;
            if (i5 < 0) {
                i5 += i2;
            }
            int iSubs = AbstractC8576l.subs(i5, i);
            if (iSubs < 0) {
                i3 = i4 + 1;
            } else {
                if (iSubs <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int yandex(ArrayList arrayList, int i, int i2) {
        int iPurchase = purchase(arrayList, i, i2);
        return iPurchase >= 0 ? iPurchase : -(iPurchase + 1);
    }
}
