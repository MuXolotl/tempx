package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؖؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3823l {
    public volatile boolean amazon;
    public Exception billing;
    public boolean crashlytics;
    public Object purchase;
    public final Object yandex = new Object();
    public final C8634l loadAd = new C8634l(17);

    public final void adcel() {
        synchronized (this.yandex) {
            try {
                if (this.crashlytics) {
                    return;
                }
                this.crashlytics = true;
                this.amazon = true;
                this.loadAd.inmobi(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3823l admob(Executor executor, InterfaceC1953l interfaceC1953l) {
        C3823l c3823l = new C3823l();
        this.loadAd.appmetrica(new C17888l(executor, interfaceC1953l, c3823l, 1));
        subscription();
        return c3823l;
    }

    public final void ads() {
        String strConcat;
        if (this.crashlytics) {
            if (!firebase()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excSubs = subs();
            if (excSubs != null) {
                strConcat = "failure";
            } else if (smaato()) {
                strConcat = "result ".concat(String.valueOf(isPro()));
            } else {
                strConcat = this.amazon ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void amazon(Executor executor, InterfaceC10377l interfaceC10377l) {
        this.loadAd.appmetrica(new C13005l(executor, interfaceC10377l));
        subscription();
    }

    public final void billing(Executor executor, InterfaceC12202l interfaceC12202l) {
        this.loadAd.appmetrica(new C13005l(executor, interfaceC12202l));
        subscription();
    }

    public final void crashlytics(InterfaceC10377l interfaceC10377l) {
        amazon(AbstractC8333l.yandex, interfaceC10377l);
    }

    public final boolean firebase() {
        boolean z;
        synchronized (this.yandex) {
            z = this.crashlytics;
        }
        return z;
    }

    public final Object isPro() {
        Object obj;
        synchronized (this.yandex) {
            try {
                AbstractC1051l.firebase("Task is not yet complete", this.crashlytics);
                if (this.amazon) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.billing;
                if (exc != null) {
                    throw new C17056l(exc);
                }
                obj = this.purchase;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final void loadAd(Executor executor, InterfaceC10162l interfaceC10162l) {
        this.loadAd.appmetrica(new C13005l(executor, interfaceC10162l));
        subscription();
    }

    public final boolean metrica(Object obj) {
        synchronized (this.yandex) {
            try {
                if (this.crashlytics) {
                    return false;
                }
                this.crashlytics = true;
                this.purchase = obj;
                this.loadAd.inmobi(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3823l mopub(Executor executor, InterfaceC1953l interfaceC1953l) {
        C3823l c3823l = new C3823l();
        this.loadAd.appmetrica(new C17888l(executor, interfaceC1953l, c3823l, 0));
        subscription();
        return c3823l;
    }

    public final void purchase(InterfaceC12202l interfaceC12202l) {
        billing(AbstractC8333l.yandex, interfaceC12202l);
    }

    public final C3823l remoteconfig(Executor executor, InterfaceC9746l interfaceC9746l) {
        C3823l c3823l = new C3823l();
        this.loadAd.appmetrica(new C13005l(executor, interfaceC9746l, c3823l));
        subscription();
        return c3823l;
    }

    public final boolean smaato() {
        boolean z;
        synchronized (this.yandex) {
            try {
                z = false;
                if (this.crashlytics && !this.amazon && this.billing == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void startapp(Exception exc) {
        AbstractC1051l.isPro(exc, "Exception must not be null");
        synchronized (this.yandex) {
            ads();
            this.crashlytics = true;
            this.billing = exc;
        }
        this.loadAd.inmobi(this);
    }

    public final Exception subs() {
        Exception exc;
        synchronized (this.yandex) {
            exc = this.billing;
        }
        return exc;
    }

    public final void subscription() {
        synchronized (this.yandex) {
            try {
                if (this.crashlytics) {
                    this.loadAd.inmobi(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(Object obj) {
        synchronized (this.yandex) {
            ads();
            this.crashlytics = true;
            this.purchase = obj;
        }
        this.loadAd.inmobi(this);
    }

    public final void yandex(InterfaceC10162l interfaceC10162l) {
        this.loadAd.appmetrica(new C13005l(AbstractC8333l.yandex, interfaceC10162l));
        subscription();
    }
}
