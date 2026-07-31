package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؗٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4867l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Object f9926l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final AbstractC14506l f9929l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile C16075l f9930l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile C6755l f9931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile Object f9932l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final boolean f9928l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Logger f9927l = Logger.getLogger(AbstractC4867l.class.getName());

    static {
        AbstractC14506l c0178l;
        try {
            c0178l = new C14203l(AtomicReferenceFieldUpdater.newUpdater(C16075l.class, Thread.class, "yandex"), AtomicReferenceFieldUpdater.newUpdater(C16075l.class, C16075l.class, "loadAd"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4867l.class, C16075l.class, "lؓٝؕ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4867l.class, C6755l.class, "lؗۤؑ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4867l.class, Object.class, "lٌؘؒ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0178l = new C0178l();
        }
        f9929l = c0178l;
        if (th != null) {
            f9927l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9926l = new Object();
    }

    public static void amazon(AbstractC4867l abstractC4867l) {
        C16075l c16075l;
        C6755l c6755l;
        C6755l c6755l2;
        C6755l c6755l3;
        do {
            c16075l = abstractC4867l.f9930l;
        } while (!f9929l.crashlytics(abstractC4867l, c16075l, C16075l.crashlytics));
        while (true) {
            c6755l = null;
            if (c16075l == null) {
                break;
            }
            Thread thread = c16075l.yandex;
            if (thread != null) {
                c16075l.yandex = null;
                LockSupport.unpark(thread);
            }
            c16075l = c16075l.loadAd;
        }
        abstractC4867l.crashlytics();
        do {
            c6755l2 = abstractC4867l.f9931l;
        } while (!f9929l.yandex(abstractC4867l, c6755l2, C6755l.amazon));
        while (true) {
            c6755l3 = c6755l;
            c6755l = c6755l2;
            if (c6755l == null) {
                break;
            }
            c6755l2 = c6755l.crashlytics;
            c6755l.crashlytics = c6755l3;
        }
        while (c6755l3 != null) {
            C6755l c6755l4 = c6755l3.crashlytics;
            purchase(c6755l3.yandex, c6755l3.loadAd);
            c6755l3 = c6755l4;
        }
    }

    public static Object billing(Object obj) throws ExecutionException {
        if (obj instanceof C13118l) {
            Throwable th = ((C13118l) obj).loadAd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C17894l) {
            throw new ExecutionException(((C17894l) obj).yandex);
        }
        if (obj == f9926l) {
            return null;
        }
        return obj;
    }

    public static Object mopub(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void purchase(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f9927l.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String admob() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C13118l c13118l;
        Object obj = this.f9932l;
        if (obj == null) {
            if (f9928l) {
                c13118l = new C13118l(new CancellationException("Future.cancel() was called."), z);
            } else {
                c13118l = z ? C13118l.crashlytics : C13118l.amazon;
            }
            if (f9929l.loadAd(this, obj, c13118l)) {
                amazon(this);
                return true;
            }
        }
        return false;
    }

    public boolean firebase(Throwable th) {
        th.getClass();
        if (!f9929l.loadAd(this, null, new C17894l(th))) {
            return false;
        }
        amazon(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C16075l c16075l = C16075l.crashlytics;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9932l;
        if (obj != null) {
            return billing(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C16075l c16075l2 = this.f9930l;
            if (c16075l2 != c16075l) {
                C16075l c16075l3 = new C16075l();
                while (true) {
                    AbstractC14506l abstractC14506l = f9929l;
                    abstractC14506l.admob(c16075l3, c16075l2);
                    if (abstractC14506l.crashlytics(this, c16075l2, c16075l3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                subs(c16075l3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9932l;
                            if (obj2 != null) {
                                return billing(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                subs(c16075l3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        c16075l2 = this.f9930l;
                        if (c16075l2 == c16075l) {
                        }
                    }
                }
            }
            return billing(this.f9932l);
        }
        while (nanos > 0) {
            Object obj3 = this.f9932l;
            if (obj3 != null) {
                return billing(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbSignature = AbstractC0653l.Signature(j, "Waited ", " ");
        sbSignature.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbSignature.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC9361l.pro(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9932l instanceof C13118l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9932l != null;
    }

    public boolean isPro(Object obj) {
        if (obj == null) {
            obj = f9926l;
        }
        if (!f9929l.loadAd(this, null, obj)) {
            return false;
        }
        amazon(this);
        return true;
    }

    public final void loadAd(StringBuilder sb) {
        try {
            Object objMopub = mopub(this);
            sb.append("SUCCESS, result=[");
            sb.append(objMopub == this ? "this future" : String.valueOf(objMopub));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final void subs(C16075l c16075l) {
        c16075l.yandex = null;
        while (true) {
            C16075l c16075l2 = this.f9930l;
            if (c16075l2 == C16075l.crashlytics) {
                return;
            }
            C16075l c16075l3 = null;
            while (c16075l2 != null) {
                C16075l c16075l4 = c16075l2.loadAd;
                if (c16075l2.yandex != null) {
                    c16075l3 = c16075l2;
                } else if (c16075l3 != null) {
                    c16075l3.loadAd = c16075l4;
                    if (c16075l3.yandex == null) {
                    }
                } else if (!f9929l.crashlytics(this, c16075l2, c16075l4)) {
                }
                c16075l2 = c16075l4;
            }
            return;
        }
    }

    public final String toString() {
        String strAdmob;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9932l instanceof C13118l) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            loadAd(sb);
        } else {
            try {
                strAdmob = admob();
            } catch (RuntimeException e) {
                strAdmob = "Exception thrown from implementation: " + e.getClass();
            }
            if (strAdmob != null && !strAdmob.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strAdmob);
                sb.append("]");
            } else if (isDone()) {
                loadAd(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        executor.getClass();
        C6755l c6755l = this.f9931l;
        C6755l c6755l2 = C6755l.amazon;
        if (c6755l != c6755l2) {
            C6755l c6755l3 = new C6755l(runnable, executor);
            do {
                c6755l3.crashlytics = c6755l;
                if (f9929l.yandex(this, c6755l, c6755l3)) {
                    return;
                } else {
                    c6755l = this.f9931l;
                }
            } while (c6755l != c6755l2);
        }
        purchase(runnable, executor);
    }

    public void crashlytics() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C16075l c16075l = C16075l.crashlytics;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9932l;
            if (obj2 != null) {
                return billing(obj2);
            }
            C16075l c16075l2 = this.f9930l;
            if (c16075l2 != c16075l) {
                C16075l c16075l3 = new C16075l();
                do {
                    AbstractC14506l abstractC14506l = f9929l;
                    abstractC14506l.admob(c16075l3, c16075l2);
                    if (abstractC14506l.crashlytics(this, c16075l2, c16075l3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9932l;
                            } else {
                                subs(c16075l3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return billing(obj);
                    }
                    c16075l2 = this.f9930l;
                } while (c16075l2 != c16075l);
            }
            return billing(this.f9932l);
        }
        throw new InterruptedException();
    }
}
