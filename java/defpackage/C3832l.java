package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: lؖؐ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832l extends AbstractC18178l {
    public static final RectF admob = new RectF();
    public final float amazon;
    public float billing;
    public final float crashlytics;
    public final float loadAd;
    public float mopub;
    public final float purchase;

    public C3832l(float f, float f2, float f3, float f4) {
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = f4;
    }

    @Override // defpackage.AbstractC18178l
    public final void yandex(Matrix matrix, Path path) {
        Matrix matrix2 = this.yandex;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.amazon;
        float f2 = this.purchase;
        RectF rectF = admob;
        rectF.set(this.loadAd, this.crashlytics, f, f2);
        path.arcTo(rectF, this.billing, this.mopub, false);
        path.transform(matrix);
    }
}
