package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0321l extends AnimatorListenerAdapter implements InterfaceC4788l {
    public boolean loadAd = false;
    public final View yandex;

    public C0321l(View view) {
        this.yandex = view;
    }

    @Override // defpackage.InterfaceC4788l
    public final void billing() {
        this.yandex.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.InterfaceC4788l
    public final void crashlytics(AbstractC1299l abstractC1299l) {
        throw null;
    }

    @Override // defpackage.InterfaceC4788l
    public final void loadAd() {
        View view = this.yandex;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC4770l.yandex.admob(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC4770l.yandex.firebase(this.yandex, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.loadAd;
        View view = this.yandex;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C2512l c2512l = AbstractC4770l.yandex;
        c2512l.firebase(view, 1.0f);
        c2512l.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.yandex;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.loadAd = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.InterfaceC4788l
    public final void yandex(AbstractC1299l abstractC1299l) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.InterfaceC4788l
    public final void amazon(AbstractC1299l abstractC1299l) {
    }

    @Override // defpackage.InterfaceC4788l
    public final void mopub(AbstractC1299l abstractC1299l) {
    }

    @Override // defpackage.InterfaceC4788l
    public final void purchase(AbstractC1299l abstractC1299l) {
    }
}
