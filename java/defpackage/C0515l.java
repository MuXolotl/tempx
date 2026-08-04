package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lؑۖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0515l extends AnimatorListenerAdapter {
    public final /* synthetic */ int amazon;
    public final /* synthetic */ C2587l billing;
    public final /* synthetic */ View crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ ViewPropertyAnimator purchase;
    public final /* synthetic */ metrica yandex;

    public C0515l(C2587l c2587l, metrica metricaVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.billing = c2587l;
        this.yandex = metricaVar;
        this.loadAd = i;
        this.crashlytics = view;
        this.amazon = i2;
        this.purchase = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.loadAd;
        View view = this.crashlytics;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.amazon != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.purchase.setListener(null);
        C2587l c2587l = this.billing;
        metrica metricaVar = this.yandex;
        c2587l.crashlytics(metricaVar);
        c2587l.startapp.remove(metricaVar);
        c2587l.subs();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.billing.getClass();
    }
}
