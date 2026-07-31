package defpackage;

/* JADX INFO: renamed from: lّۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12941l {
    public final C2209l admob;
    public final C2209l amazon;
    public final C2209l billing;
    public final C2209l crashlytics;
    public final C2209l loadAd;
    public final C2209l mopub;
    public final C2209l purchase;
    public final C2209l yandex;

    public C12941l(C2209l c2209l, C2209l c2209l2, C2209l c2209l3, C2209l c2209l4, C2209l c2209l5, C2209l c2209l6, C2209l c2209l7, C2209l c2209l8) {
        this.yandex = c2209l;
        this.loadAd = c2209l2;
        this.crashlytics = c2209l3;
        this.amazon = c2209l4;
        this.purchase = c2209l5;
        this.billing = c2209l6;
        this.mopub = c2209l7;
        this.admob = c2209l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12941l.class != obj.getClass()) {
            return false;
        }
        C12941l c12941l = (C12941l) obj;
        return AbstractC8576l.yandex(this.yandex, c12941l.yandex) && AbstractC8576l.yandex(this.loadAd, c12941l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12941l.crashlytics) && AbstractC8576l.yandex(this.amazon, c12941l.amazon) && AbstractC8576l.yandex(this.purchase, c12941l.purchase) && AbstractC8576l.yandex(this.billing, c12941l.billing) && this.mopub.equals(c12941l.mopub) && AbstractC8576l.yandex(this.admob, c12941l.admob);
    }

    public final int hashCode() {
        return this.admob.hashCode() + AbstractC12900l.purchase(this.mopub, AbstractC12900l.purchase(this.billing, AbstractC12900l.purchase(this.purchase, AbstractC12900l.purchase(this.amazon, AbstractC12900l.purchase(this.crashlytics, AbstractC12900l.purchase(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ListItemBorder(border=" + this.yandex + ", focusedBorder=" + this.loadAd + ", pressedBorder=" + this.crashlytics + ", selectedBorder=" + this.amazon + ", disabledBorder=" + this.purchase + ", focusedSelectedBorder=" + this.billing + ", focusedDisabledBorder=" + this.mopub + ", pressedSelectedBorder=" + this.admob + ')';
    }
}
