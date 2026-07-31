package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lؚؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC1688l implements Executor {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C5885l f4057l = new C5885l(ExecutorC1688l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Executor f4060l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayDeque f4059l = new ArrayDeque();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f4058l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f4062l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final RunnableC9929l f4061l = new RunnableC9929l(16, this);

    public ExecutorC1688l(Executor executor) {
        executor.getClass();
        this.f4060l = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4059l) {
            int i = this.f4058l;
            if (i != 4 && i != 3) {
                long j = this.f4062l;
                boolean z = true;
                RunnableC3543l runnableC3543l = new RunnableC3543l(1, runnable);
                this.f4059l.add(runnableC3543l);
                this.f4058l = 2;
                try {
                    this.f4060l.execute(this.f4061l);
                    if (this.f4058l != 2) {
                        return;
                    }
                    synchronized (this.f4059l) {
                        try {
                            if (this.f4062l == j && this.f4058l == 2) {
                                this.f4058l = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.f4059l) {
                        try {
                            int i2 = this.f4058l;
                            if ((i2 != 1 && i2 != 2) || !this.f4059l.removeLastOccurrence(runnableC3543l)) {
                                z = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.f4059l.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4060l + "}";
    }
}
