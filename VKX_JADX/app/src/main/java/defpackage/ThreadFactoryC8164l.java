package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lًٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8164l implements ThreadFactory {
    public final /* synthetic */ boolean loadAd;
    public final AtomicInteger yandex = new AtomicInteger(0);

    public ThreadFactoryC8164l(boolean z) {
        this.loadAd = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbAd = AbstractC5020l.ad(this.loadAd ? "WM.task-" : "androidx.work-");
        sbAd.append(this.yandex.incrementAndGet());
        return new Thread(runnable, sbAd.toString());
    }
}
