package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؗۘٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5113l implements ListenableFuture {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f11112l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C5113l f11111l = new C5113l(null);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C5885l f11110l = new C5885l(C5113l.class);

    public C5113l(Object obj) {
        this.f11112l = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f11112l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f11112l + "]]";
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        AbstractC12442l.metrica(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f11110l.yandex().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11112l;
    }
}
