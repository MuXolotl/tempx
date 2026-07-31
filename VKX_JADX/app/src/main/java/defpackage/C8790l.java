package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: lٌٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8790l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C12709l loadAd;
    public final /* synthetic */ C4651l yandex;

    public C8790l(C12709l c12709l, C4651l c4651l) {
        this.loadAd = c12709l;
        this.yandex = c4651l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C4651l c4651l = this.yandex;
        C12709l.amazon(fFloatValue, c4651l);
        C12709l c12709l = this.loadAd;
        c12709l.yandex(fFloatValue, c4651l, false);
        c12709l.invalidateSelf();
    }
}
