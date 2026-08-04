package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: lْٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13499l extends AbstractC13141l {
    public final WindowInsetsAnimation purchase;

    public C13499l(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.purchase = windowInsetsAnimation;
    }

    public static C15496l billing(WindowInsetsAnimation.Bounds bounds) {
        return C15496l.crashlytics(bounds.getLowerBound());
    }

    public static void mopub(View view, AbstractC15029l abstractC15029l) {
        view.setWindowInsetsAnimationCallback(abstractC15029l != null ? new C3040l(abstractC15029l) : null);
    }

    public static C15496l purchase(WindowInsetsAnimation.Bounds bounds) {
        return C15496l.crashlytics(bounds.getUpperBound());
    }

    @Override // defpackage.AbstractC13141l
    public final void amazon(float f) {
        this.purchase.setFraction(f);
    }

    @Override // defpackage.AbstractC13141l
    public final int crashlytics() {
        return this.purchase.getTypeMask();
    }

    @Override // defpackage.AbstractC13141l
    public final float loadAd() {
        return this.purchase.getInterpolatedFraction();
    }

    @Override // defpackage.AbstractC13141l
    public final long yandex() {
        return this.purchase.getDurationMillis();
    }
}
