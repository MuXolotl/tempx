package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16018l implements Animator.AnimatorListener {
    public final /* synthetic */ C0307l yandex;

    public C16018l(C0307l c0307l) {
        this.yandex = c0307l;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0307l c0307l = this.yandex;
        ValueAnimator valueAnimator = c0307l.admob;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
        C11644l c11644l = c0307l.yandex;
        C9928l c9928l = (C9928l) c11644l.f23360l;
        if (c9928l != null) {
            for (InterfaceC13521l interfaceC13521l : (ArrayList) c11644l.f23361l) {
                ((C9928l) c11644l.f23358l).mo2796l(interfaceC13521l);
                c9928l.Signature(interfaceC13521l);
            }
            ((C9928l) c11644l.f23358l).adcel();
            ((C9928l) c11644l.f23358l).stop();
            c11644l.f23358l = c9928l;
            c11644l.f23360l = null;
        }
        c0307l.subs = false;
        c0307l.isPro = false;
        c0307l.purchase = !c0307l.purchase;
        c0307l.amazon.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
