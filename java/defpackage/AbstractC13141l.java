package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: lْؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13141l {
    public final long amazon;
    public final Interpolator crashlytics;
    public float loadAd;
    public final int yandex;

    public AbstractC13141l(int i, Interpolator interpolator, long j) {
        this.yandex = i;
        this.crashlytics = interpolator;
        this.amazon = j;
    }

    public void amazon(float f) {
        this.loadAd = f;
    }

    public int crashlytics() {
        return this.yandex;
    }

    public float loadAd() {
        float f = this.loadAd;
        Interpolator interpolator = this.crashlytics;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public long yandex() {
        return this.amazon;
    }
}
