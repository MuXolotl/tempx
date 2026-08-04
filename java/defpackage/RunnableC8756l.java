package defpackage;

import android.util.SparseArray;

/* JADX INFO: renamed from: lٌٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8756l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7815l f18019l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18020l;

    public /* synthetic */ RunnableC8756l(C7815l c7815l, int i) {
        this.f18020l = i;
        this.f18019l = c7815l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18020l;
        C7815l c7815l = this.f18019l;
        switch (i) {
            case 0:
                SparseArray sparseArray = c7815l.admob;
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C7413l) sparseArray.valueAt(i2)).getClass();
                    C7413l.yandex(null, null);
                }
                sparseArray.clear();
                break;
            default:
                ServiceConnectionC2783l serviceConnectionC2783l = c7815l.subs;
                if (serviceConnectionC2783l.f6081l == c7815l) {
                    serviceConnectionC2783l.isPro();
                }
                break;
        }
    }
}
