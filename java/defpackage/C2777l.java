package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؔٝۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2777l {
    public float admob;
    public ObjectAnimator amazon;
    public final C6361l billing;
    public ObjectAnimator crashlytics;
    public C14228l isPro;
    public final ArrayList loadAd;
    public int mopub;
    public final InterpolatorC3577l purchase;
    public float subs;
    public C6260l yandex;
    public static final int[] firebase = {0, 1350, 2700, 4050};
    public static final int[] smaato = {667, 2017, 3367, 4717};
    public static final int[] remoteconfig = {1000, 2350, 3700, 5050};
    public static final C10550l vip = new C10550l(5, Float.class, "animationFraction");
    public static final C10550l metrica = new C10550l(6, Float.class, "completeEndFraction");

    public C2777l(C6361l c6361l) {
        ArrayList arrayList = new ArrayList();
        this.loadAd = arrayList;
        arrayList.add(new C13855l());
        this.mopub = 0;
        this.isPro = null;
        this.billing = c6361l;
        this.purchase = new InterpolatorC3577l(1);
    }

    public final void yandex() {
        int i = 0;
        if (this.crashlytics == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, vip, 0.0f, 1.0f);
            this.crashlytics = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.crashlytics.setInterpolator(null);
            this.crashlytics.setRepeatCount(-1);
            this.crashlytics.addListener(new C7312l(this, i));
        }
        if (this.amazon == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, metrica, 0.0f, 1.0f);
            this.amazon = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.amazon.setInterpolator(this.purchase);
            this.amazon.addListener(new C7312l(this, 1));
        }
        this.mopub = 0;
        ((C13855l) this.loadAd.get(0)).crashlytics = this.billing.crashlytics[0];
        this.subs = 0.0f;
        this.crashlytics.start();
    }
}
