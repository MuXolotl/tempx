package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7277l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15118l;

    public /* synthetic */ C7277l(int i) {
        this.f15118l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15118l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.settings_autostart_header), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.settings_crossfade), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC11621l.loadAd(null, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l2.isPro(c10707l)).yandex.loadAd, AbstractC15011l.purchase, c6956l2, 3072);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.settings_crossfade_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.st_refresh), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.st_refresh_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.lyrics_podcast), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l6, 0, 24960, 241662);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                boolean z = false;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if ((iIntValue7 & 3) != 2) {
                    z = true;
                }
                if (c6956l7.m2127for(iIntValue7 & 1, z)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), null, null, 0L, c6956l7, 48, 12);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                boolean z2 = false;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if ((iIntValue8 & 3) != 2) {
                    z2 = true;
                }
                if (c6956l8.m2127for(iIntValue8 & 1, z2)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), null, null, 0L, c6956l8, 48, 12);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_link, 0, c6956l9), null, null, 0L, c6956l9, 56, 12);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_search_outline_28, 0, c6956l10), null, AbstractC0080l.isPro(c4346l, 20.0f), 0L, c6956l10, 440, 8);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.search_hint_2), AbstractC15788l.yandex(c4346l, 0.5f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 48, 0, 262140);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                boolean z3 = false;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if ((iIntValue12 & 3) != 2) {
                    z3 = true;
                }
                if (c6956l12.m2127for(iIntValue12 & 1, z3)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l12, R.string.talkback_back), null, 0L, c6956l12, 0, 12);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.private_mode), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.orbit_picker_local), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_smartphone_outline_28, 0, c6956l15), null, null, 0L, c6956l15, 56, 12);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.library_vkm_sub_upsell), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 0, 0, 262142);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l17, R.string.show_qr_dialog_hint), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l17, 0, 0, 262142);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_error_outline_28, 0, c6956l18), null, null, 0L, c6956l18, 56, 12);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    AbstractC13010l.loadAd("Отчеты об ошибках", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 6, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.quickfix_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                boolean z4 = false;
                C6956l c6956l21 = (C6956l) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if ((iIntValue21 & 3) != 2) {
                    z4 = true;
                }
                if (c6956l21.m2127for(iIntValue21 & 1, z4)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l21, R.string.talkback_back), null, 0L, c6956l21, 0, 12);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, R.string.oc_reports_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l22, 0, 0, 262142);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_bug_outline_28, 0, c6956l23), null, null, 0L, c6956l23, 56, 12);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l24), null, null, 0L, c6956l24, 56, 12);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l25, R.string.configure_recommendations), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l25, 0, 0, 262142);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l26, R.string.configure_recommendations_subtitle), AbstractC15788l.yandex(c4346l, 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l26.isPro(AbstractC16964l.yandex)).loadAd.subs, c6956l26, 48, 0, 131068);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                boolean z5 = false;
                C6956l c6956l27 = (C6956l) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if ((iIntValue27 & 3) != 2) {
                    z5 = true;
                }
                if (c6956l27.m2127for(iIntValue27 & 1, z5)) {
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l27, R.string.talkback_back), null, 0L, c6956l27, 0, 12);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (c6956l28.m2127for(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_search_outline_28, 0, c6956l28), null, AbstractC0080l.isPro(c4346l, 20.0f), 0L, c6956l28, 440, 8);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (c6956l29.m2127for(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l29, R.string.search_hint_2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l29, 0, 0, 262142);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!c6956l30.m2127for(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
