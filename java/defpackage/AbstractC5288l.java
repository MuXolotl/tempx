package defpackage;

/* JADX INFO: renamed from: lؗۦٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5288l {
    public C1527l crashlytics;
    public boolean loadAd;
    public final AbstractC5103l yandex;

    public AbstractC5288l(AbstractC5103l abstractC5103l, boolean z) {
        this.yandex = abstractC5103l;
        this.loadAd = z;
    }

    public final void billing() {
        C1527l c1527l = this.crashlytics;
        if (c1527l == null || !c1527l.billing.admob(this)) {
            return;
        }
        C8048l c8048l = c1527l.amazon;
        if (equals(c8048l.billing)) {
            if (c8048l.mopub == -1) {
                loadAd();
            }
            c8048l.billing = null;
            c8048l.mopub = 0;
            c8048l.admob = null;
        }
        c8048l.amazon.remove(this);
        c8048l.purchase.remove(this);
        this.crashlytics = null;
        c8048l.loadAd();
    }

    public abstract void crashlytics();

    public final void mopub(boolean z) {
        C8048l c8048l;
        if (this.loadAd == z) {
            return;
        }
        this.loadAd = z;
        C1527l c1527l = this.crashlytics;
        if (c1527l == null || (c8048l = c1527l.amazon) == null) {
            return;
        }
        c8048l.loadAd();
    }

    public final boolean yandex() {
        C1527l c1527l = this.crashlytics;
        if (c1527l == null || c1527l.crashlytics) {
            return this.loadAd;
        }
        return false;
    }

    public void loadAd() {
    }

    public void amazon(C0005l c0005l) {
    }

    public void purchase(C0005l c0005l) {
    }
}
