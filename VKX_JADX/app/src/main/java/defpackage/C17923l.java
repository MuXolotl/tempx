package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٖ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17923l extends AbstractC18512l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final AtomicLong f34891l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final LinkedBlockingQueue f34892l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C13737l f34893l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Object f34894l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9907l f34895l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C9907l f34896l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C13737l f34897l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final PriorityBlockingQueue f34898l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Semaphore f34899l;

    public C17923l(C17417l c17417l) {
        super(c17417l);
        this.f34894l = new Object();
        this.f34899l = new Semaphore(2);
        this.f34898l = new PriorityBlockingQueue();
        this.f34892l = new LinkedBlockingQueue();
        this.f34893l = new C13737l(this, "Thread death: Uncaught exception on worker thread");
        this.f34897l = new C13737l(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final C10958l m4441l(Callable callable) {
        m4564l();
        C10958l c10958l = new C10958l(this, callable, true);
        if (Thread.currentThread() == this.f34896l) {
            c10958l.run();
            return c10958l;
        }
        m4450l(c10958l);
        return c10958l;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m4442l() {
        if (Thread.currentThread() != this.f34896l) {
            return;
        }
        C8339l.smaato("Call not expected from worker thread");
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m4443l() {
        if (Thread.currentThread() == this.f34895l) {
            return;
        }
        C8339l.smaato("Call expected from network thread");
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final boolean m4444l() {
        return Thread.currentThread() == this.f34896l;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؙؕؕ */
    public final void mo211l() {
        if (Thread.currentThread() == this.f34896l) {
            return;
        }
        C8339l.smaato("Call expected from worker thread");
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final Object m4445l(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C17923l c17923l = ((C17417l) this.f833l).f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                C8118l c8118l = ((C17417l) this.f833l).f33950l;
                C17417l.admob(c8118l);
                C14906l c14906l = c8118l.f16910l;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                c14906l.yandex(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            C8118l c8118l2 = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16910l.yandex("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m4446l(Runnable runnable) {
        m4564l();
        C10958l c10958l = new C10958l(this, runnable, false, "Task exception on network thread");
        synchronized (this.f34894l) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f34892l;
                linkedBlockingQueue.add(c10958l);
                C9907l c9907l = this.f34895l;
                if (c9907l == null) {
                    C9907l c9907l2 = new C9907l(this, "Measurement Network", linkedBlockingQueue);
                    this.f34895l = c9907l2;
                    c9907l2.setUncaughtExceptionHandler(this.f34897l);
                    this.f34895l.start();
                } else {
                    c9907l.yandex();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final C10958l m4447l(Callable callable) {
        m4564l();
        C10958l c10958l = new C10958l(this, callable, false);
        if (Thread.currentThread() != this.f34896l) {
            m4450l(c10958l);
            return c10958l;
        }
        if (!this.f34898l.isEmpty()) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("Callable skipped the worker queue.");
        }
        c10958l.run();
        return c10958l;
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void m4448l(Runnable runnable) {
        m4564l();
        m4450l(new C10958l(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void m4449l(Runnable runnable) {
        m4564l();
        AbstractC1051l.subs(runnable);
        m4450l(new C10958l(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m4450l(C10958l c10958l) {
        synchronized (this.f34894l) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f34898l;
                priorityBlockingQueue.add(c10958l);
                C9907l c9907l = this.f34896l;
                if (c9907l == null) {
                    C9907l c9907l2 = new C9907l(this, "Measurement Worker", priorityBlockingQueue);
                    this.f34896l = c9907l2;
                    c9907l2.setUncaughtExceptionHandler(this.f34893l);
                    this.f34896l.start();
                } else {
                    c9907l.yandex();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC18512l
    /* JADX INFO: renamed from: lٕؖؔ */
    public final boolean mo699l() {
        return false;
    }
}
