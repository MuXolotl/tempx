package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledExecutorServiceC6354l extends C17438l implements ScheduledExecutorService, InterfaceExecutorServiceC0212l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ScheduledExecutorService f13317l;

    public ScheduledExecutorServiceC6354l(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f13317l = scheduledExecutorService;
    }

    @Override // defpackage.C17438l, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC14238l.remoteconfig(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(Executors.callable(runnable, null));
        return new ScheduledFutureC7054l(runnableFutureC13286l, this.f13317l.schedule(runnableFutureC13286l, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC14919l runnableC14919l = new RunnableC14919l(runnable);
        return new ScheduledFutureC7054l(runnableC14919l, this.f13317l.scheduleAtFixedRate(runnableC14919l, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC14919l runnableC14919l = new RunnableC14919l(runnable);
        return new ScheduledFutureC7054l(runnableC14919l, this.f13317l.scheduleWithFixedDelay(runnableC14919l, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(callable);
        return new ScheduledFutureC7054l(runnableFutureC13286l, this.f13317l.schedule(runnableFutureC13286l, j, timeUnit));
    }
}
