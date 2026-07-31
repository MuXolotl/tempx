package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lًًۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7870l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Executor f16415l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayDeque f16416l = new ArrayDeque();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final RunnableC5360l f16414l = new RunnableC5360l(22, this);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16418l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f16417l = 0;

    public ExecutorC7870l(Executor executor) {
        executor.getClass();
        this.f16415l = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f16416l) {
            int i = this.f16418l;
            if (i != 4 && i != 3) {
                long j = this.f16417l;
                RunnableC3543l runnableC3543l = new RunnableC3543l(3, runnable);
                this.f16416l.add(runnableC3543l);
                this.f16418l = 2;
                try {
                    this.f16415l.execute(this.f16414l);
                    if (this.f16418l != 2) {
                        return;
                    }
                    synchronized (this.f16416l) {
                        try {
                            if (this.f16417l == j && this.f16418l == 2) {
                                this.f16418l = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f16416l) {
                        try {
                            int i2 = this.f16418l;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f16416l.removeLastOccurrence(runnableC3543l)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f16416l.add(runnable);
        }
    }
}
