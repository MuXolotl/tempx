package defpackage;

/* JADX INFO: renamed from: lّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4065l {
    public static final C4065l billing = new C4065l(new C14970l(5, C0617l.yandex), new C14970l(5, C10797l.yandex), new C14970l(5, C16614l.yandex), new C14970l(5, new C5086l()), new C14970l(5, new C5086l()));
    public final InterfaceC6942l amazon;
    public final InterfaceC6942l crashlytics;
    public final InterfaceC6942l loadAd;
    public final InterfaceC6942l purchase;
    public final InterfaceC6942l yandex;

    public C4065l(InterfaceC6942l interfaceC6942l, InterfaceC6942l interfaceC6942l2, InterfaceC6942l interfaceC6942l3, InterfaceC6942l interfaceC6942l4, InterfaceC6942l interfaceC6942l5) {
        this.yandex = interfaceC6942l;
        this.loadAd = interfaceC6942l2;
        this.crashlytics = interfaceC6942l3;
        this.amazon = interfaceC6942l4;
        this.purchase = interfaceC6942l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4065l)) {
            return false;
        }
        C4065l c4065l = (C4065l) obj;
        return this.yandex.equals(c4065l.yandex) && this.loadAd.equals(c4065l.loadAd) && this.crashlytics.equals(c4065l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4065l.amazon) && AbstractC8576l.yandex(this.purchase, c4065l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OrionFlows(myLibraryFlow=" + this.yandex + ", virtualLibraryFlow=" + this.loadAd + ", allTracksLink=" + this.crashlytics + ", dataFlow=" + this.amazon + ", sortedDataFlow=" + this.purchase + ')';
    }
}
