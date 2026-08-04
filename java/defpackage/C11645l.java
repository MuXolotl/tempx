package defpackage;

/* JADX INFO: renamed from: lِْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11645l implements InterfaceC3442l {
    public final int loadAd;
    public final int yandex;

    public C11645l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11645l)) {
            return false;
        }
        C11645l c11645l = (C11645l) obj;
        return this.yandex == c11645l.yandex && this.loadAd == c11645l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "SetComposingRegionCommand(start=", ", end=", ")");
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        boolean z = c7221l.f15052l != -1;
        C11522l c11522l = (C11522l) c7221l.f15053l;
        if (z) {
            c7221l.f15052l = -1;
            c7221l.f15051l = -1;
        }
        int iPurchase = AbstractC8576l.purchase(this.yandex, 0, c11522l.premium());
        int iPurchase2 = AbstractC8576l.purchase(this.loadAd, 0, c11522l.premium());
        if (iPurchase != iPurchase2) {
            if (iPurchase < iPurchase2) {
                c7221l.metrica(iPurchase, iPurchase2);
            } else {
                c7221l.metrica(iPurchase2, iPurchase);
            }
        }
    }
}
