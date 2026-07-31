package defpackage;

/* JADX INFO: renamed from: lًٌِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8643l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final InterfaceC18059l purchase;
    public final String yandex;

    public C8643l(String str, String str2, String str3, String str4, InterfaceC18059l interfaceC18059l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = interfaceC18059l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8643l)) {
            return false;
        }
        C8643l c8643l = (C8643l) obj;
        return this.yandex.equals(c8643l.yandex) && this.loadAd.equals(c8643l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8643l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8643l.amazon) && this.purchase.equals(c8643l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
    }

    public final String toString() {
        return "OrionCacheEntry(id=" + this.yandex + ", imageUrl=" + this.loadAd + ", title=" + this.crashlytics + ", subtitle=" + this.amazon + ", type=" + this.purchase + ')';
    }
}
