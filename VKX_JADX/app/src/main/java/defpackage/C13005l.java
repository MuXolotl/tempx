package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13005l implements InterfaceC8215l, InterfaceC12202l, InterfaceC10377l, InterfaceC16369l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f25480l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Executor f25481l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25482l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f25483l;

    public C13005l(Executor executor, InterfaceC16369l interfaceC16369l) {
        this.f25482l = 0;
        this.f25480l = new Object();
        this.f25481l = executor;
        this.f25483l = interfaceC16369l;
    }

    private final void crashlytics(C3823l c3823l) {
        if (c3823l.smaato() || c3823l.amazon) {
            return;
        }
        synchronized (this.f25480l) {
            try {
                if (((InterfaceC10377l) this.f25483l) == null) {
                    return;
                }
                this.f25481l.execute(new RunnableC16301l(this, c3823l, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void loadAd(C3823l c3823l) {
        synchronized (this.f25480l) {
        }
        this.f25481l.execute(new RunnableC16301l(this, c3823l, 4));
    }

    private final void purchase(C3823l c3823l) {
        if (c3823l.smaato()) {
            synchronized (this.f25480l) {
                try {
                    if (((InterfaceC12202l) this.f25483l) == null) {
                        return;
                    }
                    this.f25481l.execute(new RunnableC16301l(this, c3823l, 15));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        ((C3823l) this.f25483l).startapp(exc);
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        ((C3823l) this.f25483l).vip(obj);
    }

    @Override // defpackage.InterfaceC16369l
    public void mopub() {
        ((C3823l) this.f25483l).adcel();
    }

    @Override // defpackage.InterfaceC8215l
    public final void yandex(C3823l c3823l) {
        switch (this.f25482l) {
            case 0:
                if (c3823l.amazon) {
                    synchronized (this.f25480l) {
                        try {
                            if (((InterfaceC16369l) this.f25483l) != null) {
                                this.f25481l.execute(new RunnableC10799l(7, this));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                loadAd(c3823l);
                return;
            case 2:
                crashlytics(c3823l);
                return;
            case 3:
                purchase(c3823l);
                return;
            default:
                this.f25481l.execute(new RunnableC16301l(this, c3823l, 22));
                return;
        }
    }

    public C13005l(Executor executor, InterfaceC10162l interfaceC10162l) {
        this.f25482l = 1;
        this.f25480l = new Object();
        this.f25481l = executor;
        this.f25483l = interfaceC10162l;
    }

    public C13005l(Executor executor, InterfaceC10377l interfaceC10377l) {
        this.f25482l = 2;
        this.f25480l = new Object();
        this.f25481l = executor;
        this.f25483l = interfaceC10377l;
    }

    public C13005l(Executor executor, InterfaceC12202l interfaceC12202l) {
        this.f25482l = 3;
        this.f25480l = new Object();
        this.f25481l = executor;
        this.f25483l = interfaceC12202l;
    }

    public C13005l(Executor executor, InterfaceC9746l interfaceC9746l, C3823l c3823l) {
        this.f25482l = 4;
        this.f25481l = executor;
        this.f25480l = interfaceC9746l;
        this.f25483l = c3823l;
    }
}
