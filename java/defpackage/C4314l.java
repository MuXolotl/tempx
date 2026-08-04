package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4314l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8854l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8855l;

    public /* synthetic */ C4314l(int i, int i2) {
        this.f8855l = 9;
        this.f8854l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strMopub;
        int i = this.f8855l;
        C4346l c4346l = C4346l.f8873l;
        boolean z = false;
        int i2 = this.f8854l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC11621l.loadAd(null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l2.isPro(c10707l)).yandex.license, AbstractC14566l.amazon(-1636954610, new C8821l(i2, 3), c6956l2), c6956l2, 3072);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (i2 == 0) {
                        strMopub = AbstractC12900l.mopub(c6956l3, -1373555196, R.string.lng_override_default, c6956l3, false);
                    } else {
                        c6956l3.m2123default(-1373429026);
                        c6956l3.startapp(false);
                        strMopub = i2 + " dp";
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l4, i2);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l4.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l4.isPro(c10707l2)).loadAd.remoteconfig, c6956l4, 0, 0, 131066);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).loadAd.smaato, c6956l5, 0, 0, 131070);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l6), null, null, ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).yandex.adcel, c6956l6, 56, 4);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC11282l.loadAd(AbstractC0653l.vip(i2, "Track "), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l7, 0, 0, 131070);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC11282l.loadAd(AbstractC0653l.vip(i2, "Artist "), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l8, 0, 0, 131070);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l9, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC0441l.yandex(i2, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 10:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l10, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l10, 0, 0, 262142);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 11:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 12:
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l12, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l12, 0, 0, 262142);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case 13:
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l13, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case 14:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                } else {
                    c6956l14.m2124else();
                }
                break;
            case 15:
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l15, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l15, 0, 0, 262142);
                } else {
                    c6956l15.m2124else();
                }
                break;
            case 16:
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l16), null, AbstractC3605l.smaato(c4346l, 12.0f), 0L, c6956l16, 440, 8);
                } else {
                    c6956l16.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC3274l.yandex(AbstractC0080l.isPro(c4346l, 64.0f), ((C14370l) c6956l17.isPro(c10707l3)).crashlytics.loadAd, ((C14370l) c6956l17.isPro(c10707l3)).yandex.ads, ((C14370l) c6956l17.isPro(c10707l3)).yandex.adcel, 0.0f, 0.0f, null, AbstractC14566l.amazon(-174743831, new C4314l(i2, 16, z ? (byte) 1 : (byte) 0), c6956l17), c6956l17, 12582918, 112);
                } else {
                    c6956l17.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l18 = (C6956l) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c6956l18.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l18, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                } else {
                    c6956l18.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l19 = (C6956l) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c6956l19.m2127for(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l19, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l19, 0, 0, 262142);
                } else {
                    c6956l19.m2124else();
                }
                break;
            case 20:
                C6956l c6956l20 = (C6956l) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l20, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l20, 0, 0, 262142);
                } else {
                    c6956l20.m2124else();
                }
                break;
            case 21:
                C6956l c6956l21 = (C6956l) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c6956l21.m2127for(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l21, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l21, 0, 0, 262142);
                } else {
                    c6956l21.m2124else();
                }
                break;
            case 22:
                C6956l c6956l22 = (C6956l) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (c6956l22.m2127for(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l22, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l22, 0, 0, 262142);
                } else {
                    c6956l22.m2124else();
                }
                break;
            default:
                C6956l c6956l23 = (C6956l) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c6956l23.m2127for(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l23, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l23.isPro(AbstractC16964l.yandex)).loadAd.admob, c6956l23, 0, 0, 131070);
                } else {
                    c6956l23.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4314l(int i, int i2, byte b) {
        this.f8855l = i2;
        this.f8854l = i;
    }
}
