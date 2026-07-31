package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: lٓٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14140l {
    public static final int[] yandex = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory loadAd = Executors.defaultThreadFactory();

    public static ScheduledExecutorService yandex(ThreadFactoryC8910l threadFactoryC8910l, int i) {
        if (i > 0) {
            return Executors.newScheduledThreadPool(i, threadFactoryC8910l);
        }
        C10754l.metrica(AbstractC15560l.tapsense("Threads (", i, ") must be > 0"));
        return null;
    }
}
