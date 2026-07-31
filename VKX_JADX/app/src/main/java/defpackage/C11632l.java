package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: lِؖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11632l {
    public Set crashlytics;
    public int loadAd;
    public SparseArray yandex;

    public final C7611l yandex(int i) {
        SparseArray sparseArray = this.yandex;
        C7611l c7611l = (C7611l) sparseArray.get(i);
        if (c7611l != null) {
            return c7611l;
        }
        C7611l c7611l2 = new C7611l();
        sparseArray.put(i, c7611l2);
        return c7611l2;
    }
}
