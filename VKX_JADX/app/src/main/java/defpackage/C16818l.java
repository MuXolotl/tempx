package defpackage;

/* JADX INFO: renamed from: lٖٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16818l {
    public final C4442l amazon;
    public final C4442l billing;
    public final C4442l crashlytics;
    public final C4442l loadAd;
    public final C4442l purchase;
    public final C4442l yandex;

    public C16818l(C4442l c4442l, C4442l c4442l2, C4442l c4442l3, C4442l c4442l4, C4442l c4442l5, C4442l c4442l6) {
        this.yandex = c4442l;
        this.loadAd = c4442l2;
        this.crashlytics = c4442l3;
        this.amazon = c4442l4;
        this.purchase = c4442l5;
        this.billing = c4442l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16818l.class != obj.getClass()) {
            return false;
        }
        C16818l c16818l = (C16818l) obj;
        return AbstractC8576l.yandex(this.yandex, c16818l.yandex) && AbstractC8576l.yandex(this.loadAd, c16818l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c16818l.crashlytics) && AbstractC8576l.yandex(this.amazon, c16818l.amazon) && AbstractC8576l.yandex(this.purchase, c16818l.purchase) && AbstractC8576l.yandex(this.billing, c16818l.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ListItemGlow(glow=" + this.yandex + ", focusedGlow=" + this.loadAd + ", pressedGlow=" + this.crashlytics + ", selectedGlow=" + this.amazon + ", focusedSelectedGlow=" + this.purchase + ", pressedSelectedGlow=" + this.billing + ')';
    }
}
