package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؘِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC11659l implements ThreadFactory {
    public final AtomicInteger loadAd;
    public final /* synthetic */ int yandex;

    public ThreadFactoryC11659l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new AtomicInteger(0);
                break;
            case 2:
                this.loadAd = new AtomicInteger(0);
                break;
            default:
                this.loadAd = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.yandex;
        AtomicInteger atomicInteger = this.loadAd;
        switch (i) {
            case 0:
                Thread thread = new Thread(new RunnableC16112l(13, runnable));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread3;
        }
    }
}
