package defpackage;

import android.animation.Animator;

/* JADX INFO: renamed from: lُّۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12537l implements Animator.AnimatorListener {
    public final /* synthetic */ C12709l loadAd;
    public final /* synthetic */ C4651l yandex;

    public C12537l(C12709l c12709l, C4651l c4651l) {
        this.loadAd = c12709l;
        this.yandex = c4651l;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C12709l c12709l = this.loadAd;
        C4651l c4651l = this.yandex;
        c12709l.yandex(1.0f, c4651l, true);
        c4651l.firebase = c4651l.purchase;
        c4651l.smaato = c4651l.billing;
        c4651l.remoteconfig = c4651l.mopub;
        c4651l.yandex((c4651l.isPro + 1) % c4651l.subs.length);
        if (!c12709l.f25050l) {
            c12709l.f25048l += 1.0f;
            return;
        }
        c12709l.f25050l = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (c4651l.vip) {
            c4651l.vip = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.loadAd.f25048l = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
