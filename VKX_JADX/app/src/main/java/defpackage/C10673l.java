package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10673l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21664l;

    public /* synthetic */ C10673l(int i) {
        this.f21664l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f21664l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.widget_glance_recommendations_preferences_source);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.vip, c6956l, 48, 0, 131064);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                C7552l c7552l = new C7552l(R.drawable.player_play);
                InterfaceC12001l interfaceC12001lCrashlytics = AbstractC2812l.crashlytics(new C8079l(new C9402l(28.0f)), new C4538l(new C9402l(28.0f)));
                C10707l c10707l2 = AbstractC9404l.purchase;
                C10053l.yandex(c7552l, null, interfaceC12001lCrashlytics, 0, new C2607l(new C12922l(((C16592l) c6956l3.isPro(c10707l2)).tapsense)), c6956l3, 32816, 8);
                String string = ((Context) c6956l3.isPro(AbstractC9404l.loadAd)).getString(R.string.open_vkx);
                C12373l c12373l = new C12373l(((C16592l) c6956l3.isPro(c10707l2)).tapsense, null, null, 126);
                float f = (2 & 1) != 0 ? 0.0f : 8.0f;
                float f2 = (2 & 2) == 0 ? 8.0f : 0.0f;
                AbstractC16570l.yandex(string, new C1491l(AbstractC17307l.remoteconfig(f), AbstractC17307l.remoteconfig(f2), AbstractC17307l.remoteconfig(f), AbstractC17307l.remoteconfig(f2)), c12373l, 0, c6956l3, 0, 8);
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.spark_code_entry_button), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    C17857l c17857l = AbstractC16434l.yandex;
                    AbstractC9383l.yandex(C18158l.f35556l, c6956l5, 6);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC7209l.yandex(null, false, 0L, c6956l6, 0, 7);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC7209l.yandex(null, false, 0L, c6956l7, 0, 7);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.plus_spark_window_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, R.string.spark_refresh), AbstractC0080l.amazon(c4346l, 1.0f), ((C9735l) c6956l10.isPro(AbstractC12502l.yandex)).yandex, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l10, 48, 0, 261112);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.plus_disclaimer), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l11.isPro(AbstractC16964l.yandex)).loadAd.smaato, c6956l11, 0, 0, 131070);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, R.string.fc_usagepolicy), AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 48, 0, 262140);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    int i2 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC12300l.yandex, null, null, AbstractC12300l.loadAd, null, AbstractC12300l.crashlytics, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l13, 510), c6956l13, 199686, 406);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.spark_payment_invoked_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.spark_payment_window_target_selector_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 0, 0, 262142);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.spark_payment_window_target_selector_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 0, 0, 262142);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    int i3 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC10310l.yandex, null, null, AbstractC10310l.loadAd, null, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l17, 510), c6956l17, 3078, 438);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.alert_close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, R.string.close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l20, R.string.odin_tab_library), c6956l20, 0);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l21, R.string.cache_ch), c6956l21, 0);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC2991l.loadAd(null, c6956l22, 24582);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC2991l.crashlytics("cache_invert_add_order", R.string.cache_v2_pref_totop, R.string.cache_v2_pref_totop_desc, false, false, null, c6956l23, 3078, 48);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC2991l.crashlytics("unified_skip_errors", R.string.cache_ignore_errors, R.string.cache_ignore_errors_desc, false, false, null, c6956l24, 3078, 48);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l25, R.string.pb_header), c6956l25, 0);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC2991l.crashlytics("download_add_id3", R.string.download_tag, R.string.add_id3_desc, true, false, null, c6956l26, 3078, 48);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC2991l.crashlytics("download_add_counter", R.string.download_tag_multiple, R.string.download_tag_multiple_summary, true, false, null, c6956l27, 3078, 48);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC2991l.crashlytics("downloader_invorder_pl", R.string.inv_playlist_downorder, 0, false, false, null, c6956l28, 3078, 52);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC2991l.crashlytics("downloader_overwrite_existing", R.string.downloader_prefs_overwrite_existing, 0, true, false, null, c6956l29, 3078, 52);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l30.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    AbstractC2991l.crashlytics("dl_sp_folder", R.string.dl_playlist_folders, R.string.dl_playlist_folders_desc, true, false, null, c6956l30, 3078, 48);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
