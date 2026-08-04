package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٖۖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16565l implements ListenableFuture {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C14641l f32512l = new C14641l(this);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f32513l;

    public C16565l(C5807l c5807l) {
        this.f32513l = new WeakReference(c5807l);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C5807l c5807l = (C5807l) this.f32513l.get();
        boolean zCancel = this.f32512l.cancel(z);
        if (zCancel && c5807l != null) {
            c5807l.yandex = null;
            c5807l.loadAd = null;
            c5807l.crashlytics.isPro(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f32512l.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f32512l.f9932l instanceof C13118l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f32512l.isDone();
    }

    public final boolean loadAd(Throwable th) {
        return this.f32512l.firebase(th);
    }

    public final String toString() {
        return this.f32512l.toString();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f32512l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f32512l.get(j, timeUnit);
    }
}
