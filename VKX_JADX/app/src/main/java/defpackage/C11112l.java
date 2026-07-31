package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11112l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22320l;

    public /* synthetic */ C11112l(int i) {
        this.f22320l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f22320l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(AbstractC10409l.purchase(c4346l), 1.0f), 16.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_add_outline_28, 0, c6956l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 56, 4);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 16.0f));
                    C10092l c10092lStartapp = AbstractC5020l.startapp(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, AbstractC12502l.yandex);
                    C8540l c8540l = AbstractC13010l.yandex;
                    AbstractC10478l.loadAd(new C10092l[]{c10092lStartapp, c8540l.yandex(((C11090l) c6956l.isPro(c8540l)).purchase(((C14370l) c6956l.isPro(c10707l)).loadAd.admob))}, AbstractC5103l.metrica, c6956l, 56);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.error_occurred_info), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.settings_experimental_warning), AbstractC3605l.smaato(c4346l, 16.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 262140);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC2991l.crashlytics(AbstractC8619l.adcel.yandex, R.string.settings_experimental_reduce_wakelocks, R.string.settings_experimental_reduce_wakelocks_desc, false, true, null, c6956l4, 27648, 32);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC2991l.crashlytics(AbstractC8619l.ads.yandex, R.string.settings_experimental_offload, R.string.settings_experimental_offload_desc, false, true, null, c6956l5, 27648, 32);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.ic_services_outline_28, 0, c6956l6);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC2991l.crashlytics("libvkx_libcatalog", R.string.libvkx_libcache_pref, R.string.libvkx_libcache_pref_desc, false, false, null, c6956l7, 3078, 48);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, R.string.libvkx), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l8.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 48, 0, 262136);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.confirm_act), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, R.string.downloader_saf_picker_dialog_dismiss), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l10, 0, 0, 262142);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l11, 6, 30);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.auth2_qr_code_camera_permission_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 0, 0, 262142);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.widgets_settings_background), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l14.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 48, 0, 262136);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.external_header_s), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l15.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 48, 0, 262136);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.tp_header_shortcuts), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l16.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 48, 0, 262136);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC2991l.crashlytics("shortcuts_shuffle", R.string.tp_shortcuts_shuffle, R.string.tp_shortcuts_shuffle_desc, false, false, null, c6956l17, 3078, 48);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, R.string.intro_login), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_qr_code_outline_28, 0, c6956l20), null, null, 0L, c6956l20, 56, 12);
                    AbstractC9334l.yandex(c6956l20, AbstractC0080l.vip(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.auth2_qr_code_act_auth), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l21, R.string.intro_login_skip), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 0, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, R.string.auth2_acc_manager_delete_confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l22, 0, 0, 262142);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, R.string.auth2_acc_manager_delete_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l23, 0, 0, 262142);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC13010l.loadAd("Telegram", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l24, 6, 0, 262142);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.ic_picture_outline_28, 0, c6956l25);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC2991l.crashlytics("download_use_itunes_tagging", R.string.additional_tagging_itunes, R.string.additional_tagging_itunes_desc, false, false, null, c6956l26, 3078, 48);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l27, R.string.external_itunes_desc_full);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l27.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l27.isPro(c10707l2)).loadAd.vip, c6956l27, 48, 0, 131064);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC2991l.crashlytics("playback_allowlastfm_broadcast", R.string.st_lfm_np, R.string.st_lfm_np_desc, false, false, null, c6956l28, 3078, 48);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    C11489l.yandex.getClass();
                    AbstractC2991l.purchase(C11489l.admob, false, null, null, c6956l29, 0, 14);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                if (c6956l30.m2127for(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    C11489l.yandex.getClass();
                    AbstractC2991l.purchase(C11489l.subs, false, null, null, c6956l30, 0, 14);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
