package defpackage;

/* JADX INFO: renamed from: lّؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3363l implements InterfaceC3442l {
    public final int loadAd;
    public final int yandex;

    public C3363l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3363l)) {
            return false;
        }
        C3363l c3363l = (C3363l) obj;
        return this.yandex == c3363l.yandex && this.loadAd == c3363l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "SetSelectionCommand(start=", ", end=", ")");
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        int iPurchase = AbstractC8576l.purchase(this.yandex, 0, ((C11522l) c7221l.f15053l).premium());
        int iPurchase2 = AbstractC8576l.purchase(this.loadAd, 0, ((C11522l) c7221l.f15053l).premium());
        if (iPurchase < iPurchase2) {
            c7221l.startapp(iPurchase, iPurchase2);
        } else {
            c7221l.startapp(iPurchase2, iPurchase);
        }
    }
}
