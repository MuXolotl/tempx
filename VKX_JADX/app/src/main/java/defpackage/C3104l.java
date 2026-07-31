package defpackage;

/* JADX INFO: renamed from: lؕؐ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3104l {
    public final C2209l admob;
    public final C2209l amazon;
    public final C2209l billing;
    public final C2209l crashlytics;
    public final C2209l isPro;
    public final C2209l loadAd;
    public final C2209l mopub;
    public final C2209l purchase;
    public final C2209l subs;
    public final C2209l yandex;

    public C3104l(C2209l c2209l, C2209l c2209l2, C2209l c2209l3, C2209l c2209l4, C2209l c2209l5, C2209l c2209l6, C2209l c2209l7, C2209l c2209l8, C2209l c2209l9, C2209l c2209l10) {
        this.yandex = c2209l;
        this.loadAd = c2209l2;
        this.crashlytics = c2209l3;
        this.amazon = c2209l4;
        this.purchase = c2209l5;
        this.billing = c2209l6;
        this.mopub = c2209l7;
        this.admob = c2209l8;
        this.subs = c2209l9;
        this.isPro = c2209l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3104l.class != obj.getClass()) {
            return false;
        }
        C3104l c3104l = (C3104l) obj;
        return AbstractC8576l.yandex(this.yandex, c3104l.yandex) && AbstractC8576l.yandex(this.loadAd, c3104l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3104l.crashlytics) && AbstractC8576l.yandex(this.amazon, c3104l.amazon) && AbstractC8576l.yandex(this.purchase, c3104l.purchase) && AbstractC8576l.yandex(this.billing, c3104l.billing) && AbstractC8576l.yandex(this.mopub, c3104l.mopub) && AbstractC8576l.yandex(this.admob, c3104l.admob) && AbstractC8576l.yandex(this.subs, c3104l.subs) && AbstractC8576l.yandex(this.isPro, c3104l.isPro);
    }

    public final int hashCode() {
        return this.isPro.hashCode() + AbstractC12900l.purchase(this.subs, AbstractC12900l.purchase(this.admob, AbstractC12900l.purchase(this.mopub, AbstractC12900l.purchase(this.billing, AbstractC12900l.purchase(this.purchase, AbstractC12900l.purchase(this.amazon, AbstractC12900l.purchase(this.crashlytics, AbstractC12900l.purchase(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SelectableSurfaceBorder(border=" + this.yandex + ", focusedBorder=" + this.loadAd + ",pressedBorder=" + this.crashlytics + ", selectedBorder=" + this.amazon + ",disabledBorder=" + this.purchase + ", focusedSelectedBorder=" + this.billing + ", focusedDisabledBorder=" + this.mopub + ",pressedSelectedBorder=" + this.admob + ", selectedDisabledBorder=" + this.subs + ", focusedSelectedDisabledBorder=" + this.isPro + ')';
    }
}
