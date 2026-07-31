package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: lؚؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7048l {
    public long adcel;
    public float admob;
    public long ads;
    public boolean amazon;
    public float billing;
    public AbstractC16097l crashlytics;
    public long firebase;
    public int isPro;
    public final Context loadAd;
    public long metrica;
    public float mopub;
    public Surface purchase;
    public long remoteconfig;
    public long smaato;
    public long startapp;
    public float subs;
    public long subscription;
    public long vip;
    public final C6544l yandex;

    public C7048l(Context context) {
        this.loadAd = context;
        C6544l c6544l = new C6544l();
        c6544l.f13665l = new C3812l();
        c6544l.f13664l = new C3812l();
        c6544l.f13662l = -9223372036854775807L;
        this.yandex = c6544l;
        this.billing = -1.0f;
        this.subs = 1.0f;
        this.isPro = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public final void amazon(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.purchase) == null || this.isPro == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.amazon) {
            float f2 = this.mopub;
            if (f2 != -1.0f) {
                f = f2 * this.subs;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.admob != f) {
            this.admob = f;
            AbstractC5121l.license(this.purchase, f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    public final void crashlytics() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.purchase == null) {
            return;
        }
        C6544l c6544l = this.yandex;
        if (!((C3812l) c6544l.f13665l).yandex()) {
            f = this.billing;
        } else if (((C3812l) c6544l.f13665l).yandex()) {
            C3812l c3812l = (C3812l) c6544l.f13665l;
            long j = c3812l.purchase;
            f = (float) (1.0E9d / (j != 0 ? c3812l.billing / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.mopub;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (((C3812l) c6544l.f13665l).yandex()) {
                if ((((C3812l) c6544l.f13665l).yandex() ? ((C3812l) c6544l.f13665l).billing : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.mopub) < f2) {
                return;
            }
        } else if (f == -1.0f && c6544l.f13663l < 30) {
            return;
        }
        this.mopub = f;
        amazon(false);
    }

    public final void loadAd() {
        this.remoteconfig = 0L;
        this.adcel = -1L;
        this.vip = -1L;
        this.firebase = 0L;
        this.smaato = 0L;
    }

    public final void yandex() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.purchase) == null || this.isPro == Integer.MIN_VALUE || this.admob == 0.0f || !surface.isValid()) {
            return;
        }
        this.admob = 0.0f;
        AbstractC5121l.license(this.purchase, 0.0f);
    }
}
