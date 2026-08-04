package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: lًؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4756l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C4756l(View view, int i) {
        this.yandex = i;
        this.loadAd = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.yandex;
        View view = this.loadAd;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setAlpha(fFloatValue);
                if (fFloatValue == 0.0f) {
                    view.setVisibility(8);
                }
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
