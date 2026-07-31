package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: renamed from: lْ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13703l {
    public final C17915l admob;
    public final C14965l amazon;
    public final C16603l billing;
    public final C17793l crashlytics;
    public final C17915l firebase;
    public final C17915l isPro;
    public final C14018l loadAd;
    public final C17915l mopub;
    public final C14018l purchase;
    public final C17915l remoteconfig;
    public final C0458l smaato;
    public final C16603l subs;
    public final Activity vip;
    public final C10918l yandex;

    public C13703l(Activity activity) {
        int i = 1;
        this.yandex = new C10918l(i, this);
        this.vip = activity;
        int i2 = 0;
        this.loadAd = new C14018l(this, i2);
        C16582l c16582l = new C16582l(this, i2);
        this.crashlytics = new C17793l(new Matrix(), this);
        C16582l c16582l2 = new C16582l(this, i);
        this.amazon = new C14965l(3);
        this.purchase = new C14018l(this, i);
        this.billing = new C16603l(this, 1);
        this.mopub = new C17915l(c16582l2, (byte) 0);
        this.admob = new C17915l(c16582l2, (byte) 0);
        this.subs = new C16603l(this, 0);
        this.isPro = new C17915l(c16582l);
        this.firebase = new C17915l(c16582l);
        C0458l c0458l = new C0458l(this);
        this.smaato = c0458l;
        Paint paint = (Paint) c0458l.f1690l;
        for (AbstractC3159l abstractC3159l : (AbstractC3159l[]) c0458l.f1691l) {
            abstractC3159l.yandex(paint);
        }
        this.remoteconfig = new C17915l(new Paint[]{paint});
    }

    public final void amazon(float f) {
        this.mopub.billing(Float.valueOf(f));
    }

    public final float crashlytics() {
        return ((Float) this.subs.yandex).floatValue();
    }

    public final void loadAd(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(((Float) this.mopub.yandex).floatValue() - crashlytics(), ((Float) this.admob.yandex).floatValue() - crashlytics());
            C13557l c13557lYandex = yandex();
            C0458l c0458l = this.smaato;
            Paint paint = (Paint) c0458l.f1690l;
            for (AbstractC3159l abstractC3159l : (AbstractC3159l[]) c0458l.f1691l) {
                abstractC3159l.yandex(paint);
            }
            c13557lYandex.setAlpha(paint.getAlpha());
            yandex().draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void purchase(float f) {
        this.admob.billing(Float.valueOf(f));
    }

    public final String toString() {
        return "CircleRenderingState(color=" + ((Integer) this.billing.yandex).intValue() + ", x=" + ((Float) this.mopub.yandex).floatValue() + ", y=" + ((Float) this.admob.yandex).floatValue() + ", radius=" + crashlytics() + ", alpha=" + ((Integer) this.isPro.yandex).intValue() + ", globalAlpha=" + ((Integer) this.firebase.yandex).intValue() + ')';
    }

    public final C13557l yandex() {
        return (C13557l) this.yandex.subs();
    }
}
