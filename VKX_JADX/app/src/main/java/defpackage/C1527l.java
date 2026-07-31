package defpackage;

/* JADX INFO: renamed from: lؓؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1527l {
    public boolean loadAd;
    public final C6536l yandex;
    public boolean crashlytics = true;
    public final C8048l amazon = new C8048l();
    public final C1807l purchase = AbstractC1793l.yandex();
    public final C1807l billing = AbstractC1793l.yandex();
    public final C1807l mopub = AbstractC1793l.yandex();

    public C1527l(C6536l c6536l) {
        this.yandex = c6536l;
    }

    public static void yandex(C1527l c1527l, AbstractC5288l abstractC5288l) {
        c1527l.amazon();
        if (c1527l.billing.yandex(abstractC5288l)) {
            C8048l c8048l = c1527l.amazon;
            c8048l.getClass();
            if (abstractC5288l.crashlytics != null) {
                C10754l.license(abstractC5288l, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            c8048l.purchase.addFirst(abstractC5288l);
            abstractC5288l.crashlytics = c1527l;
            c8048l.loadAd();
        }
    }

    public final void amazon() {
        if (this.loadAd) {
            C8339l.smaato("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void crashlytics(AbstractC13833l abstractC13833l, int i) {
        amazon();
        if (i != 1 && i != 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "Unsupported priority value: "));
        } else if (this.mopub.yandex(abstractC13833l)) {
            this.amazon.yandex(this, abstractC13833l, i);
        }
    }

    public final void loadAd(AbstractC14771l abstractC14771l) {
        amazon();
        if (this.mopub.yandex(abstractC14771l)) {
            this.amazon.yandex(this, abstractC14771l, -1);
        }
    }

    public final void purchase(AbstractC14771l abstractC14771l, C0005l c0005l) {
        amazon();
        if (this.crashlytics) {
            C8048l c8048l = this.amazon;
            if (c8048l.mopub != 0) {
                return;
            }
            AbstractC5288l abstractC5288lCrashlytics = c8048l.crashlytics(-1);
            c8048l.billing = abstractC5288lCrashlytics;
            c8048l.mopub = -1;
            c8048l.admob = abstractC14771l;
            if (c0005l != null) {
                if (abstractC5288lCrashlytics != null) {
                    abstractC5288lCrashlytics.purchase(c0005l);
                }
                C1008l c1008l = c8048l.yandex;
                C2819l c2819l = new C2819l(c0005l);
                c1008l.getClass();
                c1008l.remoteconfig(null, c2819l);
            }
        }
    }
}
