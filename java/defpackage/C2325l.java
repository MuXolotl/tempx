package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؔؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2325l extends AbstractC16620l implements InterfaceC8680l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Executor f5039l;

    public C2325l(Executor executor) {
        Method method;
        this.f5039l = executor;
        Method method2 = AbstractC15005l.yandex;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC15005l.yandex) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.InterfaceC8680l
    public final void billing(long j, C2397l c2397l) {
        Executor executor = this.f5039l;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC9929l runnableC9929l = new RunnableC9929l(this, c2397l, 15);
            InterfaceC12932l interfaceC12932l = c2397l.f5166l;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC9929l, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC11174l.crashlytics(interfaceC12932l, AbstractC4952l.yandex("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            c2397l.advert(new C0667l(0, scheduledFutureSchedule));
        } else {
            RunnableC12527l.f24681l.billing(j, c2397l);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f5039l;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2325l) && ((C2325l) obj).f5039l == this.f5039l;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5039l);
    }

    @Override // defpackage.AbstractC16620l
    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final Executor mo1128l() {
        return this.f5039l;
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return this.f5039l.toString();
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        try {
            this.f5039l.execute(runnable);
        } catch (RejectedExecutionException e) {
            AbstractC11174l.crashlytics(interfaceC12932l, AbstractC4952l.yandex("The task was rejected", e));
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l.f14063l.vip(interfaceC12932l, runnable);
        }
    }

    @Override // defpackage.InterfaceC8680l
    public final InterfaceC11791l yandex(long j, Runnable runnable, InterfaceC12932l interfaceC12932l) {
        Executor executor = this.f5039l;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC11174l.crashlytics(interfaceC12932l, AbstractC4952l.yandex("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new C14277l(scheduledFutureSchedule) : RunnableC12527l.f24681l.yandex(j, runnable, interfaceC12932l);
    }
}
