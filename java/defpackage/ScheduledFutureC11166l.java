package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lُٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledFutureC11166l extends AbstractC15212l implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ScheduledFuture f22453l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC1207l f22454l;

    public ScheduledFutureC11166l(AbstractC1207l abstractC1207l, ScheduledFuture scheduledFuture) {
        this.f22454l = abstractC1207l;
        this.f22453l = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f22454l.cancel(z);
        if (zCancel) {
            this.f22453l.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f22453l.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f22454l.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f22453l.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22454l.f26944l instanceof C3866l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f22454l.isDone();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f22454l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f22454l.get(j, timeUnit);
    }
}
