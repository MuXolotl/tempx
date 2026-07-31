package androidx.recyclerview.widget;

import android.util.SparseArray;
import defpackage.AbstractC12930l;
import defpackage.C11632l;
import defpackage.C7611l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class billing {
    public static void yandex(RecyclerView recyclerView) {
        ArrayList<metrica> arrayList;
        firebase firebaseVar = recyclerView.mRecycler;
        if (firebaseVar != null && (arrayList = firebaseVar.crashlytics) != null) {
            for (metrica metricaVar : arrayList) {
                if (metricaVar != null) {
                    AbstractC12930l.loadAd(metricaVar.yandex);
                }
            }
        }
        C11632l recycledViewPool = recyclerView.getRecycledViewPool();
        for (int i = 0; i < recycledViewPool.yandex.size(); i++) {
            SparseArray sparseArray = recycledViewPool.yandex;
            C7611l c7611l = (C7611l) sparseArray.get(sparseArray.keyAt(i));
            if (c7611l != null) {
                for (metrica metricaVar2 : c7611l.yandex) {
                    if (metricaVar2 != null) {
                        AbstractC12930l.loadAd(metricaVar2.yandex);
                    }
                }
            }
        }
    }
}
