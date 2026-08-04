package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: public, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Cpublic implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f36549l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36550l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36551l;

    public /* synthetic */ Cpublic(C2391l c2391l, InterfaceC3102l interfaceC3102l) {
        this.f36551l = 16;
        this.f36550l = c2391l;
        this.f36549l = interfaceC3102l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        int i = this.f36551l;
        C9946l c9946l = AbstractC16837l.yandex;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 2;
        Object obj3 = this.f36550l;
        Object obj4 = this.f36549l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj4;
                C7659l c7659l = (C7659l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC10733l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(394058922, new Cbreak(c7659l), c6956l2), null, null, 0.0f, 0.0f, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).purchase(c6956l2), AbstractC0831l.billing(((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l2, 60), interfaceC3102l, c6956l2, 3078, 244);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C7659l) obj3).m2192abstract((C12823l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C0483l) obj4).billing((C0217l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C9231l) obj4).advert((C0324l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 4:
                Function2 function2 = (Function2) obj4;
                Function2 function3 = (Function2) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lPremium = AbstractC3605l.firebase(c4346l, AbstractC0850l.loadAd).premium(new C14020l(function2 == null ? C18450l.f36046l : C18450l.f36034l));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l3.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lPremium);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    function3.invoke(c6956l3, 0);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                float fFloatValue = ((Float) obj).floatValue();
                ((C14061l) obj4).yandex(fFloatValue, ((Float) obj2).floatValue());
                ((C13250l) obj3).f26029l = fFloatValue;
                return Unit.INSTANCE;
            case 6:
                C18159l c18159l = (C18159l) obj4;
                EnumC0442l enumC0442l = (EnumC0442l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM2132native = c6956l4.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC13273l.loadAd(c18159l.isVip(), enumC0442l.f1619l);
                        c6956l4.m2147try(objM2132native);
                    }
                    C12371l.yandex(AbstractC7041l.yandex((Drawable) objM2132native, c6956l4), AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(8.0f)), 52.0f), null, null, 0.0f, c6956l4, 56, 120);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z = ((C15343l) interfaceC8714l.getValue()).f29993l;
                    boolean zAdmob = c6956l5.admob(interfaceC2262l);
                    Object objM2132native2 = c6956l5.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C15299l(interfaceC2262l, 0);
                        c6956l5.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(z, (Function1) objM2132native2, null, false, null, c6956l5, 0, 124);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj4;
                C18159l c18159l2 = (C18159l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C17253l c17253l2 = AbstractC0831l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    byte b = 0;
                    AbstractC18079l.loadAd(AbstractC0837l.purchase, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l6.isPro(c10707l2)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-501441348, new C14260l(c18159l2, b, b), c6956l6), null, null, 0.0f, 0.0f, ((C15700l) c6956l6.isPro(AbstractC18678l.yandex)).purchase(c6956l6), AbstractC0831l.amazon(((C14370l) c6956l6.isPro(c10707l2)).yandex.startapp, ((C14370l) c6956l6.isPro(c10707l2)).yandex.ads, 0L, c6956l6, 28), interfaceC3102l2, c6956l6, 3078, 244);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC0496l.crashlytics((String) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(49));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC7039l.loadAd((InterfaceC13238l) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 11:
                String str = (String) obj4;
                String str2 = (String) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC7741l.purchase(str, str2, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 64.0f), ((C14370l) c6956l7.isPro(c10707l3)).crashlytics.crashlytics), new C18627l(((C14370l) c6956l7.isPro(c10707l3)).yandex.premium), null, null, c6956l7, 4096, 0, 32752);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((C13157l) obj4).m3572import((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 13:
                C13157l c13157l = (C13157l) obj4;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj3;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zAdmob2 = c6956l8.admob(c13157l) | c6956l8.billing(interfaceC8714l2);
                    Object objM2132native3 = c6956l8.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new Ctry(c13157l, interfaceC8714l2, 11);
                        c6956l8.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC4072l.billing, c6956l8, 805306368, 510);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj4;
                C13157l c13157l2 = (C13157l) obj3;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C17253l c17253l3 = AbstractC0831l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    byte b2 = 0;
                    AbstractC18079l.loadAd(AbstractC4072l.subs, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1301131442, new C6041l(c13157l2, b2, b2), c6956l9), AbstractC14566l.amazon(1915935579, new C5214l(c13157l2, b2), c6956l9), null, 0.0f, 0.0f, ((C15700l) c6956l9.isPro(AbstractC18678l.yandex)).purchase(c6956l9), AbstractC0831l.amazon(((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l9.isPro(c10707l4)).yandex.adcel, c6956l9, 12), interfaceC3102l3, c6956l9, 27654, 228);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC11156l.yandex((AudioFollowingsUpdateInfo) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(9));
                return Unit.INSTANCE;
            case 16:
                C2391l c2391l = (C2391l) obj3;
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj4;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str3 = c2391l.tapsense;
                    if (str3 == null) {
                        str3 = "";
                    }
                    AbstractC13010l.loadAd(str3, AbstractC15788l.yandex(c4346l, interfaceC3102l4.yandex().loadAd()), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l10, 0, 24960, 241660);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C7968l c7968l = (C7968l) obj4;
                EnumC1518l enumC1518l = (EnumC1518l) obj3;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    if (c7968l.f16616l == enumC1518l) {
                        c6956l11.m2123default(-447493904);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l11), AbstractC11999l.purchase(c6956l11, R.string.selected), null, 0L, c6956l11, 8, 12);
                        c6956l = c6956l11;
                    } else {
                        c6956l = c6956l11;
                        c6956l.m2123default(-461232267);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3102l interfaceC3102l5 = (InterfaceC3102l) obj4;
                C13659l c13659l = (C13659l) obj3;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    C17253l c17253l4 = AbstractC0831l.yandex;
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC14506l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l12.isPro(c10707l5)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-2061184714, new C4345l(c13659l), c6956l12), null, null, 0.0f, 0.0f, ((C15700l) c6956l12.isPro(AbstractC18678l.yandex)).purchase(c6956l12), AbstractC0831l.amazon(((C14370l) c6956l12.isPro(c10707l5)).yandex.startapp, ((C14370l) c6956l12.isPro(c10707l5)).yandex.startapp, 0L, c6956l12, 28), interfaceC3102l5, c6956l12, 3078, 244);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9122l c9122l = (C9122l) obj4;
                C12210l c12210l = (C12210l) obj3;
                String str4 = (String) obj;
                List list = (List) obj2;
                if (str4.equals("Transfer-Encoding")) {
                    c9122l.f18750l = true;
                } else if (str4.equals("Upgrade")) {
                    throw new C13947l("Upgrade", "non-upgrading response");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c12210l.f24264l.m1825transient(str4, (String) it.next(), true);
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((C15718l) obj4).crashlytics((C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 21:
                String str5 = (String) obj4;
                C15578l c15578l = (C15578l) obj3;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zBilling = c6956l13.billing(str5);
                    Object objM2132native4 = c6956l13.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        objM2132native4 = new C6908l(str5, i2);
                        c6956l13.m2147try(objM2132native4);
                    }
                    C15986l c15986l = new C15986l((Function1) objM2132native4, false);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l13.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l13.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l13, c15986l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l13.m2140super();
                    if (c6956l13.f14603switch) {
                        c6956l13.firebase(c16395l2);
                    } else {
                        c6956l13.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l13, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l13, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l13, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l13, C3438l.firebase);
                    AbstractC8182l.billing(c6956l13, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l13, true);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj4;
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj3;
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objM2132native5 = c6956l14.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = new C13073l(interfaceC8714l3, interfaceC8714l4, 0);
                        c6956l14.m2147try(objM2132native5);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native5, null, false, null, null, null, AbstractC18219l.f35663l, c6956l14, 805306374, 510);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC3102l interfaceC3102l6 = (InterfaceC3102l) obj4;
                C9991l c9991l = (C9991l) obj3;
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    C17253l c17253l5 = AbstractC0831l.yandex;
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC18219l.f35664l, null, null, AbstractC14566l.amazon(431444868, new C2734l(c9991l), c6956l15), null, null, 0.0f, 0.0f, ((C15700l) c6956l15.isPro(AbstractC18678l.yandex)).purchase(c6956l15), AbstractC0831l.amazon(((C14370l) c6956l15.isPro(c10707l6)).yandex.startapp, ((C14370l) c6956l15.isPro(c10707l6)).yandex.ads, 0L, c6956l15, 28), interfaceC3102l6, c6956l15, 3078, 246);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC15847l interfaceC15847l = (InterfaceC15847l) obj;
                C15519l c15519l = (C15519l) obj2;
                return ((InterfaceC10835l) obj4).loadAd(interfaceC15847l, interfaceC15847l.ads(Unit.INSTANCE, new C15578l(-431986394, true, new Cpublic((C15578l) obj3, new C0923l(interfaceC15847l, c15519l.yandex), 25))), c15519l.yandex);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C15578l c15578l2 = (C15578l) obj4;
                C0923l c0923l = (C0923l) obj3;
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l16.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    c15578l2.invoke(c0923l, c6956l16, 0);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj4;
                C15578l c15578l3 = (C15578l) obj3;
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    C17253l c17253l6 = C12719l.yandex;
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.yandex(c4346l, C12719l.crashlytics, C12719l.billing()), interfaceC11780l);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.purchase, C18450l.f36040l, c6956l17, 54);
                    long j3 = c6956l17.f14595continue;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l17.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l17, interfaceC17242lFirebase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l17.m2140super();
                    if (c6956l17.f14603switch) {
                        c6956l17.firebase(c16395l3);
                    } else {
                        c6956l17.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l17, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l17, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l17, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l17, C3438l.firebase);
                    AbstractC8182l.billing(c6956l17, interfaceC17242lBilling3, C3438l.amazon);
                    c15578l3.invoke(C18295l.yandex, c6956l17, 6);
                    c6956l17.startapp(true);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((C9430l) obj4).m2656try((InterfaceC13238l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C9430l) obj4).m2654this((CachedPlaylist) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C15068l) obj4).m3921finally((CachedTrack) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Cpublic(C7659l c7659l, C12823l c12823l, int i) {
        this.f36551l = 1;
        this.f36550l = c7659l;
        this.f36549l = c12823l;
    }

    public /* synthetic */ Cpublic(C9122l c9122l, AbstractC8870l abstractC8870l, C12210l c12210l) {
        this.f36551l = 19;
        this.f36549l = c9122l;
        this.f36550l = c12210l;
    }

    public /* synthetic */ Cpublic(Object obj, Object obj2, int i) {
        this.f36551l = i;
        this.f36549l = obj;
        this.f36550l = obj2;
    }

    public /* synthetic */ Cpublic(Object obj, Object obj2, int i, int i2) {
        this.f36551l = i2;
        this.f36549l = obj;
        this.f36550l = obj2;
    }
}
