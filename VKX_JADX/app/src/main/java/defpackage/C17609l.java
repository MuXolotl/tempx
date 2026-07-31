package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: lْ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17609l extends AbstractC10437l {
    public final C13957l applovin;
    public final float[] appmetrica;
    public final Path inmobi;
    public final RectF premium;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C4913l f34269throws;

    public C17609l(C9950l c9950l, C4913l c4913l) {
        super(c9950l, c4913l);
        this.premium = new RectF();
        C13957l c13957l = new C13957l();
        this.applovin = c13957l;
        this.appmetrica = new float[8];
        this.inmobi = new Path();
        this.f34269throws = c4913l;
        c13957l.setAlpha(0);
        c13957l.setStyle(Paint.Style.FILL);
        c13957l.setColor(c4913l.smaato);
    }

    @Override // defpackage.AbstractC10437l, defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        super.crashlytics(rectF, matrix, z);
        C4913l c4913l = this.f34269throws;
        float f = c4913l.isPro;
        float f2 = c4913l.firebase;
        RectF rectF2 = this.premium;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.vip.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.AbstractC10437l
    public final void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        C4913l c4913l = this.f34269throws;
        int iAlpha = Color.alpha(c4913l.smaato);
        if (iAlpha == 0) {
            return;
        }
        int i2 = c4913l.smaato;
        C13957l c13957l = this.applovin;
        c13957l.setColor(i2);
        C10017l c10017l = this.pro.startapp;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (c10017l == null ? 100 : ((Integer) c10017l.amazon()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        c13957l.setAlpha(iIntValue);
        if (c15480l == null || Color.alpha(c15480l.amazon) <= 0) {
            c13957l.clearShadowLayer();
        } else {
            c13957l.setShadowLayer(Math.max(c15480l.yandex, Float.MIN_VALUE), c15480l.loadAd, c15480l.crashlytics, c15480l.amazon);
        }
        if (iIntValue > 0) {
            float[] fArr = this.appmetrica;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = c4913l.isPro;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = c4913l.firebase;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.inmobi;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c13957l);
        }
    }
}
