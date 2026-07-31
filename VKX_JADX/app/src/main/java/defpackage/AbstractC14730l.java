package defpackage;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lؙٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14730l {
    public static final ExecutorService yandex;

    static {
        ThreadFactoryC10614l threadFactoryC10614l = new ThreadFactoryC10614l(2, new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC10614l, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC17147l(1, executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        yandex = executorServiceUnconfigurableExecutorService;
    }

    public static void yandex(C3823l c3823l) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c3823l.mopub(yandex, new C4568l(12, countDownLatch));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (c3823l.smaato()) {
            c3823l.isPro();
        } else {
            if (c3823l.amazon) {
                throw new CancellationException("Task is already canceled");
            }
            if (!c3823l.firebase()) {
                throw new TimeoutException();
            }
            C11983l.ads(c3823l.subs());
        }
    }
}
