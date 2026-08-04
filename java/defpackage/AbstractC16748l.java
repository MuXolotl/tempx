package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: lْٖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16748l extends AbstractC8012l {
    public int loadAd = 0;
    public C12676l yandex;

    public AbstractC16748l() {
    }

    @Override // defpackage.AbstractC8012l
    public boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        tapsense(coordinatorLayout, view, i);
        if (this.yandex == null) {
            this.yandex = new C12676l(8, view);
        }
        C12676l c12676l = this.yandex;
        View view2 = (View) c12676l.purchase;
        c12676l.loadAd = view2.getTop();
        c12676l.crashlytics = view2.getLeft();
        this.yandex.amazon();
        int i2 = this.loadAd;
        if (i2 == 0) {
            return true;
        }
        C12676l c12676l2 = this.yandex;
        if (c12676l2.amazon != i2) {
            c12676l2.amazon = i2;
            c12676l2.amazon();
        }
        this.loadAd = 0;
        return true;
    }

    public final int subscription() {
        C12676l c12676l = this.yandex;
        if (c12676l != null) {
            return c12676l.amazon;
        }
        return 0;
    }

    public void tapsense(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.adcel(view, i);
    }

    public AbstractC16748l(int i) {
    }
}
