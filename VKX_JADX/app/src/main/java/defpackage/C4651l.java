package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: lؗؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4651l {
    public int Signature;
    public float adcel;
    public float admob;
    public int ads;
    public final Paint amazon;
    public float billing;
    public final Paint crashlytics;
    public float firebase;
    public int isPro;
    public final Paint loadAd;
    public Path metrica;
    public float mopub;
    public float purchase;
    public float remoteconfig;
    public float smaato;
    public float startapp;
    public int[] subs;
    public int subscription;
    public int tapsense;
    public boolean vip;
    public final RectF yandex = new RectF();

    public C4651l() {
        Paint paint = new Paint();
        this.loadAd = paint;
        Paint paint2 = new Paint();
        this.crashlytics = paint2;
        Paint paint3 = new Paint();
        this.amazon = paint3;
        this.purchase = 0.0f;
        this.billing = 0.0f;
        this.mopub = 0.0f;
        this.admob = 5.0f;
        this.startapp = 1.0f;
        this.tapsense = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void yandex(int i) {
        this.isPro = i;
        this.Signature = this.subs[i];
    }
}
