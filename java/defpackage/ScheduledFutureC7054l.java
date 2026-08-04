package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؚؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledFutureC7054l extends AbstractC10851l implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final ScheduledFuture f14791l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final AbstractC2722l f14792l;

    public ScheduledFutureC7054l(AbstractC2722l abstractC2722l, ScheduledFuture scheduledFuture) {
        this.f14792l = abstractC2722l;
        this.f14791l = scheduledFuture;
    }

    public final boolean admob(boolean z) {
        return this.f14792l.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zAdmob = admob(z);
        if (zAdmob) {
            this.f14791l.cancel(z);
        }
        return zAdmob;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f14791l.compareTo(delayed);
    }

    @Override // defpackage.AbstractC10851l
    public final Object crashlytics() {
        return this.f14792l;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14792l.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14791l.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14792l.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14792l.isDone();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f14792l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f14792l.get(j, timeUnit);
    }
}
