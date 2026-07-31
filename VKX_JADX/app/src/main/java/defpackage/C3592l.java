package defpackage;

/* JADX INFO: renamed from: lؕۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3592l {
    public final C9188l loadAd;
    public final InterfaceC16902l yandex;

    public C3592l(InterfaceC16902l interfaceC16902l, C9188l c9188l) {
        this.yandex = interfaceC16902l;
        this.loadAd = c9188l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3592l)) {
            return false;
        }
        C3592l c3592l = (C3592l) obj;
        return AbstractC8576l.yandex(c3592l.yandex, this.yandex) && AbstractC8576l.yandex(c3592l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode();
        return this.loadAd.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.yandex + ", typeAttr=" + this.loadAd + ')';
    }
}
