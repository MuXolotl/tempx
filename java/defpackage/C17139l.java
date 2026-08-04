package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17139l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12457l f33324l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33325l;

    public /* synthetic */ C17139l(C12457l c12457l, int i) {
        this.f33325l = i;
        this.f33324l = c12457l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33325l;
        final C12457l c12457l = this.f33324l;
        final int i2 = 1;
        C1336l c1336l = (C1336l) obj;
        switch (i) {
            case 0:
                final int i3 = 0;
                if (AbstractC11173l.crashlytics()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-113221286, true, new Function3() { // from class: lًٗۚ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i4 = i3;
                            C13863l c13863l = C1867l.yandex;
                            C4346l c4346l = C4346l.f8873l;
                            C12457l c12457l2 = c12457l;
                            int i5 = 1;
                            switch (i4) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 16.0f, 1);
                                        C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
                                        long j = c6956l.f14595continue;
                                        int i6 = (int) (j ^ (j >>> 32));
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
                                        AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                                        AbstractC8182l.billing(c6956l, Integer.valueOf(i6), C3438l.isPro);
                                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                                        String strPurchase = AbstractC11999l.purchase(c6956l, R.string.themes_category_monet);
                                        C10707l c10707l = AbstractC16964l.yandex;
                                        AbstractC13010l.loadAd(strPurchase, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 131064);
                                        C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                                        C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                                        boolean zAdmob = c6956l.admob(c12457l2);
                                        Object objM2132native = c6956l.m2132native();
                                        if (zAdmob || objM2132native == c13863l) {
                                            objM2132native = new C17139l(c12457l2, i5);
                                            c6956l.m2147try(objM2132native);
                                        }
                                        AbstractC16336l.loadAd(null, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24960, 491);
                                        c6956l.startapp(true);
                                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                        boolean zAdmob2 = c6956l2.admob(c12457l2);
                                        Object objM2132native2 = c6956l2.m2132native();
                                        if (zAdmob2 || objM2132native2 == c13863l) {
                                            objM2132native2 = new C5767l(4, c12457l2);
                                            c6956l2.m2147try(objM2132native2);
                                        }
                                        AbstractC4111l.crashlytics(0, 0, c6956l2, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native2, 15));
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                C4588l c4588lPurchase = AbstractC6145l.loadAd.purchase();
                c1336l.firebase(((C12463l) c4588lPurchase.f9321l).loadAd, null, new C2273l(c4588lPurchase, 0), new C15578l(2039820996, true, new C6780l(c4588lPurchase, c12457l, 24)));
                break;
            default:
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(2044770637, true, new Function3() { // from class: lًٗۚ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i4 = i2;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        C12457l c12457l2 = c12457l;
                        int i5 = 1;
                        switch (i4) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 16.0f, 1);
                                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
                                    long j = c6956l.f14595continue;
                                    int i6 = (int) (j ^ (j >>> 32));
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
                                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                                    AbstractC8182l.billing(c6956l, Integer.valueOf(i6), C3438l.isPro);
                                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.themes_category_monet);
                                    C10707l c10707l = AbstractC16964l.yandex;
                                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 131064);
                                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                                    boolean zAdmob = c6956l.admob(c12457l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        objM2132native = new C17139l(c12457l2, i5);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC16336l.loadAd(null, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24960, 491);
                                    c6956l.startapp(true);
                                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l2.admob(c12457l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C5767l(4, c12457l2);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC4111l.crashlytics(0, 0, c6956l2, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native2, 15));
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
