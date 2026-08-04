package defpackage;

/* JADX INFO: renamed from: lٍِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9486l {
    public final C2209l amazon;
    public final C2209l crashlytics;
    public final C2209l loadAd;
    public final C2209l purchase;
    public final C2209l yandex;

    public C9486l(C2209l c2209l, C2209l c2209l2, C2209l c2209l3, C2209l c2209l4, C2209l c2209l5) {
        this.yandex = c2209l;
        this.loadAd = c2209l2;
        this.crashlytics = c2209l3;
        this.amazon = c2209l4;
        this.purchase = c2209l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9486l.class != obj.getClass()) {
            return false;
        }
        C9486l c9486l = (C9486l) obj;
        return AbstractC8576l.yandex(this.yandex, c9486l.yandex) && AbstractC8576l.yandex(this.loadAd, c9486l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9486l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9486l.amazon) && AbstractC8576l.yandex(this.purchase, c9486l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC12900l.purchase(this.amazon, AbstractC12900l.purchase(this.crashlytics, AbstractC12900l.purchase(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceBorder(border=" + this.yandex + ", focusedBorder=" + this.loadAd + ", pressedBorder=" + this.crashlytics + ", disabledBorder=" + this.amazon + ", focusedDisabledBorder=" + this.purchase + ')';
    }
}
