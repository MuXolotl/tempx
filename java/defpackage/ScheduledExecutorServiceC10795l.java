package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lُؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledExecutorServiceC10795l extends ExecutorServiceC11264l implements ScheduledExecutorService {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ScheduledExecutorService f21827l;

    public ScheduledExecutorServiceC10795l(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f21827l = scheduledExecutorService;
    }

    @Override // defpackage.ExecutorServiceC11264l, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC14238l.startapp(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC11585l runnableFutureC11585l = new RunnableFutureC11585l(Executors.callable(runnable, null));
        return new ScheduledFutureC11166l(runnableFutureC11585l, this.f21827l.schedule(runnableFutureC11585l, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC13248l runnableC13248l = new RunnableC13248l(runnable);
        return new ScheduledFutureC11166l(runnableC13248l, this.f21827l.scheduleAtFixedRate(runnableC13248l, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC13248l runnableC13248l = new RunnableC13248l(runnable);
        return new ScheduledFutureC11166l(runnableC13248l, this.f21827l.scheduleWithFixedDelay(runnableC13248l, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC11585l runnableFutureC11585l = new RunnableFutureC11585l(callable);
        return new ScheduledFutureC11166l(runnableFutureC11585l, this.f21827l.schedule(runnableFutureC11585l, j, timeUnit));
    }
}
