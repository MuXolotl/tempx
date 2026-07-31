package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؔٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2669l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f5791l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5792l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5793l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5794l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f5795l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f5796l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f5797l;

    public /* synthetic */ C2669l(C13072l c13072l, C5073l c5073l, C4975l c4975l, C5073l c5073l2, C13765l c13765l, C13765l c13765l2) {
        this.f5794l = 0;
        this.f5793l = c13072l;
        this.f5791l = c5073l;
        this.f5795l = c4975l;
        this.f5796l = c5073l2;
        this.f5797l = c13765l;
        this.f5792l = c13765l2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f5794l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f5792l;
        Object obj5 = this.f5797l;
        Object obj6 = this.f5795l;
        Object obj7 = this.f5796l;
        Object obj8 = this.f5791l;
        Object obj9 = this.f5793l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj9;
                C5073l c5073l = (C5073l) obj8;
                C4975l c4975l = (C4975l) obj6;
                C5073l c5073l2 = (C5073l) obj7;
                C13765l c13765l = (C13765l) obj5;
                C13765l c13765l2 = (C13765l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zBilling = c6956l.billing(c5073l) | c6956l.admob(c4975l) | c6956l.billing(c5073l2) | c6956l.billing(c13765l) | c6956l.billing(c13765l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C2831l(c5073l, c4975l, c5073l2, c13765l, c13765l2, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0582l interfaceC0582l = (InterfaceC0582l) obj9;
                String str = (String) obj8;
                C0059l c0059l = (C0059l) obj7;
                C0059l c0059l2 = (C0059l) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function2 = (Function1) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c6956l2.m2124else();
                } else if (AbstractC8576l.yandex(interfaceC0582l, C10760l.INSTANCE)) {
                    c6956l2.m2123default(255194656);
                    AbstractC8007l.purchase(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2), AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l2), AbstractC11999l.purchase(c6956l2, R.string.error_occurred), c6956l2, 64);
                    c6956l2.startapp(false);
                } else if (AbstractC8576l.yandex(interfaceC0582l, C6884l.INSTANCE)) {
                    c6956l2.m2123default(255570655);
                    AbstractC8007l.purchase(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2), AbstractC16759l.crashlytics(R.drawable.ic_text_tt_outline_24, 0, c6956l2), AbstractC11999l.purchase(c6956l2, R.string.lrc_not_found), c6956l2, 64);
                    c6956l2.startapp(false);
                } else if (interfaceC0582l instanceof C6143l) {
                    c6956l2.m2123default(255985063);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lAdcel = AbstractC15042l.adcel(AbstractC3605l.vip(AbstractC0080l.amazon(AbstractC3605l.firebase(c4346l, interfaceC11780l2), 1.0f), 24.0f, 0.0f, 2), AbstractC15042l.isVip());
                    boolean zBilling2 = c6956l2.billing(interfaceC0582l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C8250l(10, interfaceC0582l);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(interfaceC17242lAdcel, null, null, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l2, 24576, 494);
                    c6956l2.startapp(false);
                } else if (interfaceC0582l instanceof C16016l) {
                    c6956l2.m2123default(257535404);
                    AbstractC8007l.billing(str, (C16016l) interfaceC0582l, ((Number) c0059l.get()).intValue(), ((Number) c0059l2.get()).intValue(), function1, function2, AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2), c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    if (interfaceC0582l != null) {
                        throw AbstractC12900l.billing(423875009, c6956l2, false);
                    }
                    c6956l2.m2123default(258068604);
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC3605l.firebase(c4346l, interfaceC11780l2), 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC8960l.yandex(C16170l.yandex.yandex(c4346l, C18450l.f36043l), ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).amazon, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, null, null, c6956l2, 0);
                    c6956l2.startapp(true);
                    c6956l2.startapp(false);
                }
                return Unit.INSTANCE;
            case 2:
                C17284l c17284l = (C17284l) obj9;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj8;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj7;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj6;
                InterfaceC12244l interfaceC12244l4 = (InterfaceC12244l) obj5;
                InterfaceC12244l interfaceC12244l5 = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (!c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c6956l3.m2124else();
                } else if (((C5086l) interfaceC12244l5.getValue()).yandex) {
                    c6956l3.m2123default(391796761);
                    AbstractC7209l.yandex(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l3), true, 0L, c6956l3, 48, 4);
                    c6956l3.startapp(false);
                } else if (!((C5086l) interfaceC12244l5.getValue()).loadAd || ((EnumC9736l) interfaceC12244l.getValue()) == EnumC9736l.Playlists) {
                    c6956l3.m2123default(392323203);
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(AbstractC3605l.firebase(c4346l, interfaceC11780l3), 1.0f);
                    C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean zBilling3 = c6956l3.billing(interfaceC12244l) | c6956l3.billing(interfaceC12244l2) | c6956l3.admob(c17284l) | c6956l3.billing(interfaceC12244l3) | c6956l3.billing(interfaceC12244l4) | c6956l3.billing(interfaceC12244l5);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        C2623l c2623l = new C2623l(interfaceC12244l, (Object) c17284l, (Object) interfaceC12244l2, (Object) interfaceC12244l3, interfaceC12244l4, (Object) interfaceC12244l5, 4);
                        c6956l3.m2147try(c2623l);
                        objM2132native3 = c2623l;
                    }
                    AbstractC16336l.yandex(interfaceC17242lCrashlytics2, null, c17253lAmazon, null, null, null, false, null, (Function1) objM2132native3, c6956l3, 384, 506);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(392113085);
                    c17284l.m4294import(c6956l3, 0);
                    c6956l3.startapp(false);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC11780l interfaceC11780l4 = (InterfaceC11780l) obj9;
                C15578l c15578l = (C15578l) obj8;
                C15578l c15578l2 = (C15578l) obj7;
                String str2 = (String) obj6;
                C11090l c11090l = (C11090l) obj5;
                C15578l c15578l3 = (C15578l) obj4;
                Function2 function3 = (Function2) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.admob(function3) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(c4346l, interfaceC11780l4);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l4, 54);
                    long j2 = c6956l4.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lFirebase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.adcel, AbstractC12502l.yandex), AbstractC14566l.amazon(-1411180241, new C8088l(c15578l, c15578l2, str2, c11090l, function3, c15578l3), c6956l4), c6956l4, 56);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2669l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f5794l = i;
        this.f5793l = obj;
        this.f5791l = obj2;
        this.f5796l = obj3;
        this.f5795l = obj4;
        this.f5797l = obj5;
        this.f5792l = obj6;
    }
}
