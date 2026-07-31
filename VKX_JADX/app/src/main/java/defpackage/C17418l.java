package defpackage;

/* JADX INFO: renamed from: lٌٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17418l implements InterfaceC4945l {
    public static final C17418l yandex = new C17418l();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C17418l);
    }

    public final int hashCode() {
        return 1181971710;
    }

    public final String toString() {
        return "Separator";
    }

    @Override // defpackage.InterfaceC4945l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1379304963);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(interfaceC17242l, 16.0f));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, interfaceC17242l, i, 29);
        }
    }
}
