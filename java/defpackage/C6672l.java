package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: lؙۖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6672l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int amazon;
    public final /* synthetic */ C1473l crashlytics;
    public final /* synthetic */ C1473l loadAd;
    public final /* synthetic */ View purchase;
    public final /* synthetic */ C12902l yandex;

    public C6672l(C12902l c12902l, C1473l c1473l, C1473l c1473l2, int i, View view) {
        this.yandex = c12902l;
        this.loadAd = c1473l;
        this.crashlytics = c1473l2;
        this.amazon = i;
        this.purchase = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC18218l c18209l;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C12902l c12902l = this.yandex;
        AbstractC13141l abstractC13141l = c12902l.yandex;
        abstractC13141l.amazon(animatedFraction);
        float fLoadAd = abstractC13141l.loadAd();
        PathInterpolator pathInterpolator = C12441l.purchase;
        int i = Build.VERSION.SDK_INT;
        C1473l c1473l = this.loadAd;
        if (i >= 36) {
            c18209l = new C1145l(c1473l);
        } else if (i >= 35) {
            c18209l = new C0157l(c1473l);
        } else if (i >= 34) {
            c18209l = new C11094l(c1473l);
        } else if (i >= 31) {
            c18209l = new C13338l(c1473l);
        } else if (i >= 30) {
            c18209l = new C14430l(c1473l);
        } else {
            c18209l = i >= 29 ? new C18209l(c1473l) : new C4132l(c1473l);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.amazon & i2;
            C17212l c17212l = c1473l.yandex;
            if (i3 == 0) {
                c18209l.amazon(i2, c17212l.subs(i2));
            } else {
                C15496l c15496lSubs = c17212l.subs(i2);
                C15496l c15496lSubs2 = this.crashlytics.yandex.subs(i2);
                float f = 1.0f - fLoadAd;
                c18209l.amazon(i2, C1473l.purchase(c15496lSubs, (int) (((double) ((c15496lSubs.yandex - c15496lSubs2.yandex) * f)) + 0.5d), (int) (((double) ((c15496lSubs.loadAd - c15496lSubs2.loadAd) * f)) + 0.5d), (int) (((double) ((c15496lSubs.crashlytics - c15496lSubs2.crashlytics) * f)) + 0.5d), (int) (((double) ((c15496lSubs.amazon - c15496lSubs2.amazon) * f)) + 0.5d)));
            }
        }
        C12441l.mopub(this.purchase, c18209l.loadAd(), Collections.singletonList(c12902l));
    }
}
