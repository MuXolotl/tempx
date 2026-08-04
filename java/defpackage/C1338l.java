package defpackage;

/* JADX INFO: renamed from: lؙؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1338l {
    public final InterfaceC6347l admob;
    public final InterfaceC6347l amazon;
    public final InterfaceC6347l billing;
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l mopub;
    public final InterfaceC6347l purchase;
    public final InterfaceC6347l yandex;

    public C1338l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2, InterfaceC6347l interfaceC6347l3, InterfaceC6347l interfaceC6347l4, InterfaceC6347l interfaceC6347l5, InterfaceC6347l interfaceC6347l6, InterfaceC6347l interfaceC6347l7, InterfaceC6347l interfaceC6347l8) {
        this.yandex = interfaceC6347l;
        this.loadAd = interfaceC6347l2;
        this.crashlytics = interfaceC6347l3;
        this.amazon = interfaceC6347l4;
        this.purchase = interfaceC6347l5;
        this.billing = interfaceC6347l6;
        this.mopub = interfaceC6347l7;
        this.admob = interfaceC6347l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1338l.class != obj.getClass()) {
            return false;
        }
        C1338l c1338l = (C1338l) obj;
        return AbstractC8576l.yandex(this.yandex, c1338l.yandex) && AbstractC8576l.yandex(this.loadAd, c1338l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1338l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1338l.amazon) && AbstractC8576l.yandex(this.purchase, c1338l.purchase) && AbstractC8576l.yandex(this.billing, c1338l.billing) && AbstractC8576l.yandex(this.mopub, c1338l.mopub) && AbstractC8576l.yandex(this.admob, c1338l.admob);
    }

    public final int hashCode() {
        return this.admob.hashCode() + AbstractC2812l.isPro(this.mopub, AbstractC2812l.isPro(this.billing, AbstractC2812l.isPro(this.purchase, AbstractC2812l.isPro(this.amazon, AbstractC2812l.isPro(this.crashlytics, AbstractC2812l.isPro(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ListItemShape(shape=" + this.yandex + ", focusedShape=" + this.loadAd + ",pressedShape=" + this.crashlytics + ", selectedShape=" + this.amazon + ", disabledShape=" + this.purchase + ", focusedSelectedShape=" + this.billing + ", focusedDisabledShape=" + this.mopub + ", pressedSelectedShape=" + this.admob + ')';
    }
}
