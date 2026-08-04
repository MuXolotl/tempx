package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: lؙؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4550l {
    public final PointF crashlytics;
    public final PointF loadAd;
    public final PointF yandex;

    public C4550l() {
        this.yandex = new PointF();
        this.loadAd = new PointF();
        this.crashlytics = new PointF();
    }

    public final String toString() {
        PointF pointF = this.crashlytics;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.yandex;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.loadAd;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C4550l(PointF pointF, PointF pointF2, PointF pointF3) {
        this.yandex = pointF;
        this.loadAd = pointF2;
        this.crashlytics = pointF3;
    }
}
