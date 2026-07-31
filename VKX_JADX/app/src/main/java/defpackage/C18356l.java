package defpackage;

/* JADX INFO: renamed from: l٘ۦۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18356l {
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l yandex;

    public C18356l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2, InterfaceC6347l interfaceC6347l3) {
        this.yandex = interfaceC6347l;
        this.loadAd = interfaceC6347l2;
        this.crashlytics = interfaceC6347l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18356l.class != obj.getClass()) {
            return false;
        }
        C18356l c18356l = (C18356l) obj;
        return AbstractC8576l.yandex(this.yandex, c18356l.yandex) && AbstractC8576l.yandex(this.loadAd, c18356l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c18356l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC2812l.isPro(this.loadAd, this.yandex.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardShape(shape=" + this.yandex + ", focusedShape=" + this.loadAd + ", pressedShape=" + this.crashlytics + ')';
    }
}
