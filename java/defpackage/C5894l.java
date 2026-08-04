package defpackage;

/* JADX INFO: renamed from: lؘۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5894l {
    public final InterfaceC6347l amazon;
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l purchase;
    public final InterfaceC6347l yandex;

    public C5894l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2, InterfaceC6347l interfaceC6347l3, InterfaceC6347l interfaceC6347l4, InterfaceC6347l interfaceC6347l5) {
        this.yandex = interfaceC6347l;
        this.loadAd = interfaceC6347l2;
        this.crashlytics = interfaceC6347l3;
        this.amazon = interfaceC6347l4;
        this.purchase = interfaceC6347l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5894l.class != obj.getClass()) {
            return false;
        }
        C5894l c5894l = (C5894l) obj;
        return AbstractC8576l.yandex(this.yandex, c5894l.yandex) && AbstractC8576l.yandex(this.loadAd, c5894l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c5894l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5894l.amazon) && AbstractC8576l.yandex(this.purchase, c5894l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC2812l.isPro(this.amazon, AbstractC2812l.isPro(this.crashlytics, AbstractC2812l.isPro(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ButtonShape(shape=" + this.yandex + ", focusedShape=" + this.loadAd + ", pressedShape=" + this.crashlytics + ", disabledShape=" + this.amazon + ", focusedDisabledShape=" + this.purchase + ')';
    }
}
