package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15272l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29867l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29868l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29869l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29870l;

    public /* synthetic */ C15272l(InterfaceC2262l interfaceC2262l, InterfaceC12244l interfaceC12244l, C0072l c0072l) {
        this.f29869l = 5;
        this.f29867l = interfaceC2262l;
        this.f29868l = interfaceC12244l;
        this.f29870l = c0072l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v45 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        ?? r4;
        long jLoadAd;
        int i = this.f29869l;
        int i2 = 14;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i3 = 16;
        Object obj4 = this.f29868l;
        Object obj5 = this.f29870l;
        Object obj6 = this.f29867l;
        int i4 = 0;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj6;
                AbstractC14968l abstractC14968l = (AbstractC14968l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zAdmob = c6956l.admob(abstractC14968l) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C10207l(abstractC14968l, interfaceC12244l, 7);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6111l c6111l = (C6111l) obj6;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i5 = 1;
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (EnumC17214l enumC17214l : EnumC17214l.f33416l) {
                        C15578l c15578lAmazon = AbstractC14566l.amazon(-632724222, new C4691l(enumC17214l, i5), c6956l2);
                        boolean zAmazon = c6956l2.amazon(enumC17214l.ordinal()) | c6956l2.admob(c6111l);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zAmazon || objM2132native2 == c13863l) {
                            objM2132native2 = new Cfinally(enumC17214l, c6111l, interfaceC8714l, 28);
                            c6956l2.m2147try(objM2132native2);
                        }
                        AbstractC16727l.loadAd(c15578lAmazon, (Function0) objM2132native2, null, null, AbstractC14566l.amazon(-1909490562, new C9362l(enumC17214l, interfaceC12244l2, 1), c6956l2), false, null, null, c6956l2, 24582, 492);
                        i5 = 1;
                    }
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                C16589l c16589l = C16589l.yandex;
                AbstractC1889l.yandex(new C8079l(c16589l).billing(new C4538l(C1617l.yandex)), C9224l.purchase, AbstractC14566l.amazon(-1582020071, new C7605l((InterfaceC8714l) obj6, 10), c6956l3), c6956l3, 384, 0);
                AbstractC7370l.yandex(AbstractC17307l.firebase(new C8079l(c16589l), AbstractC13542l.loadAd, 13), AbstractC14566l.amazon(-329091839, new C3091l((C0884l) obj5, (Context) obj4, 9), c6956l3), c6956l3, 3072);
                break;
            case 3:
                String str = (String) obj6;
                Function0 function0 = (Function0) obj5;
                C4964l c4964l = (C4964l) obj4;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC15918l.crashlytics(str, c6956l4, 0);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l4, 0, 7);
                    AbstractC15918l.amazon(function0, c4964l, c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C8147l c8147l = (C8147l) obj6;
                Function0 function1 = (Function0) obj5;
                Function0 function2 = (Function0) obj4;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int i6 = AbstractC15548l.yandex;
                    long j = C9735l.isPro;
                    AbstractC13319l.yandex(AbstractC1383l.f3543throw, AbstractC9151l.loadAd(AbstractC0080l.amazon(AbstractC15788l.yandex(c4346l, c8147l.amazon ? 1.0f : 0.5f), 1.0f), c8147l.amazon, null, function1, 14), null, AbstractC14566l.amazon(-652400612, new C1645l(i3, c8147l), c6956l5), AbstractC1383l.f3534catch, null, AbstractC15548l.yandex(j, 0L, 0L, 0L, c6956l5, 510), c6956l5, 27654, 420);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l5, 0, 7);
                    AbstractC13319l.yandex(AbstractC1383l.f3535else, AbstractC9151l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), false, null, function2, 15), null, null, AbstractC1383l.f3533case, null, AbstractC15548l.yandex(j, 0L, 0L, 0L, c6956l5, 510), c6956l5, 24582, 428);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj6;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj4;
                C0072l c0072l = (C0072l) obj5;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l6.admob(interfaceC2262l) | c6956l6.billing(interfaceC12244l3) | c6956l6.admob(c0072l);
                    Object objM2132native3 = c6956l6.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        z = false;
                        objM2132native3 = new C5996l(interfaceC2262l, c0072l, interfaceC12244l3, 0 == true ? 1 : 0);
                        c6956l6.m2147try(objM2132native3);
                    } else {
                        z = false;
                    }
                    AbstractC13319l.yandex(AbstractC11036l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native3, 15), null, AbstractC11036l.amazon, null, AbstractC14566l.amazon(-814663967, new C3411l(interfaceC2262l, c0072l, interfaceC12244l3, i2), c6956l6), null, c6956l6, 199686, 468);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj6;
                C1639l c1639l = (C1639l) obj5;
                Function1 function3 = (Function1) obj4;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 24.0f, 1);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36046l, c6956l7, 6);
                    long j2 = c6956l7.f14595continue;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l7, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i7);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling, c6415l4);
                    if (abstractC13264l.smaato() > 1) {
                        c6956l7.m2123default(-47485470);
                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(AbstractC0080l.startapp(AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2)), 1.0f);
                        C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l7, 6);
                        long j3 = c6956l7.f14595continue;
                        int i8 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l7.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l7, interfaceC17242lAmazon2);
                        c6956l7.m2140super();
                        if (c6956l7.f14603switch) {
                            c6956l7.firebase(c16395l);
                        } else {
                            c6956l7.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l7, c5062lYandex, c6415l);
                        AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato2, c6415l2);
                        AbstractC11043l.isPro(i8, c6956l7, c6415l3, c6956l7, c11192l);
                        AbstractC8182l.billing(c6956l7, interfaceC17242lBilling2, c6415l4);
                        c6956l7.m2123default(-1799638334);
                        int iSmaato = abstractC13264l.smaato();
                        for (int i9 = 0; i9 < iSmaato; i9++) {
                            if (((C15308l) abstractC13264l.amazon.f32506l).admob() == i9) {
                                c6956l7.m2123default(-935028537);
                                jLoadAd = ((C10936l) c6956l7.isPro(AbstractC10689l.yandex)).purchase();
                                r4 = 0;
                            } else {
                                r4 = 0;
                                c6956l7.m2123default(-935027221);
                                jLoadAd = ((C10936l) c6956l7.isPro(AbstractC10689l.yandex)).loadAd();
                            }
                            c6956l7.startapp(r4);
                            AbstractC9383l.yandex(AbstractC0080l.isPro(AbstractC4927l.amazon(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex), jLoadAd, AbstractC16837l.yandex), 12.0f), c6956l7, r4);
                        }
                        AbstractC12900l.ads(c6956l7, false, true, false);
                    } else {
                        c6956l7.m2123default(-52616683);
                        c6956l7.startapp(false);
                    }
                    AbstractC7252l.yandex(abstractC13264l, null, null, null, 0.0f, null, null, false, null, null, null, AbstractC14566l.amazon(-1830716852, new C11050l(c1639l, function3, 7), c6956l7), c6956l7, 0, 24576, 16382);
                    c6956l7.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C0113l c0113l = (C0113l) obj5;
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj6;
                AbstractC14165l abstractC14165l = (AbstractC14165l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6956l8.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC15398l interfaceC15398l = (InterfaceC15398l) c0113l.f1018l.getValue();
                    if (AbstractC8576l.yandex(interfaceC15398l, C18157l.yandex) || AbstractC8576l.yandex(interfaceC15398l, C17733l.yandex)) {
                        c6956l8.m2123default(-605216228);
                        AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l2), false, 0L, c6956l8, 0, 6);
                        c6956l8.startapp(false);
                    } else if (interfaceC15398l instanceof C16261l) {
                        c6956l8.m2123default(-605053106);
                        InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(AbstractC3605l.firebase(AbstractC16422l.mopub(c4346l, interfaceC3102l2.loadAd(), null), interfaceC11780l2), 1.0f), AbstractC13841l.crashlytics(c6956l8), true);
                        InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C16261l) interfaceC15398l).yandex);
                        boolean zAdmob3 = c6956l8.admob(c0113l);
                        Object objM2132native4 = c6956l8.m2132native();
                        if (zAdmob3 || objM2132native4 == c13863l) {
                            C6814l c6814l = new C6814l(0, c0113l, C0113l.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 19);
                            c6956l8.m2147try(c6814l);
                            objM2132native4 = c6814l;
                        }
                        AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) ((InterfaceC5059l) objM2132native4), interfaceC17242lPurchase, false, c6956l8, 0, 8);
                        c6956l8.startapp(false);
                    } else {
                        c6956l8.m2123default(-604521208);
                        InterfaceC17242l interfaceC17242lMopub2 = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l2), interfaceC3102l2.loadAd(), null);
                        boolean zAdmob4 = c6956l8.admob(c0113l) | c6956l8.admob(abstractC14165l);
                        Object objM2132native5 = c6956l8.m2132native();
                        if (zAdmob4 || objM2132native5 == c13863l) {
                            objM2132native5 = new C15575l(c0113l, abstractC14165l, 8);
                            c6956l8.m2147try(objM2132native5);
                        }
                        AbstractC16336l.yandex(interfaceC17242lMopub2, null, null, null, null, null, false, null, (Function1) objM2132native5, c6956l8, 0, 510);
                        c6956l8.startapp(false);
                    }
                } else {
                    c6956l8.m2124else();
                }
                break;
            default:
                EnumC11447l enumC11447l = (EnumC11447l) obj6;
                String str2 = (String) obj5;
                C16820l c16820l = (C16820l) obj4;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    C2287l.loadAd(enumC11447l == EnumC11447l.f23032l, AbstractC8576l.yandex(str2, String.valueOf(c16820l.yandex)), AbstractC14566l.amazon(617093201, new C16384l(c16820l, i4), c6956l9), c6956l9, 384);
                } else {
                    c6956l9.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15272l(C0113l c0113l, C13072l c13072l, AbstractC14165l abstractC14165l) {
        this.f29869l = 7;
        this.f29870l = c0113l;
        this.f29867l = c13072l;
        this.f29868l = abstractC14165l;
    }

    public /* synthetic */ C15272l(Object obj, Object obj2, Object obj3, int i) {
        this.f29869l = i;
        this.f29867l = obj;
        this.f29870l = obj2;
        this.f29868l = obj3;
    }
}
