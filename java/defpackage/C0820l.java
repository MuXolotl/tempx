package defpackage;

/* JADX INFO: renamed from: lؒؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0820l {
    public final InterfaceC6407l amazon;
    public final InterfaceC6407l crashlytics;
    public final InterfaceC6407l loadAd;
    public final InterfaceC6407l yandex;

    public C0820l(InterfaceC6407l interfaceC6407l, InterfaceC6407l interfaceC6407l2, InterfaceC6407l interfaceC6407l3, InterfaceC6407l interfaceC6407l4) {
        this.yandex = interfaceC6407l;
        this.loadAd = interfaceC6407l2;
        this.crashlytics = interfaceC6407l3;
        this.amazon = interfaceC6407l4;
    }

    public static C0820l yandex(C0820l c0820l, C10773l c10773l, C10773l c10773l2, int i) {
        InterfaceC6407l interfaceC6407l = c10773l;
        if ((i & 1) != 0) {
            interfaceC6407l = c0820l.yandex;
        }
        InterfaceC6407l interfaceC6407l2 = c0820l.loadAd;
        InterfaceC6407l interfaceC6407l3 = c0820l.crashlytics;
        InterfaceC6407l interfaceC6407l4 = c10773l2;
        if ((i & 8) != 0) {
            interfaceC6407l4 = c0820l.amazon;
        }
        c0820l.getClass();
        return new C0820l(interfaceC6407l, interfaceC6407l2, interfaceC6407l3, interfaceC6407l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0820l.class != obj.getClass()) {
            return false;
        }
        C0820l c0820l = (C0820l) obj;
        return AbstractC8576l.yandex(this.yandex, c0820l.yandex) && AbstractC8576l.yandex(this.loadAd, c0820l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0820l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0820l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }
}
