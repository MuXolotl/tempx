package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.Concert;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٍٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8918l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18374l;

    public /* synthetic */ C8918l(int i) {
        this.f18374l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f18374l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.external_lastfm_desc_full);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.vip, c6956l, 48, 0, 131064);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.ic_live_outline_28, 0, c6956l3);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.external_lastfm_types), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 48, 0, 262136);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC2991l.crashlytics("playback_allowlastfm", R.string.st_lfm_scrobble, R.string.st_lfm_scrobble_desc, false, false, null, c6956l5, 3078, 48);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.eq3_legacy_bass_boost_warning_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.eq3_legacy_value), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, R.string.eq3_legacy_value), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(12.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 12.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l9, 54);
                    long j = c6956l9.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l9, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l9, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l9, C3438l.firebase);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_search_outline_28, 0, c6956l9);
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 22.0f);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, interfaceC17242lIsPro, ((C14370l) c6956l9.isPro(c10707l2)).yandex.subscription, c6956l9, 440, 0);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, R.string.search_hint_my), null, ((C14370l) c6956l9.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262138);
                    c6956l9.startapp(true);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                Concert concert = (Concert) obj;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= (iIntValue10 & 8) == 0 ? c6956l10.billing(concert) : c6956l10.admob(concert) ? 4 : 2;
                }
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    AbstractC3836l.loadAd(concert, c6956l10, (iIntValue10 & 14) | 8);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                Concert concert2 = (Concert) obj;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= (iIntValue11 & 8) == 0 ? c6956l11.billing(concert2) : c6956l11.admob(concert2) ? 4 : 2;
                }
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    AbstractC3836l.yandex(concert2, null, c6956l11, (iIntValue11 & 14) | 8, 2);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                CatalogArtist catalogArtist = (CatalogArtist) obj;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= (iIntValue12 & 8) == 0 ? c6956l12.billing(catalogArtist) : c6956l12.admob(catalogArtist) ? 4 : 2;
                }
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    AbstractC16829l.yandex(catalogArtist, c6956l12, (iIntValue12 & 14) | 8);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.library_mass_action_start), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, R.string.alert_close), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 0, 0, 262142);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.privacy_cfg_qs), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), ((C14370l) c6956l16.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l16, 48, 0, 262136);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l17, 0);
                    long j2 = c6956l17.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l17.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l17, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l17.m2140super();
                    if (c6956l17.f14603switch) {
                        c6956l17.firebase(c16395l2);
                    } else {
                        c6956l17.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l17, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l17, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l17, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l17, C3438l.firebase);
                    AbstractC8182l.billing(c6956l17, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics2 = AbstractC16759l.crashlytics(R.drawable.ic_info_outline_28, 0, c6956l17);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics2, null, null, ((C14370l) c6956l17.isPro(c10707l3)).yandex.subscription, c6956l17, 56, 4);
                    AbstractC9334l.yandex(c6956l17, AbstractC0080l.purchase(c4346l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l17, R.string.privacy_cfg_hint), null, ((C14370l) c6956l17.isPro(c10707l3)).yandex.subscription, AbstractC7039l.isPro(14), null, null, null, 0L, null, AbstractC7039l.isPro(18), 0, false, 0, 0, null, c6956l17, 24576, 48, 260074);
                    c6956l17.startapp(true);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.settings_integrations_lyrics_provider), AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l18.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 48, 0, 262136);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l19, 0, 7);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC2991l.crashlytics("download_use_genius_tagging", R.string.additional_tagging_genius, R.string.additional_tagging_genius_desc, false, false, null, c6956l20, 3078, 48);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l21, R.string.lyrics_share), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 0, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 0.0f, 16.0f, 1), 0.0f, 0L, c6956l22, 6, 6);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC0555l.loadAd(AbstractC3605l.smaato(c4346l, 16.0f), 0.0f, 0L, c6956l23, 6, 6);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.exit_with_changes_dialog_action_confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l24, 0, 0, 262142);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l25.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l25, R.string.exit_with_changes_dialog_action_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l25, 0, 0, 262142);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l26, R.string.edit_audio_apply), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l26, 0, 0, 262142);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    int i4 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC11184l.remoteconfig, null, null, AbstractC11184l.vip, AbstractC11184l.metrica, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l27, 510), c6956l27, 27654, 422);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l28, 6, 30);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l29, R.string.fake_catalog_albums);
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, interfaceC17242lSmaato2, ((C14370l) c6956l29.isPro(c10707l4)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l29.isPro(c10707l4)).loadAd.admob, c6956l29, 48, 0, 131064);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                if (c6956l30.m2127for(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    String strPurchase3 = AbstractC11999l.purchase(c6956l30, R.string.fake_catalog_tracks);
                    InterfaceC17242l interfaceC17242lSmaato3 = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase3, interfaceC17242lSmaato3, ((C14370l) c6956l30.isPro(c10707l5)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l30.isPro(c10707l5)).loadAd.admob, c6956l30, 48, 0, 131064);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
