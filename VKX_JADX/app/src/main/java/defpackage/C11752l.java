package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: lَِۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11752l extends AnimatorListenerAdapter {
    public final /* synthetic */ C17832l loadAd;
    public boolean yandex = false;

    public C11752l(C17832l c17832l) {
        this.loadAd = c17832l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.yandex = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.yandex) {
            this.yandex = false;
            return;
        }
        C17832l c17832l = this.loadAd;
        if (((Float) c17832l.isVip.getAnimatedValue()).floatValue() == 0.0f) {
            c17832l.signatures = 0;
            c17832l.isPro(0);
        } else {
            c17832l.signatures = 2;
            c17832l.subscription.invalidate();
        }
    }
}
