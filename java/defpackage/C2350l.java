package defpackage;

/* JADX INFO: renamed from: lِؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2350l {
    public final C3823l yandex = new C3823l();

    public C2350l(C5008l c5008l) {
        C15714l c15714l = new C15714l(this);
        c5008l.getClass();
        ((C3823l) c5008l.f10245l).billing(AbstractC8333l.yandex, new C11262l(c5008l, c15714l));
    }

    public final void amazon(Object obj) {
        this.yandex.metrica(obj);
    }

    public final boolean crashlytics(Exception exc) {
        C3823l c3823l = this.yandex;
        c3823l.getClass();
        AbstractC1051l.isPro(exc, "Exception must not be null");
        synchronized (c3823l.yandex) {
            try {
                if (c3823l.crashlytics) {
                    return false;
                }
                c3823l.crashlytics = true;
                c3823l.billing = exc;
                c3823l.loadAd.inmobi(c3823l);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void loadAd(Object obj) {
        this.yandex.vip(obj);
    }

    public final void yandex(Exception exc) {
        this.yandex.startapp(exc);
    }

    public C2350l() {
    }
}
