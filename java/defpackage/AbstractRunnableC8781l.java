package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lٌٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC8781l extends AbstractC12138l implements Runnable {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final /* synthetic */ int f18079l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Class f18080l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ListenableFuture f18081l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f18082l;

    public AbstractRunnableC8781l(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f18081l = listenableFuture;
        this.f18080l = cls;
        this.f18082l = obj;
    }

    public abstract Object adcel(Object obj, Throwable th);

    public abstract void ads(Object obj);

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        ListenableFuture listenableFuture = this.f18081l;
        if ((listenableFuture != null) & (this.f5919l instanceof C17783l)) {
            listenableFuture.cancel(startapp());
        }
        this.f18081l = null;
        this.f18080l = null;
        this.f18082l = null;
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        String str;
        ListenableFuture listenableFuture = this.f18081l;
        Class cls = this.f18080l;
        Object obj = this.f18082l;
        String strIsPro = super.isPro();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strIsPro != null) {
                return str.concat(strIsPro);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCrashlytics;
        ListenableFuture listenableFuture = this.f18081l;
        Class cls = this.f18080l;
        Object obj = this.f18082l;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.f5919l instanceof C17783l)) {
            return;
        }
        this.f18081l = null;
        try {
            th = listenableFuture instanceof AbstractC2722l ? ((AbstractC2722l) listenableFuture).metrica() : null;
            objCrashlytics = th == null ? AbstractC7151l.crashlytics(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            smaato(objCrashlytics);
            return;
        }
        if (!cls.isInstance(th)) {
            vip(listenableFuture);
            return;
        }
        try {
            Object objAdcel = adcel(obj, th);
            this.f18080l = null;
            this.f18082l = null;
            ads(objAdcel);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                remoteconfig(th2);
            } finally {
                this.f18080l = null;
                this.f18082l = null;
            }
        }
    }
}
