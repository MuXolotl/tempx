package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: lۣؖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4480l {
    public AbstractC8939l amazon;
    public Shader crashlytics;
    public int loadAd = 3;
    public C6853l purchase;
    public final Paint yandex;

    public C4480l(Paint paint) {
        this.yandex = paint;
    }

    public final void admob(int i) {
        this.yandex.setFilterBitmap(!(i == 0));
    }

    public final void amazon(float f) {
        this.yandex.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void billing(long j) {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.yandex;
        if (i >= 29) {
            C16409l.yandex.crashlytics(paint, j);
        } else {
            paint.setColor(AbstractC12953l.startapp(j));
        }
    }

    public final int crashlytics() {
        Paint.Join strokeJoin = this.yandex.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC6086l.loadAd[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void firebase(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.yandex.setStrokeCap(cap);
    }

    public final void isPro(Shader shader) {
        this.crashlytics = shader;
        this.yandex.setShader(shader);
    }

    public final int loadAd() {
        Paint.Cap strokeCap = this.yandex.getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC6086l.yandex[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final void mopub(AbstractC8939l abstractC8939l) {
        this.amazon = abstractC8939l;
        this.yandex.setColorFilter(abstractC8939l != null ? abstractC8939l.yandex : null);
    }

    public final void purchase(int i) {
        if (this.loadAd == i) {
            return;
        }
        this.loadAd = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.yandex;
        if (i2 >= 29) {
            C16409l.yandex.loadAd(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC11880l.m3272class(i)));
        }
    }

    public final void remoteconfig(float f) {
        this.yandex.setStrokeWidth(f);
    }

    public final void smaato(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.yandex.setStrokeJoin(join);
    }

    public final void subs(C6853l c6853l) {
        this.yandex.setPathEffect(c6853l != null ? c6853l.yandex : null);
        this.purchase = c6853l;
    }

    public final void vip(int i) {
        this.yandex.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final long yandex() {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.yandex;
        return i >= 29 ? C16409l.yandex.yandex(paint) : AbstractC12953l.loadAd(paint.getColor());
    }
}
