package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؕۤۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3755l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7838l;

    public /* synthetic */ C3755l(int i) {
        this.f7838l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7838l;
        C4346l c4346l = C4346l.f8873l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC11028l.billing((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC11028l.subs((C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 2:
                return Character.valueOf(((CharSequence) obj).charAt(((Integer) obj2).intValue()));
            case 3:
                C9967l c9967l = (C9967l) obj;
                if (c9967l != null) {
                    c9967l.crashlytics(AbstractC10026l.yandex.admob() + AbstractC5852l.loadAd);
                }
                return Unit.INSTANCE;
            case 4:
                C9967l c9967l2 = (C9967l) obj;
                C0380l c0380l = (C0380l) obj2;
                if (c9967l2 != null) {
                    c9967l2.amazon(AbstractC5852l.yandex);
                }
                if (c9967l2 != null) {
                    c9967l2.crashlytics(AbstractC10026l.yandex.admob() + AbstractC5852l.loadAd);
                }
                if (c0380l != null) {
                    c0380l.setStatusbarHeight(AbstractC5852l.yandex);
                }
                return Unit.INSTANCE;
            case 5:
                ((C5500l) obj).crashlytics = (InterfaceC12001l) obj2;
                return Unit.INSTANCE;
            case 6:
                ((C5500l) obj).amazon = (C9224l) obj2;
                return Unit.INSTANCE;
            case 7:
                return Character.valueOf(((C17721l) obj).yandex.charAt(((Integer) obj2).intValue()));
            case 8:
                return new C17848l(((C8119l) obj).yandex.loadAd, (List) obj2);
            case 9:
                return new C16229l((List) ((C13927l) obj2).yandex.invoke(((C16229l) obj).yandex));
            case 10:
                List list = (List) obj2;
                return new C10853l((C18625l) AbstractC16901l.m4214continue(list), AbstractC16901l.m4242synchronized(1, list));
            case 11:
                return Unit.INSTANCE;
            case 12:
                ((C3480l) obj).crashlytics = (InterfaceC12001l) obj2;
                return Unit.INSTANCE;
            case 13:
                ((C3480l) obj).purchase = ((C12347l) obj2).yandex;
                return Unit.INSTANCE;
            case 14:
                ((C3480l) obj).amazon = ((C15667l) obj2).yandex;
                return Unit.INSTANCE;
            case 15:
                String str = (String) obj;
                InterfaceC5763l interfaceC5763l = (InterfaceC5763l) obj2;
                if (str.length() == 0) {
                    return interfaceC5763l.toString();
                }
                return str + ", " + interfaceC5763l;
            case 16:
                String str2 = (String) obj;
                InterfaceC0084l interfaceC0084l = (InterfaceC0084l) obj2;
                if (str2.length() == 0) {
                    return interfaceC0084l.toString();
                }
                return str2 + ", " + interfaceC0084l;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    AbstractC10310l.yandex(false, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, AbstractC0080l.isPro(c4346l, 61.0f), c6956l, 384);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.pref_about_header), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC8069l.crashlytics(), AbstractC11999l.purchase(c6956l3, R.string.talkback_back), null, 0L, c6956l3, 0, 12);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_share_outline_28, 0, c6956l4), AbstractC11999l.purchase(c6956l4, R.string.share), AbstractC0080l.isPro(c4346l, 24.0f), ((C18718l) c6956l4.isPro(AbstractC5992l.yandex)).loadAd, c6956l4, 392, 0);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_text_tt_outline_24, 0, c6956l5), AbstractC11999l.purchase(c6956l5, R.string.now_playing_toolbox_lyrics), null, 0L, c6956l5, 8, 12);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.hint_np3_fx), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.hint_np3_fx_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_filter_28, 0, c6956l8), AbstractC11999l.purchase(c6956l8, R.string.eq3_title), null, 0L, c6956l8, 8, 12);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_radiowaves_left_and_right_outline_28, 0, c6956l9), AbstractC11999l.purchase(c6956l9, R.string.hs_source_mix), null, 0L, c6956l9, 8, 12);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_list_play_outline_28, 0, c6956l10), AbstractC11999l.purchase(c6956l10, R.string.now_playing_toolbox_queue), null, 0L, c6956l10, 8, 12);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_more, 0, c6956l11), AbstractC11999l.purchase(c6956l11, R.string.now_playing_toolbox_menu), null, 0L, c6956l11, 8, 12);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_qr_code_outline_28, 0, c6956l12), AbstractC11999l.purchase(c6956l12, R.string.scan_qr), null, 0L, c6956l12, 8, 12);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_upload_outline_28, 0, c6956l13), AbstractC11999l.purchase(c6956l13, R.string.upload_track), null, 0L, c6956l13, 8, 12);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3755l(int i, int i2) {
        this.f7838l = i2;
    }
}
