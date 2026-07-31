package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lُۥٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC11481l implements ThreadFactory {
    public static final ThreadFactory purchase = Executors.defaultThreadFactory();
    public final StrictMode.ThreadPolicy amazon;
    public final int crashlytics;
    public final String loadAd;
    public final AtomicLong yandex = new AtomicLong();

    public ThreadFactoryC11481l(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = purchase.newThread(new RunnableC10425l(this, runnable, 1));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.loadAd + " Thread #" + this.yandex.getAndIncrement());
        return threadNewThread;
    }
}
