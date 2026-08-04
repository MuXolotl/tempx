package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: renamed from: lٖۣٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16539l {
    public boolean admob;
    public final Paint amazon;
    public C10006l billing;
    public boolean crashlytics;
    public boolean loadAd;
    public C10006l mopub;
    public final Paint purchase;
    public final C2071l yandex;

    public C16539l(C16539l c16539l) {
        this.loadAd = c16539l.loadAd;
        this.crashlytics = c16539l.crashlytics;
        this.amazon = new Paint(c16539l.amazon);
        this.purchase = new Paint(c16539l.purchase);
        C10006l c10006l = c16539l.billing;
        if (c10006l != null) {
            this.billing = new C10006l(c10006l);
        }
        C10006l c10006l2 = c16539l.mopub;
        if (c10006l2 != null) {
            this.mopub = new C10006l(c10006l2);
        }
        this.admob = c16539l.admob;
        try {
            this.yandex = (C2071l) c16539l.yandex.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.yandex = C2071l.yandex();
        }
    }

    public C16539l() {
        Paint paint = new Paint();
        this.amazon = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.purchase = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.yandex = C2071l.yandex();
    }
}
