package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0307l {
    public final ValueAnimator admob;
    public final C4936l amazon;
    public boolean billing;
    public final C9928l crashlytics;
    public final C16018l firebase;
    public boolean isPro;
    public final C9928l loadAd;
    public long mopub = 5000;
    public boolean purchase;
    public boolean subs;
    public final C11644l yandex;

    public C0307l(C11644l c11644l, C9928l c9928l, C9928l c9928l2, C3342l c3342l, C4936l c4936l) {
        this.yandex = c11644l;
        this.loadAd = c9928l;
        this.crashlytics = c9928l2;
        this.amazon = c4936l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        this.admob = valueAnimatorOfFloat;
        this.firebase = new C16018l(this);
    }

    public final void loadAd(Function1 function1) {
        function1.invoke((C17804l) ((InterfaceC9814l) this.loadAd.f33215l));
        function1.invoke((C17804l) ((InterfaceC9814l) this.crashlytics.f33215l));
    }

    public final C9928l yandex() {
        return this.purchase ? this.crashlytics : this.loadAd;
    }
}
