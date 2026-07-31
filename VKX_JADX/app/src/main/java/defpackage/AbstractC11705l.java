package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lًِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11705l extends AbstractC14868l implements InterfaceC8680l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23452l = AtomicReferenceFieldUpdater.newUpdater(AbstractC11705l.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23453l = AtomicReferenceFieldUpdater.newUpdater(AbstractC11705l.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23454l = AtomicIntegerFieldUpdater.newUpdater(AbstractC11705l.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // defpackage.InterfaceC8680l
    public final void billing(long j, C2397l c2397l) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C6098l c6098l = new C6098l(this, j2 + jNanoTime, c2397l);
            m3218l(jNanoTime, c6098l);
            c2397l.advert(new C0667l(2, c6098l));
        }
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public void mo3212l(long j, AbstractRunnableC7736l abstractRunnableC7736l) {
        RunnableC12527l.f24681l.m3218l(j, abstractRunnableC7736l);
    }

    @Override // defpackage.AbstractC14868l
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final long mo3213l() {
        Runnable runnable;
        AbstractRunnableC7736l abstractRunnableC7736l;
        C9676l c9676l = AbstractC16465l.loadAd;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23452l;
        if (!m3901l()) {
            m3214l();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof C2335l) {
                        C2335l c2335l = (C2335l) obj;
                        Object objAmazon = c2335l.amazon();
                        if (objAmazon != C2335l.mopub) {
                            runnable = (Runnable) objAmazon;
                            break;
                        }
                        C2335l c2335lCrashlytics = c2335l.crashlytics();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2335lCrashlytics) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != c9676l) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C11315l c11315l = this.f29100l;
            if (((c11315l == null || c11315l.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C2335l) {
                        long j = C2335l.billing.get((C2335l) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c9676l) {
                        return Long.MAX_VALUE;
                    }
                }
                C13755l c13755l = (C13755l) f23453l.get(this);
                if (c13755l != null) {
                    synchronized (c13755l) {
                        AbstractRunnableC7736l[] abstractRunnableC7736lArr = c13755l.yandex;
                        abstractRunnableC7736l = abstractRunnableC7736lArr != null ? abstractRunnableC7736lArr[0] : null;
                    }
                    if (abstractRunnableC7736l != null) {
                        long jNanoTime = abstractRunnableC7736l.f16233l - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m3214l() {
        AbstractRunnableC7736l abstractRunnableC7736lCrashlytics;
        C13755l c13755l = (C13755l) f23453l.get(this);
        if (c13755l == null || C8381l.loadAd.get(c13755l) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c13755l) {
                try {
                    AbstractRunnableC7736l[] abstractRunnableC7736lArr = c13755l.yandex;
                    abstractRunnableC7736lCrashlytics = null;
                    AbstractRunnableC7736l abstractRunnableC7736l = abstractRunnableC7736lArr != null ? abstractRunnableC7736lArr[0] : null;
                    if (abstractRunnableC7736l != null) {
                        if (jNanoTime - abstractRunnableC7736l.f16233l >= 0 ? m3217l(abstractRunnableC7736l) : false) {
                            abstractRunnableC7736lCrashlytics = c13755l.crashlytics(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC7736lCrashlytics != null);
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public abstract Thread mo3215l();

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public void mo3216l(Runnable runnable) {
        m3214l();
        if (!m3217l(runnable)) {
            RunnableC12527l.f24681l.mo3216l(runnable);
            return;
        }
        Thread threadMo3215l = mo3215l();
        if (Thread.currentThread() != threadMo3215l) {
            LockSupport.unpark(threadMo3215l);
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final boolean m3217l(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23452l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f23454l.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C2335l)) {
                if (obj == AbstractC16465l.loadAd) {
                    return false;
                }
                C2335l c2335l = new C2335l(8, true);
                c2335l.yandex((Runnable) obj);
                c2335l.yandex(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2335l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C2335l c2335l2 = (C2335l) obj;
            int iYandex = c2335l2.yandex(runnable);
            if (iYandex == 0) {
                return true;
            }
            if (iYandex == 1) {
                C2335l c2335lCrashlytics = c2335l2.crashlytics();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2335lCrashlytics) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iYandex == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m3218l(long j, AbstractRunnableC7736l abstractRunnableC7736l) {
        int iCrashlytics;
        Thread threadMo3215l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23453l;
        AbstractRunnableC7736l abstractRunnableC7736l2 = null;
        if (f23454l.get(this) == 1) {
            iCrashlytics = 1;
        } else {
            C13755l c13755l = (C13755l) atomicReferenceFieldUpdater.get(this);
            if (c13755l == null) {
                C13755l c13755l2 = new C13755l();
                c13755l2.crashlytics = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c13755l2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c13755l = (C13755l) atomicReferenceFieldUpdater.get(this);
            }
            iCrashlytics = abstractRunnableC7736l.crashlytics(j, c13755l, this);
        }
        if (iCrashlytics != 0) {
            if (iCrashlytics == 1) {
                mo3212l(j, abstractRunnableC7736l);
                return;
            } else {
                if (iCrashlytics == 2) {
                    return;
                }
                C8339l.smaato("unexpected result");
                return;
            }
        }
        C13755l c13755l3 = (C13755l) atomicReferenceFieldUpdater.get(this);
        if (c13755l3 != null) {
            synchronized (c13755l3) {
                AbstractRunnableC7736l[] abstractRunnableC7736lArr = c13755l3.yandex;
                abstractRunnableC7736l2 = abstractRunnableC7736lArr != null ? abstractRunnableC7736lArr[0] : null;
            }
        }
        if (abstractRunnableC7736l2 != abstractRunnableC7736l || Thread.currentThread() == (threadMo3215l = mo3215l())) {
            return;
        }
        LockSupport.unpark(threadMo3215l);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final boolean m3219l() {
        Object obj;
        long j;
        C11315l c11315l = this.f29100l;
        if (c11315l != null ? c11315l.isEmpty() : true) {
            C13755l c13755l = (C13755l) f23453l.get(this);
            if (c13755l == null) {
                obj = f23452l.get(this);
                if (obj != null) {
                    if (obj instanceof C2335l) {
                        j = C2335l.billing.get((C2335l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC16465l.loadAd) {
                    }
                }
                return true;
            }
            if (C8381l.loadAd.get(c13755l) == 0) {
                obj = f23452l.get(this);
                if (obj != null) {
                    if (obj instanceof C2335l) {
                        j = C2335l.billing.get((C2335l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC16465l.loadAd) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC14868l
    public void shutdown() {
        AbstractRunnableC7736l abstractRunnableC7736lCrashlytics;
        AbstractC12706l.yandex.set(null);
        f23454l.set(this, 1);
        C9676l c9676l = AbstractC16465l.loadAd;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23452l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c9676l)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C2335l) {
                ((C2335l) obj).loadAd();
                break;
            } else {
                if (obj == c9676l) {
                    break;
                }
                C2335l c2335l = new C2335l(8, true);
                c2335l.yandex((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2335l)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (mo3213l() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C13755l c13755l = (C13755l) f23453l.get(this);
            if (c13755l == null) {
                return;
            }
            synchronized (c13755l) {
                abstractRunnableC7736lCrashlytics = C8381l.loadAd.get(c13755l) > 0 ? c13755l.crashlytics(0) : null;
            }
            if (abstractRunnableC7736lCrashlytics == null) {
                return;
            } else {
                mo3212l(jNanoTime, abstractRunnableC7736lCrashlytics);
            }
        }
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        mo3216l(runnable);
    }

    @Override // defpackage.InterfaceC8680l
    public InterfaceC11791l yandex(long j, Runnable runnable, InterfaceC12932l interfaceC12932l) {
        return AbstractC3357l.yandex.yandex(j, runnable, interfaceC12932l);
    }
}
