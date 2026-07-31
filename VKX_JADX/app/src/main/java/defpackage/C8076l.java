package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًَٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8076l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16841l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16842l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16843l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f16844l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f16845l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f16846l;

    public /* synthetic */ C8076l(C9879l c9879l, C15578l c15578l, C15578l c15578l2, boolean z, Function0 function0, int i) {
        this.f16843l = 2;
        this.f16842l = c9879l;
        this.f16845l = c15578l;
        this.f16844l = c15578l2;
        this.f16841l = z;
        this.f16846l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        int iMopub;
        int iMopub2;
        int i = this.f16843l;
        boolean z5 = this.f16841l;
        int i2 = 9;
        byte b = 0;
        Object obj3 = this.f16846l;
        Object obj4 = this.f16844l;
        Object obj5 = this.f16845l;
        Object obj6 = this.f16842l;
        switch (i) {
            case 0:
                C0483l c0483l = (C0483l) obj6;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj5;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                C14267l c14267l = (C14267l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 0);
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    C4346l c4346l = C4346l.f8873l;
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
                    C9879l c9879l = c0483l.yandex;
                    C12362l c12362l = c9879l.ads;
                    EnumC12999l enumC12999l = (EnumC12999l) c12362l.amazon.getValue();
                    boolean z6 = (c12362l.yandex() instanceof C16016l) || (c12362l.yandex() instanceof C6143l);
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    boolean zAdmob = c6956l.admob(c0483l) | c6956l.admob(interfaceC2262l);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0464l(c0483l, interfaceC2262l, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    Function1 function1 = (Function1) objM2132native;
                    boolean zAdmob2 = c6956l.admob(c0483l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C1657l(c0483l, 5);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function0 function0 = (Function0) objM2132native2;
                    boolean zAdmob3 = c6956l.admob(c0483l);
                    Object objM2132native3 = c6956l.m2132native();
                    int i4 = 6;
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C1657l(c0483l, i4);
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC8007l.amazon(enumC12999l, function1, z6, function0, (Function0) objM2132native3, interfaceC17242lVip, c6956l, 196608);
                    C6956l c6956l2 = c6956l;
                    if (((C18554l) interfaceC8714l.getValue()).f36220l) {
                        z = false;
                        z2 = true;
                        c6956l2.m2123default(-1286381479);
                    } else {
                        c6956l2.m2123default(-1251532581);
                        EnumC11447l enumC11447l = EnumC11447l.f23032l;
                        if (z5) {
                            c6956l2.m2123default(-1251531062);
                            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 16.0f, 1);
                            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
                            long j2 = c6956l2.f14595continue;
                            int i5 = (int) (j2 ^ (j2 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip2);
                            c6956l2.m2140super();
                            if (c6956l2.f14603switch) {
                                c6956l2.firebase(c16395l);
                            } else {
                                c6956l2.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
                            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                            if (c14267l.subs) {
                                f = Float.MAX_VALUE;
                                z4 = false;
                                c6956l2.m2123default(-896094765);
                            } else {
                                c6956l2.m2123default(-860788245);
                                f = Float.MAX_VALUE;
                                if (1.0f <= 0.0d) {
                                    AbstractC10440l.yandex("invalid weight; must be greater than zero");
                                }
                                C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                long j3 = c6956l2.f14595continue;
                                int i6 = (int) (j3 ^ (j3 >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                                InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c9247l);
                                c6956l2.m2140super();
                                if (c6956l2.f14603switch) {
                                    c6956l2.firebase(c16395l);
                                } else {
                                    c6956l2.m2136protected();
                                }
                                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                                AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
                                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                                z4 = false;
                                c0483l.billing(c9879l.subs(), c6956l2, 0);
                                c6956l2.startapp(true);
                            }
                            c6956l2.startapp(z4);
                            EnumC12501l enumC12501l = c14267l.purchase;
                            boolean z7 = c14267l.billing;
                            boolean z8 = c14267l.mopub;
                            boolean z9 = c14267l.crashlytics == enumC11447l;
                            boolean z10 = c14267l.admob;
                            boolean z11 = c14267l.subs;
                            boolean z12 = !c14267l.isPro;
                            if (1.0f <= 0.0d) {
                                AbstractC10440l.yandex("invalid weight; must be greater than zero");
                            }
                            c0483l.crashlytics(new C9247l(1.0f > f ? f : 1.0f, true), enumC12501l, z7, z8, z9, z10, z11, z12, c14267l.remoteconfig, c6956l2, 0);
                            c6956l2 = c6956l2;
                            c6956l2.startapp(true);
                            z = false;
                            c6956l2.startapp(false);
                            z2 = true;
                        } else {
                            c6956l2.m2123default(-1249550255);
                            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l2, 6);
                            long j4 = c6956l2.f14595continue;
                            int i7 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                            c6956l2.m2140super();
                            if (c6956l2.f14603switch) {
                                c6956l2.firebase(c16395l);
                            } else {
                                c6956l2.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                            AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
                            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                            if (c14267l.subs) {
                                z3 = false;
                                c6956l2.m2123default(-1650336338);
                            } else {
                                c6956l2.m2123default(-1613050096);
                                z3 = false;
                                c0483l.billing(c9879l.subs(), c6956l2, 0);
                            }
                            c6956l2.startapp(z3);
                            z2 = true;
                            c0483l.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), c14267l.purchase, c14267l.billing, c14267l.mopub, c14267l.crashlytics == enumC11447l, c14267l.admob, c14267l.subs, !c14267l.isPro, c14267l.remoteconfig, c6956l2, 6);
                            c6956l2 = c6956l2;
                            c6956l2.startapp(true);
                            z = false;
                            c6956l2.startapp(false);
                        }
                    }
                    c6956l2.startapp(z);
                    c6956l2.startapp(z2);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0483l) obj6).isPro(this.f16841l, (C15578l) obj5, (C15578l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(433));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C9879l) obj6).purchase((C15578l) obj5, (C15578l) obj4, this.f16841l, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(439));
                break;
            case 3:
                Function2 function2 = (Function2) obj6;
                C3500l c3500l = (C3500l) obj5;
                Function2 function3 = (Function2) obj4;
                Function2 function4 = (Function2) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (function2 != null) {
                        c6956l3.m2123default(-864613344);
                        AbstractC10478l.yandex(AbstractC5020l.startapp(z5 ? c3500l.loadAd : c3500l.purchase, AbstractC12502l.yandex), AbstractC14566l.amazon(1241781204, new C13393l(function2, i2, b), c6956l3), c6956l3, 56);
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(-864297175);
                        c6956l3.startapp(false);
                    }
                    C8540l c8540l = AbstractC12502l.yandex;
                    AbstractC10478l.yandex(AbstractC5020l.startapp(z5 ? c3500l.yandex : c3500l.amazon, c8540l), AbstractC14566l.amazon(-893579015, new C12755l(function2, function3, function4, 22), c6956l3), c6956l3, 56);
                    if (function3 != null) {
                        c6956l3.m2123default(-863399043);
                        AbstractC10478l.yandex(AbstractC5020l.startapp(z5 ? c3500l.crashlytics : c3500l.billing, c8540l), AbstractC14566l.amazon(-782441013, new C13393l(function3, 10, b), c6956l3), c6956l3, 56);
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(-863079991);
                        c6956l3.startapp(false);
                    }
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC8007l.subs((String) obj6, this.f16841l, (Function0) obj5, (Function0) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(196657));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C18534l) obj6).pro(this.f16841l, (String) obj5, (InterfaceC6347l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(24577));
                break;
            default:
                C17078l c17078l = (C17078l) obj6;
                C12217l c12217l = (C12217l) obj5;
                EnumC1826l enumC1826l = (EnumC1826l) obj4;
                C17078l c17078l2 = (C17078l) obj3;
                c17078l.f33243l = C1187l.subs(c17078l.f33243l, ((C1187l) obj2).yandex);
                C10312l c10312l = c12217l.loadAd;
                C16328l c16328l = c12217l.yandex;
                C0327l c0327lCrashlytics = c10312l.crashlytics();
                if (c0327lCrashlytics != null) {
                    C6222l c6222l = c0327lCrashlytics.loadAd;
                    c12217l.isVip(enumC1826l, C1187l.subs(c17078l2.f33243l, c17078l.f33243l));
                    boolean z13 = this.f16841l;
                    if (z13) {
                        iMopub = c6222l.mopub(c12217l.vip());
                    } else {
                        long j5 = c16328l.amazon().f12061l;
                        int i8 = C12814l.crashlytics;
                        iMopub = (int) (j5 >> 32);
                    }
                    int i9 = iMopub;
                    if (z13) {
                        long j6 = c16328l.amazon().f12061l;
                        int i10 = C12814l.crashlytics;
                        iMopub2 = (int) (j6 & 4294967295L);
                    } else {
                        iMopub2 = c6222l.mopub(c12217l.vip());
                    }
                    int i11 = iMopub2;
                    long j7 = c16328l.amazon().f12061l;
                    long jSignatures = c12217l.signatures(c16328l.amazon(), i9, i11, z13, C1461l.f3660l, false, false, new C14797l(9));
                    if (C12814l.amazon(j7) || !C12814l.amazon(jSignatures)) {
                        c16328l.isPro(jSignatures);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8076l(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f16843l = i;
        this.f16842l = obj;
        this.f16845l = obj2;
        this.f16841l = z;
        this.f16844l = obj3;
        this.f16846l = obj4;
    }

    public /* synthetic */ C8076l(C17078l c17078l, C12217l c12217l, EnumC1826l enumC1826l, C17078l c17078l2, boolean z) {
        this.f16843l = 6;
        this.f16842l = c17078l;
        this.f16845l = c12217l;
        this.f16844l = enumC1826l;
        this.f16846l = c17078l2;
        this.f16841l = z;
    }

    public /* synthetic */ C8076l(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f16843l = i2;
        this.f16842l = obj;
        this.f16841l = z;
        this.f16845l = obj2;
        this.f16844l = obj3;
        this.f16846l = obj4;
    }
}
