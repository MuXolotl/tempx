package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lٗۢۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC17493l implements ThreadFactory {
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ThreadFactoryC17493l(String str, int i) {
        this.yandex = i;
        this.loadAd = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.yandex;
        String str = this.loadAd;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName(str);
                thread2.setPriority(5);
                return thread2;
            default:
                return new Thread(runnable, str);
        }
    }
}
