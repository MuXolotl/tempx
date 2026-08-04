package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lًَ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC10614l implements ThreadFactory {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public ThreadFactoryC10614l(C9471l c9471l) {
        this.yandex = 0;
        this.loadAd = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
            case 1:
                return ((ThreadFactory) obj).newThread(new RunnableC3543l(6, runnable));
            default:
                Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new RunnableC17147l(0, runnable));
                threadNewThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread2;
        }
    }

    public /* synthetic */ ThreadFactoryC10614l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}
