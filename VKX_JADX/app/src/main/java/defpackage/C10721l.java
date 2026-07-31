package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import ealvatag.tag.datatype.DataTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَۧؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10721l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21731l;

    public /* synthetic */ C10721l(int i) {
        this.f21731l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f21731l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC2991l.crashlytics("downloader_add_album_to_fn", R.string.downloader_prefs_add_album_to_filename, R.string.downloader_prefs_add_album_to_filename_desc, true, false, null, c6956l, 3078, 48);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.lyrics_share_lines), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_copy_outline_28, 0, c6956l7), AbstractC11999l.purchase(c6956l7, R.string.lyrics_copy), null, 0L, c6956l7, 8, 12);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC13010l.loadAd("OK", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 6, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.tc_editor_reset), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (!c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.ic_qr_code_outline_28, 0, c6956l11), null, 0L, c6956l11, 56, 12);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.ic_pincode_lock_outline_28, 0, c6956l12), null, 0L, c6956l12, 56, 12);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC11282l.loadAd("Authorize", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l13, 6, 0, 131070);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l14), AbstractC0080l.isPro(c4346l, AbstractC14927l.amazon), 0L, c6956l14, 56, 8);
                    AbstractC9334l.yandex(c6956l14, AbstractC0080l.isPro(c4346l, AbstractC14927l.purchase));
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.mab_play), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l14, 0, 0, 131070);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    C0086l c0086l = C18450l.f36040l;
                    int i2 = 12;
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(i2));
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l15, 54);
                    long j = c6956l15.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l15.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l15, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l15.m2140super();
                    if (c6956l15.f14603switch) {
                        c6956l15.firebase(c16395l);
                    } else {
                        c6956l15.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l15, c5062lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l15, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l15, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l15, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l15, interfaceC17242lBilling, c6415l4);
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.warning_triangle_outline_28, 0, c6956l15), null, 0L, c6956l15, 56, 12);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(i2)), C18450l.f36046l, c6956l15, 6);
                    long j2 = c6956l15.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l15.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l15, c4346l);
                    c6956l15.m2140super();
                    if (c6956l15.f14603switch) {
                        c6956l15.firebase(c16395l);
                    } else {
                        c6956l15.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l15, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l15, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l15, c6415l3, c6956l15, c11192l);
                    AbstractC8182l.billing(c6956l15, interfaceC17242lBilling2, c6415l4);
                    String strPurchase = AbstractC11999l.purchase(c6956l15, R.string.tv_intro_warn1);
                    C10707l c10707l = AbstractC3459l.yandex;
                    AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l15.isPro(c10707l)).firebase, c6956l15, 0, 0, 65534);
                    AbstractC0555l.loadAd(null, 0.0f, ((C10936l) c6956l15.isPro(AbstractC10689l.yandex)).yandex(), c6956l15, 0, 3);
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.tv_intro_warn2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l15.isPro(c10707l)).firebase, c6956l15, 0, 0, 65534);
                    c6956l15.startapp(true);
                    c6956l15.startapp(true);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.ic_user_add_outline_28, 0, c6956l16), AbstractC0080l.isPro(c4346l, AbstractC14927l.amazon), 0L, c6956l16, 56, 8);
                    AbstractC9334l.yandex(c6956l16, AbstractC0080l.isPro(c4346l, AbstractC14927l.purchase));
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.tv_intro_btn_sign), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l16, 0, 0, 131070);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l17, R.string.tv_intro_btn_license), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l17, 0, 0, 131070);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.tv_nag_btn), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l18, 0, 0, 131070);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC11282l.loadAd("Pause", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l19, 6, 0, 131070);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC11282l.loadAd("Prev", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l20, 6, 0, 131070);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC11282l.loadAd("Next", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l21, 6, 0, 131070);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC11282l.loadAd(DataTypes.OBJ_LYRICS, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l22, 6, 0, 131070);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                InterfaceC4277l interfaceC4277l = (InterfaceC4277l) obj;
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= c6956l23.billing(interfaceC4277l) ? 4 : 2;
                }
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    C10707l c10707l2 = AbstractC10689l.yandex;
                    AbstractC7741l.purchase(null, null, interfaceC4277l.yandex(AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 52.0f), ((C0260l) c6956l23.isPro(AbstractC14696l.yandex)).crashlytics), C18450l.f36043l), new C18627l(((C10936l) c6956l23.isPro(c10707l2)).yandex()), new C18627l(((C10936l) c6956l23.isPro(c10707l2)).yandex()), null, c6956l23, 36918, 0, 32736);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.tv_qrview_ok), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l24, 0, 0, 131070);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.ic_external_link_outline_24, 0, c6956l25), AbstractC0080l.isPro(c4346l, AbstractC14927l.amazon), 0L, c6956l25, 56, 8);
                    AbstractC9334l.yandex(c6956l25, AbstractC0080l.isPro(c4346l, AbstractC14927l.purchase));
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l25, R.string.tv_qrview_op), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l25, 0, 0, 131070);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (!c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l27, R.string.tv_splash_long), null, ((C10936l) c6956l27.isPro(AbstractC10689l.yandex)).billing(), 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l27.isPro(AbstractC3459l.yandex)).firebase, c6956l27, 0, 0, 65530);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l28, 0, 7);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.uma_header_mix_type_description, new Object[]{AbstractC11999l.purchase(c6956l29, R.string.uma_header_mix_type_vk)}, c6956l29), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 8.0f, 5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l29.isPro(AbstractC16964l.yandex)).loadAd.isPro, c6956l29, 48, 0, 131068);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l30.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l30, R.string.alert_close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l30, 0, 0, 262142);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
