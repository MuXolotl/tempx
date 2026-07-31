package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٔ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14944l {
    public final ArrayList amazon;
    public final C8688l billing;
    public int crashlytics;
    public final int loadAd;
    public final C16977l purchase;
    public final ArrayList yandex;

    public C14944l(int i, ArrayList arrayList) {
        this.yandex = arrayList;
        this.loadAd = i;
        if (i < 0) {
            AbstractC5363l.yandex("Invalid start index");
        }
        this.amazon = new ArrayList();
        C16977l c16977l = new C16977l();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C1944l c1944l = (C1944l) this.yandex.get(i3);
            int i4 = c1944l.crashlytics;
            int i5 = c1944l.amazon;
            c16977l.subs(i4, new C17096l(i3, i2, i5));
            i2 += i5;
        }
        this.purchase = c16977l;
        this.billing = new C8688l(new C7646l(21, this));
    }

    public final boolean yandex(int i, int i2) {
        C17096l c17096l;
        int i3;
        int i4;
        C16977l c16977l = this.purchase;
        C17096l c17096l2 = (C17096l) c16977l.loadAd(i);
        if (c17096l2 == null) {
            return false;
        }
        int i5 = c17096l2.loadAd;
        int i6 = i2 - c17096l2.crashlytics;
        c17096l2.crashlytics = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c16977l.crashlytics;
        long[] jArr = c16977l.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (c17096l = (C17096l) objArr[(i7 << 3) + i9]).loadAd) >= i5 && c17096l != c17096l2 && (i4 = i3 + i6) >= 0) {
                        c17096l.loadAd = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
