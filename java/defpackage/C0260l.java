package defpackage;

/* JADX INFO: renamed from: lِِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0260l {
    public final C6839l amazon;
    public final C6839l crashlytics;
    public final C6839l loadAd;
    public final C6839l purchase;
    public final C6839l yandex;

    public C0260l() {
        C6839l c6839l = AbstractC7293l.yandex;
        C6839l c6839l2 = AbstractC7293l.loadAd;
        C6839l c6839l3 = AbstractC7293l.crashlytics;
        C6839l c6839l4 = AbstractC7293l.amazon;
        C6839l c6839l5 = AbstractC7293l.purchase;
        this.yandex = c6839l;
        this.loadAd = c6839l2;
        this.crashlytics = c6839l3;
        this.amazon = c6839l4;
        this.purchase = c6839l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0260l)) {
            return false;
        }
        C0260l c0260l = (C0260l) obj;
        return AbstractC8576l.yandex(this.yandex, c0260l.yandex) && AbstractC8576l.yandex(this.loadAd, c0260l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0260l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0260l.amazon) && AbstractC8576l.yandex(this.purchase, c0260l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.yandex + ", small=" + this.loadAd + ", medium=" + this.crashlytics + ", large=" + this.amazon + ", extraLarge=" + this.purchase + ')';
    }
}
