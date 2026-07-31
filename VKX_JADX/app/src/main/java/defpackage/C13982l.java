package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13982l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27281l;

    public /* synthetic */ C13982l(int i) {
        this.f27281l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f27281l;
        C9946l c9946l = AbstractC16837l.yandex;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cdcm_receiver_info_progress), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.cdcm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_smartphone_outline_28, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex);
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC4927l.amazon(interfaceC17242lCrashlytics, C9735l.loadAd(0.25f, ((C14370l) c6956l5.isPro(c10707l)).yandex.yandex), c9946l), 8.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l5.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l5.isPro(c10707l)).yandex.yandex, AbstractC12502l.yandex), C17423l.firebase, c6956l5, 56);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l6, R.string.talkback_back), null, 0L, c6956l6, 0, 12);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, R.string.cdcm_sender_info_progress), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, R.string.cdcm_wizard_intro_important_eta_short), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l10, 0, 0, 262142);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.warning_triangle_outline_28, 0, c6956l11), null, null, 0L, c6956l11, 56, 12);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.icon_cfg), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 0, 0, 262142);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l13, R.string.talkback_back), null, 0L, c6956l13, 0, 12);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l14), null, null, ((C9735l) c6956l14.isPro(AbstractC12502l.yandex)).yandex, c6956l14, 56, 4);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.lng_override), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 0, 0, 262142);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l16, R.string.talkback_back), null, 0L, c6956l16, 0, 12);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l17), null, null, ((C9735l) c6956l17.isPro(AbstractC12502l.yandex)).yandex, c6956l17, 56, 4);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.lng_override_default), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242lCrashlytics2, AbstractC12953l.firebase(C9735l.loadAd(0.5f, ((C14370l) c6956l19.isPro(c10707l2)).yandex.yandex), ((C14370l) c6956l19.isPro(c10707l2)).yandex.ads), c9946l);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l19.f14595continue;
                    int i3 = (int) ((j2 >>> 32) ^ j2);
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l19.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l19, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l19.m2140super();
                    if (c6956l19.f14603switch) {
                        c6956l19.firebase(c16395l2);
                    } else {
                        c6956l19.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l19, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l19, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l19, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l19, C3438l.firebase);
                    AbstractC8182l.billing(c6956l19, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_lock_outline_16, 0, c6956l19), null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 24.0f), 4.0f), 0L, c6956l19, 440, 8);
                    c6956l19.startapp(true);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.also_delete_from_cache), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_download_outline_28, 0, c6956l21), null, null, 0L, c6956l21, 56, 12);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    AbstractC17307l.billing(null, 0, 0L, 0L, 0, 40.0f, false, null, null, null, c6956l22, 196614, 990);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_close, 0, c6956l23), null, null, 0L, c6956l23, 56, 12);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    C14855l c14855l = C18450l.f36026l;
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l, false);
                    long j3 = c6956l24.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l24.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l24, interfaceC17242lCrashlytics3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l24.m2140super();
                    if (c6956l24.f14603switch) {
                        c6956l24.firebase(c16395l3);
                    } else {
                        c6956l24.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l24, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l24, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l24, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l24, C3438l.firebase);
                    AbstractC8182l.billing(c6956l24, interfaceC17242lBilling3, C3438l.amazon);
                    C16170l c16170l = C16170l.yandex;
                    AbstractC0555l.loadAd(c16170l.yandex(c4346l, c14855l), 0.0f, 0L, c6956l24, 0, 6);
                    String strPurchase = AbstractC11999l.purchase(c6956l24, R.string.settings_nothing_playing);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, c16170l.yandex(c4346l, C18450l.f36043l), ((C14370l) c6956l24.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l24.isPro(c10707l3)).loadAd.firebase, c6956l24, 0, 0, 131064);
                    c6956l24.startapp(true);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (c6956l27.m2127for(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l27, R.string.eq3_section_compressor), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l27, 0, 0, 262142);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (c6956l28.m2127for(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l28, R.string.talkback_back), null, 0L, c6956l28, 0, 12);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (c6956l29.m2127for(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l29, R.string.eq3_compressor_advanced), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l29, 0, 0, 262142);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (c6956l30.m2127for(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l30, R.string.eq3_compressor_advanced_description), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l30, 0, 0, 262142);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
