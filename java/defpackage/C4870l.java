package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: lؗٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4870l {
    public boolean amazon;
    public int[] billing;
    public boolean crashlytics;
    public int loadAd;
    public final /* synthetic */ StaggeredGridLayoutManager mopub;
    public boolean purchase;
    public int yandex;

    public C4870l(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.mopub = staggeredGridLayoutManager;
        yandex();
    }

    public final void yandex() {
        this.yandex = -1;
        this.loadAd = RecyclerView.UNDEFINED_DURATION;
        this.crashlytics = false;
        this.amazon = false;
        this.purchase = false;
        int[] iArr = this.billing;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
