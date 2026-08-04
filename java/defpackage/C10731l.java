package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10731l implements InterfaceC18514l {
    public final C6318l amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C10731l(String str, String str2, String str3, C6318l c6318l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = c6318l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10731l)) {
            return false;
        }
        C10731l c10731l = (C10731l) obj;
        return this.yandex.equals(c10731l.yandex) && AbstractC8576l.yandex(this.loadAd, c10731l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c10731l.crashlytics) && this.amazon.equals(c10731l.amazon);
    }

    public final int hashCode() {
        return this.amazon.yandex.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        return "DoubleGridItem(imageUrl=" + this.yandex + ", title=" + this.loadAd + ", subtitle=" + this.crashlytics + ", onClick=" + this.amazon + ')';
    }

    @Override // defpackage.InterfaceC18514l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1527564004);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) c6956l.isPro(AbstractC12821l.yandex);
            boolean zBilling = c6956l.billing(function1) | ((i2 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C12242l(function1, this, 0);
                c6956l.m2147try(objM2132native);
            }
            C14855l c14855l = C7219l.yandex;
            AbstractC10464l.yandex((Function0) objM2132native, interfaceC17242l, null, null, C7219l.yandex(5), null, null, null, AbstractC14566l.amazon(1353331942, new C1350l(10, this), c6956l), c6956l, ((i2 << 3) & 112) | 805306368, 476);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, interfaceC17242l, i, 5);
        }
    }
}
