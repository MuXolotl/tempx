package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: lٌٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14131l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14131l(C2290l c2290l, View view) {
        this.yandex = 6;
        this.loadAd = c2290l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C9478l c9478l = (C9478l) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if ((!c9478l.purchase || !c9478l.amazon) && fFloatValue > 0.0f && fFloatValue < 0.01f) {
                    ((ValueAnimator) c9478l.billing.subs()).pause();
                }
                break;
            case 1:
                C9478l c9478l2 = (C9478l) ((C10918l) obj).f22042l;
                if (c9478l2.isPro.mopub(((Float) valueAnimator.getAnimatedValue()).floatValue(), c9478l2.loadAd, c9478l2.subs)) {
                    c9478l2.admob.invalidate();
                }
                break;
            case 2:
                ((C0602l) obj).amazon.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                C9950l c9950l = (C9950l) obj;
                int i2 = c9950l.f20284l;
                if (i2 == 0) {
                    i2 = 1;
                }
                if (!(i2 == 2)) {
                    C13156l c13156l = c9950l.f20293l;
                    if (c13156l != null) {
                        c13156l.remoteconfig(c9950l.f20286l.amazon());
                    }
                } else {
                    c9950l.invalidateSelf();
                }
                break;
            case 4:
                C2468l c2468l = (C2468l) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2468l.isPro.setAlpha((int) (255.0f * fFloatValue2));
                c2468l.ad = fFloatValue2;
                break;
            case 5:
                ((C10295l) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((C5184l) ((C2290l) obj).f4983l).amazon.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ C14131l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}
