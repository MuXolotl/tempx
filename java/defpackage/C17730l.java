package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17730l extends Thread {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34540l = AtomicIntegerFieldUpdater.newUpdater(C17730l.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f34541l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f34542l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC8830l f34543l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10700l f34544l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11426l f34545l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f34546l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f34547l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34548l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C17730l(ExecutorC8830l executorC8830l, int i) {
        this.f34543l = executorC8830l;
        setDaemon(true);
        setContextClassLoader(ExecutorC8830l.class.getClassLoader());
        this.f34545l = new C11426l();
        this.f34544l = new C10700l();
        this.f34541l = 4;
        this.nextParkedWorker = ExecutorC8830l.f18129l;
        int iNanoTime = (int) System.nanoTime();
        this.f34548l = iNanoTime == 0 ? 42 : iNanoTime;
        billing(i);
    }

    public final boolean admob(int i) {
        int i2 = this.f34541l;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC8830l.f18128l.addAndGet(this.f34543l, 4398046511104L);
        }
        if (i2 != i) {
            this.f34541l = i;
        }
        return z;
    }

    public final int amazon(int i) {
        int i2 = this.f34548l;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f34548l = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final void billing(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34543l.f18135l);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final Object crashlytics() {
        return this.nextParkedWorker;
    }

    public final int loadAd() {
        return this.indexInArray;
    }

    public final void mopub(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final AbstractRunnableC18269l purchase() {
        int iAmazon = amazon(2);
        ExecutorC8830l executorC8830l = this.f34543l;
        C10031l c10031l = executorC8830l.f18136l;
        C10031l c10031l2 = executorC8830l.f18134l;
        if (iAmazon == 0) {
            AbstractRunnableC18269l abstractRunnableC18269l = (AbstractRunnableC18269l) c10031l2.amazon();
            return abstractRunnableC18269l != null ? abstractRunnableC18269l : (AbstractRunnableC18269l) c10031l.amazon();
        }
        AbstractRunnableC18269l abstractRunnableC18269l2 = (AbstractRunnableC18269l) c10031l.amazon();
        return abstractRunnableC18269l2 != null ? abstractRunnableC18269l2 : (AbstractRunnableC18269l) c10031l2.amazon();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC8830l.f18127l.get(this.f34543l) == 1 || this.f34541l == 5) {
                    break loop0;
                }
                AbstractRunnableC18269l abstractRunnableC18269lYandex = yandex(this.f34542l);
                if (abstractRunnableC18269lYandex != null) {
                    this.f34546l = 0L;
                    ExecutorC8830l executorC8830l = this.f34543l;
                    this.f34547l = 0L;
                    if (this.f34541l == 3) {
                        this.f34541l = 2;
                    }
                    if (!abstractRunnableC18269lYandex.f35767l) {
                        try {
                            abstractRunnableC18269lYandex.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (admob(2) && !executorC8830l.ads() && !executorC8830l.adcel(ExecutorC8830l.f18128l.get(executorC8830l))) {
                        executorC8830l.ads();
                    }
                    try {
                        abstractRunnableC18269lYandex.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    ExecutorC8830l.f18128l.addAndGet(executorC8830l, -2097152L);
                    if (this.f34541l == 5) {
                        break;
                    }
                    this.f34541l = 4;
                    break;
                }
                this.f34542l = false;
                if (this.f34546l == 0) {
                    Object obj = this.nextParkedWorker;
                    C9676l c9676l = ExecutorC8830l.f18129l;
                    if (obj != c9676l) {
                        f34540l.set(this, -1);
                        while (this.nextParkedWorker != ExecutorC8830l.f18129l) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34540l;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            ExecutorC8830l executorC8830l2 = this.f34543l;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC8830l.f18127l;
                            if (atomicIntegerFieldUpdater2.get(executorC8830l2) == 1 || this.f34541l == 5) {
                                break;
                            }
                            admob(3);
                            Thread.interrupted();
                            if (this.f34547l == 0) {
                                j = 2097151;
                                this.f34547l = System.nanoTime() + this.f34543l.f18130l;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.f34543l.f18130l);
                            if (System.nanoTime() - this.f34547l >= 0) {
                                this.f34547l = 0L;
                                ExecutorC8830l executorC8830l3 = this.f34543l;
                                synchronized (executorC8830l3.f18131l) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(executorC8830l3) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8830l.f18128l;
                                            if (((int) (atomicLongFieldUpdater.get(executorC8830l3) & j)) > executorC8830l3.f18133l && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                billing(0);
                                                executorC8830l3.vip(this, i, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC8830l3) & j);
                                                if (andDecrement != i) {
                                                    C17730l c17730l = (C17730l) executorC8830l3.f18131l.loadAd(andDecrement);
                                                    executorC8830l3.f18131l.crashlytics(i, c17730l);
                                                    c17730l.billing(i);
                                                    executorC8830l3.vip(c17730l, andDecrement, i);
                                                }
                                                executorC8830l3.f18131l.crashlytics(andDecrement, null);
                                                Unit unit = Unit.INSTANCE;
                                                this.f34541l = 5;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        ExecutorC8830l executorC8830l4 = this.f34543l;
                        if (this.nextParkedWorker == c9676l) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC8830l.f18126l;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(executorC8830l4);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = executorC8830l4.f18131l.loadAd((int) (j2 & 2097151));
                                ExecutorC8830l executorC8830l5 = executorC8830l4;
                                if (ExecutorC8830l.f18126l.compareAndSet(executorC8830l5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                    break;
                                } else {
                                    executorC8830l4 = executorC8830l5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        admob(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f34546l);
                        this.f34546l = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        admob(5);
    }

    public final AbstractRunnableC18269l subs(int i) {
        long j;
        AbstractRunnableC18269l abstractRunnableC18269lLoadAd;
        long j2;
        long j3;
        AbstractRunnableC18269l abstractRunnableC18269l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8830l.f18128l;
        ExecutorC8830l executorC8830l = this.f34543l;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC8830l) & 2097151);
        AbstractRunnableC18269l abstractRunnableC18269l2 = null;
        if (i2 < 2) {
            return null;
        }
        int iAmazon = amazon(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iAmazon++;
            if (iAmazon > i2) {
                iAmazon = 1;
            }
            C17730l c17730l = (C17730l) executorC8830l.f18131l.loadAd(iAmazon);
            if (c17730l != null && c17730l != this) {
                C11426l c11426l = c17730l.f34545l;
                c11426l.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = C11426l.amazon.get(c11426l);
                    int i5 = C11426l.crashlytics.get(c11426l);
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || C11426l.purchase.get(c11426l) != 0) {
                                int i6 = i4 + 1;
                                AbstractRunnableC18269l abstractRunnableC18269lCrashlytics = c11426l.crashlytics(i4, z);
                                if (abstractRunnableC18269lCrashlytics != null) {
                                    abstractRunnableC18269lLoadAd = abstractRunnableC18269lCrashlytics;
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        abstractRunnableC18269lLoadAd = abstractRunnableC18269l2;
                        break;
                    }
                } else {
                    abstractRunnableC18269lLoadAd = c11426l.loadAd();
                    j = 0;
                }
                C10700l c10700l = this.f34544l;
                if (abstractRunnableC18269lLoadAd == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11426l.loadAd;
                        AbstractRunnableC18269l abstractRunnableC18269l3 = (AbstractRunnableC18269l) atomicReferenceFieldUpdater.get(c11426l);
                        if (abstractRunnableC18269l3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((abstractRunnableC18269l3.f35767l ? 1 : 2) & i) != 0) {
                                AbstractC9141l.billing.getClass();
                                C11426l c11426l2 = c11426l;
                                long jNanoTime = System.nanoTime() - abstractRunnableC18269l3.f35768l;
                                long j4 = AbstractC9141l.loadAd;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    abstractRunnableC18269l = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC18269l = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c11426l2, abstractRunnableC18269l3, null)) {
                                        c10700l.f21708l = abstractRunnableC18269l3;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c11426l2) == abstractRunnableC18269l3);
                                c11426l = c11426l2;
                                abstractRunnableC18269l2 = null;
                            }
                        }
                        j3 = -2;
                        abstractRunnableC18269l = abstractRunnableC18269l2;
                        break;
                    }
                } else {
                    c10700l.f21708l = abstractRunnableC18269lLoadAd;
                    abstractRunnableC18269l = abstractRunnableC18269l2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    AbstractRunnableC18269l abstractRunnableC18269l4 = (AbstractRunnableC18269l) c10700l.f21708l;
                    c10700l.f21708l = abstractRunnableC18269l;
                    return abstractRunnableC18269l4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            abstractRunnableC18269l2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f34546l = jMin;
        return null;
    }

    public final AbstractRunnableC18269l yandex(boolean z) {
        AbstractRunnableC18269l abstractRunnableC18269lPurchase;
        AbstractRunnableC18269l abstractRunnableC18269lPurchase2;
        long j;
        int i = this.f34541l;
        ExecutorC8830l executorC8830l = this.f34543l;
        AbstractRunnableC18269l abstractRunnableC18269l = null;
        C11426l c11426l = this.f34545l;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8830l.f18128l;
            do {
                j = atomicLongFieldUpdater.get(executorC8830l);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c11426l.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11426l.loadAd;
                        AbstractRunnableC18269l abstractRunnableC18269l2 = (AbstractRunnableC18269l) atomicReferenceFieldUpdater.get(c11426l);
                        if (abstractRunnableC18269l2 == null || !abstractRunnableC18269l2.f35767l) {
                            int i2 = C11426l.amazon.get(c11426l);
                            int i3 = C11426l.crashlytics.get(c11426l);
                            while (i2 != i3 && C11426l.purchase.get(c11426l) != 0) {
                                i3--;
                                AbstractRunnableC18269l abstractRunnableC18269lCrashlytics = c11426l.crashlytics(i3, true);
                                if (abstractRunnableC18269lCrashlytics != null) {
                                    abstractRunnableC18269l = abstractRunnableC18269lCrashlytics;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c11426l, abstractRunnableC18269l2, null)) {
                                abstractRunnableC18269l = abstractRunnableC18269l2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c11426l) == abstractRunnableC18269l2);
                    }
                    if (abstractRunnableC18269l != null) {
                        return abstractRunnableC18269l;
                    }
                    AbstractRunnableC18269l abstractRunnableC18269l3 = (AbstractRunnableC18269l) executorC8830l.f18136l.amazon();
                    return abstractRunnableC18269l3 == null ? subs(1) : abstractRunnableC18269l3;
                }
            } while (!ExecutorC8830l.f18128l.compareAndSet(executorC8830l, j, j - 4398046511104L));
            this.f34541l = 1;
        }
        if (z) {
            boolean z2 = amazon(executorC8830l.f18133l * 2) == 0;
            if (z2 && (abstractRunnableC18269lPurchase2 = purchase()) != null) {
                return abstractRunnableC18269lPurchase2;
            }
            c11426l.getClass();
            AbstractRunnableC18269l abstractRunnableC18269lLoadAd = (AbstractRunnableC18269l) C11426l.loadAd.getAndSet(c11426l, null);
            if (abstractRunnableC18269lLoadAd == null) {
                abstractRunnableC18269lLoadAd = c11426l.loadAd();
            }
            if (abstractRunnableC18269lLoadAd != null) {
                return abstractRunnableC18269lLoadAd;
            }
            if (!z2 && (abstractRunnableC18269lPurchase = purchase()) != null) {
                return abstractRunnableC18269lPurchase;
            }
        } else {
            AbstractRunnableC18269l abstractRunnableC18269lPurchase3 = purchase();
            if (abstractRunnableC18269lPurchase3 != null) {
                return abstractRunnableC18269lPurchase3;
            }
        }
        return subs(3);
    }
}
