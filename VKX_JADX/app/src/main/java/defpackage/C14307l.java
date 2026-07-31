package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٓٞٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14307l {
    public InterfaceC5174l amazon;
    public Interpolator crashlytics;
    public boolean purchase;
    public long loadAd = -1;
    public final C16575l billing = new C16575l(this);
    public final ArrayList yandex = new ArrayList();

    public final void loadAd() {
        View view;
        if (this.purchase) {
            return;
        }
        for (C2932l c2932l : this.yandex) {
            long j = this.loadAd;
            if (j >= 0) {
                c2932l.crashlytics(j);
            }
            Interpolator interpolator = this.crashlytics;
            if (interpolator != null && (view = (View) c2932l.yandex.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.amazon != null) {
                c2932l.amazon(this.billing);
            }
            View view2 = (View) c2932l.yandex.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.purchase = true;
    }

    public final void yandex() {
        if (this.purchase) {
            Iterator it = this.yandex.iterator();
            while (it.hasNext()) {
                ((C2932l) it.next()).loadAd();
            }
            this.purchase = false;
        }
    }
}
