package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lًَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC10406l implements ThreadFactory {
    public final /* synthetic */ boolean loadAd;
    public final /* synthetic */ String yandex;

    public /* synthetic */ ThreadFactoryC10406l(String str, boolean z) {
        this.yandex = str;
        this.loadAd = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.yandex);
        thread.setDaemon(this.loadAd);
        return thread;
    }
}
