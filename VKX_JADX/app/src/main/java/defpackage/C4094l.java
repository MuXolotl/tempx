package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: lْؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4094l {
    public final SparseBooleanArray yandex;

    public C4094l(SparseBooleanArray sparseBooleanArray) {
        this.yandex = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4094l)) {
            return false;
        }
        C4094l c4094l = (C4094l) obj;
        SparseBooleanArray sparseBooleanArray = c4094l.yandex;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.yandex;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (loadAd(i2) != c4094l.loadAd(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.yandex;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + loadAd(i2);
        }
        return size;
    }

    public final int loadAd(int i) {
        SparseBooleanArray sparseBooleanArray = this.yandex;
        AbstractC12442l.smaato(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean yandex(int... iArr) {
        for (int i : iArr) {
            if (this.yandex.get(i)) {
                return true;
            }
        }
        return false;
    }
}
