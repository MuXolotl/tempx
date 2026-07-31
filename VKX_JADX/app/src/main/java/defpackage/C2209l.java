package defpackage;

/* JADX INFO: renamed from: lّۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2209l {
    public static final C2209l crashlytics = new C2209l(AbstractC2576l.yandex(0.0f, C9735l.isPro), AbstractC16837l.yandex);
    public final InterfaceC6347l loadAd;
    public final C5028l yandex;

    public C2209l(C5028l c5028l, InterfaceC6347l interfaceC6347l, int i) {
        this(c5028l, (i & 4) != 0 ? AbstractC14949l.yandex : interfaceC6347l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2209l.class != obj.getClass()) {
            return false;
        }
        C2209l c2209l = (C2209l) obj;
        return AbstractC8576l.yandex(this.yandex, c2209l.yandex) && C14467l.loadAd(0.0f, 0.0f) && AbstractC8576l.yandex(this.loadAd, c2209l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + AbstractC9029l.mopub(this.yandex.hashCode() * 31, 0.0f, 31);
    }

    public final String toString() {
        return "Border(border=" + this.yandex + ", inset=" + ((Object) C14467l.crashlytics(0.0f)) + ", shape=" + this.loadAd + ')';
    }

    public C2209l(C5028l c5028l, InterfaceC6347l interfaceC6347l) {
        this.yandex = c5028l;
        this.loadAd = interfaceC6347l;
    }
}
