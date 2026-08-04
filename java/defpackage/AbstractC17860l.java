package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17860l {
    public static final C15578l yandex = new C15578l(-261405289, false, new C4832l(20));
    public static final C15578l loadAd = new C15578l(152393271, false, new C4832l(22));
    public static final C15578l crashlytics = new C15578l(103739118, false, new C4832l(25));
    public static final C15578l amazon = new C15578l(-1062836547, false, new C13881l(7));
    public static final C15578l purchase = new C15578l(-506498927, false, new C13881l(8));
    public static final C15578l billing = new C15578l(-1062617658, false, new C4832l(26));
    public static final C15578l mopub = new C15578l(-669826142, false, new C4832l(27));
    public static final C15578l admob = new C15578l(746944487, false, new C4832l(28));
    public static final C15578l subs = new C15578l(228621212, false, new C1590l(0));
    public static final C15578l isPro = new C15578l(1671972371, false, new C1590l(1));
    public static final C15578l firebase = new C15578l(-1836644268, false, new C4832l(29));
    public static final C15578l smaato = new C15578l(-1050293611, false, new C1590l(2));
    public static final C15578l remoteconfig = new C15578l(-1636823204, false, new C13881l(9));
    public static final C15578l vip = new C15578l(-1104518404, false, new C1590l(3));
    public static final C15578l metrica = new C15578l(-1972158344, false, new C1590l(4));
    public static final C15578l startapp = new C15578l(1809538341, false, new C1590l(5));
    public static final C15578l adcel = new C15578l(302051330, false, new C1590l(6));
    public static final C15578l ads = new C15578l(1231211425, false, new C1590l(7));
    public static final C15578l subscription = new C15578l(416604932, false, new C1590l(8));
    public static final C15578l tapsense = new C15578l(-161721984, false, new C4832l(21));
    public static final C15578l Signature = new C15578l(-1168382921, false, new C4832l(23));
    public static final C15578l license = new C15578l(-1332204365, false, new C4832l(24));

    public static final long amazon(long j, EnumC16636l enumC16636l) {
        long j2;
        int iOrdinal = enumC16636l.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                C17132l.metrica(enumC16636l, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static boolean billing(C5425l c5425l, InterfaceC0583l interfaceC0583l, InterfaceC2224l interfaceC2224l) {
        InterfaceC14555l interfaceC14555l = c5425l.crashlytics;
        if (interfaceC14555l.pro(interfaceC0583l)) {
            return true;
        }
        if (interfaceC14555l.mo1173l(interfaceC0583l)) {
            return false;
        }
        if (c5425l.loadAd) {
            interfaceC14555l.mo1160case(interfaceC0583l);
        }
        return interfaceC14555l.mo1169import(interfaceC14555l.mo1209package(interfaceC0583l), interfaceC2224l);
    }

    public static final String crashlytics(InterfaceC11661l interfaceC11661l) {
        if (!AbstractC11125l.remoteconfig(interfaceC11661l)) {
            InterfaceC8371l interfaceC8371lSignature = interfaceC11661l.Signature();
            InterfaceC17477l interfaceC17477l = interfaceC8371lSignature instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371lSignature : null;
            if (interfaceC17477l != null && !interfaceC17477l.getName().f7383l) {
                InterfaceC11661l interfaceC11661lMo864l = interfaceC11661l.mo864l();
                C17134l c17134l = interfaceC11661lMo864l instanceof C17134l ? (C17134l) interfaceC11661lMo864l : null;
                if (c17134l != null) {
                    String strLoadAd = loadAd(c17134l, 3);
                    String str = C4632l.yandex;
                    C3624l c3624lAdmob = C4632l.admob(AbstractC3759l.mopub(interfaceC17477l).yandex);
                    return AbstractC11043l.admob('.', c3624lAdmob != null ? C8353l.purchase(c3624lAdmob) : C0516l.yandex(interfaceC17477l, C18450l.f36014l), strLoadAd);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String loadAd(InterfaceC4884l interfaceC4884l, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(interfaceC4884l instanceof InterfaceC5684l ? "<init>" : ((AbstractC2775l) interfaceC4884l).getName().loadAd());
        }
        sb.append("(");
        C7073l c7073lMo1479return = interfaceC4884l.mo1479return();
        if (c7073lMo1479return != null) {
            sb.append(mopub(c7073lMo1479return.yandex()));
        }
        Iterator it = interfaceC4884l.mo1007finally().iterator();
        while (it.hasNext()) {
            sb.append(mopub(((C17538l) it.next()).yandex()));
        }
        sb.append(")");
        if (z) {
            if (interfaceC4884l instanceof InterfaceC5684l) {
                sb.append("V");
            } else {
                AbstractC18041l abstractC18041lSmaato = interfaceC4884l.smaato();
                if (abstractC18041lSmaato == null) {
                    AbstractC16860l.yandex(142);
                    throw null;
                }
                C3498l c3498l = AbstractC16860l.purchase;
                if (!AbstractC16860l.appmetrica(abstractC18041lSmaato, AbstractC3333l.amazon) || AbstractC12008l.purchase(interfaceC4884l.smaato()) || (interfaceC4884l instanceof C11425l)) {
                    sb.append(mopub(interfaceC4884l.smaato()));
                } else {
                    sb.append("V");
                }
            }
        }
        return sb.toString();
    }

    public static final AbstractC3050l mopub(AbstractC18041l abstractC18041l) {
        return (AbstractC3050l) C0516l.loadAd(abstractC18041l, C10676l.subs, C3499l.f7388l);
    }

    public static boolean purchase(C5425l c5425l, InterfaceC0583l interfaceC0583l, AbstractC12027l abstractC12027l) {
        C5987l c5987l = C5987l.isPro;
        InterfaceC14555l interfaceC14555l = c5425l.crashlytics;
        if ((interfaceC14555l.ad(interfaceC0583l) && !interfaceC14555l.mo1173l(interfaceC0583l)) || interfaceC14555l.mo1210private(interfaceC0583l)) {
            return true;
        }
        c5425l.crashlytics();
        ArrayDeque arrayDeque = c5425l.mopub;
        C4853l c4853l = c5425l.admob;
        arrayDeque.push(interfaceC0583l);
        while (!arrayDeque.isEmpty()) {
            InterfaceC0583l interfaceC0583l2 = (InterfaceC0583l) arrayDeque.pop();
            if (c4853l.add(interfaceC0583l2)) {
                AbstractC12027l abstractC12027l2 = interfaceC14555l.mo1173l(interfaceC0583l2) ? c5987l : abstractC12027l;
                if (abstractC12027l2.equals(c5987l)) {
                    abstractC12027l2 = null;
                }
                if (abstractC12027l2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC14555l.appmetrica(interfaceC14555l.mo1209package(interfaceC0583l2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC0583l interfaceC0583lPurchase = abstractC12027l2.purchase(c5425l, (InterfaceC13789l) it.next());
                        if ((interfaceC14555l.ad(interfaceC0583lPurchase) && !interfaceC14555l.mo1173l(interfaceC0583lPurchase)) || interfaceC14555l.mo1210private(interfaceC0583lPurchase)) {
                            c5425l.yandex();
                            return true;
                        }
                        arrayDeque.add(interfaceC0583lPurchase);
                    }
                }
            }
        }
        c5425l.yandex();
        return false;
    }

    public static final void yandex(Function0 function0, EnumC8514l enumC8514l, C6956l c6956l, int i) {
        int i2;
        int i3;
        Function0 function1 = function0;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1121260103);
        int i4 = i | (c6956l2.admob(function1) ? 4 : 2) | (c6956l2.amazon(enumC8514l.ordinal()) ? 32 : 16);
        if (c6956l2.m2127for(i4 & 1, (i4 & 19) != 18)) {
            int iOrdinal = enumC8514l.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.spark_unavailable_gone;
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return;
                }
                i2 = R.string.spark_unavailable_network;
            }
            int iOrdinal2 = enumC8514l.ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.string.spark_unavailable_gone_desc;
            } else {
                if (iOrdinal2 != 1) {
                    C18725l.billing();
                    return;
                }
                i3 = R.string.spark_unavailable_network_desc;
            }
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
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
            Integer numValueOf = Integer.valueOf(i5);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, i2);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i3), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j2 = c6956l2.f14595continue;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon2);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            function1 = function0;
            AbstractC17457l.loadAd(function1, new C9247l(1.0f, true), false, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC2133l.yandex, c6956l2, (i4 & 14) | 817889280, 372);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(function1, enumC8514l, i, 8);
        }
    }
}
