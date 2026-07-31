package defpackage;

/* JADX INFO: renamed from: lُٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11047l implements InterfaceC4945l {
    public final InterfaceC13238l yandex;

    public C11047l(InterfaceC13238l interfaceC13238l) {
        this.yandex = interfaceC13238l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11047l) && AbstractC8576l.yandex(this.yandex, ((C11047l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "HorizontalList(items=" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC4945l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(90907254);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            C14823l.f28995l.amazon(c6523l2, AbstractC14566l.amazon(520651337, new C18198l(interfaceC17242l, c6523l2, new C6523l(), this), c6956l), c6956l, 432);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, interfaceC17242l, i, 28);
        }
    }
}
