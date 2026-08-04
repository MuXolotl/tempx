package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: lٗۜۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17429l extends AbstractC17546l {
    public final float amazon;
    public final C1081l crashlytics;
    public final float purchase;

    public C17429l(C1081l c1081l, float f, float f2) {
        this.crashlytics = c1081l;
        this.amazon = f;
        this.purchase = f2;
    }

    public final float loadAd() {
        C1081l c1081l = this.crashlytics;
        return (float) Math.toDegrees(Math.atan((c1081l.crashlytics - this.purchase) / (c1081l.loadAd - this.amazon)));
    }

    @Override // defpackage.AbstractC17546l
    public final void yandex(Matrix matrix, C17724l c17724l, int i, Canvas canvas) {
        C1081l c1081l = this.crashlytics;
        float f = c1081l.crashlytics;
        float f2 = this.purchase;
        float f3 = c1081l.loadAd;
        float f4 = this.amazon;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.yandex;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(loadAd());
        c17724l.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c17724l.crashlytics;
        int[] iArr = C17724l.subs;
        iArr[0] = i2;
        iArr[1] = c17724l.loadAd;
        iArr[2] = c17724l.yandex;
        Paint paint = (Paint) c17724l.billing;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C17724l.isPro, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
