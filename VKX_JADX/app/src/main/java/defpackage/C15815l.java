package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٕٝؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15815l implements ListenableFuture {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C5807l f31053l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ListenableFuture f31054l;

    public C15815l() {
        this.f31054l = AbstractC11064l.purchase(new C3585l(14, this));
    }

    public static C15815l loadAd(ListenableFuture listenableFuture) {
        return listenableFuture instanceof C15815l ? (C15815l) listenableFuture : new C15815l(listenableFuture);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f31054l.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f31054l.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31054l.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31054l.isDone();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f31054l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f31054l.get(j, timeUnit);
    }

    public C15815l(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f31054l = listenableFuture;
    }
}
