package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class remoteconfig {
    public int amazon;
    public boolean billing;
    public int crashlytics;
    public int loadAd;
    public int mopub;
    public Interpolator purchase;
    public int yandex;

    public final void yandex(RecyclerView recyclerView) {
        int i = this.amazon;
        if (i >= 0) {
            this.amazon = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.billing = false;
            return;
        }
        if (!this.billing) {
            this.mopub = 0;
            return;
        }
        Interpolator interpolator = this.purchase;
        if (interpolator != null && this.crashlytics < 1) {
            C8339l.smaato("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.crashlytics;
        if (i2 < 1) {
            C8339l.smaato("Scroll duration must be a positive number");
            return;
        }
        recyclerView.mViewFlinger.crashlytics(this.yandex, this.loadAd, interpolator, i2);
        int i3 = this.mopub + 1;
        this.mopub = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.billing = false;
    }
}
