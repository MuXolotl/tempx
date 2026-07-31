package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: lّٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12616l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C9359l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12616l(C9359l c9359l, int i) {
        this.yandex = i;
        this.loadAd = c9359l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.yandex;
        C9359l c9359l = this.loadAd;
        switch (i) {
            case 0:
                ((AppCompatImageView) c9359l.loadAd.f20466l).setImageTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
            case 1:
                ((FrameLayout) c9359l.loadAd.f20465l).setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
            default:
                ((FrameLayout) c9359l.loadAd.f20465l).setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
        }
    }
}
