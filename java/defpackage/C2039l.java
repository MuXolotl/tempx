package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؓۖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2039l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4574l;

    public /* synthetic */ C2039l(int i) {
        this.f4574l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f4574l;
        C14054l c14054l = C14054l.f27396l;
        int i2 = 6;
        int i3 = 2;
        C4346l c4346l = C4346l.f8873l;
        int i4 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                C0397l c0397l = (C0397l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(c0397l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lPremium = c0397l.yandex(c4346l, C18450l.f36034l).premium(AbstractC0080l.loadAd);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC11028l.yandex(6, c6956l, false);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_arrow_right_outline_28, 0, c6956l), null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 56.0f), 10.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription, c6956l, 440, 0);
                    AbstractC11028l.yandex(6, c6956l, true);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C0397l c0397l2 = (C0397l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(c0397l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lPremium2 = c0397l2.yandex(c4346l, C18450l.f36034l).premium(AbstractC0080l.loadAd);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j2 = c6956l2.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 72.0f), 10.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c6956l2, 440, 0);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_arrow_right_outline_28, 0, c6956l2), null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 56.0f), 10.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440, 0);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l2), null, AbstractC3605l.smaato(AbstractC0080l.isPro(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC3605l.smaato(c4346l, 10.0f), ((C14370l) c6956l2.isPro(c10707l)).crashlytics.crashlytics), C9735l.loadAd(0.25f, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex), AbstractC16837l.yandex), 72.0f), 10.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, c6956l2, 56, 0);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj;
                int iMo870l = interfaceC7448l.mo870l(10.0f);
                int i7 = iMo870l * 2;
                AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) obj2).adcel(AbstractC7563l.subs(i7, ((C15519l) obj3).yandex, 0));
                return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l - i7, abstractC10113lAdcel.f20591l, c14054l, new C0352l(abstractC10113lAdcel, iMo870l, z ? 1 : 0));
            case 3:
                InterfaceC7448l interfaceC7448l2 = (InterfaceC7448l) obj;
                int iMo870l2 = interfaceC7448l2.mo870l(10.0f);
                int i8 = iMo870l2 * 2;
                AbstractC10113l abstractC10113lAdcel2 = ((InterfaceC6357l) obj2).adcel(AbstractC7563l.subs(0, ((C15519l) obj3).yandex, i8));
                return interfaceC7448l2.isVip(abstractC10113lAdcel2.f20592l, abstractC10113lAdcel2.f20591l - i8, c14054l, new C0352l(abstractC10113lAdcel2, iMo870l2, i4));
            case 4:
                AbstractC10113l abstractC10113lAdcel3 = ((InterfaceC6357l) obj2).adcel(((C15519l) obj3).yandex);
                return ((InterfaceC7448l) obj).mo1114const(abstractC10113lAdcel3.f20592l, abstractC10113lAdcel3.f20591l, C14054l.f27396l, new C10351l(i2), new C10889l(abstractC10113lAdcel3, i3));
            case 5:
                ((C10972l) obj).loadAd.invoke(((C8119l) obj2).yandex, ((C8119l) obj3).yandex);
                return Unit.INSTANCE;
            case 6:
                ((C13927l) obj).loadAd.invoke(((C16229l) obj2).yandex, ((C16229l) obj3).yandex);
                return Unit.INSTANCE;
            case 7:
                C6698l c6698l = (C6698l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                C15578l c15578l = AbstractC15290l.amazon;
                C17989l c17989l = AbstractC1923l.crashlytics;
                C10707l c10707l2 = AbstractC5992l.yandex;
                long jLoadAd = ((C18718l) c6956l3.isPro(c10707l2)).yandex;
                C14997l c14997l = new C14997l(AbstractC12953l.startapp(jLoadAd));
                double dBilling = AbstractC15497l.billing(c14997l.amazon, 3.0d);
                Double dValueOf = Double.valueOf(dBilling);
                if (dBilling <= -1.0d) {
                    dValueOf = null;
                }
                if (dValueOf != null) {
                    int iFirebase = AbstractC6889l.firebase(c14997l.loadAd, c14997l.crashlytics, dValueOf.doubleValue());
                    new C14997l(iFirebase);
                    jLoadAd = AbstractC12953l.loadAd(iFirebase);
                }
                long j3 = ((C18718l) c6956l3.isPro(c10707l2)).loadAd;
                long j4 = ((C18718l) c6956l3.isPro(c10707l2)).yandex;
                long j5 = C9735l.firebase;
                C0764l c0764l = ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex;
                C16065l c16065l = c0764l.f2304l;
                if (c16065l == null) {
                    C16065l c16065l2 = new C16065l(AbstractC15038l.amazon(c0764l, 37), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 26));
                    c0764l.f2304l = c16065l2;
                    c16065l = c16065l2;
                }
                if (jLoadAd == 16) {
                    jLoadAd = c16065l.yandex;
                }
                long j6 = jLoadAd;
                if (j3 == 16) {
                    j3 = c16065l.loadAd;
                }
                long j7 = j3;
                if (j4 == 16) {
                    j4 = c16065l.crashlytics;
                }
                long j8 = j4;
                if (j5 == 16) {
                    j5 = c16065l.amazon;
                }
                C16065l c16065l3 = new C16065l(j6, j7, j8, j5);
                C15578l c15578l2 = AbstractC15290l.yandex;
                AbstractC15645l.crashlytics(c6698l, null, c15578l, c17989l, 0.0f, null, c16065l3, 0.0f, c6956l3, (iIntValue3 & 14) | 384);
                return Unit.INSTANCE;
            case 8:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.hint), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.ic_car_outline_28, 0, c6956l5);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.android_auto_setup_start), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l7, 0, 7);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (!c6956l8.m2127for(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (!c6956l9.m2127for(1 & iIntValue9, (iIntValue9 & 17) != 16)) {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (!c6956l10.m2127for(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.eq3_float_set), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.settings_appearance_dpi_override), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l12.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 48, 0, 262136);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(1 & iIntValue13, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.eq3_float_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.launch_category), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l14.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 48, 0, 262136);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC2991l.crashlytics("startup_orbit", R.string.launch_category_orbit, 0, false, false, null, c6956l15, 3078, 52);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(1 & iIntValue16, (iIntValue16 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.misc), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l16.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 48, 0, 262136);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC2991l.crashlytics("animreduce_nav", R.string.animreduce_section_nav, 0, false, false, null, c6956l17, 3078, 52);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC2991l.crashlytics("interface_fullnumbers", R.string.st_fn, R.string.st_fn_desc, false, false, null, c6956l18, 3078, 48);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(1 & iIntValue19, (iIntValue19 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(1 & iIntValue20, (iIntValue20 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(1 & iIntValue21, (iIntValue21 & 17) != 16)) {
                    AbstractC13010l.loadAd("OK", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 6, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(1 & iIntValue22, (iIntValue22 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l22, 0, 0, 262142);
                } else {
                    c6956l22.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(1 & iIntValue23, (iIntValue23 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l23, 0, 0, 262142);
                } else {
                    c6956l23.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(1 & iIntValue24, (iIntValue24 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.eq3_system_error_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l24, 0, 0, 262142);
                } else {
                    c6956l24.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
