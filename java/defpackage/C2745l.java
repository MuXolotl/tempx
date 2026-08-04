package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: lُؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2745l extends AnimatorListenerAdapter {
    public final /* synthetic */ C1500l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2745l(C1500l c1500l, int i) {
        this.yandex = i;
        this.loadAd = c1500l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.yandex) {
            case 1:
                this.loadAd.loadAd.mopub(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.yandex) {
            case 0:
                this.loadAd.loadAd.mopub(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
