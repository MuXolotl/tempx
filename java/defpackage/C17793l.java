package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: renamed from: lٌ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17793l extends AbstractC3159l {
    public final C13703l crashlytics;
    public final Matrix loadAd;

    public C17793l(Matrix matrix, C13703l c13703l) {
        this.loadAd = matrix;
        this.crashlytics = c13703l;
    }

    @Override // defpackage.AbstractC3159l
    public final void yandex(Paint paint) {
        if (this.yandex) {
            this.yandex = false;
            C13703l c13703l = this.crashlytics;
            float fFloatValue = ((Float) c13703l.mopub.yandex).floatValue();
            float fFloatValue2 = ((Float) c13703l.admob.yandex).floatValue();
            Matrix matrix = this.loadAd;
            matrix.setTranslate(fFloatValue, fFloatValue2);
            matrix.preScale(c13703l.crashlytics(), c13703l.crashlytics());
            paint.getShader().setLocalMatrix(matrix);
        }
    }
}
