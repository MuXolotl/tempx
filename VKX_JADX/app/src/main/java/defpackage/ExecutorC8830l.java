package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lٌؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC8830l implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f18130l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18472l f18131l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f18132l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f18133l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10031l f18134l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f18135l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10031l f18136l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18126l = AtomicLongFieldUpdater.newUpdater(ExecutorC8830l.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18128l = AtomicLongFieldUpdater.newUpdater(ExecutorC8830l.class, "controlState$volatile");

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18127l = AtomicIntegerFieldUpdater.newUpdater(ExecutorC8830l.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C9676l f18129l = new C9676l("NOT_IN_STACK", 2);

    public ExecutorC8830l(int i, int i2, long j, String str) {
        this.f18133l = i;
        this.f18132l = i2;
        this.f18130l = j;
        this.f18135l = str;
        if (i < 1) {
            C10754l.metrica(AbstractC15560l.tapsense("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C10754l.metrica(AbstractC12589l.premium(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C10754l.metrica(AbstractC15560l.tapsense("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.f18134l = new C10031l();
        this.f18136l = new C10031l();
        this.f18131l = new C18472l((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void mopub(ExecutorC8830l executorC8830l, Runnable runnable, int i) {
        executorC8830l.billing(runnable, false, (i & 4) == 0);
    }

    public final boolean adcel(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f18133l;
        if (i < i2) {
            int iYandex = yandex();
            if (iYandex == 1 && i2 > 1) {
                yandex();
            }
            if (iYandex > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean ads() {
        ExecutorC8830l executorC8830l;
        C9676l c9676l;
        int iLoadAd;
        while (true) {
            long j = f18126l.get(this);
            C17730l c17730l = (C17730l) this.f18131l.loadAd((int) (2097151 & j));
            if (c17730l == null) {
                c17730l = null;
                executorC8830l = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objCrashlytics = c17730l.crashlytics();
                while (true) {
                    c9676l = f18129l;
                    if (objCrashlytics == c9676l) {
                        iLoadAd = -1;
                        break;
                    }
                    if (objCrashlytics == null) {
                        iLoadAd = 0;
                        break;
                    }
                    C17730l c17730l2 = (C17730l) objCrashlytics;
                    iLoadAd = c17730l2.loadAd();
                    if (iLoadAd != 0) {
                        break;
                    }
                    objCrashlytics = c17730l2.crashlytics();
                    j = j;
                }
                if (iLoadAd >= 0) {
                    ExecutorC8830l executorC8830l2 = this;
                    boolean zCompareAndSet = f18126l.compareAndSet(executorC8830l2, j, ((long) iLoadAd) | j2);
                    executorC8830l = executorC8830l2;
                    if (zCompareAndSet) {
                        c17730l.mopub(c9676l);
                    }
                    this = executorC8830l;
                } else {
                    continue;
                }
            }
            if (c17730l == null) {
                return false;
            }
            if (C17730l.f34540l.compareAndSet(c17730l, -1, 0)) {
                LockSupport.unpark(c17730l);
                return true;
            }
            this = executorC8830l;
        }
    }

    public final void billing(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC18269l c17916l;
        int i;
        AbstractC9141l.billing.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC18269l) {
            c17916l = (AbstractRunnableC18269l) runnable;
            c17916l.f35768l = jNanoTime;
            c17916l.f35767l = z;
        } else {
            c17916l = new C17916l(runnable, jNanoTime, z);
        }
        boolean z3 = c17916l.f35767l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18128l;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C17730l c17730l = threadCurrentThread instanceof C17730l ? (C17730l) threadCurrentThread : null;
        if (c17730l == null || c17730l.f34543l != this) {
            c17730l = null;
        }
        if (c17730l != null && (i = c17730l.f34541l) != 5 && (c17916l.f35767l || i != 2)) {
            c17730l.f34542l = true;
            C11426l c11426l = c17730l.f34545l;
            if (z2) {
                c17916l = c11426l.yandex(c17916l);
            } else {
                c11426l.getClass();
                AbstractRunnableC18269l abstractRunnableC18269l = (AbstractRunnableC18269l) C11426l.loadAd.getAndSet(c11426l, c17916l);
                c17916l = abstractRunnableC18269l == null ? null : c11426l.yandex(abstractRunnableC18269l);
            }
        }
        if (c17916l != null) {
            if (!(c17916l.f35767l ? this.f18136l.yandex(c17916l) : this.f18134l.yandex(c17916l))) {
                throw new RejectedExecutionException(AbstractC0653l.ads(new StringBuilder(), this.f18135l, " was terminated"));
            }
        }
        if (z3) {
            if (ads() || adcel(jAddAndGet)) {
                return;
            }
            ads();
            return;
        }
        if (ads() || adcel(atomicLongFieldUpdater.get(this))) {
            return;
        }
        ads();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC18269l abstractRunnableC18269lYandex;
        if (f18127l.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C17730l c17730l = threadCurrentThread instanceof C17730l ? (C17730l) threadCurrentThread : null;
            if (c17730l == null || c17730l.f34543l != this) {
                c17730l = null;
            }
            synchronized (this.f18131l) {
                i = (int) (f18128l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C17730l c17730l2 = (C17730l) this.f18131l.loadAd(i2);
                    if (c17730l2 != c17730l) {
                        while (c17730l2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c17730l2);
                            c17730l2.join(10000L);
                        }
                        C11426l c11426l = c17730l2.f34545l;
                        C10031l c10031l = this.f18136l;
                        c11426l.getClass();
                        AbstractRunnableC18269l abstractRunnableC18269l = (AbstractRunnableC18269l) C11426l.loadAd.getAndSet(c11426l, null);
                        if (abstractRunnableC18269l != null) {
                            c10031l.yandex(abstractRunnableC18269l);
                        }
                        while (true) {
                            AbstractRunnableC18269l abstractRunnableC18269lLoadAd = c11426l.loadAd();
                            if (abstractRunnableC18269lLoadAd == null) {
                                break;
                            } else {
                                c10031l.yandex(abstractRunnableC18269lLoadAd);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f18136l.loadAd();
            this.f18134l.loadAd();
            while (true) {
                if (c17730l != null) {
                    abstractRunnableC18269lYandex = c17730l.yandex(true);
                    if (abstractRunnableC18269lYandex == null) {
                        abstractRunnableC18269lYandex = (AbstractRunnableC18269l) this.f18134l.amazon();
                        if (abstractRunnableC18269lYandex == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC18269lYandex = (AbstractRunnableC18269l) this.f18134l.amazon();
                    if (abstractRunnableC18269lYandex == null && (abstractRunnableC18269lYandex = (AbstractRunnableC18269l) this.f18136l.amazon()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC18269lYandex.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c17730l != null) {
                c17730l.admob(5);
            }
            f18126l.set(this, 0L);
            f18128l.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mopub(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C18472l c18472l = this.f18131l;
        int iYandex = c18472l.yandex();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iYandex; i6++) {
            C17730l c17730l = (C17730l) c18472l.loadAd(i6);
            if (c17730l != null) {
                C11426l c11426l = c17730l.f34545l;
                c11426l.getClass();
                int i7 = C11426l.loadAd.get(c11426l) != null ? (C11426l.crashlytics.get(c11426l) - C11426l.amazon.get(c11426l)) + 1 : C11426l.crashlytics.get(c11426l) - C11426l.amazon.get(c11426l);
                int iInmobi = AbstractC5020l.inmobi(c17730l.f34541l);
                if (iInmobi == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iInmobi == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iInmobi == 2) {
                    i3++;
                } else if (iInmobi == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iInmobi != 4) {
                        C18725l.billing();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f18128l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f18135l);
        sb4.append('@');
        sb4.append(AbstractC17549l.purchase(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f18133l;
        sb4.append(i8);
        sb4.append(", max = ");
        AbstractC12900l.tapsense(sb4, this.f18132l, "}, Worker States {CPU = ", i, ", blocking = ");
        AbstractC12900l.tapsense(sb4, i2, ", parked = ", i3, ", dormant = ");
        AbstractC12900l.tapsense(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f18134l.crashlytics());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f18136l.crashlytics());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void vip(C17730l c17730l, int i, int i2) {
        while (true) {
            long j = f18126l.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objCrashlytics = c17730l.crashlytics();
                    while (true) {
                        if (objCrashlytics == f18129l) {
                            i3 = -1;
                            break;
                        }
                        if (objCrashlytics == null) {
                            i3 = 0;
                            break;
                        }
                        C17730l c17730l2 = (C17730l) objCrashlytics;
                        int iLoadAd = c17730l2.loadAd();
                        if (iLoadAd != 0) {
                            i3 = iLoadAd;
                            break;
                        }
                        objCrashlytics = c17730l2.crashlytics();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC8830l executorC8830l = this;
                if (f18126l.compareAndSet(executorC8830l, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC8830l;
                }
            }
        }
    }

    public final int yandex() {
        synchronized (this.f18131l) {
            try {
                if (f18127l.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f18128l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f18133l) {
                    return 0;
                }
                if (i >= this.f18132l) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f18131l.loadAd(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C17730l c17730l = new C17730l(this, i3);
                this.f18131l.crashlytics(i3, c17730l);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c17730l.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
