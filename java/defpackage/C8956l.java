package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8956l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f18469l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16307l f18470l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18471l = 0;

    public /* synthetic */ C8956l(C0228l c0228l, C16307l c16307l) {
        this.f18469l = c0228l;
        this.f18470l = c16307l;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0444 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0446  */
    /* JADX WARN: Code duplicated, block: B:104:0x0496 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0498  */
    /* JADX WARN: Code duplicated, block: B:89:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:96:0x03f2  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4346l c4346l;
        C6415l c6415l;
        C6415l c6415l2;
        C11192l c11192l;
        C6415l c6415l3;
        boolean z;
        float f;
        C13863l c13863l;
        C13863l c13863l2;
        C6956l c6956l;
        boolean zAdmob;
        Object objM2132native;
        C13863l c13863l3;
        boolean zAdmob2;
        Object objM2132native2;
        boolean zAdmob3;
        Object objM2132native3;
        int i;
        int i2 = this.f18471l;
        C13863l c13863l4 = C1867l.yandex;
        C0228l c0228l = this.f18469l;
        C16307l c16307l = this.f18470l;
        int i3 = 1;
        switch (i2) {
            case 0:
                C10086l c10086l = c0228l.f1208l;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    C15089l c15089l = C18450l.f36046l;
                    C11485l c11485l = AbstractC8313l.crashlytics;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l4 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l4);
                    C6415l c6415l5 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l5);
                    Integer numValueOf = Integer.valueOf(i4);
                    C6415l c6415l6 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l6);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l2);
                    C6415l c6415l7 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l7);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l2, 16.0f, 0.0f, 2);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 6);
                    long j2 = c6956l2.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l4);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l5);
                    AbstractC11043l.isPro(i5, c6956l2, c6415l6, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l7);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36016l, c6956l2, 54);
                    long j3 = c6956l2.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l4);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l5);
                    AbstractC11043l.isPro(i6, c6956l2, c6415l6, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l7);
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l2, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), 84.0f);
                    boolean zAdmob4 = c6956l2.admob(c0228l) | c6956l2.admob(c16307l);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l4) {
                        objM2132native4 = new C1446l(c0228l, c16307l);
                        c6956l2.m2147try(objM2132native4);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lIsPro, false, null, (Function0) objM2132native4, 15);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l2.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l4);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l5);
                    AbstractC11043l.isPro(i7, c6956l2, c6415l6, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l7);
                    if (c0228l.f1207l) {
                        c4346l = c4346l2;
                        c6415l = c6415l7;
                        c6415l2 = c6415l5;
                        c11192l = c11192l2;
                        c6415l3 = c6415l6;
                        z = false;
                        f = 84.0f;
                        c6956l2.m2123default(-824831564);
                    } else {
                        c6956l2.m2123default(-810339653);
                        if (((C14115l) c10086l.getValue()) != null) {
                            c6956l2.m2123default(-810283450);
                            c4346l = c4346l2;
                            f = 84.0f;
                            C12371l.loadAd((C14115l) c10086l.getValue(), AbstractC0080l.isPro(c4346l, 84.0f), c6956l2, 432, 248);
                            c6956l2.startapp(false);
                            z = false;
                            c6415l = c6415l7;
                            c6415l2 = c6415l5;
                            c11192l = c11192l2;
                            c6415l3 = c6415l6;
                        } else {
                            c4346l = c4346l2;
                            f = 84.0f;
                            c6956l2.m2123default(-809911264);
                            c11192l = c11192l2;
                            c6415l = c6415l7;
                            c6415l2 = c6415l5;
                            c6415l3 = c6415l6;
                            AbstractC17307l.billing(c0228l.f1204l, 3, 0L, 0L, R.drawable.ic_playlist_outline_28, 84.0f, false, null, null, null, c6956l2, 196656, 972);
                            c6956l2 = c6956l2;
                            z = false;
                            c6956l2.startapp(false);
                        }
                    }
                    c6956l2.startapp(z);
                    InterfaceC17242l interfaceC17242lIsPro2 = AbstractC0080l.isPro(AbstractC4927l.amazon(c4346l, C9735l.loadAd(0.5f, C9735l.loadAd), AbstractC16837l.yandex), f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, z);
                    long j5 = c6956l2.f14595continue;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l2, interfaceC17242lIsPro2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l4);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato5, c6415l2);
                    AbstractC11043l.isPro(i8, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling5, c6415l);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_picture_outline_28, 0, c6956l2), null, null, C9735l.purchase, c6956l2, 3128, 4);
                    c6956l2.startapp(true);
                    boolean zBooleanValue = ((Boolean) c0228l.f1200l.getValue()).booleanValue();
                    boolean zAdmob5 = c6956l2.admob(c0228l);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zAdmob5) {
                        c13863l = c13863l4;
                    } else {
                        c13863l = c13863l4;
                        if (objM2132native5 == c13863l) {
                        }
                        c13863l2 = c13863l;
                        c6956l = c6956l2;
                        AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native5, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(918052211, new C8956l(c16307l, c0228l), c6956l2), c6956l, 0, 2044);
                        c6956l.startapp(true);
                        C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
                        long j6 = c6956l.f14595continue;
                        int i9 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
                        InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, c4346l);
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(c16395l);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l4);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l2);
                        AbstractC11043l.isPro(i9, c6956l, c6415l3, c6956l, c11192l);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l);
                        String strApplovin = c0228l.applovin();
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                        zAdmob = c6956l.admob(c0228l);
                        objM2132native = c6956l.m2132native();
                        if (zAdmob) {
                            c13863l3 = c13863l2;
                        } else {
                            c13863l3 = c13863l2;
                            if (objM2132native == c13863l3) {
                            }
                            AbstractC2130l.amazon(strApplovin, (Function1) objM2132native, interfaceC17242lAmazon, false, null, AbstractC11184l.firebase, null, null, null, false, null, null, null, true, 1, 0, null, null, c6956l, 1573248, 113246208, 7995320);
                            c6956l.startapp(true);
                            c6956l.startapp(true);
                            String strSignatures = c0228l.signatures();
                            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                            zAdmob2 = c6956l.admob(c0228l);
                            objM2132native2 = c6956l.m2132native();
                            if (zAdmob2 || objM2132native2 == c13863l3) {
                                objM2132native2 = new C8946l(c0228l, 2);
                                c6956l.m2147try(objM2132native2);
                            }
                            AbstractC2130l.amazon(strSignatures, (Function1) objM2132native2, interfaceC17242lAmazon2, false, null, AbstractC11184l.smaato, null, null, null, false, null, null, null, false, 3, 3, null, null, c6956l, 1573248, 905969664, 7602104);
                            c6956l.startapp(true);
                            c6956l.m2123default(2043004735);
                            InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                            zAdmob3 = c6956l.admob(c0228l);
                            objM2132native3 = c6956l.m2132native();
                            i = 7;
                            if (zAdmob3 || objM2132native3 == c13863l3) {
                                objM2132native3 = new C6303l(c0228l, i);
                                c6956l.m2147try(objM2132native3);
                            }
                            AbstractC13319l.yandex(AbstractC11184l.startapp, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC11184l.adcel, null, AbstractC14566l.amazon(-2046802571, new C15956l(c0228l, i, (byte) 0), c6956l), null, c6956l, 199686, 468);
                            c6956l.startapp(false);
                            c6956l.startapp(true);
                        }
                        objM2132native = new C8946l(c0228l, 3);
                        c6956l.m2147try(objM2132native);
                        AbstractC2130l.amazon(strApplovin, (Function1) objM2132native, interfaceC17242lAmazon, false, null, AbstractC11184l.firebase, null, null, null, false, null, null, null, true, 1, 0, null, null, c6956l, 1573248, 113246208, 7995320);
                        c6956l.startapp(true);
                        c6956l.startapp(true);
                        String strSignatures2 = c0228l.signatures();
                        InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                        zAdmob2 = c6956l.admob(c0228l);
                        objM2132native2 = c6956l.m2132native();
                        if (zAdmob2) {
                            objM2132native2 = new C8946l(c0228l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C8946l(c0228l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        AbstractC2130l.amazon(strSignatures2, (Function1) objM2132native2, interfaceC17242lAmazon4, false, null, AbstractC11184l.smaato, null, null, null, false, null, null, null, false, 3, 3, null, null, c6956l, 1573248, 905969664, 7602104);
                        c6956l.startapp(true);
                        c6956l.m2123default(2043004735);
                        InterfaceC17242l interfaceC17242lAmazon5 = AbstractC0080l.amazon(c4346l, 1.0f);
                        zAdmob3 = c6956l.admob(c0228l);
                        objM2132native3 = c6956l.m2132native();
                        i = 7;
                        if (zAdmob3) {
                            objM2132native3 = new C6303l(c0228l, i);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C6303l(c0228l, i);
                            c6956l.m2147try(objM2132native3);
                        }
                        AbstractC13319l.yandex(AbstractC11184l.startapp, AbstractC9151l.loadAd(interfaceC17242lAmazon5, false, null, (Function0) objM2132native3, 15), null, AbstractC11184l.adcel, null, AbstractC14566l.amazon(-2046802571, new C15956l(c0228l, i, (byte) 0), c6956l), null, c6956l, 199686, 468);
                        c6956l.startapp(false);
                        c6956l.startapp(true);
                    }
                    objM2132native5 = new C6303l(c0228l, 8);
                    c6956l2.m2147try(objM2132native5);
                    c13863l2 = c13863l;
                    c6956l = c6956l2;
                    AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native5, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(918052211, new C8956l(c16307l, c0228l), c6956l2), c6956l, 0, 2044);
                    c6956l.startapp(true);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
                    long j7 = c6956l.f14595continue;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex4, c6415l4);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato7, c6415l2);
                    AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling7, c6415l);
                    String strApplovin2 = c0228l.applovin();
                    InterfaceC17242l interfaceC17242lAmazon6 = AbstractC0080l.amazon(c4346l, 1.0f);
                    zAdmob = c6956l.admob(c0228l);
                    objM2132native = c6956l.m2132native();
                    if (zAdmob) {
                        c13863l3 = c13863l2;
                        if (objM2132native == c13863l3) {
                        }
                        AbstractC2130l.amazon(strApplovin2, (Function1) objM2132native, interfaceC17242lAmazon6, false, null, AbstractC11184l.firebase, null, null, null, false, null, null, null, true, 1, 0, null, null, c6956l, 1573248, 113246208, 7995320);
                        c6956l.startapp(true);
                        c6956l.startapp(true);
                        String strSignatures3 = c0228l.signatures();
                        InterfaceC17242l interfaceC17242lAmazon7 = AbstractC0080l.amazon(c4346l, 1.0f);
                        zAdmob2 = c6956l.admob(c0228l);
                        objM2132native2 = c6956l.m2132native();
                        if (zAdmob2) {
                            objM2132native2 = new C8946l(c0228l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C8946l(c0228l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        AbstractC2130l.amazon(strSignatures3, (Function1) objM2132native2, interfaceC17242lAmazon7, false, null, AbstractC11184l.smaato, null, null, null, false, null, null, null, false, 3, 3, null, null, c6956l, 1573248, 905969664, 7602104);
                        c6956l.startapp(true);
                        c6956l.m2123default(2043004735);
                        InterfaceC17242l interfaceC17242lAmazon8 = AbstractC0080l.amazon(c4346l, 1.0f);
                        zAdmob3 = c6956l.admob(c0228l);
                        objM2132native3 = c6956l.m2132native();
                        i = 7;
                        if (zAdmob3) {
                            objM2132native3 = new C6303l(c0228l, i);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C6303l(c0228l, i);
                            c6956l.m2147try(objM2132native3);
                        }
                        AbstractC13319l.yandex(AbstractC11184l.startapp, AbstractC9151l.loadAd(interfaceC17242lAmazon8, false, null, (Function0) objM2132native3, 15), null, AbstractC11184l.adcel, null, AbstractC14566l.amazon(-2046802571, new C15956l(c0228l, i, (byte) 0), c6956l), null, c6956l, 199686, 468);
                        c6956l.startapp(false);
                        c6956l.startapp(true);
                    } else {
                        c13863l3 = c13863l2;
                    }
                    objM2132native = new C8946l(c0228l, 3);
                    c6956l.m2147try(objM2132native);
                    AbstractC2130l.amazon(strApplovin2, (Function1) objM2132native, interfaceC17242lAmazon6, false, null, AbstractC11184l.firebase, null, null, null, false, null, null, null, true, 1, 0, null, null, c6956l, 1573248, 113246208, 7995320);
                    c6956l.startapp(true);
                    c6956l.startapp(true);
                    String strSignatures4 = c0228l.signatures();
                    InterfaceC17242l interfaceC17242lAmazon9 = AbstractC0080l.amazon(c4346l, 1.0f);
                    zAdmob2 = c6956l.admob(c0228l);
                    objM2132native2 = c6956l.m2132native();
                    if (zAdmob2) {
                        objM2132native2 = new C8946l(c0228l, 2);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C8946l(c0228l, 2);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC2130l.amazon(strSignatures4, (Function1) objM2132native2, interfaceC17242lAmazon9, false, null, AbstractC11184l.smaato, null, null, null, false, null, null, null, false, 3, 3, null, null, c6956l, 1573248, 905969664, 7602104);
                    c6956l.startapp(true);
                    c6956l.m2123default(2043004735);
                    InterfaceC17242l interfaceC17242lAmazon10 = AbstractC0080l.amazon(c4346l, 1.0f);
                    zAdmob3 = c6956l.admob(c0228l);
                    objM2132native3 = c6956l.m2132native();
                    i = 7;
                    if (zAdmob3) {
                        objM2132native3 = new C6303l(c0228l, i);
                        c6956l.m2147try(objM2132native3);
                    } else {
                        objM2132native3 = new C6303l(c0228l, i);
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC11184l.startapp, AbstractC9151l.loadAd(interfaceC17242lAmazon10, false, null, (Function0) objM2132native3, 15), null, AbstractC11184l.adcel, null, AbstractC14566l.amazon(-2046802571, new C15956l(c0228l, i, (byte) 0), c6956l), null, c6956l, 199686, 468);
                    c6956l.startapp(false);
                    c6956l.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zAdmob6 = c6956l3.admob(c16307l) | c6956l3.admob(c0228l);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l4) {
                        objM2132native6 = new C1446l(c16307l, c0228l);
                        c6956l3.m2147try(objM2132native6);
                    }
                    AbstractC16727l.loadAd(AbstractC11184l.mopub, (Function0) objM2132native6, null, AbstractC11184l.admob, null, false, null, null, c6956l3, 3078, 500);
                    C17253l c17253l = AbstractC13451l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    long j8 = ((C14370l) c6956l3.isPro(c10707l)).yandex.pro;
                    long j9 = ((C14370l) c6956l3.isPro(c10707l)).yandex.pro;
                    long j10 = C9735l.firebase;
                    C3500l c3500lYandex = AbstractC13451l.yandex(((C14370l) c6956l3.isPro(c10707l)).yandex);
                    if (j9 == 16) {
                        j9 = c3500lYandex.yandex;
                    }
                    long j11 = j9;
                    if (j8 == 16) {
                        j8 = c3500lYandex.loadAd;
                    }
                    long j12 = j8;
                    long j13 = j10 != 16 ? j10 : c3500lYandex.crashlytics;
                    long j14 = j10 != 16 ? j10 : c3500lYandex.amazon;
                    long j15 = j10 != 16 ? j10 : c3500lYandex.purchase;
                    if (j10 == 16) {
                        j10 = c3500lYandex.billing;
                    }
                    C3500l c3500l = new C3500l(j11, j12, j13, j14, j15, j10);
                    boolean zAdmob7 = c6956l3.admob(c0228l);
                    Object objM2132native7 = c6956l3.m2132native();
                    if (zAdmob7 || objM2132native7 == c13863l4) {
                        objM2132native7 = new C6303l(c0228l, i3);
                        c6956l3.m2147try(objM2132native7);
                    }
                    AbstractC16727l.loadAd(AbstractC11184l.subs, (Function0) objM2132native7, null, AbstractC11184l.isPro, null, false, c3500l, null, c6956l3, 3078, 436);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8956l(C16307l c16307l, C0228l c0228l) {
        this.f18470l = c16307l;
        this.f18469l = c0228l;
    }
}
