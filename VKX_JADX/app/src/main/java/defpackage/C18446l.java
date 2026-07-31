package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18446l extends AbstractC13890l {
    public final PointF admob;
    public final PathMeasure firebase;
    public final float[] isPro;
    public C12786l smaato;
    public final float[] subs;

    public C18446l(ArrayList arrayList) {
        super(arrayList);
        this.admob = new PointF();
        this.subs = new float[2];
        this.isPro = new float[2];
        this.firebase = new PathMeasure();
    }

    @Override // defpackage.AbstractC4383l
    public final Object purchase(C4529l c4529l, float f) {
        C12786l c12786l = (C12786l) c4529l;
        Path path = c12786l.adcel;
        if (path == null) {
            return (PointF) c4529l.loadAd;
        }
        C12786l c12786l2 = this.smaato;
        PathMeasure pathMeasure = this.firebase;
        if (c12786l2 != c12786l) {
            pathMeasure.setPath(path, false);
            this.smaato = c12786l;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.subs;
        float[] fArr2 = this.isPro;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.admob;
        pointF.set(f3, f4);
        if (f2 < 0.0f) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }
}
