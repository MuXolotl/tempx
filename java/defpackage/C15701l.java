package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15701l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f30839l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30840l;

    public /* synthetic */ C15701l(C15578l c15578l, int i) {
        this.f30840l = i;
        this.f30839l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30840l;
        C4346l c4346l = C4346l.f8873l;
        C15578l c15578l = this.f30839l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long jYandex = AbstractC9027l.yandex(40.0f, 40.0f);
                    C11205l c11205l = AbstractC0080l.yandex;
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC0080l.firebase(c4346l, C2261l.loadAd(jYandex), C2261l.yandex(jYandex));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l, true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    long jYandex2 = AbstractC9027l.yandex(40.0f, 40.0f);
                    C11205l c11205l2 = AbstractC0080l.yandex;
                    InterfaceC17242l interfaceC17242lFirebase2 = AbstractC0080l.firebase(c4346l, C2261l.loadAd(jYandex2), C2261l.yandex(jYandex2));
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lFirebase2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l2, true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5889l.loadAd(c15578l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c15578l.invoke(c6956l3, 0);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objM2132native = c6956l4.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C8864l(0);
                        c6956l4.m2147try(objM2132native);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l4.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l3);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.crashlytics(c6956l4, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l4, true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC14289l.amazon(c15578l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 6:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c15578l.invoke(C9398l.yandex, c6956l5, 6);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC9831l.yandex(c15578l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 8:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.np_title), null, ((C18718l) c6956l6.isPro(AbstractC5992l.yandex)).loadAd, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262138);
                    c15578l.invoke(c6956l6, 0);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 9:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c15578l.invoke(c6956l7, 0);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC8681l.yandex(c15578l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC14460l.yandex(c15578l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 12:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC14312l.isPro(c4346l, "Container");
                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j4 = c6956l8.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l8, interfaceC17242lIsPro);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l4);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, interfaceC10835lAmazon4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l8, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling4, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l8, true);
                } else {
                    c6956l8.m2124else();
                }
                break;
            default:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC13010l.yandex(((C14370l) c6956l9.isPro(AbstractC16964l.yandex)).loadAd.metrica, c15578l, c6956l9, 0);
                } else {
                    c6956l9.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15701l(C15578l c15578l, int i, int i2) {
        this.f30840l = i2;
        this.f30839l = c15578l;
    }
}
