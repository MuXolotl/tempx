package defpackage;

/* JADX INFO: renamed from: lٌۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9192l {
    public static final C9192l crashlytics;
    public final InterfaceC18382l loadAd;
    public final InterfaceC18382l yandex;

    static {
        C18499l c18499l = C18499l.yandex;
        crashlytics = new C9192l(c18499l, c18499l);
    }

    public C9192l(InterfaceC18382l interfaceC18382l, InterfaceC18382l interfaceC18382l2) {
        this.yandex = interfaceC18382l;
        this.loadAd = interfaceC18382l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9192l)) {
            return false;
        }
        C9192l c9192l = (C9192l) obj;
        return this.yandex.equals(c9192l.yandex) && this.loadAd.equals(c9192l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.yandex + ", height=" + this.loadAd + ")";
    }
}
