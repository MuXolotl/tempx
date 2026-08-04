package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: lًؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7312l extends AnimatorListenerAdapter {
    public final /* synthetic */ C2777l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7312l(C2777l c2777l, int i) {
        this.yandex = i;
        this.loadAd = c2777l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.yandex) {
            case 1:
                super.onAnimationEnd(animator);
                C2777l c2777l = this.loadAd;
                ObjectAnimator objectAnimator = c2777l.crashlytics;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                C14228l c14228l = c2777l.isPro;
                if (c14228l != null) {
                    c14228l.yandex(c2777l.yandex);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.yandex) {
            case 0:
                super.onAnimationRepeat(animator);
                C2777l c2777l = this.loadAd;
                c2777l.mopub = (c2777l.mopub + 4) % c2777l.billing.crashlytics.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
