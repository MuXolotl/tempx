package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؘؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0862l implements ThreadFactory {
    public static final AtomicInteger amazon = new AtomicInteger(1);
    public final String crashlytics;
    public final AtomicInteger loadAd = new AtomicInteger(1);
    public final ThreadGroup yandex;

    public ThreadFactoryC0862l() {
        SecurityManager securityManager = System.getSecurityManager();
        this.yandex = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.crashlytics = "lottie-" + amazon.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.yandex, runnable, this.crashlytics + this.loadAd.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
