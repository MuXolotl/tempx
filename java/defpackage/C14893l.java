package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14893l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f29294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29296l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f29297l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29298l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f29299l;

    public /* synthetic */ C14893l(int i, InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC8714l interfaceC8714l3) {
        this.f29295l = i;
        this.f29298l = interfaceC2262l;
        this.f29294l = interfaceC8714l;
        this.f29297l = interfaceC8714l2;
        this.f29299l = interfaceC8714l3;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x03c4  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13863l c13863l;
        Object objM2132native;
        int i = this.f29296l;
        C13863l c13863l2 = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f29299l;
        Object obj5 = this.f29297l;
        Object obj6 = this.f29298l;
        int i2 = this.f29295l;
        switch (i) {
            case 0:
                String str = (String) obj6;
                Function1 function1 = (Function1) obj5;
                C7968l c7968l = (C7968l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C15089l c15089l = C18450l.f36046l;
                    C11485l c11485l = AbstractC8313l.crashlytics;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c4346l, 16.0f, 8.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l, 54);
                    long j2 = c6956l.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lRemoteconfig);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l), str, null, 0L, c6956l, 8, 12);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
                    long j3 = c6956l.f14595continue;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.as2_view_scenario_if), null, AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).subs, c6956l, 0, 0, 131066);
                    AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).subs, c6956l, 0, 0, 131066);
                    c6956l.startapp(true);
                    AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
                    boolean zBilling = c6956l.billing(function1);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling) {
                        c13863l = c13863l2;
                    } else {
                        c13863l = c13863l2;
                        if (objM2132native2 == c13863l) {
                        }
                        AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, AbstractC17860l.billing, c6956l, 1572864, 62);
                        c6956l.startapp(true);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                        int i6 = AbstractC15548l.yandex;
                        C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510);
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C0289l(this.f29294l, 3);
                            c6956l.m2147try(objM2132native);
                        }
                        AbstractC13319l.yandex(AbstractC17860l.mopub, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native, 15), null, AbstractC14566l.amazon(-1537750683, new C14958l(c7968l, 0), c6956l), null, AbstractC17860l.admob, c15087lYandex, c6956l, 199686, 404);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.as2_view_scenario_options), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).subs, c6956l, 48, 0, 131064);
                        AbstractC7039l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), new C7537l(8.0f, true, new C8339l(12)), new C7537l(0.0f, true, new C8339l(12)), null, 0, 0, AbstractC14566l.amazon(1161175145, new C7442l(c7968l, function1, 10), c6956l), c6956l, 1573302, 56);
                        c6956l.startapp(true);
                    }
                    objM2132native2 = new C15456l(0, function1);
                    c6956l.m2147try(objM2132native2);
                    AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, AbstractC17860l.billing, c6956l, 1572864, 62);
                    c6956l.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                    int i7 = AbstractC15548l.yandex;
                    C15087l c15087lYandex2 = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C0289l(this.f29294l, 3);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(AbstractC17860l.mopub, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native, 15), null, AbstractC14566l.amazon(-1537750683, new C14958l(c7968l, 0), c6956l), null, AbstractC17860l.admob, c15087lYandex2, c6956l, 199686, 404);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.as2_view_scenario_options), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).subs, c6956l, 48, 0, 131064);
                    AbstractC7039l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), new C7537l(8.0f, true, new C8339l(12)), new C7537l(0.0f, true, new C8339l(12)), null, 0, 0, AbstractC14566l.amazon(1161175145, new C7442l(c7968l, function1, 10), c6956l), c6956l, 1573302, 56);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj6;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j4 = c6956l2.f14595continue;
                    int i8 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, C3438l.amazon);
                    InterfaceC8714l interfaceC8714l3 = this.f29294l;
                    String str2 = (String) interfaceC8714l3.getValue();
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                    C15578l c15578l = ((Boolean) interfaceC8714l.getValue()).booleanValue() ? AbstractC7303l.crashlytics : null;
                    Object objM2132native3 = c6956l2.m2132native();
                    if (objM2132native3 == c13863l2) {
                        objM2132native3 = new C17660l(interfaceC8714l3, 0);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC2130l.amazon(str2, (Function1) objM2132native3, interfaceC17242lAmazon, false, null, AbstractC7303l.amazon, null, c15578l, null, zBooleanValue, null, null, null, true, 0, 0, null, null, c6956l2, 1573296, 12582912, 8248760);
                    InterfaceC16831l interfaceC16831l = (InterfaceC16831l) interfaceC8714l2.getValue();
                    boolean zAmazon = c6956l2.amazon(i2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAmazon || objM2132native4 == c13863l2) {
                        objM2132native4 = new C2221l(i2, 25);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC7741l.loadAd(interfaceC16831l, null, (Function1) objM2132native4, null, "", null, AbstractC7303l.purchase, c6956l2, 1597440, 42);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    C17253l c17253l = C12719l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l2.isPro(c10707l)).yandex.license, 0L, 0L, c6956l2, 12);
                    C17253l c17253l2 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C6839l c6839l = ((C14370l) c6956l2.isPro(c10707l)).crashlytics.crashlytics;
                    boolean z = ((String) interfaceC8714l3.getValue()).length() > 0;
                    boolean zAdmob = c6956l2.admob(interfaceC2262l);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zAdmob || objM2132native5 == c13863l2) {
                        objM2132native5 = new C17026l(interfaceC2262l, interfaceC8714l, interfaceC8714l2, interfaceC8714l3, 7);
                        c6956l2.m2147try(objM2132native5);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native5, interfaceC17242lAmazon2, z, c6839l, c13412lYandex, null, null, c17253l2, AbstractC7303l.billing, c6956l2, 817889328, 352);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14893l(int i, String str, Function1 function1, InterfaceC8714l interfaceC8714l, C7968l c7968l) {
        this.f29295l = i;
        this.f29298l = str;
        this.f29297l = function1;
        this.f29294l = interfaceC8714l;
        this.f29299l = c7968l;
    }
}
