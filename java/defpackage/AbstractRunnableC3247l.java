package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؚؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC3247l extends AbstractC12138l implements Runnable {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ int f6940l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f6941l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ListenableFuture f6942l;

    public AbstractRunnableC3247l(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f6942l = listenableFuture;
        obj.getClass();
        this.f6941l = obj;
    }

    public abstract Object adcel(Object obj, Object obj2);

    public abstract void ads(Object obj);

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        ListenableFuture listenableFuture = this.f6942l;
        if ((listenableFuture != null) & (this.f5919l instanceof C17783l)) {
            listenableFuture.cancel(startapp());
        }
        this.f6942l = null;
        this.f6941l = null;
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        String str;
        ListenableFuture listenableFuture = this.f6942l;
        Object obj = this.f6941l;
        String strIsPro = super.isPro();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strIsPro != null) {
                return str.concat(strIsPro);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f6942l;
        Object obj = this.f6941l;
        if (((this.f5919l instanceof C17783l) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f6942l = null;
        if (listenableFuture.isCancelled()) {
            vip(listenableFuture);
            return;
        }
        try {
            try {
                Object objAdcel = adcel(obj, AbstractC7151l.crashlytics(listenableFuture));
                this.f6941l = null;
                ads(objAdcel);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    remoteconfig(th);
                } finally {
                    this.f6941l = null;
                }
            }
        } catch (Error e) {
            remoteconfig(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            remoteconfig(e2.getCause());
        } catch (Exception e3) {
            remoteconfig(e3);
        }
    }
}
