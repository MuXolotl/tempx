package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13881l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27152l;

    public /* synthetic */ C13881l(int i) {
        this.f27152l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f27152l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                AbstractC7741l.amazon((C7819l) obj, null, AbstractC0080l.crashlytics(c4346l, 1.0f), C4176l.yandex, null, (C6956l) obj2, (((Integer) obj3).intValue() & 14) | 1573296, 1976);
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_lock_outline_16, 0, c6956l2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c6956l2, 56, 4);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) ((j2 >>> 32) ^ j2);
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.book_subscription), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.vip, c6956l2, 0, 0, 131066);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.book_subscription_desc), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.vip, c6956l2, 0, 0, 131066);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC3383l.yandex(AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), null, AbstractC13880l.purchase(((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l3, 0, 14), null, null, AbstractC15918l.crashlytics, c6956l3, 196614, 26);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l4, 48);
                    long j3 = c6956l4.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                    AbstractC9334l.yandex(c6956l4, AbstractC0080l.vip(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 5:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l5, 0, 7);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 6:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC0555l.loadAd(AbstractC3605l.startapp(C4346l.f8873l, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0.0f, 0L, c6956l6, 6, 6);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 7:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.as2_desc), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l7.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 48, 0, 262136);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 8:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l8, 0, 7);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 9:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.launch__ontinue_res_0x7f1203d3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 10:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36034l, c6956l10, 54);
                    long j4 = c6956l10.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l10, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l3);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling4, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, R.string.launch__ontinue_res_0x7f1203d3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l10, 0, 0, 262142);
                    c6956l10.startapp(true);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 11:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 12:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 0, 0, 262142);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 13:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.bookmarks_find), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 14:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.cache_library_delete_warning_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 15:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 0, 0, 262142);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 16:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.auth2_password_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 0, 0, 262142);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC3605l.smaato(c4346l, 16.0f);
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l, c6956l17, 54);
                    long j5 = c6956l17.f14595continue;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l17.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l17, interfaceC17242lSmaato2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l17.m2140super();
                    if (c6956l17.f14603switch) {
                        c6956l17.firebase(c16395l4);
                    } else {
                        c6956l17.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l17, c5062lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l17, interfaceC18556lSmaato5, C3438l.billing);
                    AbstractC8182l.billing(c6956l17, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l17, C3438l.firebase);
                    AbstractC8182l.billing(c6956l17, interfaceC17242lBilling5, C3438l.amazon);
                    String strPurchase = AbstractC11999l.purchase(c6956l17, R.string.captcha_webview);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC11282l.loadAd(strPurchase, new C9247l(1.0f, true), ((C14370l) c6956l17.isPro(c10707l2)).yandex.adcel, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C14370l) c6956l17.isPro(c10707l2)).loadAd.firebase, c6956l17, 0, 0, 65528);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l17), null, null, ((C14370l) c6956l17.isPro(c10707l2)).yandex.subscription, c6956l17, 56, 4);
                    c6956l17.startapp(true);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.catalog_categories), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l18.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 48, 0, 262136);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l19, R.string.catalog_blacklist_info);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, AbstractC3605l.smaato(c4346l, 16.0f), ((C14370l) c6956l19.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l19.isPro(c10707l3)).loadAd.vip, c6956l19, 48, 0, 131064);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case 20:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    String strPurchase3 = AbstractC11999l.purchase(c6956l20, R.string.catalog_classic_info);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase3, AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), ((C14370l) c6956l20.isPro(c10707l4)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l20.isPro(c10707l4)).loadAd.vip, c6956l20, 48, 0, 131064);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 21:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l21, 0, 7);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 22:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    C2491l.yandex.getClass();
                    AbstractC2991l.purchase(C2491l.amazon, false, null, null, c6956l22, 0, 14);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 23:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    String strPurchase4 = AbstractC11999l.purchase(c6956l23, R.string.catalog_classic_info);
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase4, AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), ((C14370l) c6956l23.isPro(c10707l5)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l23.isPro(c10707l5)).loadAd.vip, c6956l23, 48, 0, 131064);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l24, 0, 7);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    C2491l.yandex.getClass();
                    AbstractC2991l.purchase(C2491l.amazon, false, null, null, c6956l25, 0, 14);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l26, 0, 7);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l27, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l27, 0, 0, 262142);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l28, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l28, 0, 0, 262142);
                } else {
                    c6956l28.m2124else();
                }
                break;
            default:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    String strPurchase5 = AbstractC11999l.purchase(c6956l29, R.string.cdcm_wizard_mode);
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase5, null, ((C14370l) c6956l29.isPro(c10707l6)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l29.isPro(c10707l6)).loadAd.purchase, c6956l29, 0, 0, 131066);
                } else {
                    c6956l29.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
