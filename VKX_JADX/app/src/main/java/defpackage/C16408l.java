package defpackage;

/* JADX INFO: renamed from: lٖٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16408l implements InterfaceC1878l {
    public static final C16408l yandex = new C16408l();
    public static final C13315l loadAd = AbstractC0532l.admob(0.9f, 700.0f, null, 4);
    public static final C13315l crashlytics = AbstractC0532l.admob(0.9f, 1400.0f, null, 4);
    public static final C13315l amazon = AbstractC0532l.admob(0.9f, 300.0f, null, 4);
    public static final C13315l purchase = AbstractC0532l.admob(1.0f, 1600.0f, null, 4);
    public static final C13315l billing = AbstractC0532l.admob(1.0f, 3800.0f, null, 4);
    public static final C13315l mopub = AbstractC0532l.admob(1.0f, 800.0f, null, 4);

    @Override // defpackage.InterfaceC1878l
    public final C13315l amazon() {
        return purchase;
    }

    @Override // defpackage.InterfaceC1878l
    public final C13315l billing() {
        return loadAd;
    }

    @Override // defpackage.InterfaceC1878l
    public final C13315l crashlytics() {
        return crashlytics;
    }

    @Override // defpackage.InterfaceC1878l
    public final C13315l loadAd() {
        return billing;
    }

    @Override // defpackage.InterfaceC1878l
    public final C13315l purchase() {
        return amazon;
    }

    @Override // defpackage.InterfaceC1878l
    public final C13315l yandex() {
        return mopub;
    }
}
