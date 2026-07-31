package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4293l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9455l f8778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8779l;

    public /* synthetic */ C4293l(C9455l c9455l, int i) {
        this.f8779l = 2;
        this.f8778l = c9455l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8779l;
        C9455l c9455l = this.f8778l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(c9455l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C7368l(c9455l, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC4447l.yandex, c6956l, 805306368, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C15589l c15589l = C5013l.yandex;
                    int iBilling = C5013l.billing();
                    C15089l c15089l = C18450l.f36046l;
                    C11485l c11485l = AbstractC8313l.crashlytics;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    C4346l c4346l = C4346l.f8873l;
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
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(c4346l, iBilling > 0 ? 1.0f : 0.5f);
                    boolean z = iBilling > 0;
                    C9455l c9455l2 = this.f8778l;
                    boolean zAdmob2 = c6956l2.admob(c9455l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C4936l(0, c9455l2, C9455l.class, "collectCrashesIntoZip", "collectCrashesIntoZip()V", 0, 0, 22);
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.vip(AbstractC9151l.loadAd(interfaceC17242lYandex, z, null, (Function0) ((InterfaceC5059l) objM2132native2), 14), 0.0f, 8.0f, 1), 1.0f);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    AbstractC13010l.loadAd("Поделиться в ZIP-архиве", null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).isPro, c6956l2, 6, 0, 131066);
                    c6956l2.startapp(true);
                    boolean zAdmob3 = c6956l2.admob(c9455l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C4936l(0, c9455l2, C9455l.class, "collectLogcat", "collectLogcat()V", 0, 0, 23);
                        c6956l2.m2147try(objM2132native3);
                    }
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(AbstractC3605l.vip(AbstractC9151l.loadAd(c4346l, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), 0.0f, 8.0f, 1), 1.0f);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j3 = c6956l2.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex3, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                    AbstractC13010l.loadAd("Поделиться логами", null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).isPro, c6956l2, 6, 0, 131066);
                    c6956l2.startapp(true);
                    boolean zAdmob4 = c6956l2.admob(c9455l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C4936l(0, c9455l2, C9455l.class, "clearCrashes", "clearCrashes()V", 0, 0, 24);
                        c6956l2.m2147try(objM2132native4);
                    }
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(AbstractC3605l.vip(AbstractC9151l.loadAd(c4346l, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), 0.0f, 8.0f, 1), 1.0f);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j4 = c6956l2.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon3);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex4, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                    AbstractC13010l.loadAd("Очистить папку", null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).isPro, c6956l2, 6, 0, 131066);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = "отчетов записано: " + iBilling;
                        c6956l2.m2147try(objM2132native5);
                    }
                    AbstractC13010l.loadAd((String) objM2132native5, null, AbstractC13106l.purchase(c6956l2).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 6, 0, 262138);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c9455l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C9455l c9455l3 = this.f8778l;
                    boolean zAdmob5 = c6956l3.admob(c9455l3);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        C4936l c4936l = new C4936l(0, c9455l3, C9455l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 25);
                        c6956l3.m2147try(c4936l);
                        objM2132native6 = c4936l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native6), null, false, null, null, null, AbstractC4447l.amazon, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4293l(C9455l c9455l, int i, byte b) {
        this.f8779l = i;
        this.f8778l = c9455l;
    }
}
