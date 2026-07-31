package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؔٚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2722l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Object f5913l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C5885l f5914l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final boolean f5915l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final AbstractC16670l f5916l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile C12054l f5917l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile C0181l f5918l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile Object f5919l;

    static {
        boolean z;
        Throwable th;
        AbstractC16670l c17936l;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f5915l = z;
        f5914l = new C5885l(AbstractC2722l.class);
        Throwable th2 = null;
        try {
            c17936l = new C2668l();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                c17936l = new C8121l(AtomicReferenceFieldUpdater.newUpdater(C12054l.class, Thread.class, "yandex"), AtomicReferenceFieldUpdater.newUpdater(C12054l.class, C12054l.class, "loadAd"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2722l.class, C12054l.class, "lؓٝؕ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2722l.class, C0181l.class, "lؗۤؑ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2722l.class, Object.class, "lٌؘؒ"));
            } catch (Error | Exception e2) {
                th2 = e2;
                c17936l = new C17936l();
            }
        }
        f5916l = c17936l;
        if (th2 != null) {
            C5885l c5885l = f5914l;
            Logger loggerYandex = c5885l.yandex();
            Level level = Level.SEVERE;
            loggerYandex.log(level, "UnsafeAtomicHelper is broken!", th);
            c5885l.yandex().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f5913l = new Object();
    }

    public static Object admob(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thMetrica;
        if (listenableFuture instanceof InterfaceC0556l) {
            Object c17783l = ((AbstractC2722l) listenableFuture).f5919l;
            if (c17783l instanceof C17783l) {
                C17783l c17783l2 = (C17783l) c17783l;
                if (c17783l2.yandex) {
                    c17783l = c17783l2.loadAd != null ? new C17783l(c17783l2.loadAd, false) : C17783l.amazon;
                }
            }
            Objects.requireNonNull(c17783l);
            return c17783l;
        }
        if ((listenableFuture instanceof AbstractC2722l) && (thMetrica = ((AbstractC2722l) listenableFuture).metrica()) != null) {
            return new C14583l(thMetrica);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f5915l) && zIsCancelled) {
            C17783l c17783l3 = C17783l.amazon;
            Objects.requireNonNull(c17783l3);
            return c17783l3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new C14583l(e);
                    } catch (CancellationException e2) {
                        if (zIsCancelled) {
                            return new C17783l(e2, false);
                        }
                        return new C14583l(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                    } catch (ExecutionException e3) {
                        if (!zIsCancelled) {
                            return new C14583l(e3.getCause());
                        }
                        return new C17783l(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3), false);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e4) {
                e = e4;
                return new C14583l(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f5913l : obj;
        }
        return new C17783l(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    public static void billing(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f5914l.yandex().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object mopub(Object obj) throws ExecutionException {
        if (obj instanceof C17783l) {
            Throwable th = ((C17783l) obj).loadAd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C14583l) {
            throw new ExecutionException(((C14583l) obj).yandex);
        }
        if (obj == f5913l) {
            return null;
        }
        return obj;
    }

    public static void purchase(AbstractC2722l abstractC2722l, boolean z) {
        C0181l c0181l = null;
        while (true) {
            for (C12054l c12054lAdmob = f5916l.admob(abstractC2722l); c12054lAdmob != null; c12054lAdmob = c12054lAdmob.loadAd) {
                Thread thread = c12054lAdmob.yandex;
                if (thread != null) {
                    c12054lAdmob.yandex = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC2722l.subs();
                z = false;
            }
            abstractC2722l.crashlytics();
            C0181l c0181l2 = c0181l;
            C0181l c0181lMopub = f5916l.mopub(abstractC2722l);
            C0181l c0181l3 = c0181l2;
            while (c0181lMopub != null) {
                C0181l c0181l4 = c0181lMopub.crashlytics;
                c0181lMopub.crashlytics = c0181l3;
                c0181l3 = c0181lMopub;
                c0181lMopub = c0181l4;
            }
            while (c0181l3 != null) {
                c0181l = c0181l3.crashlytics;
                Runnable runnable = c0181l3.yandex;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC7949l) {
                    RunnableC7949l runnableC7949l = (RunnableC7949l) runnable;
                    abstractC2722l = runnableC7949l.f16546l;
                    if (abstractC2722l.f5919l == runnableC7949l) {
                        if (f5916l.crashlytics(abstractC2722l, runnableC7949l, admob(runnableC7949l.f16545l))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0181l3.loadAd;
                    Objects.requireNonNull(executor);
                    billing(runnable, executor);
                }
                c0181l3 = c0181l;
            }
            return;
        }
    }

    public final void amazon(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C17783l c17783l;
        Object obj = this.f5919l;
        if (!(obj == null) && !(obj instanceof RunnableC7949l)) {
            return false;
        }
        if (f5915l) {
            c17783l = new C17783l(new CancellationException("Future.cancel() was called."), z);
        } else {
            c17783l = z ? C17783l.crashlytics : C17783l.amazon;
            Objects.requireNonNull(c17783l);
        }
        boolean z2 = false;
        while (true) {
            if (f5916l.crashlytics(this, obj, c17783l)) {
                purchase(this, z);
                if (obj instanceof RunnableC7949l) {
                    ListenableFuture listenableFuture = ((RunnableC7949l) obj).f16545l;
                    if (listenableFuture instanceof InterfaceC0556l) {
                        this = (AbstractC2722l) listenableFuture;
                        obj = this.f5919l;
                        if ((obj == null) | (obj instanceof RunnableC7949l)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f5919l;
            if (!(obj instanceof RunnableC7949l)) {
                return z2;
            }
        }
    }

    public final void firebase(C12054l c12054l) {
        c12054l.yandex = null;
        while (true) {
            C12054l c12054l2 = this.f5917l;
            if (c12054l2 == C12054l.crashlytics) {
                return;
            }
            C12054l c12054l3 = null;
            while (c12054l2 != null) {
                C12054l c12054l4 = c12054l2.loadAd;
                if (c12054l2.yandex != null) {
                    c12054l3 = c12054l2;
                } else if (c12054l3 != null) {
                    c12054l3.loadAd = c12054l4;
                    if (c12054l3.yandex == null) {
                    }
                } else if (!f5916l.amazon(this, c12054l2, c12054l4)) {
                }
                c12054l2 = c12054l4;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6 A[EDGE_INSN: B:60:0x00c6->B:37:0x0083 BREAK  A[LOOP:0: B:21:0x0043->B:44:0x0097]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2722l.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5919l instanceof C17783l;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f5919l;
        return (!(obj instanceof RunnableC7949l)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String isPro() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void loadAd(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        amazon(sb, obj);
        sb.append("]");
    }

    public final Throwable metrica() {
        if (!(this instanceof InterfaceC0556l)) {
            return null;
        }
        Object obj = this.f5919l;
        if (obj instanceof C14583l) {
            return ((C14583l) obj).yandex;
        }
        return null;
    }

    public boolean remoteconfig(Throwable th) {
        th.getClass();
        if (!f5916l.crashlytics(this, null, new C14583l(th))) {
            return false;
        }
        purchase(this, false);
        return true;
    }

    public boolean smaato(Object obj) {
        if (obj == null) {
            obj = f5913l;
        }
        if (!f5916l.crashlytics(this, null, obj)) {
            return false;
        }
        purchase(this, false);
        return true;
    }

    public final boolean startapp() {
        Object obj = this.f5919l;
        return (obj instanceof C17783l) && ((C17783l) obj).yandex;
    }

    public String toString() {
        String strIsPro;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            loadAd(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f5919l;
            if (obj instanceof RunnableC7949l) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((RunnableC7949l) obj).f16545l;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strIsPro = isPro();
                    if (AbstractC1315l.purchase(strIsPro)) {
                        strIsPro = null;
                    }
                } catch (Exception | StackOverflowError e3) {
                    strIsPro = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strIsPro != null) {
                    sb.append(", info=[");
                    sb.append(strIsPro);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                loadAd(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean vip(ListenableFuture listenableFuture) {
        C14583l c14583l;
        listenableFuture.getClass();
        Object obj = this.f5919l;
        if (obj != null) {
            if (obj instanceof C17783l) {
                listenableFuture.cancel(((C17783l) obj).yandex);
            }
        } else if (listenableFuture.isDone()) {
            if (f5916l.crashlytics(this, null, admob(listenableFuture))) {
                purchase(this, false);
                return true;
            }
        } else {
            RunnableC7949l runnableC7949l = new RunnableC7949l(this, listenableFuture);
            if (f5916l.crashlytics(this, null, runnableC7949l)) {
                try {
                    listenableFuture.yandex(runnableC7949l, EnumC1535l.f3808l);
                    return true;
                } catch (Throwable th) {
                    try {
                        c14583l = new C14583l(th);
                    } catch (Error | Exception unused) {
                        c14583l = C14583l.loadAd;
                    }
                    f5916l.crashlytics(this, runnableC7949l, c14583l);
                    return true;
                }
            }
            obj = this.f5919l;
            if (obj instanceof C17783l) {
                listenableFuture.cancel(((C17783l) obj).yandex);
            }
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void yandex(Runnable runnable, Executor executor) {
        C0181l c0181l;
        C0181l c0181l2 = C0181l.amazon;
        AbstractC12442l.metrica(executor, "Executor was null.");
        if (!isDone() && (c0181l = this.f5918l) != c0181l2) {
            C0181l c0181l3 = new C0181l(runnable, executor);
            do {
                c0181l3.crashlytics = c0181l;
                if (f5916l.loadAd(this, c0181l, c0181l3)) {
                    return;
                } else {
                    c0181l = this.f5918l;
                }
            } while (c0181l != c0181l2);
        }
        billing(runnable, executor);
    }

    public void crashlytics() {
    }

    public void subs() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C12054l c12054l = C12054l.crashlytics;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5919l;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC7949l))) {
                return mopub(obj2);
            }
            C12054l c12054l2 = this.f5917l;
            if (c12054l2 != c12054l) {
                C12054l c12054l3 = new C12054l();
                do {
                    AbstractC16670l abstractC16670l = f5916l;
                    abstractC16670l.remoteconfig(c12054l3, c12054l2);
                    if (abstractC16670l.amazon(this, c12054l2, c12054l3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5919l;
                            } else {
                                firebase(c12054l3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC7949l))));
                        return mopub(obj);
                    }
                    c12054l2 = this.f5917l;
                } while (c12054l2 != c12054l);
            }
            Object obj3 = this.f5919l;
            Objects.requireNonNull(obj3);
            return mopub(obj3);
        }
        throw new InterruptedException();
    }
}
