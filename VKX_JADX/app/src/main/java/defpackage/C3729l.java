package defpackage;

/* JADX INFO: renamed from: lؕۢۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3729l {
    public static final C3729l mopub;
    public final InterfaceC6942l amazon;
    public final InterfaceC6942l billing;
    public final InterfaceC6942l crashlytics;
    public final InterfaceC6942l loadAd;
    public final InterfaceC6942l purchase;
    public final InterfaceC6942l yandex;

    static {
        C11507l c11507l = C11507l.f23131l;
        mopub = new C3729l(new C14970l(5, c11507l), new C14970l(5, EnumC5154l.f11200l), new C14970l(5, c11507l), new C14970l(5, 0), new C14970l(5, 0), new C14970l(5, 0));
    }

    public C3729l(InterfaceC6942l interfaceC6942l, InterfaceC6942l interfaceC6942l2, InterfaceC6942l interfaceC6942l3, InterfaceC6942l interfaceC6942l4, InterfaceC6942l interfaceC6942l5, InterfaceC6942l interfaceC6942l6) {
        this.yandex = interfaceC6942l;
        this.loadAd = interfaceC6942l2;
        this.crashlytics = interfaceC6942l3;
        this.amazon = interfaceC6942l4;
        this.purchase = interfaceC6942l5;
        this.billing = interfaceC6942l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3729l)) {
            return false;
        }
        C3729l c3729l = (C3729l) obj;
        return this.yandex.equals(c3729l.yandex) && this.loadAd.equals(c3729l.loadAd) && this.crashlytics.equals(c3729l.crashlytics) && this.amazon.equals(c3729l.amazon) && this.purchase.equals(c3729l.purchase) && this.billing.equals(c3729l.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SkylineFlows(playlistsStack=" + this.yandex + ", emptyPageFlow=" + this.loadAd + ", trackFlow=" + this.crashlytics + ", libraryCountFlow=" + this.amazon + ", manualTracksCountFlow=" + this.purchase + ", allTracksSizeFlow=" + this.billing + ')';
    }
}
