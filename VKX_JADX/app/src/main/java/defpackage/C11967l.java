package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11967l {
    public final Function0 amazon;
    public final boolean crashlytics;
    public final String loadAd;
    public final int yandex;

    public C11967l(int i, String str, boolean z, Function0 function0) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = z;
        this.amazon = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11967l)) {
            return false;
        }
        C11967l c11967l = (C11967l) obj;
        return this.yandex == c11967l.yandex && AbstractC8576l.yandex(this.loadAd, c11967l.loadAd) && this.crashlytics == c11967l.crashlytics && this.amazon.equals(c11967l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Action(icon=" + this.yandex + ", title=" + this.loadAd + ", checked=" + this.crashlytics + ", onClick=" + this.amazon + ')';
    }

    public final void yandex(C6956l c6956l, int i) {
        C15578l c15578l;
        c6956l.m2133new(1465887722);
        int i2 = 2;
        int i3 = (c6956l.billing(this) ? 4 : 2) | i;
        byte b = 0;
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            if (this.yandex != 0) {
                c6956l.m2123default(-966130374);
                C15578l c15578lAmazon = AbstractC14566l.amazon(1380744742, new C12526l(this, b, b), c6956l);
                c6956l.startapp(false);
                c15578l = c15578lAmazon;
            } else {
                c6956l.m2123default(-965972461);
                c6956l.startapp(false);
                c15578l = null;
            }
            int i5 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC14566l.amazon(1209429960, new C12526l(this, i4, b), c6956l), AbstractC9151l.loadAd(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), false, null, this.amazon, 15), null, null, c15578l, AbstractC14566l.amazon(-1767052211, new C12526l(this, i2, b), c6956l), AbstractC15548l.loadAd(0L, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex, c6956l, 16777207), c6956l, 196614, 396);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12526l(this, i);
        }
    }
}
