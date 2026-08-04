package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: renamed from: lِّۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12786l extends C4529l {
    public Path adcel;
    public final C4529l ads;

    public C12786l(C10712l c10712l, C4529l c4529l) {
        super(c10712l, (PointF) c4529l.loadAd, (PointF) c4529l.crashlytics, c4529l.amazon, c4529l.purchase, c4529l.billing, c4529l.mopub, c4529l.admob);
        this.ads = c4529l;
        amazon();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void amazon() {
        boolean z;
        Object obj;
        Object obj2 = this.crashlytics;
        Object obj3 = this.loadAd;
        if (obj2 == null || obj3 == null) {
            z = false;
        } else {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (obj3 == null || (obj = this.crashlytics) == null || z) {
            return;
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj;
        C4529l c4529l = this.ads;
        PointF pointF4 = c4529l.metrica;
        PointF pointF5 = c4529l.startapp;
        Matrix matrix = AbstractC4218l.yandex;
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF4.x + pointF2.x;
            float f2 = pointF2.y + pointF4.y;
            float f3 = pointF3.x;
            float f4 = f3 + pointF5.x;
            float f5 = pointF3.y;
            path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
        }
        this.adcel = path;
    }
}
