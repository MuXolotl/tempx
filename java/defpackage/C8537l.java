package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: lٌؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8537l extends AnimatorListenerAdapter {
    public final /* synthetic */ C10518l loadAd;
    public final /* synthetic */ int yandex;

    public C8537l(C10518l c10518l, int i) {
        this.loadAd = c10518l;
        this.yandex = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.yandex;
        C10518l c10518l = this.loadAd;
        c10518l.f21400l = i;
        c10518l.f21407l = 0.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.loadAd.f21400l = this.yandex;
    }
}
