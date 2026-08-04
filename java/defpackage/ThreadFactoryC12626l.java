package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lّٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC12626l implements ThreadFactory {
    public static final /* synthetic */ ThreadFactoryC12626l loadAd = new ThreadFactoryC12626l(2);
    public final /* synthetic */ int yandex;

    public /* synthetic */ ThreadFactoryC12626l(int i) {
        this.yandex = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.yandex) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new C8186l(runnable);
            default:
                Object obj = C7447l.isPro;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
