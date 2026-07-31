package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؒؐؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0750l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5073l f2260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13765l f2261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2262l;

    public /* synthetic */ C0750l(int i, C5073l c5073l, C13765l c13765l) {
        this.f2262l = i;
        this.f2261l = c13765l;
        this.f2260l = c5073l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r8;
        Object obj4;
        int i = this.f2262l;
        final int i2 = 3;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        final C5073l c5073l = this.f2260l;
        final C13765l c13765l = this.f2261l;
        final int i3 = 2;
        final int i4 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    float fAdmob = c13765l.admob();
                    C12015l c12015l = new C12015l(0.0f, 100.0f);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling = c6956l.billing(c13765l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C15708l(c13765l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    Function1 function1 = (Function1) objM2132native;
                    boolean zBilling2 = c6956l.billing(c5073l) | c6956l.billing(c13765l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Function0() { // from class: lَؗٞ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i6 = i4;
                                C13765l c13765l2 = c13765l;
                                C5073l c5073l2 = c5073l;
                                switch (i6) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, 0, (int) c13765l2.admob(), null, 55));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, (int) c13765l2.admob(), 0, null, 59));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC5832l.yandex(fAdmob, function1, interfaceC17242lAmazon, null, false, (Function0) objM2132native2, AbstractC15788l.admob, AbstractC14566l.amazon(1837899396, new C15394l(c13765l, i4), c6956l), null, 0.0f, 100, c12015l, c6956l, 14156160);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l2.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    float fAdmob2 = c13765l.admob();
                    C12015l c12015l2 = new C12015l(0.0f, 100.0f);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling3 = c6956l2.billing(c13765l);
                    Object objM2132native3 = c6956l2.m2132native();
                    Object obj5 = objM2132native3;
                    if (zBilling3 || objM2132native3 == c13863l) {
                        C15708l c15708l = new C15708l(c13765l, 1);
                        c6956l2.m2147try(c15708l);
                        obj5 = c15708l;
                    }
                    Function1 function2 = (Function1) obj5;
                    boolean zBilling4 = c6956l2.billing(c5073l) | c6956l2.billing(c13765l);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zBilling4 || objM2132native4 == c13863l) {
                        r8 = 1;
                        final boolean z = true ? 1 : 0;
                        Function0 function0 = new Function0() { // from class: lَؗٞ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = z;
                                C13765l c13765l2 = c13765l;
                                C5073l c5073l2 = c5073l;
                                switch (i7) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, 0, (int) c13765l2.admob(), null, 55));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, (int) c13765l2.admob(), 0, null, 59));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(function0);
                        obj4 = function0;
                    } else {
                        r8 = 1;
                        obj4 = objM2132native4;
                    }
                    AbstractC5832l.yandex(fAdmob2, function2, interfaceC17242lAmazon2, null, false, (Function0) obj4, AbstractC15788l.billing, AbstractC14566l.amazon(1565858892, new C15394l(c13765l, r8), c6956l2), null, 0.0f, 100, c12015l2, c6956l2, 14156160);
                    c6956l2.startapp(r8);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l3.f14595continue;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l3);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i7), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, C3438l.amazon);
                    float fAdmob3 = c13765l.admob();
                    C12015l c12015l3 = new C12015l(0.0f, 100.0f);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling5 = c6956l3.billing(c13765l);
                    Object objM2132native5 = c6956l3.m2132native();
                    if (zBilling5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C15708l(c13765l, 3);
                        c6956l3.m2147try(objM2132native5);
                    }
                    Function1 function3 = (Function1) objM2132native5;
                    boolean zBilling6 = c6956l3.billing(c5073l) | c6956l3.billing(c13765l);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zBilling6 || objM2132native6 == c13863l) {
                        objM2132native6 = new Function0() { // from class: lَؗٞ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i3;
                                C13765l c13765l2 = c13765l;
                                C5073l c5073l2 = c5073l;
                                switch (i8) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, 0, (int) c13765l2.admob(), null, 55));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, (int) c13765l2.admob(), 0, null, 59));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native6);
                    }
                    AbstractC5832l.yandex(fAdmob3, function3, interfaceC17242lAmazon3, null, false, (Function0) objM2132native6, C5795l.purchase, AbstractC14566l.amazon(-1122336442, new C15394l(c13765l, i2), c6956l3), null, 0.0f, 100, c12015l3, c6956l3, 14156160);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip4 = AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l4.f14595continue;
                    int i8 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l4, interfaceC17242lVip4);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l4);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling4, C3438l.amazon);
                    float fAdmob4 = c13765l.admob();
                    C12015l c12015l4 = new C12015l(0.0f, 100.0f);
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling7 = c6956l4.billing(c13765l);
                    Object objM2132native7 = c6956l4.m2132native();
                    int i9 = 4;
                    if (zBilling7 || objM2132native7 == c13863l) {
                        objM2132native7 = new C15708l(c13765l, 4);
                        c6956l4.m2147try(objM2132native7);
                    }
                    Function1 function4 = (Function1) objM2132native7;
                    boolean zBilling8 = c6956l4.billing(c5073l) | c6956l4.billing(c13765l);
                    Object objM2132native8 = c6956l4.m2132native();
                    if (zBilling8 || objM2132native8 == c13863l) {
                        objM2132native8 = new Function0() { // from class: lَؗٞ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i10 = i2;
                                C13765l c13765l2 = c13765l;
                                C5073l c5073l2 = c5073l;
                                switch (i10) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, 0, (int) c13765l2.admob(), null, 55));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, false, (int) c13765l2.admob(), 0, null, 59));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), false, c13765l2.admob(), 5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l4.m2147try(objM2132native8);
                    }
                    AbstractC5832l.yandex(fAdmob4, function4, interfaceC17242lAmazon4, null, false, (Function0) objM2132native8, AbstractC5578l.crashlytics, AbstractC14566l.amazon(1255247257, new C15394l(c13765l, i9), c6956l4), null, 0.0f, 100, c12015l4, c6956l4, 14156160);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
