package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: lۘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18538l extends AbstractC17546l {
    public final C3832l crashlytics;

    public C18538l(C3832l c3832l) {
        this.crashlytics = c3832l;
    }

    @Override // defpackage.AbstractC17546l
    public final void yandex(Matrix matrix, C17724l c17724l, int i, Canvas canvas) {
        C3832l c3832l = this.crashlytics;
        float f = c3832l.billing;
        float f2 = c3832l.mopub;
        RectF rectF = new RectF(c3832l.loadAd, c3832l.crashlytics, c3832l.amazon, c3832l.purchase);
        Paint paint = (Paint) c17724l.purchase;
        boolean z = f2 < 0.0f;
        Path path = (Path) c17724l.admob;
        int[] iArr = C17724l.firebase;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c17724l.crashlytics;
            iArr[2] = c17724l.loadAd;
            iArr[3] = c17724l.yandex;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c17724l.yandex;
            iArr[2] = c17724l.loadAd;
            iArr[3] = c17724l.crashlytics;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C17724l.smaato;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) c17724l.mopub);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
