package defpackage;

/* JADX INFO: renamed from: lّٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12804l {
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l yandex;

    public C12804l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2, InterfaceC6347l interfaceC6347l3) {
        this.yandex = interfaceC6347l;
        this.loadAd = interfaceC6347l2;
        this.crashlytics = interfaceC6347l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12804l)) {
            return false;
        }
        C12804l c12804l = (C12804l) obj;
        return AbstractC8576l.yandex(this.yandex, c12804l.yandex) && AbstractC8576l.yandex(this.loadAd, c12804l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12804l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC2812l.isPro(this.loadAd, this.yandex.hashCode() * 31, 31);
    }
}
