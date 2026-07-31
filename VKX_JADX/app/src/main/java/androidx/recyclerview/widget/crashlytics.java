package androidx.recyclerview.widget;

import defpackage.C8339l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class crashlytics {
    public int amazon;
    public int[] crashlytics;
    public int loadAd;
    public int yandex;

    public final void loadAd(RecyclerView recyclerView, boolean z) {
        this.amazon = 0;
        int[] iArr = this.crashlytics;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        isPro ispro = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || ispro == null || !ispro.subs) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.mopub()) {
                ispro.subs(recyclerView.mAdapter.mopub(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            ispro.admob(this.yandex, this.loadAd, recyclerView.mState, this);
        }
        int i = this.amazon;
        if (i > ispro.isPro) {
            ispro.isPro = i;
            ispro.firebase = z;
            recyclerView.mRecycler.vip();
        }
    }

    public final void yandex(int i, int i2) {
        if (i < 0) {
            C8339l.metrica("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C8339l.metrica("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.amazon;
        int i4 = i3 * 2;
        int[] iArr = this.crashlytics;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.crashlytics = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.crashlytics = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.crashlytics;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.amazon++;
    }
}
