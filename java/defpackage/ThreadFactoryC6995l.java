package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lؚؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC6995l implements ThreadFactory {
    public final ThreadFactory loadAd = Executors.defaultThreadFactory();
    public final String yandex;

    public ThreadFactoryC6995l(String str) {
        this.yandex = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.loadAd.newThread(new RunnableC3543l(4, runnable));
        threadNewThread.setName(this.yandex);
        return threadNewThread;
    }
}
