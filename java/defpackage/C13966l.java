package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13966l implements InterfaceC18514l {
    public final C17043l amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C13966l(String str, String str2, String str3, C17043l c17043l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = c17043l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13966l)) {
            return false;
        }
        C13966l c13966l = (C13966l) obj;
        return this.yandex.equals(c13966l.yandex) && AbstractC8576l.yandex(this.loadAd, c13966l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c13966l.crashlytics) && this.amazon.equals(c13966l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        return "StandardTvCard(imageUrl=" + this.yandex + ", title=" + this.loadAd + ", subtitle=" + this.crashlytics + ", onClick=" + this.amazon + ')';
    }

    @Override // defpackage.InterfaceC18514l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-11092927);
        int i2 = (c6956l.billing(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 17) != 16)) {
            AbstractC10547l.loadAd(AbstractC14566l.amazon(9596081, new C7442l((Function1) c6956l.isPro(AbstractC12821l.yandex), this, 17), c6956l), AbstractC14566l.amazon(-1631942535, new Function2(this) { // from class: lِؑؒ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C13966l f1246l;

                {
                    this.f1246l = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2;
                    int i5 = i3;
                    C4346l c4346l = C4346l.f8873l;
                    C13966l c13966l = this.f1246l;
                    switch (i5) {
                        case 0:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC11282l.loadAd(c13966l.loadAd, AbstractC3605l.startapp(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 2, false, 2, 0, null, null, c6956l3, 48, 3120, 120828);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                if (c13966l.crashlytics.length() > 0) {
                                    c6956l4.m2123default(1139956459);
                                    AbstractC11282l.loadAd(c13966l.crashlytics, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, c6956l4, 48, 3120, 120828);
                                    c6956l2 = c6956l4;
                                } else {
                                    c6956l2 = c6956l4;
                                    c6956l2.m2123default(1135709831);
                                }
                                c6956l2.startapp(false);
                            } else {
                                c6956l4.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC0080l.vip(C4346l.f8873l, 120.0f), AbstractC14566l.amazon(739774331, new Function2(this) { // from class: lِؑؒ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C13966l f1246l;

                {
                    this.f1246l = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2;
                    int i5 = i4;
                    C4346l c4346l = C4346l.f8873l;
                    C13966l c13966l = this.f1246l;
                    switch (i5) {
                        case 0:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC11282l.loadAd(c13966l.loadAd, AbstractC3605l.startapp(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 2, false, 2, 0, null, null, c6956l3, 48, 3120, 120828);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                if (c13966l.crashlytics.length() > 0) {
                                    c6956l4.m2123default(1139956459);
                                    AbstractC11282l.loadAd(c13966l.crashlytics, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, c6956l4, 48, 3120, 120828);
                                    c6956l2 = c6956l4;
                                } else {
                                    c6956l2 = c6956l4;
                                    c6956l2.m2123default(1135709831);
                                }
                                c6956l2.startapp(false);
                            } else {
                                c6956l4.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), null, null, null, c6956l, 3510);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, interfaceC17242l, i, 6);
        }
    }
}
