package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8856l implements InterfaceC4945l {
    public final InterfaceC13238l yandex;

    public C8856l(InterfaceC13238l interfaceC13238l) {
        this.yandex = interfaceC13238l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8856l) && AbstractC8576l.yandex(this.yandex, ((C8856l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "TripleSlider(items=" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC4945l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1499364941);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            C6523l c6523l3 = new C6523l();
            C1513l c1513l = new C1513l(3);
            InterfaceC17242l interfaceC17242lPurchase = AbstractC6745l.purchase(AbstractC9966l.billing(AbstractC0080l.mopub(interfaceC17242l, 0.0f, 192.0f, 1), c6523l2), c6523l3);
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(8.0f, 0.0f, 2);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            boolean zBilling = c6956l.billing(c6523l3) | ((i2 & 112) == 32);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C15575l((Object) this, c6523l3, 4);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC13628l.yandex(c1513l, interfaceC17242lPurchase, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l, 199680, 980);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(this, interfaceC17242l, i, 0);
        }
    }
}
