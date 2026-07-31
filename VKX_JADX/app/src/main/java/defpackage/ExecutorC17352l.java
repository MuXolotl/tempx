package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٗۘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC17352l implements Executor {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Logger f33809l = Logger.getLogger(ExecutorC17352l.class.getName());

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Executor f33812l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayDeque f33811l = new ArrayDeque();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f33810l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f33814l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final RunnableC9929l f33813l = new RunnableC9929l(17, this);

    public ExecutorC17352l(Executor executor) {
        AbstractC1051l.subs(executor);
        this.f33812l = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1051l.subs(runnable);
        synchronized (this.f33811l) {
            int i = this.f33810l;
            if (i != 4 && i != 3) {
                long j = this.f33814l;
                RunnableC3543l runnableC3543l = new RunnableC3543l(2, runnable);
                this.f33811l.add(runnableC3543l);
                this.f33810l = 2;
                try {
                    this.f33812l.execute(this.f33813l);
                    if (this.f33810l != 2) {
                        return;
                    }
                    synchronized (this.f33811l) {
                        try {
                            if (this.f33814l == j && this.f33810l == 2) {
                                this.f33810l = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f33811l) {
                        try {
                            int i2 = this.f33810l;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f33811l.removeLastOccurrence(runnableC3543l)) {
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
            this.f33811l.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f33812l + "}";
    }
}
