package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: lِٜؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11973l extends AnimatorListenerAdapter {
    public final /* synthetic */ TextView amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ TextView loadAd;
    public final /* synthetic */ C17156l purchase;
    public final /* synthetic */ int yandex;

    public C11973l(C17156l c17156l, int i, TextView textView, int i2, TextView textView2) {
        this.purchase = c17156l;
        this.yandex = i;
        this.loadAd = textView;
        this.crashlytics = i2;
        this.amazon = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9189l c9189l;
        int i = this.yandex;
        C17156l c17156l = this.purchase;
        c17156l.vip = i;
        c17156l.smaato = null;
        TextView textView = this.loadAd;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.crashlytics == 1 && (c9189l = c17156l.ads) != null) {
                c9189l.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.amazon;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.amazon;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
