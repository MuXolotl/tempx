package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙّۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6858l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14089l f14345l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15968l f14346l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14347l = 0;

    public /* synthetic */ C6858l(C15968l c15968l, C14089l c14089l) {
        this.f14346l = c15968l;
        this.f14345l = c14089l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v37 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6415l c6415l;
        C6415l c6415l2;
        C11485l c11485l;
        ?? r4;
        C6956l c6956l;
        int i = this.f14347l;
        C4346l c4346l = C4346l.f8873l;
        C14089l c14089l = this.f14345l;
        C15968l c15968l = this.f14346l;
        switch (i) {
            case 0:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c14089l.m3835instanceof(c15968l.f31340l, c6956l2, 0);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.separator), null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262138);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13010l.loadAd(String.valueOf(c15968l.f31339l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    AbstractC13010l.loadAd(c15968l.f31344l, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l3, 6);
                    long j2 = c6956l3.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    C6415l c6415l3 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l3, c1853lYandex, c6415l3);
                    C6415l c6415l4 = C3438l.billing;
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l4);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l5 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l3, numValueOf, c6415l5);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l3, c11192l);
                    C6415l c6415l6 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l6);
                    Long l = c15968l.f31342l;
                    long j3 = c15968l.f31343l;
                    C11485l c11485l2 = AbstractC8313l.crashlytics;
                    C13863l c13863l = C1867l.yandex;
                    if (l != null) {
                        c6956l3.m2123default(-1715225629);
                        boolean zAdmob = c6956l3.admob(c14089l) | c6956l3.admob(c15968l);
                        Object objM2132native = c6956l3.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new C8652l(c14089l, c15968l, 22);
                            c6956l3.m2147try(objM2132native);
                        }
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native, 15), 1.0f);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l2, c15089l, c6956l3, 0);
                        long j4 = c6956l3.f14595continue;
                        int i4 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l2);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, c1853lYandex2, c6415l3);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, c6415l4);
                        AbstractC11043l.isPro(i4, c6956l3, c6415l5, c6956l3, c11192l);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, c6415l6);
                        C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l3, 0);
                        long j5 = c6956l3.f14595continue;
                        int i5 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato4 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l3, c4346l);
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l2);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, c5062lYandex2, c6415l3);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato4, c6415l4);
                        AbstractC11043l.isPro(i5, c6956l3, c6415l5, c6956l3, c11192l);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling4, c6415l6);
                        C10707l c10707l = AbstractC16964l.yandex;
                        c6415l2 = c6415l6;
                        c11485l = c11485l2;
                        c6415l = c6415l3;
                        AbstractC13010l.loadAd("https://vk.com/id", null, ((C14370l) c6956l3.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 6, 0, 262138);
                        AbstractC13010l.loadAd(String.valueOf(c15968l.f31342l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                        c6956l3.startapp(true);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.spark_rfield_gifted), null, ((C14370l) c6956l3.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(c10707l)).loadAd.vip, c6956l3, 0, 0, 131066);
                        C6956l c6956l4 = c6956l3;
                        c6956l4.startapp(true);
                        r4 = 0;
                        c6956l = c6956l4;
                    } else {
                        c13863l = c13863l;
                        c6415l = c6415l3;
                        c6415l2 = c6415l6;
                        c11485l = c11485l2;
                        r4 = 0;
                        C6956l c6956l5 = c6956l3;
                        c6956l5.m2123default(-1727787449);
                        c6956l = c6956l5;
                    }
                    c6956l.startapp(r4);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, c15089l, c6956l, r4);
                    long j6 = c6956l.f14595continue;
                    int i6 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l2);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l4);
                    AbstractC11043l.isPro(i6, c6956l, c6415l5, c6956l, c11192l);
                    C6415l c6415l7 = c6415l2;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l7);
                    C6956l c6956l6 = c6956l;
                    AbstractC13010l.loadAd(c15968l.f31338l, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                    String strPurchase = AbstractC11999l.purchase(c6956l6, R.string.spark_rfield_vendor);
                    AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l6.isPro(abstractC5189l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(abstractC5189l)).loadAd.vip, c6956l6, 0, 0, 131066);
                    c6956l6.startapp(true);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c11485l, c15089l, c6956l6, 0);
                    long j7 = c6956l6.f14595continue;
                    int i7 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l6, c4346l);
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l2);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c1853lYandex4, c6415l);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato6, c6415l4);
                    AbstractC11043l.isPro(i7, c6956l6, c6415l5, c6956l6, c11192l);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling6, c6415l7);
                    boolean zPurchase = c6956l6.purchase(j3);
                    Object objM2132native2 = c6956l6.m2132native();
                    if (zPurchase || objM2132native2 == c13863l) {
                        objM2132native2 = AbstractC7076l.amazon(c14089l.isVip(), j3);
                        c6956l6.m2147try(objM2132native2);
                    }
                    AbstractC13010l.loadAd((String) objM2132native2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.spark_rfield_date), null, ((C14370l) c6956l6.isPro(abstractC5189l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(abstractC5189l)).loadAd.vip, c6956l6, 0, 0, 131066);
                    c6956l6.startapp(true);
                    c6956l6.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6858l(C14089l c14089l, C15968l c15968l) {
        this.f14345l = c14089l;
        this.f14346l = c15968l;
    }
}
