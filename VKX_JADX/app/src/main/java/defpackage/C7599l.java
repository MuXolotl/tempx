package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7599l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2752l f15634l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1774l f15635l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15636l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f15637l;

    public /* synthetic */ C7599l(C1774l c1774l, InterfaceC2752l interfaceC2752l, int i, int i2) {
        this.f15636l = i2;
        this.f15635l = c1774l;
        this.f15634l = interfaceC2752l;
        this.f15637l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.f15636l;
        C4346l c4346l = C4346l.f8873l;
        int i2 = this.f15637l;
        InterfaceC2752l interfaceC2752l = this.f15634l;
        C1774l c1774l = this.f15635l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(AbstractC14566l.amazon(390103489, new C7599l(c1774l, interfaceC2752l, i2, 1), c6956l), AbstractC4927l.amazon(c4346l, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), AbstractC14566l.amazon(1989252547, new C3369l(c1774l), c6956l), AbstractC14566l.amazon(-1866273940, new C1350l(1, c1774l), c6956l), 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), AbstractC0831l.billing(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 44), null, null, c6956l, 3462, 400);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C10086l c10086l = c1774l.f4197l;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(1.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
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
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(4.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l2, 54);
                    long j2 = c6956l2.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    String str = ((C14288l) c10086l.getValue()).yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str, new C9247l(1.0f, false), 0L, AbstractC7039l.isPro(20), null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.billing, c6956l2, 24576, 24960, 110572);
                    if (i2 == 2) {
                        c6956l2.m2123default(1251549513);
                        z = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_crown_vkx, 0, c6956l2), null, null, ((C14370l) c6956l2.isPro(c10707l2)).yandex.yandex, c6956l2, 56, 4);
                    } else {
                        z = false;
                        c6956l2.m2123default(1240177287);
                    }
                    c6956l2.startapp(z);
                    c6956l2.startapp(true);
                    String str2 = ((C14288l) c10086l.getValue()).loadAd;
                    C11090l c11090l = ((C14370l) c6956l2.isPro(c10707l2)).loadAd.subs;
                    InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(c4346l, 0.75f);
                    boolean zAdmob = c6956l2.admob(interfaceC2752l) | c6956l2.admob(c1774l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new Ctry(interfaceC2752l, c1774l, 2);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd(str2, AbstractC9151l.loadAd(interfaceC17242lYandex, false, null, (Function0) objM2132native, 15), 0L, 0L, null, C6886l.f14425l, null, 0L, null, 0L, 0, false, 0, 0, c11090l, c6956l2, 14155776, 0, 130876);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
