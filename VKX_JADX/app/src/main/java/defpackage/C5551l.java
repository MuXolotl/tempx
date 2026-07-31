package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lًٌؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5551l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C5551l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C1194l) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5022l c5022l = ((BottomSheetBehavior) obj).subs;
                if (c5022l != null) {
                    c5022l.firebase(fFloatValue);
                }
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C17832l c17832l = (C17832l) obj;
                c17832l.crashlytics.setAlpha(iFloatValue);
                c17832l.amazon.setAlpha(iFloatValue);
                c17832l.subscription.invalidate();
                break;
            case 3:
                ((C9603l) obj).remoteconfig = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) obj).f761l.firebase(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
