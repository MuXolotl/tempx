package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lؚٞۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7421l {
    public static final double crashlytics;
    public static final double loadAd;
    public static final float yandex = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        loadAd = dLog;
        crashlytics = dLog - 1.0d;
    }
}
