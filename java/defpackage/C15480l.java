package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: renamed from: lٕؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15480l {
    public int amazon;
    public float crashlytics;
    public float loadAd;
    public float[] purchase = null;
    public float yandex;

    public C15480l(C15480l c15480l) {
        this.yandex = 0.0f;
        this.loadAd = 0.0f;
        this.crashlytics = 0.0f;
        this.amazon = 0;
        this.yandex = c15480l.yandex;
        this.loadAd = c15480l.loadAd;
        this.crashlytics = c15480l.crashlytics;
        this.amazon = c15480l.amazon;
    }

    public final void crashlytics(Matrix matrix) {
        if (this.purchase == null) {
            this.purchase = new float[2];
        }
        float[] fArr = this.purchase;
        fArr[0] = this.loadAd;
        fArr[1] = this.crashlytics;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.purchase;
        this.loadAd = fArr2[0];
        this.crashlytics = fArr2[1];
        this.yandex = matrix.mapRadius(this.yandex);
    }

    public final void loadAd(int i) {
        this.amazon = Color.argb(Math.round((AbstractC7484l.crashlytics(i) * Color.alpha(this.amazon)) / 255.0f), Color.red(this.amazon), Color.green(this.amazon), Color.blue(this.amazon));
    }

    public final void yandex(int i, C13957l c13957l) {
        int iAlpha = Color.alpha(this.amazon);
        int iCrashlytics = AbstractC7484l.crashlytics(i);
        Matrix matrix = AbstractC4218l.yandex;
        int i2 = (int) ((((iAlpha / 255.0f) * iCrashlytics) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            c13957l.clearShadowLayer();
        } else {
            c13957l.setShadowLayer(Math.max(this.yandex, Float.MIN_VALUE), this.loadAd, this.crashlytics, Color.argb(i2, Color.red(this.amazon), Color.green(this.amazon), Color.blue(this.amazon)));
        }
    }
}
