package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lًؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3986l extends AnimatorListenerAdapter implements InterfaceC4788l {
    public final ViewGroup crashlytics;
    public final int loadAd;
    public boolean purchase;
    public final View yandex;
    public boolean billing = false;
    public final boolean amazon = true;

    public C3986l(View view, int i) {
        this.yandex = view;
        this.loadAd = i;
        this.crashlytics = (ViewGroup) view.getParent();
        admob(true);
    }

    public final void admob(boolean z) {
        ViewGroup viewGroup;
        if (!this.amazon || this.purchase == z || (viewGroup = this.crashlytics) == null) {
            return;
        }
        this.purchase = z;
        AbstractC13702l.billing(viewGroup, z);
    }

    @Override // defpackage.InterfaceC4788l
    public final void billing() {
        admob(true);
        if (this.billing) {
            return;
        }
        AbstractC4770l.loadAd(this.yandex, 0);
    }

    @Override // defpackage.InterfaceC4788l
    public final void crashlytics(AbstractC1299l abstractC1299l) {
        throw null;
    }

    @Override // defpackage.InterfaceC4788l
    public final void loadAd() {
        admob(false);
        if (this.billing) {
            return;
        }
        AbstractC4770l.loadAd(this.yandex, this.loadAd);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.billing = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.billing) {
            AbstractC4770l.loadAd(this.yandex, this.loadAd);
            ViewGroup viewGroup = this.crashlytics;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        admob(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC4770l.loadAd(this.yandex, 0);
            ViewGroup viewGroup = this.crashlytics;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
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
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.billing) {
            AbstractC4770l.loadAd(this.yandex, this.loadAd);
            ViewGroup viewGroup = this.crashlytics;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        admob(false);
    }

    @Override // defpackage.InterfaceC4788l
    public final void amazon(AbstractC1299l abstractC1299l) {
    }

    @Override // defpackage.InterfaceC4788l
    public final void mopub(AbstractC1299l abstractC1299l) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
