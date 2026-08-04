package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؒٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1207l extends AbstractC13813l {
    public static Object billing(AbstractC1207l abstractC1207l) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC1207l.get();
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

    public static Object crashlytics(Object obj) throws ExecutionException {
        if (obj instanceof C3866l) {
            Throwable th = ((C3866l) obj).loadAd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C11466l) {
            throw new ExecutionException(((C11466l) obj).yandex);
        }
        if (obj == AbstractC13813l.f26940l) {
            return null;
        }
        return obj;
    }

    public static void mopub(AbstractC1207l abstractC1207l) {
        abstractC1207l.getClass();
        for (C14714l c14714lRemoteconfig = AbstractC13813l.f26938l.remoteconfig(abstractC1207l); c14714lRemoteconfig != null; c14714lRemoteconfig = c14714lRemoteconfig.loadAd) {
            Thread thread = c14714lRemoteconfig.yandex;
            if (thread != null) {
                c14714lRemoteconfig.yandex = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC1207l.amazon();
        C14266l c14266lVip = AbstractC13813l.f26938l.vip(abstractC1207l);
        C14266l c14266l = null;
        while (c14266lVip != null) {
            C14266l c14266l2 = c14266lVip.crashlytics;
            c14266lVip.crashlytics = c14266l;
            c14266l = c14266lVip;
            c14266lVip = c14266l2;
        }
        while (c14266l != null) {
            Runnable runnable = c14266l.yandex;
            C14266l c14266l3 = c14266l.crashlytics;
            Objects.requireNonNull(runnable);
            Executor executor = c14266l.loadAd;
            Objects.requireNonNull(executor);
            subs(runnable, executor);
            c14266l = c14266l3;
        }
    }

    public static void subs(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerLoadAd = AbstractC13813l.f26939l.loadAd();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerLoadAd.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC9361l.advert(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    public final void admob(StringBuilder sb) {
        try {
            Object objBilling = billing(this);
            sb.append("SUCCESS, result=[");
            if (objBilling == null) {
                sb.append("null");
            } else if (objBilling == this) {
                sb.append("this future");
            } else {
                sb.append(objBilling.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objBilling)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3866l c3866l;
        Object obj = this.f26944l;
        if (obj != null) {
            return false;
        }
        if (AbstractC13813l.f26941l) {
            c3866l = new C3866l(new CancellationException("Future.cancel() was called."), z);
        } else {
            c3866l = z ? C3866l.crashlytics : C3866l.amazon;
            Objects.requireNonNull(c3866l);
        }
        if (!AbstractC13813l.f26938l.metrica(this, obj, c3866l)) {
            return false;
        }
        mopub(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e A[EDGE_INSN: B:48:0x009e->B:29:0x006b BREAK  A[LOOP:0: B:17:0x0037->B:36:0x007e]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x009e -> B:29:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1207l.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26944l instanceof C3866l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26944l != null;
    }

    public abstract String purchase();

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f26944l instanceof C3866l) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            admob(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strConcat = purchase();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                admob(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        C14266l c14266l;
        C14266l c14266l2 = C14266l.amazon;
        if (executor == null) {
            C6541l.subs("Executor was null.");
            return;
        }
        if (!isDone() && (c14266l = this.f26943l) != c14266l2) {
            C14266l c14266l3 = new C14266l(runnable, executor);
            do {
                c14266l3.crashlytics = c14266l;
                if (AbstractC13813l.f26938l.smaato(this, c14266l, c14266l3)) {
                    return;
                } else {
                    c14266l = this.f26943l;
                }
            } while (c14266l != c14266l2);
        }
        subs(runnable, executor);
    }

    public void amazon() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C14714l c14714l = C14714l.crashlytics;
        if (!Thread.interrupted()) {
            Object obj2 = this.f26944l;
            if (obj2 != null) {
                return crashlytics(obj2);
            }
            C14714l c14714l2 = this.f26942l;
            if (c14714l2 != c14714l) {
                C14714l c14714l3 = new C14714l();
                do {
                    AbstractC17549l abstractC17549l = AbstractC13813l.f26938l;
                    abstractC17549l.isPro(c14714l3, c14714l2);
                    if (abstractC17549l.firebase(this, c14714l2, c14714l3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26944l;
                            } else {
                                loadAd(c14714l3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return crashlytics(obj);
                    }
                    c14714l2 = this.f26942l;
                } while (c14714l2 != c14714l);
            }
            Object obj3 = this.f26944l;
            Objects.requireNonNull(obj3);
            return crashlytics(obj3);
        }
        throw new InterruptedException();
    }
}
