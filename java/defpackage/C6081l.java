package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lؘۥؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6081l extends AnimatorListenerAdapter {
    public final /* synthetic */ C0880l crashlytics;
    public final /* synthetic */ boolean loadAd;
    public final /* synthetic */ ViewGroup yandex;

    public C6081l(ViewGroup viewGroup, boolean z, AbstractC18261l abstractC18261l, C0880l c0880l) {
        this.yandex = viewGroup;
        this.loadAd = z;
        this.crashlytics = c0880l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.yandex.endViewTransition(null);
        if (!this.loadAd) {
            throw null;
        }
        throw null;
    }
}
