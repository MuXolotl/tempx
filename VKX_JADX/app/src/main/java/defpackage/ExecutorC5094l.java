package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؗۗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5094l implements Executor, ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ThreadFactoryC11659l f11100l = new ThreadFactoryC11659l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ScheduledThreadPoolExecutor f11101l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f11102l = new Object();

    public ExecutorC5094l() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f11100l);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC13303l());
        this.f11101l = scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        synchronized (this.f11102l) {
            zAwaitTermination = this.f11101l.awaitTermination(j, timeUnit);
        }
        return zAwaitTermination;
    }

    public final void billing(C6655l c6655l) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        c6655l.getClass();
        synchronized (this.f11102l) {
            try {
                if (this.f11101l.isShutdown()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, f11100l);
                    scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC13303l());
                    this.f11101l = scheduledThreadPoolExecutor2;
                }
                scheduledThreadPoolExecutor = this.f11101l;
            } catch (Throwable th) {
                throw th;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, c6655l.loadAd().size()));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC14238l.admob(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f11102l) {
            this.f11101l.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        List listInvokeAll;
        synchronized (this.f11102l) {
            listInvokeAll = this.f11101l.invokeAll(collection);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        Object objInvokeAny;
        synchronized (this.f11102l) {
            objInvokeAny = this.f11101l.invokeAny(collection);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean zIsShutdown;
        synchronized (this.f11102l) {
            zIsShutdown = this.f11101l.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean zIsTerminated;
        synchronized (this.f11102l) {
            zIsTerminated = this.f11101l.isTerminated();
        }
        return zIsTerminated;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f11102l) {
            scheduledFutureSchedule = this.f11101l.schedule(runnable, j, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.f11102l) {
            scheduledFutureScheduleAtFixedRate = this.f11101l.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.f11102l) {
            scheduledFutureScheduleWithFixedDelay = this.f11101l.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f11102l) {
            this.f11101l.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow;
        synchronized (this.f11102l) {
            listShutdownNow = this.f11101l.shutdownNow();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future futureSubmit;
        synchronized (this.f11102l) {
            futureSubmit = this.f11101l.submit(callable);
        }
        return futureSubmit;
    }

    public final void yandex() {
        synchronized (this.f11102l) {
            try {
                if (!this.f11101l.isShutdown()) {
                    this.f11101l.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        List listInvokeAll;
        synchronized (this.f11102l) {
            listInvokeAll = this.f11101l.invokeAll(collection, j, timeUnit);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        Object objInvokeAny;
        synchronized (this.f11102l) {
            objInvokeAny = this.f11101l.invokeAny(collection, j, timeUnit);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ScheduledFuture scheduledFutureSchedule;
        synchronized (this.f11102l) {
            scheduledFutureSchedule = this.f11101l.schedule(callable, j, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future futureSubmit;
        synchronized (this.f11102l) {
            futureSubmit = this.f11101l.submit(runnable, obj);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> futureSubmit;
        synchronized (this.f11102l) {
            futureSubmit = this.f11101l.submit(runnable);
        }
        return futureSubmit;
    }
}
