package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lِؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC11585l extends AbstractC1207l implements RunnableFuture {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public volatile RunnableC4025l f23283l;

    public RunnableFutureC11585l(Callable callable) {
        this.f23283l = new RunnableC4025l(this, callable);
    }

    @Override // defpackage.AbstractC1207l
    public final void amazon() {
        RunnableC4025l runnableC4025l;
        Object obj = this.f26944l;
        if ((obj instanceof C3866l) && ((C3866l) obj).yandex && (runnableC4025l = this.f23283l) != null) {
            RunnableC10253l runnableC10253l = RunnableC4025l.f8301l;
            RunnableC10253l runnableC10253l2 = RunnableC4025l.f8300l;
            Runnable runnable = (Runnable) runnableC4025l.get();
            if (runnable instanceof Thread) {
                RunnableC16121l runnableC16121l = new RunnableC16121l(runnableC4025l);
                runnableC16121l.yandex(Thread.currentThread());
                if (runnableC4025l.compareAndSet(runnable, runnableC16121l)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) runnableC4025l.getAndSet(runnableC10253l2)) == runnableC10253l) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) runnableC4025l.getAndSet(runnableC10253l2)) == runnableC10253l) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f23283l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1207l
    public final String purchase() {
        RunnableC4025l runnableC4025l = this.f23283l;
        if (runnableC4025l != null) {
            String string = runnableC4025l.toString();
            return AbstractC9361l.ad(new StringBuilder(string.length() + 7), "task=[", string, "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        RunnableC4025l runnableC4025l = this.f23283l;
        if (runnableC4025l != null) {
            runnableC4025l.run();
        }
        this.f23283l = null;
    }
}
