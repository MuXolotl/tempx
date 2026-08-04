package defpackage;

/* JADX INFO: renamed from: lَٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10312l {
    public final C10086l amazon;
    public final C10086l billing;
    public final C10086l crashlytics;
    public final C15315l loadAd;
    public final C1739l mopub;
    public final C10086l purchase;
    public final C15315l yandex;

    public C10312l() {
        C15315l c15315l = new C15315l();
        this.yandex = c15315l;
        this.loadAd = c15315l;
        C18450l c18450l = C18450l.f36015l;
        this.crashlytics = new C10086l(null, c18450l);
        this.amazon = new C10086l(null, c18450l);
        this.purchase = new C10086l(null, c18450l);
        this.billing = AbstractC8020l.smaato(new C14467l(0.0f));
        this.mopub = new C1739l();
    }

    public final int amazon(long j, boolean z) {
        C0327l c0327lCrashlytics = crashlytics();
        if (c0327lCrashlytics == null) {
            return -1;
        }
        if (z) {
            j = yandex(j);
        }
        return c0327lCrashlytics.loadAd.mopub(AbstractC3700l.billing(this, j));
    }

    public final boolean billing(long j) {
        C0327l c0327lCrashlytics = crashlytics();
        if (c0327lCrashlytics == null) {
            return false;
        }
        long jBilling = AbstractC3700l.billing(this, yandex(j));
        int iPurchase = c0327lCrashlytics.loadAd.purchase(Float.intBitsToFloat((int) (4294967295L & jBilling)));
        int i = (int) (jBilling >> 32);
        return Float.intBitsToFloat(i) >= c0327lCrashlytics.mopub(iPurchase) && Float.intBitsToFloat(i) <= c0327lCrashlytics.admob(iPurchase);
    }

    public final C0327l crashlytics() {
        return (C0327l) this.loadAd.getValue();
    }

    public final InterfaceC18212l loadAd() {
        return (InterfaceC18212l) this.purchase.getValue();
    }

    public final InterfaceC18212l purchase() {
        return (InterfaceC18212l) this.crashlytics.getValue();
    }

    public final long yandex(long j) {
        C8896l c8896lMo2592synchronized;
        InterfaceC18212l interfaceC18212lPurchase = purchase();
        C8896l c8896l = C8896l.purchase;
        if (interfaceC18212lPurchase != null) {
            if (interfaceC18212lPurchase.mopub()) {
                InterfaceC18212l interfaceC18212lLoadAd = loadAd();
                c8896lMo2592synchronized = interfaceC18212lLoadAd != null ? interfaceC18212lLoadAd.mo2592synchronized(interfaceC18212lPurchase, true) : null;
            } else {
                c8896lMo2592synchronized = c8896l;
            }
            if (c8896lMo2592synchronized != null) {
                c8896l = c8896lMo2592synchronized;
            }
        }
        return AbstractC3700l.yandex(j, c8896l);
    }
}
