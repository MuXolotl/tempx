package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4076l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8377l;

    public /* synthetic */ C4076l(int i) {
        this.f8377l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8377l;
        int i2 = 2;
        int i3 = 4;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l, 6, 30);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cache_library_delete_warning_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.ota_card_action_later), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.notification_permission_grant), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l6, R.string.not_header2), c6956l6, 0);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.settings_now_playing_blur_theme), AbstractC3605l.remoteconfig(c4346l, 16.0f, 4.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l7, 48, 0, 131068);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l8, R.string.settings_now_playing_category_artwork), c6956l8, 0);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l9, R.string.settings_now_playing_category_lyrics), c6956l9, 0);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l10, R.string.settings_now_playing_category_gestures), c6956l10, 0);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l11, R.string.settings_now_playing_category_other), c6956l11, 0);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                C4346l c4346l2 = C4346l.f8873l;
                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.startapp(c4346l2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                C10707l c10707l = AbstractC16964l.yandex;
                InterfaceC17242l interfaceC17242lLoadAd = AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242lAmazon, ((C14370l) c6956l12.isPro(c10707l)).crashlytics.amazon), ((C14370l) c6956l12.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), 1.0f, ((C14370l) c6956l12.isPro(c10707l)).yandex.premium, AbstractC7497l.yandex);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j = c6956l12.f14595continue;
                int i4 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l12.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l12, interfaceC17242lLoadAd);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l12.m2140super();
                if (c6956l12.f14603switch) {
                    c6956l12.firebase(c16395l);
                } else {
                    c6956l12.m2136protected();
                }
                C6415l c6415l = C3438l.mopub;
                AbstractC8182l.billing(c6956l12, interfaceC10835lAmazon, c6415l);
                C6415l c6415l2 = C3438l.billing;
                AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato, c6415l2);
                Integer numValueOf = Integer.valueOf(i4);
                C6415l c6415l3 = C3438l.isPro;
                AbstractC8182l.billing(c6956l12, numValueOf, c6415l3);
                C11192l c11192l = C3438l.firebase;
                AbstractC8182l.purchase(c6956l12, c11192l);
                C6415l c6415l4 = C3438l.amazon;
                AbstractC8182l.billing(c6956l12, interfaceC17242lBilling, c6415l4);
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l2, C18450l.f36043l), 0.0f, 4.0f, 1);
                C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l12, 6);
                long j2 = c6956l12.f14595continue;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l12.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l12, interfaceC17242lVip);
                c6956l12.m2140super();
                if (c6956l12.f14603switch) {
                    c6956l12.firebase(c16395l);
                } else {
                    c6956l12.m2136protected();
                }
                AbstractC8182l.billing(c6956l12, c5062lYandex, c6415l);
                AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato2, c6415l2);
                AbstractC8182l.billing(c6956l12, Integer.valueOf(i5), c6415l3);
                AbstractC8182l.purchase(c6956l12, c11192l);
                AbstractC8182l.billing(c6956l12, interfaceC17242lBilling2, c6415l4);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_previous, 0, c6956l12), null, AbstractC0080l.isPro(c4346l2, 16.0f), 0L, c6956l12, 440, 8);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_pause, 0, c6956l12), null, AbstractC0080l.isPro(c4346l2, 16.0f), 0L, c6956l12, 440, 8);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_next, 0, c6956l12), null, AbstractC0080l.isPro(c4346l2, 16.0f), 0L, c6956l12, 440, 8);
                c6956l12.startapp(true);
                c6956l12.startapp(true);
                break;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, R.string.settings_now_playing_blur_thickness), AbstractC3605l.remoteconfig(c4346l, 16.0f, 4.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l13.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l13, 48, 0, 131068);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.settings_crossfade_beta), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 14:
                C13450l c13450l = (C13450l) obj;
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= c6956l15.billing(c13450l) ? 4 : 2;
                }
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    C12371l.loadAd(c13450l.loadAd, AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l15, 25008, 232);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC9334l.yandex(c6956l16, AbstractC0080l.purchase(c4346l, 8.0f));
                } else {
                    c6956l16.m2124else();
                }
                break;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, ((C18718l) c6956l17.isPro(AbstractC5992l.yandex)).amazon, c6956l17, 0, 3);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC9334l.yandex(c6956l18, AbstractC0080l.purchase(c4346l, 24.0f));
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l19, 0, 7);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l20, 48);
                    long j3 = c6956l20.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l20.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l20, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l20.m2140super();
                    if (c6956l20.f14603switch) {
                        c6956l20.firebase(c16395l2);
                    } else {
                        c6956l20.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l20, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l20, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l20, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l20, C3438l.firebase);
                    AbstractC8182l.billing(c6956l20, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, R.string.settings_integrations_lyrics_provider), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l20), null, null, 0L, c6956l20, 56, 12);
                    c6956l20.startapp(true);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_share_outline_28, 0, c6956l21), null, AbstractC0080l.isPro(c4346l, 24.0f), 0L, c6956l21, 440, 8);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j4 = c6956l22.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l22.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l22, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l22.m2140super();
                    if (c6956l22.f14603switch) {
                        c6956l22.firebase(c16395l3);
                    } else {
                        c6956l22.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l22, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l22, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l22, Integer.valueOf(i7), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l22, C3438l.firebase);
                    AbstractC8182l.billing(c6956l22, interfaceC17242lBilling4, C3438l.amazon);
                    Unit unit = Unit.INSTANCE;
                    Object objM2132native = c6956l22.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C18160l(i2, null, i3);
                        c6956l22.m2147try(objM2132native);
                    }
                    AbstractC12311l.amazon(c6956l22, unit, (Function2) objM2132native);
                    AbstractC8960l.loadAd(null, ((C18718l) c6956l22.isPro(AbstractC5992l.yandex)).loadAd, null, c6956l22, 0, 5);
                    c6956l22.startapp(true);
                } else {
                    c6956l22.m2124else();
                }
                break;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, R.string.ny25_view_playlist), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l23, 0, 0, 262142);
                } else {
                    c6956l23.m2124else();
                }
                break;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.ny25_save_playlist), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l24, 0, 0, 262142);
                } else {
                    c6956l24.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String str = (String) obj;
                C6956l c6956l25 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= c6956l25.billing(str) ? 4 : 2;
                }
                if (c6956l25.m2127for(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    AbstractC13010l.loadAd(str, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, C6886l.f14420l, AbstractC1193l.crashlytics, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l25.isPro(AbstractC16964l.yandex)).loadAd.admob, c6956l25, (iIntValue24 & 14) | 14155824, 0, 129852);
                } else {
                    c6956l25.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l26 = (C6956l) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                if (c6956l26.m2127for(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC2991l.yandex(AbstractC11999l.purchase(c6956l26, R.string.settings_proxy_servers), c6956l26, 0);
                } else {
                    c6956l26.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l27 = (C6956l) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                if (c6956l27.m2127for(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l27, R.string.settings_proxy_servers_remove), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l27, 0, 0, 262142);
                } else {
                    c6956l27.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l28 = (C6956l) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if (c6956l28.m2127for(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l28, R.string.settings_proxy_add_dismiss), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l28, 0, 0, 262142);
                } else {
                    c6956l28.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l29 = (C6956l) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                if (c6956l29.m2127for(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l29, R.string.settings_proxy_add_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l29, 0, 0, 262142);
                } else {
                    c6956l29.m2124else();
                }
                break;
            default:
                C6956l c6956l30 = (C6956l) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                if (c6956l30.m2127for(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l30, R.string.settings_proxy_add_dismiss), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l30, 0, 0, 262142);
                } else {
                    c6956l30.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
