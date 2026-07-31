package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: lّٛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12709l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final LinearInterpolator f25042l = new LinearInterpolator();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final InterpolatorC3577l f25043l = new InterpolatorC3577l(1);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int[] f25044l = {-16777216};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Resources f25045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float f25046l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4651l f25047l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f25048l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ValueAnimator f25049l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f25050l;

    public C12709l(Context context) {
        context.getClass();
        this.f25045l = context.getResources();
        C4651l c4651l = new C4651l();
        this.f25047l = c4651l;
        c4651l.subs = f25044l;
        c4651l.yandex(0);
        c4651l.admob = 2.5f;
        c4651l.loadAd.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8790l(this, c4651l));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f25042l);
        valueAnimatorOfFloat.addListener(new C12537l(this, c4651l));
        this.f25049l = valueAnimatorOfFloat;
    }

    public static void amazon(float f, C4651l c4651l) {
        if (f <= 0.75f) {
            c4651l.Signature = c4651l.subs[c4651l.isPro];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c4651l.subs;
        int i = c4651l.isPro;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        c4651l.Signature = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    public final void crashlytics(int i) {
        if (i == 0) {
            loadAd(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            loadAd(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f25046l, bounds.exactCenterX(), bounds.exactCenterY());
        C4651l c4651l = this.f25047l;
        Paint paint = c4651l.loadAd;
        RectF rectF = c4651l.yandex;
        float f = c4651l.adcel;
        float fMin = (c4651l.admob / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c4651l.ads * c4651l.startapp) / 2.0f, c4651l.admob / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c4651l.purchase;
        float f3 = c4651l.mopub;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c4651l.billing + f3) * 360.0f) - f4;
        paint.setColor(c4651l.Signature);
        paint.setAlpha(c4651l.tapsense);
        float f6 = c4651l.admob / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c4651l.amazon);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c4651l.crashlytics;
        if (c4651l.vip) {
            Path path = c4651l.metrica;
            if (path == null) {
                Path path2 = new Path();
                c4651l.metrica = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c4651l.ads * c4651l.startapp) / 2.0f;
            c4651l.metrica.moveTo(0.0f, 0.0f);
            c4651l.metrica.lineTo(c4651l.ads * c4651l.startapp, 0.0f);
            Path path3 = c4651l.metrica;
            float f9 = c4651l.ads;
            float f10 = c4651l.startapp;
            path3.lineTo((f9 * f10) / 2.0f, c4651l.subscription * f10);
            c4651l.metrica.offset((rectF.centerX() + fMin2) - f8, (c4651l.admob / 2.0f) + rectF.centerY());
            c4651l.metrica.close();
            paint2.setColor(c4651l.Signature);
            paint2.setAlpha(c4651l.tapsense);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c4651l.metrica, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f25047l.tapsense;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f25049l.isRunning();
    }

    public final void loadAd(float f, float f2, float f3, float f4) {
        float f5 = this.f25045l.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C4651l c4651l = this.f25047l;
        c4651l.admob = f6;
        c4651l.loadAd.setStrokeWidth(f6);
        c4651l.adcel = f * f5;
        c4651l.yandex(0);
        c4651l.ads = (int) (f3 * f5);
        c4651l.subscription = (int) (f4 * f5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f25047l.tapsense = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25047l.loadAd.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f25049l;
        valueAnimator.cancel();
        C4651l c4651l = this.f25047l;
        float f = c4651l.purchase;
        c4651l.firebase = f;
        float f2 = c4651l.billing;
        c4651l.smaato = f2;
        c4651l.remoteconfig = c4651l.mopub;
        if (f2 != f) {
            this.f25050l = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        c4651l.yandex(0);
        c4651l.firebase = 0.0f;
        c4651l.smaato = 0.0f;
        c4651l.remoteconfig = 0.0f;
        c4651l.purchase = 0.0f;
        c4651l.billing = 0.0f;
        c4651l.mopub = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f25049l.cancel();
        this.f25046l = 0.0f;
        C4651l c4651l = this.f25047l;
        if (c4651l.vip) {
            c4651l.vip = false;
        }
        c4651l.yandex(0);
        c4651l.firebase = 0.0f;
        c4651l.smaato = 0.0f;
        c4651l.remoteconfig = 0.0f;
        c4651l.purchase = 0.0f;
        c4651l.billing = 0.0f;
        c4651l.mopub = 0.0f;
        invalidateSelf();
    }

    public final void yandex(float f, C4651l c4651l, boolean z) {
        float interpolation;
        if (this.f25050l) {
            amazon(f, c4651l);
            float fFloor = (float) (Math.floor(c4651l.remoteconfig / 0.8f) + 1.0d);
            float f2 = c4651l.firebase;
            float f3 = c4651l.smaato;
            c4651l.purchase = (((f3 - 0.01f) - f2) * f) + f2;
            c4651l.billing = f3;
            float f4 = c4651l.remoteconfig;
            c4651l.mopub = AbstractC4338l.Signature(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c4651l.remoteconfig;
            float interpolation2 = c4651l.firebase;
            InterpolatorC3577l interpolatorC3577l = f25043l;
            if (f < 0.5f) {
                interpolation = (interpolatorC3577l.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - interpolatorC3577l.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f25048l) * 216.0f;
            c4651l.purchase = interpolation2;
            c4651l.billing = interpolation;
            c4651l.mopub = f7;
            this.f25046l = f8;
        }
    }
}
