package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: lؖۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C4529l {
    public Float admob;
    public final Interpolator amazon;
    public final Interpolator billing;
    public Object crashlytics;
    public int firebase;
    public float isPro;
    public final Object loadAd;
    public PointF metrica;
    public final float mopub;
    public final Interpolator purchase;
    public float remoteconfig;
    public int smaato;
    public PointF startapp;
    public float subs;
    public float vip;
    public final C10712l yandex;

    public C4529l(Object obj) {
        this.subs = -3987645.8f;
        this.isPro = -3987645.8f;
        this.firebase = 784923401;
        this.smaato = 784923401;
        this.remoteconfig = Float.MIN_VALUE;
        this.vip = Float.MIN_VALUE;
        this.metrica = null;
        this.startapp = null;
        this.yandex = null;
        this.loadAd = obj;
        this.crashlytics = obj;
        this.amazon = null;
        this.purchase = null;
        this.billing = null;
        this.mopub = Float.MIN_VALUE;
        this.admob = Float.valueOf(Float.MAX_VALUE);
    }

    public final boolean crashlytics() {
        return this.amazon == null && this.purchase == null && this.billing == null;
    }

    public final float loadAd() {
        C10712l c10712l = this.yandex;
        if (c10712l == null) {
            return 0.0f;
        }
        if (this.remoteconfig == Float.MIN_VALUE) {
            float f = c10712l.smaato;
            this.remoteconfig = (this.mopub - f) / (c10712l.remoteconfig - f);
        }
        return this.remoteconfig;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.loadAd + ", endValue=" + this.crashlytics + ", startFrame=" + this.mopub + ", endFrame=" + this.admob + ", interpolator=" + this.amazon + '}';
    }

    public final float yandex() {
        C10712l c10712l = this.yandex;
        if (c10712l == null) {
            return 1.0f;
        }
        if (this.vip == Float.MIN_VALUE) {
            if (this.admob == null) {
                this.vip = 1.0f;
            } else {
                this.vip = (float) (((double) loadAd()) + (((double) (this.admob.floatValue() - this.mopub)) / ((double) (c10712l.remoteconfig - c10712l.smaato))));
            }
        }
        return this.vip;
    }

    public C4529l(C10712l c10712l, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.subs = -3987645.8f;
        this.isPro = -3987645.8f;
        this.firebase = 784923401;
        this.smaato = 784923401;
        this.remoteconfig = Float.MIN_VALUE;
        this.vip = Float.MIN_VALUE;
        this.metrica = null;
        this.startapp = null;
        this.yandex = c10712l;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = null;
        this.purchase = interpolator;
        this.billing = interpolator2;
        this.mopub = f;
        this.admob = null;
    }

    public C4529l(C10712l c10712l, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.subs = -3987645.8f;
        this.isPro = -3987645.8f;
        this.firebase = 784923401;
        this.smaato = 784923401;
        this.remoteconfig = Float.MIN_VALUE;
        this.vip = Float.MIN_VALUE;
        this.metrica = null;
        this.startapp = null;
        this.yandex = c10712l;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = interpolator;
        this.purchase = interpolator2;
        this.billing = interpolator3;
        this.mopub = f;
        this.admob = f2;
    }

    public C4529l(C10712l c10712l, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.subs = -3987645.8f;
        this.isPro = -3987645.8f;
        this.firebase = 784923401;
        this.smaato = 784923401;
        this.remoteconfig = Float.MIN_VALUE;
        this.vip = Float.MIN_VALUE;
        this.metrica = null;
        this.startapp = null;
        this.yandex = c10712l;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = interpolator;
        this.purchase = null;
        this.billing = null;
        this.mopub = f;
        this.admob = f2;
    }

    public C4529l(C14360l c14360l, C14360l c14360l2) {
        this.subs = -3987645.8f;
        this.isPro = -3987645.8f;
        this.firebase = 784923401;
        this.smaato = 784923401;
        this.remoteconfig = Float.MIN_VALUE;
        this.vip = Float.MIN_VALUE;
        this.metrica = null;
        this.startapp = null;
        this.yandex = null;
        this.loadAd = c14360l;
        this.crashlytics = c14360l2;
        this.amazon = null;
        this.purchase = null;
        this.billing = null;
        this.mopub = Float.MIN_VALUE;
        this.admob = Float.valueOf(Float.MAX_VALUE);
    }
}
