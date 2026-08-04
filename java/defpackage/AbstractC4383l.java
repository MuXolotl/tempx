package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؖۚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4383l {
    public final InterfaceC13952l crashlytics;
    public final ArrayList yandex = new ArrayList(1);
    public boolean loadAd = false;
    public float amazon = 0.0f;
    public Object purchase = null;
    public float billing = -1.0f;
    public float mopub = -1.0f;

    public AbstractC4383l(List list) {
        InterfaceC13952l c9422l;
        if (list.isEmpty()) {
            c9422l = new C2782l(25);
        } else if (list.size() == 1) {
            C7240l c7240l = new C7240l();
            c7240l.f15066l = -1.0f;
            c7240l.f15065l = (C4529l) list.get(0);
            c9422l = c7240l;
        } else {
            c9422l = new C9422l(list);
        }
        this.crashlytics = c9422l;
    }

    public boolean admob() {
        return false;
    }

    public Object amazon() {
        float fCrashlytics = crashlytics();
        InterfaceC13952l interfaceC13952l = this.crashlytics;
        if (interfaceC13952l.loadAd(fCrashlytics) && !admob()) {
            return this.purchase;
        }
        C4529l c4529lCrashlytics = interfaceC13952l.crashlytics();
        Interpolator interpolator = c4529lCrashlytics.purchase;
        Interpolator interpolator2 = c4529lCrashlytics.billing;
        Object objPurchase = (interpolator == null || interpolator2 == null) ? purchase(c4529lCrashlytics, loadAd()) : billing(c4529lCrashlytics, fCrashlytics, interpolator.getInterpolation(fCrashlytics), interpolator2.getInterpolation(fCrashlytics));
        this.purchase = objPurchase;
        return objPurchase;
    }

    public Object billing(C4529l c4529l, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final float crashlytics() {
        if (this.loadAd) {
            return 0.0f;
        }
        C4529l c4529lCrashlytics = this.crashlytics.crashlytics();
        if (c4529lCrashlytics.crashlytics()) {
            return 0.0f;
        }
        return (this.amazon - c4529lCrashlytics.loadAd()) / (c4529lCrashlytics.yandex() - c4529lCrashlytics.loadAd());
    }

    public final float loadAd() {
        Interpolator interpolator;
        C4529l c4529lCrashlytics = this.crashlytics.crashlytics();
        if (c4529lCrashlytics == null || c4529lCrashlytics.crashlytics() || (interpolator = c4529lCrashlytics.amazon) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(crashlytics());
    }

    public void mopub(float f) {
        InterfaceC13952l interfaceC13952l = this.crashlytics;
        if (interfaceC13952l.isEmpty()) {
            return;
        }
        if (this.billing == -1.0f) {
            this.billing = interfaceC13952l.subs();
        }
        float f2 = this.billing;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.billing = interfaceC13952l.subs();
            }
            f = this.billing;
        } else {
            if (this.mopub == -1.0f) {
                this.mopub = interfaceC13952l.admob();
            }
            float f3 = this.mopub;
            if (f > f3) {
                if (f3 == -1.0f) {
                    this.mopub = interfaceC13952l.admob();
                }
                f = this.mopub;
            }
        }
        if (f == this.amazon) {
            return;
        }
        this.amazon = f;
        if (!interfaceC13952l.mopub(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC15871l) arrayList.get(i)).yandex();
            i++;
        }
    }

    public abstract Object purchase(C4529l c4529l, float f);

    public final void yandex(InterfaceC15871l interfaceC15871l) {
        this.yandex.add(interfaceC15871l);
    }
}
