package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1104l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3040l;

    public /* synthetic */ C1104l(int i) {
        this.f3040l = i;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object yandex(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cdcm_wizard_copy_logs), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3040l;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.cdcm_wizard_intro_important_acc);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 1572864, 0, 131002);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l2, R.string.cdcm_wizard_intro_important_rem);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, null, ((C14370l) c6956l2.isPro(c10707l2)).yandex.adcel, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.firebase, c6956l2, 1572864, 0, 131002);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strPurchase3 = AbstractC11999l.purchase(c6956l3, R.string.cdcm_wizard_intro_important_eta);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase3, null, ((C14370l) c6956l3.isPro(c10707l3)).yandex.adcel, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(c10707l3)).loadAd.firebase, c6956l3, 1572864, 0, 131002);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    Object objM2132native = c6956l4.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C4100l(14);
                        c6956l4.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lVip, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native, c6956l4, ((iIntValue4 << 6) & 896) | 805330950, 490);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    String strPurchase4 = AbstractC11999l.purchase(c6956l7, R.string.cdcm_wizard_intro);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase4, null, ((C14370l) c6956l7.isPro(c10707l4)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l4)).loadAd.purchase, c6956l7, 0, 0, 131066);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strPurchase5 = AbstractC11999l.purchase(c6956l8, R.string.cdcm_wizard_intro_text);
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase5, null, ((C14370l) c6956l8.isPro(c10707l5)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l8.isPro(c10707l5)).loadAd.firebase, c6956l8, 0, 0, 131066);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    String strPurchase6 = AbstractC11999l.purchase(c6956l9, R.string.cdcm_wizard_intro_important);
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase6, null, ((C14370l) c6956l9.isPro(c10707l6)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l6)).loadAd.vip, c6956l9, 0, 0, 131066);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    String strPurchase7 = AbstractC11999l.purchase(c6956l10, R.string.cdcm_wizard_intro_important_gms);
                    C10707l c10707l7 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase7, null, ((C14370l) c6956l10.isPro(c10707l7)).yandex.adcel, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l7)).loadAd.firebase, c6956l10, 1572864, 0, 131002);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 0, 0, 262142);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    String strPurchase8 = AbstractC11999l.purchase(c6956l13, R.string.cdcm_wizard_prereq_gms);
                    C10707l c10707l8 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase8, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l13.isPro(c10707l8)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l13.isPro(c10707l8)).loadAd.purchase, c6956l13, 48, 0, 131064);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    String strPurchase9 = AbstractC11999l.purchase(c6956l14, R.string.cdcm_wizard_prereq_permissions);
                    C10707l c10707l9 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase9, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l14.isPro(c10707l9)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l14.isPro(c10707l9)).loadAd.purchase, c6956l14, 48, 0, 131064);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    String strPurchase10 = AbstractC11999l.purchase(c6956l15, R.string.cdcm_wizard_prereq_permissions_privacy);
                    C10707l c10707l10 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase10, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l15.isPro(c10707l10)).yandex.adcel, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l15.isPro(c10707l10)).loadAd.firebase, c6956l15, 1572912, 0, 131000);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l16, 0);
                    long j = c6956l16.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l16.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l16, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l16.m2140super();
                    if (c6956l16.f14603switch) {
                        c6956l16.firebase(c16395l);
                    } else {
                        c6956l16.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l16, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l16, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l16, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l16, C3438l.firebase);
                    AbstractC8182l.billing(c6956l16, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13319l.yandex(AbstractC7720l.admob, null, null, AbstractC7720l.subs, null, null, null, c6956l16, 3078, 502);
                    AbstractC13319l.yandex(AbstractC7720l.isPro, null, null, AbstractC7720l.firebase, null, null, null, c6956l16, 3078, 502);
                    c6956l16.startapp(true);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    String strPurchase11 = AbstractC11999l.purchase(c6956l17, R.string.cdcm_wizard_prereq_permissions_text_os);
                    C10707l c10707l11 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase11, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l17.isPro(c10707l11)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l17.isPro(c10707l11)).loadAd.firebase, c6956l17, 48, 0, 131064);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l18, 0);
                    long j2 = c6956l18.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l18.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l18, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l18.m2140super();
                    if (c6956l18.f14603switch) {
                        c6956l18.firebase(c16395l2);
                    } else {
                        c6956l18.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l18, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l18, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l18, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l18, C3438l.firebase);
                    AbstractC8182l.billing(c6956l18, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC13319l.yandex(AbstractC7720l.vip, null, null, AbstractC7720l.metrica, null, null, null, c6956l18, 3078, 502);
                    AbstractC13319l.yandex(AbstractC7720l.startapp, null, null, AbstractC7720l.adcel, null, null, null, c6956l18, 3078, 502);
                    c6956l18.startapp(true);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l21, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 0, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= c6956l22.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l2), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l22, 6);
                    long j3 = c6956l22.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l22.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l22, interfaceC17242lVip2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l22.m2140super();
                    if (c6956l22.f14603switch) {
                        c6956l22.firebase(c16395l3);
                    } else {
                        c6956l22.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l22, c1853lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l22, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l22, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l22, C3438l.firebase);
                    AbstractC8182l.billing(c6956l22, interfaceC17242lBilling3, C3438l.amazon);
                    String strPurchase12 = AbstractC11999l.purchase(c6956l22, R.string.cdcm_wizard_err_space);
                    C10707l c10707l12 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase12, null, ((C14370l) c6956l22.isPro(c10707l12)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l22.isPro(c10707l12)).loadAd.purchase, c6956l22, 0, 0, 131066);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, R.string.cdcm_wizard_err_space_on_sender), null, ((C14370l) c6956l22.isPro(c10707l12)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l22.isPro(c10707l12)).loadAd.firebase, c6956l22, 0, 0, 131066);
                    c6956l22.startapp(true);
                } else {
                    c6956l22.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l23, 0, 0, 262142);
                } else {
                    c6956l23.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= c6956l24.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l3), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l24, 6);
                    long j4 = c6956l24.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l24.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l24, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l24.m2140super();
                    if (c6956l24.f14603switch) {
                        c6956l24.firebase(c16395l4);
                    } else {
                        c6956l24.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l24, c1853lYandex4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l24, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l24, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l24, C3438l.firebase);
                    AbstractC8182l.billing(c6956l24, interfaceC17242lBilling4, C3438l.amazon);
                    String strPurchase13 = AbstractC11999l.purchase(c6956l24, R.string.cdcm_wizard_complete);
                    C10707l c10707l13 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase13, null, ((C14370l) c6956l24.isPro(c10707l13)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l24.isPro(c10707l13)).loadAd.purchase, c6956l24, 0, 0, 131066);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.cdcm_wizard_complete_on_sender), null, ((C14370l) c6956l24.isPro(c10707l13)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l24.isPro(c10707l13)).loadAd.firebase, c6956l24, 0, 0, 131066);
                    c6956l24.startapp(true);
                } else {
                    c6956l24.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l25, R.string.cdcm_receive_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l25, 0, 0, 262142);
                } else {
                    c6956l25.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l26, R.string.cdcm_receive_confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l26, 0, 0, 262142);
                } else {
                    c6956l26.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return yandex(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return mopub(obj, obj2, obj3);
            default:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l27, R.string.cdcm_wizard_err_version_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l27, 0, 0, 262142);
                } else {
                    c6956l27.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
