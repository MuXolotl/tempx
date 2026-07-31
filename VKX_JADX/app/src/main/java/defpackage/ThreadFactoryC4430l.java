package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lؖ۟٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC4430l implements ThreadFactory {
    public final /* synthetic */ C11879l crashlytics;
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ ThreadFactory yandex;

    public /* synthetic */ ThreadFactoryC4430l(ThreadFactory threadFactory, String str, C11879l c11879l) {
        this.yandex = threadFactory;
        this.loadAd = str;
        this.crashlytics = c11879l;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.yandex.newThread(runnable);
        StringBuilder sbAd = AbstractC5020l.ad(this.loadAd);
        sbAd.append(AbstractC12024l.m3340static(2, String.valueOf(C11879l.loadAd.incrementAndGet(this.crashlytics))));
        threadNewThread.setName(sbAd.toString());
        return threadNewThread;
    }
}
