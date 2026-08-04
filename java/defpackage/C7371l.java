package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7371l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f15286l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f15287l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15288l;

    public /* synthetic */ C7371l(boolean z, Function2 function2, int i) {
        this.f15288l = 1;
        this.f15287l = z;
        this.f15286l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f15288l;
        C4346l c4346l = C4346l.f8873l;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C13863l c13863l = C1867l.yandex;
        boolean z4 = this.f15287l;
        Object obj3 = this.f15286l;
        byte b = 0;
        byte b2 = 0;
        switch (i) {
            case 0:
                C8039l c8039l = (C8039l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 16.0f, 0.0f, 16.0f, fYandex, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36034l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
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
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l2);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(z4 ? R.string.confirm_remove_from_blacklist : R.string.to_blacklist_title, new Object[]{c8039l.f16736l.yandex}, c6956l), AbstractC0080l.amazon(c4346l2, 1.0f), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130040);
                    if (z4) {
                        z = false;
                        c6956l.m2123default(339333270);
                    } else {
                        c6956l.m2123default(341917182);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.to_blacklist_content), AbstractC0080l.amazon(c4346l2, 1.0f), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 48, 0, 130040);
                        z = false;
                    }
                    c6956l.startapp(z);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
                    long j3 = c6956l.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c4346l2);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                    boolean zAdmob = c6956l.admob(c8039l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        Cconst cconst = new Cconst(0, c8039l, C8039l.class, "dismiss", "dismiss()V", 0, 0, 24);
                        c6956l.m2147try(cconst);
                        objM2132native = cconst;
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    AbstractC17457l.loadAd((Function0) interfaceC5059l, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, c13412lYandex, null, null, c17253l, AbstractC0775l.yandex, c6956l, 817889280, 356);
                    C17253l c17253l3 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C13412l c13412lYandex2 = C12719l.yandex(AbstractC13106l.purchase(c6956l).Signature, AbstractC13106l.purchase(c6956l).license, 0L, 0L, c6956l, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C6839l c6839l = AbstractC13106l.billing(c6956l).crashlytics;
                    boolean zMopub = c6956l.mopub(z4) | c6956l.admob(c8039l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zMopub || objM2132native2 == c13863l) {
                        objM2132native2 = new C10041l(z4, c8039l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native2, c9247l, false, c6839l, c13412lYandex2, null, null, c17253l3, AbstractC0775l.loadAd, c6956l, 817889280, 356);
                    AbstractC12900l.ads(c6956l, true, true, true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2130l.purchase(z4, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C14843l c14843l = (C14843l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C14855l c14855l = C18450l.f36026l;
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                    long j4 = c6956l2.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i5);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l8);
                    int i6 = c14843l.yandex;
                    int i7 = c14843l.loadAd;
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(i6, 0, c6956l2);
                    String strPurchase = AbstractC11999l.purchase(c6956l2, i7);
                    C14855l c14855l2 = C18450l.f36043l;
                    C16170l c16170l = C16170l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, strPurchase, c16170l.yandex(c4346l, c14855l2), 0L, c6956l2, 8, 8);
                    C6956l c6956l3 = c6956l2;
                    if (z4) {
                        z2 = false;
                        z3 = true;
                        c6956l3.m2123default(1593032559);
                    } else {
                        c6956l3.m2123default(1605672406);
                        InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c16170l.yandex(c4346l, C18450l.f36032l), AbstractC7497l.yandex);
                        C10707l c10707l = AbstractC16964l.yandex;
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242lCrashlytics, AbstractC12953l.firebase(C9735l.loadAd(0.5f, ((C14370l) c6956l3.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l3.isPro(c10707l)).yandex.ads), AbstractC16837l.yandex);
                        InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                        long j5 = c6956l3.f14595continue;
                        int i8 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato5 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l2);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon2, c6415l5);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato5, c6415l6);
                        AbstractC11043l.isPro(i8, c6956l3, c6415l7, c6956l3, c11192l2);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling5, c6415l8);
                        z2 = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_lock_outline_16, 0, c6956l3), null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 18.0f), 4.0f), 0L, c6956l3, 440, 8);
                        c6956l3 = c6956l3;
                        z3 = true;
                        c6956l3.startapp(true);
                    }
                    c6956l3.startapp(z2);
                    c6956l3.startapp(z3);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, i7), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l3, 0, 0, 131070);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                C4587l c4587l = (C4587l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(1.0f, true, new C8339l(12)), C18450l.f36040l, c6956l4, 54);
                    long j6 = c6956l4.f14595continue;
                    int i9 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l4, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l3);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling6, C3438l.amazon);
                    AbstractC13010l.loadAd(c4587l.crashlytics, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l4, 0, 24960, 241662);
                    if (z4) {
                        c6956l4.m2123default(-1472468830);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l4), null, AbstractC0080l.isPro(c4346l, 16.0f), 0L, c6956l4, 440, 8);
                    } else {
                        c6956l4.m2123default(-1488712365);
                    }
                    c6956l4.startapp(false);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C4456l c4456l = (C4456l) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) c4456l.f9074l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l5.admob(c4456l);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C0014l(c4456l, b == true ? 1 : 0);
                        c6956l5.m2147try(objM2132native3);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native3, null, this.f15287l, null, c6956l5, 0, 108);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC16817l.amazon((C16173l) obj3, z4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 6:
                C1026l c1026l = (C1026l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) c1026l.f2856l.getValue()).booleanValue();
                    boolean zAdmob3 = c6956l6.admob(c1026l);
                    Object objM2132native4 = c6956l6.m2132native();
                    if (zAdmob3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C15079l(14, c1026l);
                        c6956l6.m2147try(objM2132native4);
                    }
                    AbstractC2021l.yandex(zBooleanValue2, (Function1) objM2132native4, null, this.f15287l, null, c6956l6, 0, 108);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 7:
                C17984l c17984l = (C17984l) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    float fYandex2 = ((C15700l) c6956l7.isPro(AbstractC18678l.yandex)).yandex(c6956l7) + 8.0f;
                    C4346l c4346l3 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.startapp(c4346l3, 0.0f, 16.0f, 0.0f, fYandex2, 5), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l7, 0);
                    long j7 = c6956l7.f14595continue;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l7, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l4);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.billing(c6956l7, Integer.valueOf(i10), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l7, C3438l.firebase);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling7, C3438l.amazon);
                    boolean zAdmob4 = c6956l7.admob(c17984l);
                    Object objM2132native5 = c6956l7.m2132native();
                    if (zAdmob4 || objM2132native5 == c13863l) {
                        C13246l c13246l = new C13246l(0, c17984l, C17984l.class, "startAuth", "startAuth()V", 0, 0, 18);
                        c6956l7.m2147try(c13246l);
                        objM2132native5 = c13246l;
                    }
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l3, 1.0f);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    C6839l c6839l2 = ((C14370l) c6956l7.isPro(c10707l2)).crashlytics.crashlytics;
                    C17253l c17253l4 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l5 = C12719l.yandex;
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native5), interfaceC17242lAmazon2, false, c6839l2, C12719l.yandex(0L, ((C14370l) c6956l7.isPro(c10707l2)).yandex.license, 0L, 0L, c6956l7, 13), null, null, c17253l4, AbstractC4959l.billing, c6956l7, 817889328, 356);
                    C6956l c6956l8 = c6956l7;
                    AbstractC9334l.yandex(c6956l8, AbstractC0080l.purchase(c4346l3, 8.0f));
                    boolean zAdmob5 = c6956l8.admob(c17984l);
                    Object objM2132native6 = c6956l8.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        C13246l c13246l2 = new C13246l(0, c17984l, C17984l.class, "activateQrScanner", "activateQrScanner()V", 0, 0, 19);
                        c6956l8.m2147try(c13246l2);
                        objM2132native6 = c13246l2;
                    }
                    AbstractC17457l.purchase((Function0) ((InterfaceC5059l) objM2132native6), AbstractC0080l.amazon(c4346l3, 1.0f), false, ((C14370l) c6956l8.isPro(c10707l2)).crashlytics.crashlytics, null, null, null, AbstractC4959l.mopub, c6956l8, 805306416, 500);
                    if (z4) {
                        c6956l8.m2123default(177042672);
                        AbstractC9334l.yandex(c6956l8, AbstractC0080l.purchase(c4346l3, 16.0f));
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l8, 0, 7);
                        AbstractC9334l.yandex(c6956l8, AbstractC0080l.purchase(c4346l3, 8.0f));
                        boolean zAdmob6 = c6956l8.admob(c17984l);
                        Object objM2132native7 = c6956l8.m2132native();
                        if (zAdmob6 || objM2132native7 == c13863l) {
                            objM2132native7 = new C2573l(c17984l, b2 == true ? 1 : 0);
                            c6956l8.m2147try(objM2132native7);
                        }
                        AbstractC17457l.mopub((Function0) objM2132native7, AbstractC0080l.amazon(c4346l3, 1.0f), false, ((C14370l) c6956l8.isPro(c10707l2)).crashlytics.crashlytics, C12719l.subs(((C14370l) c6956l8.isPro(c10707l2)).yandex.subscription, 0L, c6956l8, 13), null, AbstractC4959l.admob, c6956l8, 805306416, 484);
                        c6956l8 = c6956l8;
                    } else {
                        c6956l8.m2123default(169250388);
                    }
                    c6956l8.startapp(false);
                    c6956l8.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((C17408l) obj3).m4323abstract(AbstractC0545l.purchase(1), (C6956l) obj, z4);
                break;
            case 9:
                C10507l c10507l = (C10507l) obj3;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    if (z4) {
                        c6956l9.m2123default(-1323240091);
                        AbstractC5889l.amazon(null, ((C18718l) c6956l9.isPro(AbstractC5992l.yandex)).loadAd, c6956l9, 0, 1);
                    } else {
                        c6956l9.m2123default(-1338918403);
                    }
                    c6956l9.startapp(false);
                    AbstractC13010l.loadAd(c10507l.loadAd.getCrashlytics(), null, ((C18718l) c6956l9.isPro(AbstractC5992l.yandex)).yandex, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l9, 0, 24960, 241658);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 10:
                C11279l c11279l = (C11279l) obj3;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!c6956l10.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c6956l10.m2124else();
                } else if (z4) {
                    c6956l10.m2123default(-1110963882);
                    boolean zBooleanValue3 = ((Boolean) c11279l.purchase.getValue()).booleanValue();
                    boolean zAdmob7 = c6956l10.admob(c11279l);
                    Object objM2132native8 = c6956l10.m2132native();
                    if (zAdmob7 || objM2132native8 == c13863l) {
                        C3151l c3151l = new C3151l(1, c11279l, C11279l.class, "set", "set(Z)V", 0, 0, 3);
                        c6956l10.m2147try(c3151l);
                        objM2132native8 = c3151l;
                    }
                    AbstractC2021l.yandex(zBooleanValue3, (Function1) ((InterfaceC5059l) objM2132native8), null, false, null, c6956l10, 0, 124);
                    c6956l10.startapp(false);
                } else {
                    c6956l10.m2123default(-1110863690);
                    AbstractC4597l.yandex(AbstractC3234l.billing(), null, null, ((C14370l) c6956l10.isPro(AbstractC16964l.yandex)).yandex.adcel, c6956l10, 48, 4);
                    c6956l10.startapp(false);
                }
                break;
            default:
                String strMopub = (String) obj3;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    if (z4) {
                        c6956l11.m2123default(-1199069927);
                        c6956l11.startapp(false);
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l11, -1198998627, R.string.storage_not_set, c6956l11, false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7371l(Object obj, boolean z, int i, int i2) {
        this.f15288l = i2;
        this.f15286l = obj;
        this.f15287l = z;
    }

    public /* synthetic */ C7371l(boolean z, Object obj, int i) {
        this.f15288l = i;
        this.f15287l = z;
        this.f15286l = obj;
    }

    public /* synthetic */ C7371l(Object obj, boolean z, int i) {
        this.f15288l = i;
        this.f15286l = obj;
        this.f15287l = z;
    }
}
