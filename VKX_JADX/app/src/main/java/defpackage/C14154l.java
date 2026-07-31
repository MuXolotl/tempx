package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: lٓٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14154l extends DataSetObserver {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14154l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C1194l) obj).purchase();
                break;
            default:
                C2956l c2956l = (C2956l) obj;
                if (c2956l.f6435l.isShowing()) {
                    c2956l.mopub();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C1194l) obj).purchase();
                break;
            default:
                ((C2956l) obj).dismiss();
                break;
        }
    }
}
