package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.net.SocketTimeoutException;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11813l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23647l;

    public /* synthetic */ C11813l(int i) {
        this.f23647l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f23647l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.edit_audio_apply), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l3, 54);
                    long j = c6956l3.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_document_outline_28, 0, c6956l3), AbstractC11999l.purchase(c6956l3, R.string.upload_track_btn), null, 0L, c6956l3, 8, 12);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.upload_track_btn), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC2991l.amazon("meme_block_explicit", "По explicit-тегу", null, c6956l4, 3126);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    Object objM2132native = c6956l5.m2132native();
                    int i3 = 15;
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C11200l(i3);
                        c6956l5.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(C10053l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, C10053l.purchase, null, null, c6956l5, 24582, 492);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC2991l.amazon("meme_block_legal_notices", "Скрывать \"метку качества\" на страницах исполнителей", null, c6956l6, 3126);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC2991l.amazon("meme_block_names", "в названии", null, c6956l7, 3126);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC2991l.amazon("meme_block_art", "в названии исполнителей", null, c6956l8, 3126);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC2991l.amazon("meme_block_alb", "в названии альбомов", null, c6956l9, 3126);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l10), null, null, 0L, c6956l10, 56, 12);
                    AbstractC9334l.yandex(c6956l10, AbstractC0080l.vip(c4346l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l10, 0, 24576, 245758);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.logo_vk_music_outline_24, 0, c6956l11);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l12, R.string.lvm_pref_desc);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l12.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l12.isPro(c10707l)).loadAd.vip, c6956l12, 48, 0, 131064);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC0441l.yandex(R.drawable.history_backward_outline_28, 0, c6956l13);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC2991l.crashlytics("analytics_vk", R.string.analytics_vk, 0, true, false, null, c6956l14, 3078, 52);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l15, R.string.external_vkrecomm_desc_full);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l15.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l15.isPro(c10707l2)).loadAd.vip, c6956l15, 48, 0, 131064);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l16), null, null, 0L, c6956l16, 56, 12);
                    AbstractC9334l.yandex(c6956l16, AbstractC0080l.vip(c4346l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l16, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l16, 0, 24576, 245758);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    String strPurchase3 = AbstractC11999l.purchase(c6956l17, R.string.ota_card_beta);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase3, AbstractC3605l.smaato(c4346l, 16.0f), ((C14370l) c6956l17.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l17.isPro(c10707l3)).loadAd.firebase, c6956l17, 48, 0, 131064);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, R.string.ota_card_action_later), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l19 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, R.string.ota_card_action_update), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l20, 54);
                    long j2 = c6956l20.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l20.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l20, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l20.m2140super();
                    if (c6956l20.f14603switch) {
                        c6956l20.firebase(c16395l2);
                    } else {
                        c6956l20.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l20, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l20, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l20, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l20, C3438l.firebase);
                    AbstractC8182l.billing(c6956l20, interfaceC17242lBilling2, C3438l.amazon);
                    String strPurchase4 = AbstractC11999l.purchase(c6956l20, R.string.ota_card_failed_direct_link);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase4, null, ((C14370l) c6956l20.isPro(c10707l4)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l20.isPro(c10707l4)).loadAd.firebase, c6956l20, 0, 0, 131066);
                    AbstractC9334l.yandex(c6956l20, new C9247l(1.0f, true));
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_link_outline_28, 0, c6956l20), null, null, ((C14370l) c6956l20.isPro(c10707l4)).yandex.adcel, c6956l20, 56, 4);
                    c6956l20.startapp(true);
                } else {
                    c6956l20.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C6956l c6956l21 = (C6956l) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l21, R.string.ota_card_action_later), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 0, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C6956l c6956l22 = (C6956l) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, R.string.ota_card_permission_gave), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l22, 0, 0, 262142);
                } else {
                    c6956l22.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C6956l c6956l23 = (C6956l) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, R.string.ota_card_permission_gave), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l23, 0, 0, 262142);
                } else {
                    c6956l23.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                C6956l c6956l24 = (C6956l) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if (c6956l24.m2127for(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l24, R.string.ota_card_permission_give), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l24, 0, 0, 262142);
                } else {
                    c6956l24.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj3).getClass();
                ((InterfaceC5289l) ((C18625l) obj).loadAd).yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), (C6956l) obj2, 6);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                Throwable th = (Throwable) obj3;
                C11911l c11911l = AbstractC7891l.yandex;
                Throwable thPurchase = AbstractC15852l.purchase(th);
                return Boolean.valueOf(((thPurchase instanceof AbstractC6713l) || (thPurchase instanceof C2739l) || (thPurchase instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int i5 = ((AbstractC10022l) obj3).mopub().f5987l;
                return Boolean.valueOf(500 <= i5 && i5 < 600);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
                C6956l c6956l25 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l25.m2123default(216864039);
                WeakHashMap weakHashMap = C12923l.pro;
                C9297l c9297l = C6760l.smaato(c6956l25).crashlytics;
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l25.isPro(AbstractC4751l.admob);
                float fMo872static = interfaceC13490l.mo872static(c9297l.crashlytics(interfaceC13490l)) - 16.0f;
                InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(interfaceC17242l, 0.0f, 0.0f, 0.0f, fMo872static < 0.0f ? 0.0f : fMo872static, 7);
                c6956l25.startapp(false);
                return interfaceC17242lStartapp;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).intValue();
                ((Long) obj3).longValue();
                return Unit.INSTANCE;
            default:
                ((Integer) obj3).getClass();
                AbstractC16759l.yandex.invoke((C6956l) obj2, 0);
                return Unit.INSTANCE;
        }
    }
}
