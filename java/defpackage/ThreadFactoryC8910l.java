package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lٌٛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC8910l implements ThreadFactory {
    public final /* synthetic */ ThreadFactoryC4430l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ThreadFactoryC8910l(int i, ThreadFactoryC4430l threadFactoryC4430l) {
        this.yandex = i;
        this.loadAd = threadFactoryC4430l;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.yandex;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= AbstractC14140l.yandex[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread threadNewThread = this.loadAd.newThread(new RunnableC9534l(i, runnable));
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
