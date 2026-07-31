package defpackage;

import android.util.SparseArray;

/* JADX INFO: renamed from: lِٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11886l {
    public C2049l loadAd;
    public final SparseArray yandex;

    public C11886l(int i) {
        this.yandex = new SparseArray(i);
    }

    public final void yandex(C2049l c2049l, int i, int i2) {
        int iYandex = c2049l.yandex(i);
        SparseArray sparseArray = this.yandex;
        C11886l c11886l = sparseArray == null ? null : (C11886l) sparseArray.get(iYandex);
        if (c11886l == null) {
            c11886l = new C11886l(1);
            sparseArray.put(c2049l.yandex(i), c11886l);
        }
        if (i2 > i) {
            c11886l.yandex(c2049l, i + 1, i2);
        } else {
            c11886l.loadAd = c2049l;
        }
    }
}
