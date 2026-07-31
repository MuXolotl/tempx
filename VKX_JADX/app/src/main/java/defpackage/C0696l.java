package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: lؑۥؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0696l extends AnimatorListenerAdapter {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public C0696l(C12902l c12902l, View view) {
        this.loadAd = c12902l;
        this.crashlytics = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                ((C11154l) obj2).remove(animator);
                ((AbstractC1299l) obj).f3375l.remove(animator);
                break;
            default:
                C12902l c12902l = (C12902l) obj2;
                c12902l.yandex.amazon(1.0f);
                C12441l.purchase(c12902l, (View) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.yandex) {
            case 0:
                ((AbstractC1299l) this.crashlytics).f3375l.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0696l(AbstractC1299l abstractC1299l, C11154l c11154l) {
        this.crashlytics = abstractC1299l;
        this.loadAd = c11154l;
    }
}
