package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lؙٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16226l extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator amazon;
    public final /* synthetic */ View crashlytics;
    public final /* synthetic */ metrica loadAd;
    public final /* synthetic */ C2587l purchase;
    public final /* synthetic */ int yandex = 1;

    public C16226l(C2587l c2587l, metrica metricaVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.purchase = c2587l;
        this.loadAd = metricaVar;
        this.amazon = viewPropertyAnimator;
        this.crashlytics = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.yandex) {
            case 1:
                this.crashlytics.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.yandex;
        metrica metricaVar = this.loadAd;
        C2587l c2587l = this.purchase;
        ViewPropertyAnimator viewPropertyAnimator = this.amazon;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.crashlytics.setAlpha(1.0f);
                c2587l.crashlytics(metricaVar);
                c2587l.adcel.remove(metricaVar);
                c2587l.subs();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                c2587l.crashlytics(metricaVar);
                c2587l.metrica.remove(metricaVar);
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

    public C16226l(C2587l c2587l, metrica metricaVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.purchase = c2587l;
        this.loadAd = metricaVar;
        this.crashlytics = view;
        this.amazon = viewPropertyAnimator;
    }
}
