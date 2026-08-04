package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: lؙٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6439l extends DataSetObserver {
    public final /* synthetic */ AbstractC2361l yandex;

    public C6439l(AbstractC2361l abstractC2361l) {
        this.yandex = abstractC2361l;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.yandex.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.yandex.dataSetChanged();
    }
}
