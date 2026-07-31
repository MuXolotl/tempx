package defpackage;

/* JADX INFO: renamed from: l٘ۥؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18329l {
    public final C8841l amazon;
    public final C8841l crashlytics;
    public final C8841l loadAd;
    public C0327l mopub;
    public final C1739l purchase;
    public final long yandex;
    public final C18329l billing = this;
    public int admob = -1;

    public C18329l(long j, C8841l c8841l, C8841l c8841l2, C8841l c8841l3, C1739l c1739l) {
        this.yandex = j;
        this.loadAd = c8841l;
        this.crashlytics = c8841l2;
        this.amazon = c8841l3;
        this.purchase = c1739l;
    }

    public final C3242l amazon() {
        C0327l c0327l = (C0327l) this.crashlytics.invoke();
        if (c0327l == null) {
            return null;
        }
        int length = c0327l.yandex.yandex.f7563l.length();
        int iYandex = c0327l.yandex(0);
        long j = this.yandex;
        return new C3242l(new C15812l(iYandex, j, 0), new C15812l(c0327l.yandex(Math.max(length - 1, 0)), j, length), false);
    }

    public final InterfaceC18212l crashlytics() {
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.loadAd.invoke();
        if (interfaceC18212l == null || !interfaceC18212l.mopub()) {
            return null;
        }
        return interfaceC18212l;
    }

    public final int loadAd(C0327l c0327l) {
        int i;
        synchronized (this.billing) {
            try {
                if (this.mopub != c0327l) {
                    C6222l c6222l = c0327l.loadAd;
                    boolean z = c6222l.crashlytics;
                    int i2 = 0;
                    if (!(z || ((float) ((int) (c0327l.crashlytics & 4294967295L))) < c6222l.purchase) || z) {
                        i2 = c6222l.billing - 1;
                    } else {
                        int iPurchase = c6222l.purchase((int) (c0327l.crashlytics & 4294967295L));
                        int i3 = c0327l.loadAd.billing - 1;
                        if (iPurchase > i3) {
                            iPurchase = i3;
                        }
                        while (iPurchase >= 0 && c0327l.loadAd.billing(iPurchase) >= ((int) (c0327l.crashlytics & 4294967295L))) {
                            iPurchase--;
                        }
                        if (iPurchase >= 0) {
                            i2 = iPurchase;
                        }
                    }
                    this.admob = c0327l.loadAd.crashlytics(i2, true);
                    this.mopub = c0327l;
                }
                i = this.admob;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final C3625l purchase() {
        C0327l c0327l = (C0327l) this.crashlytics.invoke();
        return c0327l == null ? new C3625l("") : c0327l.yandex.yandex;
    }

    public final long yandex(C3242l c3242l, boolean z) {
        C0327l c0327l;
        long j = this.yandex;
        if (z && c3242l.yandex.crashlytics != j) {
            return 9205357640488583168L;
        }
        if ((!z && c3242l.loadAd.crashlytics != j) || crashlytics() == null || (c0327l = (C0327l) this.crashlytics.invoke()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC8069l.amazon(c0327l, AbstractC8576l.purchase((z ? c3242l.yandex : c3242l.loadAd).loadAd, 0, loadAd(c0327l)), z, c3242l.crashlytics);
    }
}
