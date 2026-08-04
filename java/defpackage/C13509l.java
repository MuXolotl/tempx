package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: lْٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13509l extends AbstractC17271l {
    public float amazon;
    public float billing;
    public float crashlytics;
    public float loadAd;
    public boolean purchase;

    public final int amazon() {
        C6361l c6361l = this.yandex;
        return (c6361l.subs * 2) + c6361l.admob;
    }

    public final void crashlytics(Canvas canvas, Paint paint, float f, float f2, float f3, float f4) {
        float fMin = (int) Math.min(f3, this.loadAd);
        float f5 = f2 / 2.0f;
        float fMin2 = Math.min(f5, (this.crashlytics * fMin) / this.loadAd);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f2) / 2.0f, fMin / 2.0f, f5);
        canvas.save();
        double d = f;
        canvas.translate((float) (Math.cos(Math.toRadians(d)) * ((double) this.amazon)), (float) (Math.sin(Math.toRadians(d)) * ((double) this.amazon)));
        canvas.rotate(f);
        canvas.scale(f4, f4);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void loadAd(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f4 = f % 1.0f;
        if (this.billing < 1.0f) {
            float f5 = f4 + f3;
            if (f5 > 1.0f) {
                loadAd(canvas, paint, f4, 1.0f, i, i2, 0);
                loadAd(canvas, paint, 1.0f, f5, i, 0, i3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.crashlytics / this.amazon);
        if (f4 == 0.0f && f3 >= 0.99f) {
            f3 += (((degrees * 2.0f) / 360.0f) * (f3 - 0.99f)) / 0.01f;
        }
        float fFirebase = AbstractC8020l.firebase(1.0f - this.billing, 1.0f, f4);
        float fFirebase2 = AbstractC8020l.firebase(0.0f, this.billing, f3);
        float degrees2 = (float) Math.toDegrees(i2 / this.amazon);
        float degrees3 = ((fFirebase2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.amazon));
        float f6 = (fFirebase * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.loadAd);
        float f7 = degrees * 2.0f;
        if (degrees3 < f7) {
            float f8 = degrees3 / f7;
            paint.setStyle(Paint.Style.FILL);
            crashlytics(canvas, paint, (degrees * f8) + f6, this.crashlytics * 2.0f, this.loadAd, f8);
            return;
        }
        float f9 = this.amazon;
        float f10 = -f9;
        RectF rectF = new RectF(f10, f10, f9, f9);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.purchase ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f11 = f6 + degrees;
        canvas.drawArc(rectF, f11, degrees3 - f7, false, paint);
        if (this.purchase || this.crashlytics <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        crashlytics(canvas, paint, f11, this.crashlytics * 2.0f, this.loadAd, 1.0f);
        crashlytics(canvas, paint, (f6 + degrees3) - degrees, this.crashlytics * 2.0f, this.loadAd, 1.0f);
    }
}
