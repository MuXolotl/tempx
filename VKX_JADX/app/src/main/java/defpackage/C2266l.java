package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؓۧؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2266l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f4946l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4947l;

    public /* synthetic */ C2266l(InterfaceC8714l interfaceC8714l, int i) {
        this.f4947l = i;
        this.f4946l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l;
        int i;
        int i2;
        int i3 = this.f4947l;
        C4346l c4346l = C4346l.f8873l;
        int i4 = 18;
        int i5 = 6;
        int i6 = 2;
        C13863l c13863l = C1867l.yandex;
        InterfaceC8714l interfaceC8714l = this.f4946l;
        int i7 = 1;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l2.billing(c7091l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                        c6956l2.m2123default(-148043270);
                        Object objM2132native = c6956l2.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C0289l(interfaceC8714l, i6);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC17457l.mopub((Function0) objM2132native, AbstractC5020l.smaato(c7091l, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2)), false, null, null, null, AbstractC14566l.amazon(-1583218287, new C2266l(interfaceC8714l, i7), c6956l2), c6956l2, 805306374, 508);
                        c6956l = c6956l2;
                    } else {
                        c6956l = c6956l2;
                        c6956l.m2123default(-173932455);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 1:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                        i = -1054349095;
                        i2 = R.string.as2_bt_show_all;
                    } else {
                        i = -1054347623;
                        i2 = R.string.as2_bt_hide_all;
                    }
                    AbstractC13010l.loadAd(AbstractC12900l.mopub(c6956l3, i, i2, c6956l3, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 2:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.eq3_balancer_left);
                    float f = ((C7315l) interfaceC8714l.getValue()).f15168l;
                    boolean zBilling = c6956l4.billing(interfaceC8714l);
                    Object objM2132native2 = c6956l4.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C9922l(interfaceC8714l, 4);
                        c6956l4.m2147try(objM2132native2);
                    }
                    AbstractC11028l.mopub(strPurchase, "dB", f, (Function1) objM2132native2, null, c6956l4, 48);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 3:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l5, R.string.eq3_balancer_right);
                    float f2 = ((C7315l) interfaceC8714l.getValue()).f15169l;
                    boolean zBilling2 = c6956l5.billing(interfaceC8714l);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zBilling2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C9922l(interfaceC8714l, i5);
                        c6956l5.m2147try(objM2132native3);
                    }
                    AbstractC11028l.mopub(strPurchase2, "dB", f2, (Function1) objM2132native3, null, c6956l5, 48);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 4:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    boolean z = ((C7315l) interfaceC8714l.getValue()).f15171l;
                    boolean zBilling3 = c6956l6.billing(interfaceC8714l);
                    Object objM2132native4 = c6956l6.m2132native();
                    if (zBilling3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C9922l(interfaceC8714l, 3);
                        c6956l6.m2147try(objM2132native4);
                    }
                    AbstractC13402l.yandex(z, (Function1) objM2132native4, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), c6956l6, 384);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 5:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z2 = ((C7315l) interfaceC8714l.getValue()).f15170l;
                    boolean zBilling4 = c6956l7.billing(interfaceC8714l);
                    Object objM2132native5 = c6956l7.m2132native();
                    if (zBilling4 || objM2132native5 == c13863l) {
                        objM2132native5 = new C9922l(interfaceC8714l, 5);
                        c6956l7.m2147try(objM2132native5);
                    }
                    AbstractC11028l.admob(AbstractC14506l.crashlytics, AbstractC14506l.amazon, z2, (Function1) objM2132native5, c6956l7, 54);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 6:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean z3 = ((C7315l) interfaceC8714l.getValue()).f15172l;
                    boolean zBilling5 = c6956l8.billing(interfaceC8714l);
                    Object objM2132native6 = c6956l8.m2132native();
                    if (zBilling5 || objM2132native6 == c13863l) {
                        objM2132native6 = new C9922l(interfaceC8714l, 7);
                        c6956l8.m2147try(objM2132native6);
                    }
                    AbstractC11028l.admob(AbstractC14506l.purchase, AbstractC14506l.billing, z3, (Function1) objM2132native6, c6956l8, 54);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 7:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c6956l9.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_sound_wave_outline_28, 0, c6956l9), null, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0L, c6956l9, 440, 8);
                    InterfaceC17242l interfaceC17242lYandex = interfaceC15451l.yandex(c4346l, 1.0f, true);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(1.0f, true, new C8339l(12)), C18450l.f36046l, c6956l9, 6);
                    long j = c6956l9.f14595continue;
                    int i8 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l9, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l9, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l9, C3438l.firebase);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.eq2_presets), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l9, 0, 24576, 245758);
                    AbstractC13010l.loadAd(((C3554l) interfaceC8714l.getValue()).f7470l, null, ((C14370l) c6956l9.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l9, 0, 24960, 241658);
                    c6956l9.startapp(true);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l9), null, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0L, c6956l9, 440, 8);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 8:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    String strPurchase3 = AbstractC11999l.purchase(c6956l10, R.string.eq3_param_threshold);
                    float f3 = ((C1887l) interfaceC8714l.getValue()).f4314l;
                    String strPurchase4 = AbstractC11999l.purchase(c6956l10, R.string.eq3_units_db);
                    boolean zBilling6 = c6956l10.billing(interfaceC8714l);
                    Object objM2132native7 = c6956l10.m2132native();
                    if (zBilling6 || objM2132native7 == c13863l) {
                        objM2132native7 = new C9922l(interfaceC8714l, 22);
                        c6956l10.m2147try(objM2132native7);
                    }
                    AbstractC11028l.mopub(strPurchase3, strPurchase4, f3, (Function1) objM2132native7, null, c6956l10, 0);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 9:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    String strPurchase5 = AbstractC11999l.purchase(c6956l11, R.string.eq3_param_gain);
                    float f4 = ((C1887l) interfaceC8714l.getValue()).f4317l;
                    String strPurchase6 = AbstractC11999l.purchase(c6956l11, R.string.eq3_units_db);
                    boolean zBilling7 = c6956l11.billing(interfaceC8714l);
                    Object objM2132native8 = c6956l11.m2132native();
                    if (zBilling7 || objM2132native8 == c13863l) {
                        objM2132native8 = new C9922l(interfaceC8714l, 20);
                        c6956l11.m2147try(objM2132native8);
                    }
                    AbstractC11028l.mopub(strPurchase5, strPurchase6, f4, (Function1) objM2132native8, null, c6956l11, 0);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 10:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean z4 = ((C1887l) interfaceC8714l.getValue()).f4316l;
                    boolean zBilling8 = c6956l12.billing(interfaceC8714l);
                    Object objM2132native9 = c6956l12.m2132native();
                    if (zBilling8 || objM2132native9 == c13863l) {
                        objM2132native9 = new C9922l(interfaceC8714l, 17);
                        c6956l12.m2147try(objM2132native9);
                    }
                    AbstractC13402l.yandex(z4, (Function1) objM2132native9, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), c6956l12, 384);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 11:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    String strPurchase7 = AbstractC11999l.purchase(c6956l13, R.string.eq3_param_attack);
                    float f5 = ((C1887l) interfaceC8714l.getValue()).f4315l;
                    String strPurchase8 = AbstractC11999l.purchase(c6956l13, R.string.eq3_units_ms);
                    boolean zBilling9 = c6956l13.billing(interfaceC8714l);
                    Object objM2132native10 = c6956l13.m2132native();
                    if (zBilling9 || objM2132native10 == c13863l) {
                        objM2132native10 = new C9922l(interfaceC8714l, 19);
                        c6956l13.m2147try(objM2132native10);
                    }
                    AbstractC11028l.mopub(strPurchase7, strPurchase8, f5, (Function1) objM2132native10, null, c6956l13, 0);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 12:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    String strPurchase9 = AbstractC11999l.purchase(c6956l14, R.string.eq3_param_release);
                    float f6 = ((C1887l) interfaceC8714l.getValue()).f4318l;
                    String strPurchase10 = AbstractC11999l.purchase(c6956l14, R.string.eq3_units_ms);
                    boolean zBilling10 = c6956l14.billing(interfaceC8714l);
                    Object objM2132native11 = c6956l14.m2132native();
                    if (zBilling10 || objM2132native11 == c13863l) {
                        objM2132native11 = new C9922l(interfaceC8714l, i4);
                        c6956l14.m2147try(objM2132native11);
                    }
                    AbstractC11028l.mopub(strPurchase9, strPurchase10, f6, (Function1) objM2132native11, null, c6956l14, 0);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 13:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    String strPurchase11 = AbstractC11999l.purchase(c6956l15, R.string.eq3_param_ratio);
                    float f7 = ((C1887l) interfaceC8714l.getValue()).f4313l;
                    boolean zBilling11 = c6956l15.billing(interfaceC8714l);
                    Object objM2132native12 = c6956l15.m2132native();
                    if (zBilling11 || objM2132native12 == c13863l) {
                        objM2132native12 = new C9922l(interfaceC8714l, 21);
                        c6956l15.m2147try(objM2132native12);
                    }
                    AbstractC11028l.mopub(strPurchase11, "", f7, (Function1) objM2132native12, null, c6956l15, 48);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 14:
                C0275l c0275l = (C0275l) obj;
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= c6956l16.billing(c0275l) ? 4 : 2;
                }
                if (c6956l16.m2127for(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    boolean z5 = ((EnumC16913l) interfaceC8714l.getValue()) == EnumC16913l.SOCKS5;
                    Object objM2132native13 = c6956l16.m2132native();
                    if (objM2132native13 == c13863l) {
                        objM2132native13 = new C0289l(interfaceC8714l, 25);
                        c6956l16.m2147try(objM2132native13);
                    }
                    Function0 function0 = (Function0) objM2132native13;
                    C7069l c7069l = C7069l.yandex;
                    int i9 = (iIntValue15 & 14) | 384;
                    AbstractC17122l.crashlytics(c0275l, z5, function0, C7069l.crashlytics(0, 2, c6956l16), null, false, null, null, null, null, AbstractC11141l.adcel, c6956l16, i9, 1016);
                    boolean z6 = ((EnumC16913l) interfaceC8714l.getValue()) == EnumC16913l.HTTP;
                    Object objM2132native14 = c6956l16.m2132native();
                    if (objM2132native14 == c13863l) {
                        objM2132native14 = new C0289l(interfaceC8714l, 26);
                        c6956l16.m2147try(objM2132native14);
                    }
                    AbstractC17122l.crashlytics(c0275l, z6, (Function0) objM2132native14, C7069l.crashlytics(1, 2, c6956l16), null, false, null, null, null, null, AbstractC11141l.ads, c6956l16, i9, 1016);
                } else {
                    c6956l16.m2124else();
                }
                break;
            default:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l17, ((Boolean) interfaceC8714l.getValue()).booleanValue() ? R.string.tc_editor_picker : R.string.tc_editor_hex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l17, 0, 0, 262142);
                } else {
                    c6956l17.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
