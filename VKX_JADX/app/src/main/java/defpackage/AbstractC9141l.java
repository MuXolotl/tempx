package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٌۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9141l {
    public static final int amazon;
    public static final C14823l billing;
    public static final int crashlytics;
    public static final long loadAd;
    public static final long purchase;
    public static final String yandex;

    static {
        String property;
        int i = AbstractC8177l.yandex;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        yandex = property;
        loadAd = C16050l.adcel("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC8177l.yandex;
        if (i2 < 2) {
            i2 = 2;
        }
        crashlytics = C16050l.ads(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        amazon = C16050l.ads(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        purchase = TimeUnit.SECONDS.toNanos(C16050l.adcel("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        billing = C14823l.f29000l;
    }
}
