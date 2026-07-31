package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؘۤ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6075l {
    public final AtomicInteger amazon;
    public long crashlytics;
    public long loadAd;
    public final int purchase;
    public final long yandex;

    public C6075l(C14513l c14513l) {
        this.purchase = c14513l.f28392l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.yandex = jCurrentTimeMillis;
        this.loadAd = jCurrentTimeMillis;
        this.amazon = new AtomicInteger(1);
    }
}
