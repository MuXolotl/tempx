package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: lؚٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3968l extends AnimatorListenerAdapter {
    public final /* synthetic */ View amazon;
    public final /* synthetic */ ViewPropertyAnimator crashlytics;
    public final /* synthetic */ C3989l loadAd;
    public final /* synthetic */ C2587l purchase;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3968l(C2587l c2587l, C3989l c3989l, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.yandex = i;
        this.purchase = c2587l;
        this.loadAd = c3989l;
        this.crashlytics = viewPropertyAnimator;
        this.amazon = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.yandex;
        C3989l c3989l = this.loadAd;
        C2587l c2587l = this.purchase;
        View view = this.amazon;
        ViewPropertyAnimator viewPropertyAnimator = this.crashlytics;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2587l.crashlytics(c3989l.yandex);
                c2587l.ads.remove(c3989l.yandex);
                c2587l.subs();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2587l.crashlytics(c3989l.loadAd);
                c2587l.ads.remove(c3989l.loadAd);
                c2587l.subs();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.yandex) {
            case 0:
                this.purchase.getClass();
                break;
            default:
                this.purchase.getClass();
                break;
        }
    }
}
