package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17430l extends AnimatorListenerAdapter implements InterfaceC4788l {
    public boolean amazon = true;
    public final View crashlytics;
    public final View loadAd;
    public final /* synthetic */ C5671l purchase;
    public final ViewGroup yandex;

    public C17430l(C5671l c5671l, ViewGroup viewGroup, View view, View view2) {
        this.purchase = c5671l;
        this.yandex = viewGroup;
        this.loadAd = view;
        this.crashlytics = view2;
    }

    public final void admob() {
        this.crashlytics.setTag(R.id.save_overlay_view, null);
        this.yandex.getOverlay().remove(this.loadAd);
        this.amazon = false;
    }

    @Override // defpackage.InterfaceC4788l
    public final void crashlytics(AbstractC1299l abstractC1299l) {
        throw null;
    }

    @Override // defpackage.InterfaceC4788l
    public final void mopub(AbstractC1299l abstractC1299l) {
        if (this.amazon) {
            admob();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        admob();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.yandex.getOverlay().remove(this.loadAd);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.loadAd;
        if (view.getParent() == null) {
            this.yandex.getOverlay().add(view);
        } else {
            this.purchase.crashlytics();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.crashlytics;
            View view2 = this.loadAd;
            view.setTag(R.id.save_overlay_view, view2);
            this.yandex.getOverlay().add(view2);
            this.amazon = true;
        }
    }

    @Override // defpackage.InterfaceC4788l
    public final void purchase(AbstractC1299l abstractC1299l) {
        abstractC1299l.signatures(this);
    }

    @Override // defpackage.InterfaceC4788l
    public final void yandex(AbstractC1299l abstractC1299l) {
        abstractC1299l.signatures(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        admob();
    }

    @Override // defpackage.InterfaceC4788l
    public final void billing() {
    }

    @Override // defpackage.InterfaceC4788l
    public final void loadAd() {
    }

    @Override // defpackage.InterfaceC4788l
    public final void amazon(AbstractC1299l abstractC1299l) {
    }
}
