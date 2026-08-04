package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f1683l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1684l;

    public /* synthetic */ C0454l(int i, int i2, Function0 function0) {
        this.f1684l = i2;
        this.f1683l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1684l;
        C1083l c1083l = AbstractC8313l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Function0 function0 = this.f1683l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7470l.billing(this.f1683l, null, false, null, null, null, AbstractC7209l.yandex, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c1083l, c0086l, c6956l2, 48);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l2, 0);
                    AbstractC17457l.loadAd(this.f1683l, null, false, null, null, null, null, null, AbstractC11028l.billing, c6956l2, 805306368, 510);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0086l c0086l2 = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c1083l, c0086l2, c6956l3, 48);
                    long j2 = c6956l3.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l3, 0);
                    AbstractC17457l.loadAd(this.f1683l, null, false, null, null, null, null, null, C17423l.subs, c6956l3, 805306368, 510);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C0086l c0086l3 = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(c1083l, c0086l3, c6956l4, 48);
                    long j3 = c6956l4.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l3);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l4, 0);
                    AbstractC17457l.loadAd(this.f1683l, null, false, null, null, null, null, null, C17423l.mopub, c6956l4, 805306368, 510);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C0086l c0086l4 = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip4 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex4 = AbstractC7001l.yandex(c1083l, c0086l4, c6956l5, 48);
                    long j4 = c6956l5.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l5, interfaceC17242lVip4);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l4);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling4, C3438l.amazon);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l5, 0);
                    AbstractC17457l.loadAd(this.f1683l, null, false, null, null, null, null, null, AbstractC15422l.purchase, c6956l5, 805306368, 510);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC5103l.amazon, c6956l6, 805306368, 510);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC5103l.purchase, c6956l7, 805306368, 510);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC5103l.admob, c6956l8, 805306368, 510);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC5103l.smaato, c6956l9, 805306368, 510);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC17824l.admob(function0, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC17824l.mopub(function0, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC17824l.purchase(function0, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC17824l.billing(function0, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 13:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC11141l.metrica, c6956l10, 805306368, 510);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 14:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC17457l.mopub(this.f1683l, null, false, null, null, null, AbstractC11141l.smaato, c6956l11, 805306368, 510);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 15:
                boolean z = false;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if ((iIntValue12 & 3) != 2) {
                    z = true;
                }
                if (c6956l12.m2127for(iIntValue12 & 1, z)) {
                    AbstractC18079l.amazon(AbstractC12027l.yandex, null, AbstractC14566l.amazon(1881051403, new C0454l(17, function0), c6956l12), null, 0.0f, null, null, null, null, c6956l12, 390, 506);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 16:
                boolean z2 = false;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if ((iIntValue13 & 3) != 2) {
                    z2 = true;
                }
                if (c6956l13.m2127for(iIntValue13 & 1, z2)) {
                    AbstractC11184l.yandex(this.f1683l, null, null, 0L, 0L, null, AbstractC12027l.crashlytics, c6956l13, 12582912, 126);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC7470l.billing(this.f1683l, null, false, null, null, null, AbstractC12027l.loadAd, c6956l14, 1572864, 62);
                } else {
                    c6956l14.m2124else();
                }
                break;
            default:
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC7470l.billing(this.f1683l, null, false, null, null, null, AbstractC10310l.mopub, c6956l15, 1572864, 62);
                } else {
                    c6956l15.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0454l(int i, Function0 function0) {
        this.f1684l = i;
        this.f1683l = function0;
    }
}
