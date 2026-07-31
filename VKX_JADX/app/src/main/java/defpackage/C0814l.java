package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؒؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0814l extends AbstractC11257l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ListenableFuture f2445l;

    public C0814l(ListenableFuture listenableFuture) {
        this.f2445l = listenableFuture;
    }

    @Override // defpackage.AbstractC2722l, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f2445l.cancel(z);
    }

    @Override // defpackage.AbstractC2722l, java.util.concurrent.Future
    public final Object get() {
        return this.f2445l.get();
    }

    @Override // defpackage.AbstractC2722l, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2445l.isCancelled();
    }

    @Override // defpackage.AbstractC2722l, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2445l.isDone();
    }

    @Override // defpackage.AbstractC2722l
    public final String toString() {
        return this.f2445l.toString();
    }

    @Override // defpackage.AbstractC2722l, com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f2445l.yandex(runnable, executor);
    }

    @Override // defpackage.AbstractC2722l, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f2445l.get(j, timeUnit);
    }
}
