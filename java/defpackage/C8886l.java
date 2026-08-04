package defpackage;

/* JADX INFO: renamed from: lٌِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8886l {
    public final InterfaceC6347l amazon;
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l purchase;
    public final InterfaceC6347l yandex;

    public C8886l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2, InterfaceC6347l interfaceC6347l3, InterfaceC6347l interfaceC6347l4, InterfaceC6347l interfaceC6347l5) {
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
        if (obj == null || C8886l.class != obj.getClass()) {
            return false;
        }
        C8886l c8886l = (C8886l) obj;
        return AbstractC8576l.yandex(this.yandex, c8886l.yandex) && AbstractC8576l.yandex(this.loadAd, c8886l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8886l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8886l.amazon) && AbstractC8576l.yandex(this.purchase, c8886l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC2812l.isPro(this.amazon, AbstractC2812l.isPro(this.crashlytics, AbstractC2812l.isPro(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceShape(shape=" + this.yandex + ", focusedShape=" + this.loadAd + ", pressedShape=" + this.crashlytics + ", disabledShape=" + this.amazon + ", focusedDisabledShape=" + this.purchase + ')';
    }
}
