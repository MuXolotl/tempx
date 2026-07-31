package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؑٝؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0461l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0324l f1693l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1694l;

    public /* synthetic */ C0461l(C0324l c0324l, int i) {
        this.f1694l = i;
        this.f1693l = c0324l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f1694l;
        C13863l c13863l = C1867l.yandex;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C4346l c4346l = C4346l.f8873l;
        C0324l c0324l = this.f1693l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l, 0);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
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
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    Unit unit = Unit.INSTANCE;
                    boolean zAdmob = c6956l.admob(c0324l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        z = false;
                        objM2132native = new C16654l(c0324l, null, 0);
                        c6956l.m2147try(objM2132native);
                    } else {
                        z = false;
                    }
                    AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, z);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    AbstractC8960l.loadAd(null, 0L, null, c6956l, 0, 7);
                    c6956l.startapp(true);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l2, 0);
                    long j3 = c6956l2.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i4);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l8);
                    Unit unit2 = Unit.INSTANCE;
                    boolean zAdmob2 = c6956l2.admob(c0324l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C16654l(c0324l, null, 1);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC12311l.amazon(c6956l2, unit2, (Function2) objM2132native2);
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j4 = c6956l2.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l5);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l6);
                    AbstractC11043l.isPro(i5, c6956l2, c6415l7, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l8);
                    AbstractC8960l.loadAd(null, 0L, null, c6956l2, 0, 7);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
