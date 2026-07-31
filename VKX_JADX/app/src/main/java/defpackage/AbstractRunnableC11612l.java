package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lؙِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC11612l extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final RunnableC10253l f23325l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final RunnableC10253l f23326l;

    static {
        int i = 1;
        f23326l = new RunnableC10253l(i);
        f23325l = new RunnableC10253l(i);
    }

    public abstract boolean amazon();

    public abstract String billing();

    public final void crashlytics() {
        RunnableC10253l runnableC10253l = f23325l;
        RunnableC10253l runnableC10253l2 = f23326l;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC5863l runnableC5863l = new RunnableC5863l(this);
            RunnableC5863l.yandex(runnableC5863l, Thread.currentThread());
            if (compareAndSet(runnable, runnableC5863l)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(runnableC10253l2)) == runnableC10253l) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract void loadAd(Object obj);

    public final void mopub(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC5863l runnableC5863l = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC5863l;
            RunnableC10253l runnableC10253l = f23325l;
            if (!z2 && runnable != runnableC10253l) {
                break;
            }
            if (z2) {
                runnableC5863l = (RunnableC5863l) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC10253l || compareAndSet(runnable, runnableC10253l)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC5863l);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object purchase();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objPurchase = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zAmazon = amazon();
            RunnableC10253l runnableC10253l = f23326l;
            if (!zAmazon) {
                try {
                    objPurchase = purchase();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                            mopub(threadCurrentThread);
                        }
                        if (zAmazon) {
                            return;
                        }
                        yandex(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                            mopub(threadCurrentThread);
                        }
                        if (!zAmazon) {
                            loadAd(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC10253l)) {
                mopub(threadCurrentThread);
            }
            if (zAmazon) {
                return;
            }
            loadAd(objPurchase);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f23326l) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC5863l) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbAdvert = AbstractC5020l.advert(str, ", ");
        sbAdvert.append(billing());
        return sbAdvert.toString();
    }

    public abstract void yandex(Throwable th);
}
