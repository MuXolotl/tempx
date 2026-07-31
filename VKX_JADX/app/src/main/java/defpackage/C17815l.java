package defpackage;

import android.view.WindowInsets;

/* JADX INFO: renamed from: lٍ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17815l extends C3521l {
    public C15496l subscription;

    public C17815l(C1473l c1473l, C17815l c17815l) {
        super(c1473l, c17815l);
        this.subscription = null;
        this.subscription = c17815l.subscription;
    }

    @Override // defpackage.C17212l
    public C1473l crashlytics() {
        return C1473l.admob(this.crashlytics.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.C17212l
    public void isVip(C15496l c15496l) {
        this.subscription = c15496l;
    }

    @Override // defpackage.C17212l
    public C1473l loadAd() {
        return C1473l.admob(this.crashlytics.consumeStableInsets(), null);
    }

    @Override // defpackage.C17212l
    public final C15496l smaato() {
        if (this.subscription == null) {
            WindowInsets windowInsets = this.crashlytics;
            this.subscription = C15496l.loadAd(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.subscription;
    }

    @Override // defpackage.C17212l
    public boolean subscription() {
        return this.crashlytics.isConsumed();
    }

    public C17815l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
        this.subscription = null;
    }
}
