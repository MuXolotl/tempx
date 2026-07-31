package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٍؘُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableScheduledFutureC10932l implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Callable f22053l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f22054l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AtomicReference f22055l = new AtomicReference(null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16565l f22056l;

    public RunnableScheduledFutureC10932l(Handler handler, long j, Callable callable) {
        this.f22054l = j;
        this.f22053l = callable;
        this.f22056l = AbstractC11064l.purchase(new C18449l(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f22056l.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f22056l.f32512l.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f22054l - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22056l.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f22056l.f32512l.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C5807l c5807l = (C5807l) this.f22055l.getAndSet(null);
        if (c5807l != null) {
            try {
                c5807l.loadAd(this.f22053l.call());
            } catch (Exception e) {
                c5807l.amazon(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f22056l.f32512l.get(j, timeUnit);
    }
}
