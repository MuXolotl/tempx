package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0849l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2501l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2502l;

    public /* synthetic */ C0849l(boolean z, int i) {
        this.f2502l = i;
        this.f2501l = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        long j;
        int i = this.f2502l;
        boolean z2 = this.f2501l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                C15089l c15089l = C18450l.f36046l;
                C14855l c14855l = C18450l.f36026l;
                C14855l c14855l2 = C18450l.f36043l;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l2, false);
                    long j2 = c6956l.f14595continue;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    InterfaceC17242l interfaceC17242lAdcel = AbstractC15042l.adcel(AbstractC10409l.admob(AbstractC3605l.smaato(c4346l, 16.0f).premium(AbstractC0080l.loadAd), 1), C1083l.pro(new C8195l[]{new C8195l(Float.valueOf(0.1f), new C9735l(C9735l.isPro)), new C8195l(Float.valueOf(0.5f), new C9735l(C9735l.loadAd))}));
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0019l.crashlytics(AbstractC17551l.loadAd(interfaceC17242lAdcel, 1.0f, ((C14370l) c6956l.isPro(c10707l)).yandex.premium, ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon), ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                    long j3 = c6956l.f14595continue;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics2);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    C14855l c14855l3 = C18450l.f36042l;
                    C16170l c16170l = C16170l.yandex;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l3), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 0);
                    long j4 = c6956l.f14595continue;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l, 6);
                    long j5 = c6956l.f14595continue;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
                    c6956l.m2123default(-55364627);
                    int i6 = 0;
                    while (true) {
                        C9946l c9946l = AbstractC16837l.yandex;
                        if (i6 < 5) {
                            C6839l c6839l = AbstractC7497l.yandex;
                            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.vip(AbstractC0019l.crashlytics(c4346l, c6839l), 92.0f), 16.0f);
                            C10707l c10707l2 = AbstractC16964l.yandex;
                            AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(interfaceC17242lPurchase, ((C14370l) c6956l.isPro(c10707l2)).yandex.startapp, c9946l), 1.0f, ((C14370l) c6956l.isPro(c10707l2)).yandex.premium, c6839l), c6956l, 0);
                            i6++;
                        } else {
                            c6956l.startapp(false);
                            c6956l.startapp(true);
                            AbstractC3308l.loadAd(C0397l.yandex, this.f2501l, null, AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15)), AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15)), null, AbstractC8317l.metrica, c6956l, 1600518, 18);
                            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                            InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(c4346l, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                            C1853l c1853lYandex3 = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 6);
                            long j6 = c6956l.f14595continue;
                            int i7 = (int) (j6 ^ (j6 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp2);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l2 = C3438l.loadAd;
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(c16395l2);
                            } else {
                                c6956l.m2136protected();
                            }
                            C6415l c6415l5 = C3438l.mopub;
                            AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l5);
                            C6415l c6415l6 = C3438l.billing;
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l6);
                            Integer numValueOf2 = Integer.valueOf(i7);
                            C6415l c6415l7 = C3438l.isPro;
                            AbstractC8182l.billing(c6956l, numValueOf2, c6415l7);
                            C11192l c11192l2 = C3438l.firebase;
                            AbstractC8182l.purchase(c6956l, c11192l2);
                            C6415l c6415l8 = C3438l.amazon;
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l8);
                            C9946l c9946l2 = c9946l;
                            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                            InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l, false);
                            long j7 = c6956l.f14595continue;
                            int i8 = (int) (j7 ^ (j7 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(c16395l2);
                            } else {
                                c6956l.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon3, c6415l5);
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l6);
                            AbstractC11043l.isPro(i8, c6956l, c6415l7, c6956l, c11192l2);
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l8);
                            InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, c14855l2);
                            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
                            long j8 = c6956l.f14595continue;
                            int i9 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato7 = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(c16395l2);
                            } else {
                                c6956l.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l5);
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato7, c6415l6);
                            AbstractC11043l.isPro(i9, c6956l, c6415l7, c6956l, c11192l2);
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling7, c6415l8);
                            c6956l.m2123default(-35727913);
                            int i10 = 0;
                            while (i10 < 3) {
                                InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 4.0f);
                                C6839l c6839l2 = AbstractC7497l.yandex;
                                InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0019l.crashlytics(interfaceC17242lIsPro, c6839l2);
                                if (i10 == 0) {
                                    c6956l.m2123default(-1655808694);
                                    j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                                    z = false;
                                } else {
                                    z = false;
                                    c6956l.m2123default(-1655807446);
                                    j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                                }
                                c6956l.startapp(z);
                                C9946l c9946l3 = c9946l2;
                                AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(interfaceC17242lCrashlytics3, j, c9946l3), i10 == 0 ? 0.0f : 1.0f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.premium, c6839l2), c6956l, 0);
                                i10++;
                                c9946l2 = c9946l3;
                            }
                            c6956l.startapp(false);
                            c6956l.startapp(true);
                            c6956l.startapp(true);
                            c6956l.startapp(true);
                            AbstractC12900l.ads(c6956l, true, true, true);
                        }
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                String str = (String) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(str) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z3 = (iIntValue2 & 14) == 4;
                    Object objM2132native = c6956l2.m2132native();
                    if (z3 || objM2132native == C1867l.yandex) {
                        objM2132native = str.toUpperCase(Locale.ROOT);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0L, 0L, new C11617l(!z2 ? 1 : 0), C6886l.f14420l, AbstractC1193l.crashlytics, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.crashlytics, c6956l2, 14155824, 0, 129820);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC18219l.ads(0, c6956l3, z2);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
