package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;

/* JADX INFO: renamed from: lؘؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6024l extends Drawable {
    public boolean adcel;
    public final Paint admob;
    public long ads = 0;
    public final int amazon;
    public final TimeInterpolator[] billing;
    public final DecelerateInterpolator crashlytics;
    public final RectF firebase;
    public final Random isPro;
    public final int loadAd;
    public final Paint metrica;
    public final float[] mopub;
    public final int purchase;
    public final int remoteconfig;
    public final int smaato;
    public final int startapp;
    public final float[] subs;
    public final Canvas vip;
    public final AccelerateInterpolator yandex;

    public C6024l(C5034l c5034l) {
        int i = c5034l.yandex;
        this.loadAd = i;
        int i2 = c5034l.billing;
        this.remoteconfig = i2;
        int i3 = c5034l.amazon;
        this.smaato = i3;
        int i4 = c5034l.purchase;
        if (i4 > i3) {
            C8339l.metrica(AbstractC12589l.premium(i4, i3, "rectMinHeight = ", " must not be greater than rectHeight = "));
            throw null;
        }
        int i5 = c5034l.loadAd;
        this.amazon = i5;
        int i6 = ((i2 + i5) * i) - i5;
        this.startapp = i6;
        this.purchase = i3;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i3, Bitmap.Config.ARGB_8888);
        this.vip = new Canvas(bitmapCreateBitmap);
        this.firebase = new RectF();
        this.isPro = new Random();
        Paint paint = new Paint(1);
        this.metrica = paint;
        paint.setColor(c5034l.crashlytics);
        Paint paint2 = new Paint(1);
        this.admob = paint2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        this.subs = new float[i];
        this.mopub = new float[i];
        this.billing = new TimeInterpolator[i];
        this.crashlytics = new DecelerateInterpolator();
        this.yandex = new AccelerateInterpolator();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        long jCurrentTimeMillis = System.currentTimeMillis();
        canvas.save();
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int i = this.startapp;
        int iHeight = bounds.height();
        int i2 = this.purchase;
        canvas.translate((iWidth - i) / 2, (iHeight - i2) / 2);
        long j = jCurrentTimeMillis - this.ads;
        TimeInterpolator[] timeInterpolatorArr = this.billing;
        int i3 = this.loadAd;
        float[] fArr = this.mopub;
        float[] fArr2 = this.subs;
        int i4 = 0;
        float f = 0.0f;
        if (j > 150) {
            this.ads = jCurrentTimeMillis;
            for (int i5 = 0; i5 < i3; i5++) {
                fArr2[i5] = fArr[i5];
                if (this.adcel) {
                    fArr[i5] = (float) (Math.cbrt(this.isPro.nextInt(1000000)) / 100.0d);
                } else {
                    fArr[i5] = 0.0f;
                }
                timeInterpolatorArr[i5] = fArr[i5] > fArr2[i5] ? this.yandex : this.crashlytics;
            }
        }
        float f2 = (jCurrentTimeMillis - this.ads) / 150.0f;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        Canvas canvas2 = this.vip;
        canvas2.drawColor(0, mode);
        float f3 = 0.0f;
        while (true) {
            rectF = this.firebase;
            if (i4 >= i3) {
                break;
            }
            float f4 = fArr2[i4];
            float f5 = f3 + f4;
            int i6 = this.amazon;
            int i7 = this.remoteconfig;
            float f6 = (i6 + i7) * i4;
            float interpolation = (timeInterpolatorArr[i4].getInterpolation(f2) * (fArr[i4] - f4)) + f4;
            int i8 = this.smaato;
            float f7 = f2;
            float f8 = i8;
            rectF.set(f6, i8 - Math.max(Math.round(interpolation * f8), i7), i7 + f6, f8);
            f = 0.0f;
            canvas2.drawRoundRect(rectF, 0.0f, 0.0f, this.metrica);
            i4++;
            f2 = f7;
            f3 = f5;
        }
        rectF.set(f, f, i, i2);
        canvas.drawRect(rectF, this.admob);
        canvas.restore();
        if (f3 != f || this.adcel) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = this.adcel;
        this.adcel = false;
        for (int i : iArr) {
            if (i == 16843518) {
                this.adcel = true;
                break;
            }
        }
        return z == this.adcel;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.admob.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.admob.setColorFilter(colorFilter);
    }
}
