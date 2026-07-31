package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4024l extends AbstractC14842l {
    public final /* synthetic */ C4485l loadAd;
    public boolean yandex = false;

    public C4024l(C4485l c4485l) {
        this.loadAd = c4485l;
    }

    @Override // defpackage.AbstractC14842l
    public final void loadAd(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.yandex = true;
    }

    @Override // defpackage.AbstractC14842l
    public final void yandex(int i) {
        if (i == 0 && this.yandex) {
            this.yandex = false;
            this.loadAd.mopub();
        }
    }
}
