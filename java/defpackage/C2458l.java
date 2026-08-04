package defpackage;

import android.animation.ValueAnimator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؙؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2458l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C10518l crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ int yandex;

    public C2458l(C10518l c10518l, int i, int i2) {
        this.crashlytics = c10518l;
        this.yandex = i;
        this.loadAd = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C10518l c10518l = this.crashlytics;
        int iCrashlytics = AbstractC0926l.crashlytics(c10518l.f21402l, animatedFraction, this.yandex);
        int iCrashlytics2 = AbstractC0926l.crashlytics(c10518l.f21408l, animatedFraction, this.loadAd);
        if (iCrashlytics == c10518l.f21406l && iCrashlytics2 == c10518l.f21409l) {
            return;
        }
        c10518l.f21406l = iCrashlytics;
        c10518l.f21409l = iCrashlytics2;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        c10518l.postInvalidateOnAnimation();
    }
}
