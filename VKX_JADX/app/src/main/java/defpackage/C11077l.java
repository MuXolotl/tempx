package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lُٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C11077l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11077l f22285l = new C11077l(0, null);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f22286l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22287l;

    public /* synthetic */ C11077l(int i, Object obj) {
        this.f22287l = i;
        this.f22286l = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f22287l) {
            case 0:
                return this.f22286l;
            default:
                throw new ExecutionException((Throwable) this.f22286l);
        }
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
        int i = this.f22287l;
        Object obj = this.f22286l;
        switch (i) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            AbstractC5088l.amazon("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
