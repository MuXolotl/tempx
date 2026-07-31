package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class yandex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout.BaseBehavior crashlytics;
    public final /* synthetic */ AppBarLayout loadAd;
    public final /* synthetic */ CoordinatorLayout yandex;

    public yandex(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.crashlytics = baseBehavior;
        this.yandex = coordinatorLayout;
        this.loadAd = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.crashlytics.pro(this.yandex, this.loadAd, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
