package defpackage;

import android.graphics.RectF;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15707l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30848l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30849l;

    public /* synthetic */ C15707l(int i, Object obj) {
        this.f30849l = i;
        this.f30848l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0486  */
    /* JADX WARN: Code duplicated, block: B:166:0x0488  */
    /* JADX WARN: Code duplicated, block: B:168:0x048e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0490  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        boolean zSmaato;
        Object obj3;
        int i = this.f30849l;
        C18295l c18295l = C18295l.yandex;
        C4346l c4346l = C4346l.f8873l;
        C17334l c17334l = AbstractC8313l.loadAd;
        int i2 = 1;
        Object obj4 = this.f30848l;
        switch (i) {
            case 0:
                C14267l c14267l = (C14267l) obj4;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (c14267l.amazon.length() > 0) {
                        c6956l2.m2123default(-470286756);
                        AbstractC13010l.loadAd(c14267l.amazon, null, ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).yandex, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241658);
                        c6956l = c6956l2;
                    } else {
                        c6956l = c6956l2;
                        c6956l.m2123default(-490146968);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C9231l) obj4).ad((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C8529l) obj4).mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 3:
                C8896l c8896lRemoteconfig = AbstractC5833l.remoteconfig((RectF) obj);
                C8896l c8896lRemoteconfig2 = AbstractC5833l.remoteconfig((RectF) obj2);
                switch (((C1759l) obj4).f4173l) {
                    case 4:
                        zSmaato = c8896lRemoteconfig.smaato(c8896lRemoteconfig2);
                        break;
                    default:
                        zSmaato = c8896lRemoteconfig2.yandex(c8896lRemoteconfig.billing());
                        break;
                }
                return Boolean.valueOf(zSmaato);
            case 4:
                EnumC0442l enumC0442l = (EnumC0442l) obj4;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, enumC0442l.f1620l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C8039l) obj4).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 6:
                CatalogArtist catalogArtist = (CatalogArtist) obj4;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l4.m2124else();
                } else if (catalogArtist.admob) {
                    c6956l4.m2123default(-71213574);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_unfavorite_outline_28, 0, c6956l4), AbstractC11999l.purchase(c6956l4, R.string.unsubscribe), null, 0L, c6956l4, 8, 12);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2123default(-71020258);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_favorite_outline_28, 0, c6956l4), AbstractC11999l.purchase(c6956l4, R.string.subscribe), null, 0L, c6956l4, 8, 12);
                    c6956l4.startapp(false);
                }
                return Unit.INSTANCE;
            case 7:
                Long l = (Long) obj2;
                if (AbstractC8548l.yandex((C11611l) obj4, l.longValue())) {
                    return l;
                }
                return null;
            case 8:
                C2814l c2814l = (C2814l) obj4;
                C16287l.yandex.getClass();
                if (C16287l.yandex()) {
                    new C10530l(c2814l.loadAd, new C14072l(c2814l, i2), new C5897l(c2814l, false ? 1 : 0), new C14072l(c2814l, false ? 1 : 0)).Signature(c2814l.yandex);
                }
                return Unit.INSTANCE;
            case 9:
                C8954l c8954l = (C8954l) obj4;
                C18416l c18416lYandex = AbstractC12019l.yandex(new C13313l(C15519l.mopub(((C15519l) obj2).yandex), c8954l, (int) (((C4999l) obj).yandex & 4294967295L)));
                int iOrdinal = ((EnumC9129l) c8954l.billing.getValue()).ordinal();
                EnumC9129l enumC9129l = EnumC9129l.f18765l;
                if (iOrdinal != 0) {
                    EnumC9129l enumC9129l2 = EnumC9129l.f18764l;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            C18725l.billing();
                            return null;
                        }
                        boolean z = c8954l.purchase;
                        EnumC9129l enumC9129l3 = EnumC9129l.f18763l;
                        if (z) {
                            C18416l c18416lSubs = c8954l.mopub.subs();
                            if (c18416lSubs.crashlytics(enumC9129l3) && c18416lSubs.crashlytics(enumC9129l2) && c18416lSubs.billing(enumC9129l3) == c18416lSubs.billing(enumC9129l2) && c18416lYandex.crashlytics(enumC9129l2)) {
                                enumC9129l = enumC9129l2;
                            } else if (c18416lYandex.crashlytics(enumC9129l3)) {
                                enumC9129l = enumC9129l3;
                            } else if (c18416lYandex.crashlytics(enumC9129l2)) {
                                enumC9129l = enumC9129l2;
                            }
                        } else if (c18416lYandex.crashlytics(enumC9129l3)) {
                            enumC9129l = enumC9129l3;
                        } else if (c18416lYandex.crashlytics(enumC9129l2)) {
                            enumC9129l = enumC9129l2;
                        }
                    } else if (c18416lYandex.crashlytics(enumC9129l2)) {
                        enumC9129l = enumC9129l2;
                    }
                }
                return new C8195l(c18416lYandex, enumC9129l);
            case 10:
                ((Integer) obj2).getClass();
                ((C4077l) obj4).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C10299l) obj4).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 12:
                C4587l c4587l = (C4587l) obj4;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC0133l.purchase(c4587l.loadAd, null, 0L, 0L, null, c6956l5, 48, 28);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                AbstractC5097l abstractC5097l = (AbstractC5097l) obj4;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    abstractC5097l.license(c6956l6, 0);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                AbstractC11801l abstractC11801l = (AbstractC11801l) obj4;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    abstractC11801l.mo271new(c6956l7, 0);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C15389l c15389l = (C15389l) obj4;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC0492l) {
                    InterfaceC0492l interfaceC0492l = (InterfaceC0492l) obj2;
                    C6295l c6295l = (C6295l) c15389l.admob;
                    if (c6295l == null) {
                        C6295l c6295l2 = AbstractC13087l.yandex;
                        c6295l = new C6295l();
                        c15389l.admob = c6295l;
                    }
                    c6295l.smaato(interfaceC0492l);
                    ((C17893l) c15389l.billing).crashlytics(interfaceC0492l);
                }
                if (obj2 instanceof InterfaceC17142l) {
                    c15389l.mopub((InterfaceC17142l) obj2);
                }
                if (obj2 instanceof C4224l) {
                    ((C4224l) obj2).crashlytics();
                }
                return Unit.INSTANCE;
            case 16:
                C0090l c0090l = (C0090l) obj4;
                String str = (String) obj;
                List list = (List) obj2;
                if (str.equalsIgnoreCase("Content-Encoding") || str.equalsIgnoreCase("Content-Length")) {
                    return Unit.INSTANCE;
                }
                c0090l.mo199class(str, list);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC16817l.purchase((C16173l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13765l c13765l = (C13765l) obj4;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int iAdmob = (int) c13765l.admob();
                    if (iAdmob < 1) {
                        iAdmob = 1;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.settings_crossfade_seconds_fmt, new Object[]{Integer.valueOf(iAdmob)}, c6956l8), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C8948l) obj4).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 20:
                C10038l c10038l = (C10038l) obj4;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String strCrashlytics = AbstractC7902l.crashlytics(c6956l9, R.string.m3c_dialog);
                    InterfaceC17242l interfaceC17242l = (InterfaceC17242l) c10038l.f20462l;
                    C17253l c17253l = AbstractC0850l.yandex;
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC0080l.remoteconfig(interfaceC17242l, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                    boolean zBilling = c6956l9.billing(strCrashlytics);
                    Object objM2132native = c6956l9.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        obj3 = objM2132native;
                        C6908l c6908l = new C6908l(strCrashlytics, 7);
                        c6956l9.m2147try(c6908l);
                        obj3 = c6908l;
                    }
                    obj3 = objM2132native;
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242lRemoteconfig.premium(new C15986l((Function1) obj3, false));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j = c6956l9.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l9, interfaceC17242lPremium);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l9, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l9, C3438l.firebase);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, (C15578l) c10038l.f20465l, c6956l9, true);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C10809l c10809l = (C10809l) obj4;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    Function3 function3 = c10809l.mopub;
                    C5062l c5062lYandex = AbstractC7001l.yandex(c17334l, c0086l, c6956l10, 54);
                    long j2 = c6956l10.f14595continue;
                    int i4 = (int) ((j2 >>> 32) ^ j2);
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l10, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l2);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling2, C3438l.amazon);
                    function3.invoke(c18295l, c6956l10, 6);
                    c6956l10.startapp(true);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C6956l c6956l11 = (C6956l) obj;
                ((Integer) obj2).getClass();
                c6956l11.m2123default(666084174);
                String str2 = ((C5249l) obj4).loadAd;
                c6956l11.startapp(false);
                return str2;
            case 23:
                C15351l c15351l = (C15351l) obj4;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C0086l c0086l2 = C18450l.f36040l;
                    Function3 function4 = c15351l.remoteconfig;
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c17334l, c0086l2, c6956l12, 54);
                    long j3 = c6956l12.f14595continue;
                    int i5 = (int) ((j3 >>> 32) ^ j3);
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l12, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l3);
                    } else {
                        c6956l12.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l12, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l12, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l12, C3438l.firebase);
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling3, C3438l.amazon);
                    function4.invoke(c18295l, c6956l12, 6);
                    c6956l12.startapp(true);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C13640l) obj4).mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C11359l c11359l = (C11359l) obj4;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.eq3_delete_preset_msg, new Object[]{c11359l.loadAd}, c6956l13), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                AbstractC12959l.crashlytics((CustomCatalogBlockItem.Background) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    throw null;
                }
                c6956l14.m2124else();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C16942l) obj4).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                Integer num = (Integer) obj2;
                num.getClass();
                return Long.valueOf(Math.max(((Number) ((C12513l) obj4).invoke((AbstractC14246l) obj, num)).longValue(), 0L));
        }
    }

    public /* synthetic */ C15707l(Object obj, int i, int i2) {
        this.f30849l = i2;
        this.f30848l = obj;
    }
}
