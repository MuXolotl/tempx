package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lٍؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4025l extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final RunnableC10253l f8300l = new RunnableC10253l(7);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final RunnableC10253l f8301l = new RunnableC10253l(7);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RunnableFutureC11585l f8302l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Callable f8303l;

    public RunnableC4025l(RunnableFutureC11585l runnableFutureC11585l, Callable callable) {
        this.f8302l = runnableFutureC11585l;
        callable.getClass();
        this.f8303l = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            RunnableFutureC11585l runnableFutureC11585l = this.f8302l;
            boolean zIsDone = runnableFutureC11585l.isDone();
            RunnableC10253l runnableC10253l = f8300l;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f8303l.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                            yandex(threadCurrentThread);
                        }
                        boolean zMetrica = AbstractC13813l.f26938l.metrica(runnableFutureC11585l, null, new C11466l(th));
                        if (zMetrica) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                            yandex(threadCurrentThread);
                        }
                        runnableFutureC11585l.getClass();
                        if (AbstractC13813l.f26938l.metrica(runnableFutureC11585l, null, AbstractC13813l.f26940l)) {
                            AbstractC1207l.mopub(runnableFutureC11585l);
                        }
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                yandex(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            runnableFutureC11585l.getClass();
            if (objCall == null) {
                objCall = AbstractC13813l.f26940l;
            }
            if (AbstractC13813l.f26938l.metrica(runnableFutureC11585l, null, objCall)) {
                AbstractC1207l.mopub(runnableFutureC11585l);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strAd;
        Runnable runnable = (Runnable) get();
        if (runnable == f8300l) {
            strAd = "running=[DONE]";
        } else if (runnable instanceof RunnableC16121l) {
            strAd = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strAd = AbstractC9361l.ad(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strAd = "running=[NOT STARTED YET]";
        }
        String string = this.f8303l.toString();
        return AbstractC9361l.ad(new StringBuilder(strAd.length() + 2 + String.valueOf(string).length()), strAd, ", ", string);
    }

    public final void yandex(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC16121l runnableC16121l = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC16121l;
            RunnableC10253l runnableC10253l = f8301l;
            if (!z2) {
                if (runnable != runnableC10253l) {
                    break;
                }
            } else {
                runnableC16121l = (RunnableC16121l) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC10253l || compareAndSet(runnable, runnableC10253l)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC16121l);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }
}
