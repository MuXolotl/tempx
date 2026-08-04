package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒۜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1350l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3457l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3458l;

    public /* synthetic */ C1350l(int i, Object obj) {
        this.f3458l = i;
        this.f3457l = obj;
    }

    private final Object admob(Object obj, Object obj2, Object obj3) {
        C5726l c5726l = (C5726l) this.f3457l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(C4346l.f8873l, 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C17570l c17570l = c5726l.yandex;
            C17570l c17570l2 = c5726l.loadAd;
            c6956l.m2123default(561117555);
            String str = c17570l.yandex;
            c6956l.startapp(false);
            C10707l c10707l = AbstractC3459l.yandex;
            AbstractC11282l.loadAd(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).mopub, c6956l, 0, 0, 65534);
            c6956l.m2123default(-225091095);
            c6956l.m2123default(561117555);
            String str2 = c17570l2.yandex;
            c6956l.startapp(false);
            AbstractC11282l.loadAd(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).isPro, c6956l, 0, 0, 65534);
            c6956l.startapp(false);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C11663l c11663l = (C11663l) this.f3457l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zAdmob = c6956l.admob(c11663l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9490l(c11663l, i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC2991l.crashlytics("download_use_itunes", R.string.st_itunes, R.string.st_itunes_desc, false, false, (Function1) objM2132native, c6956l, 3078, 16);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        InterfaceC1982l interfaceC1982l = (InterfaceC1982l) this.f3457l;
        Catalog2Button catalog2Button = (Catalog2Button) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (catalog2Button.yandex instanceof Catalog2ButtonAction.PlayVkMix) {
            c6956l.m2123default(566501374);
            boolean zAdmob = c6956l.admob(interfaceC1982l) | c6956l.admob(catalog2Button);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9810l(interfaceC1982l, catalog2Button, 2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC4447l.yandex(catalog2Button, (Function0) objM2132native, c6956l, iIntValue & 14);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(567243173);
            c6956l.startapp(false);
        }
        return Unit.INSTANCE;
    }

    private final Object subs(Object obj, Object obj2, Object obj3) {
        C5636l c5636l = (C5636l) this.f3457l;
        C7091l c7091l = (C7091l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(c7091l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC17242l interfaceC17242lSmaato = AbstractC5020l.smaato(c7091l, C4346l.f8873l);
            boolean zAdmob = c6956l.admob(c5636l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C7730l(28, c5636l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC7236l.billing, AbstractC9151l.loadAd(interfaceC17242lSmaato, false, null, (Function0) objM2132native, 15), null, AbstractC7236l.mopub, null, null, null, c6956l, 3078, 500);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object yandex(Object obj, Object obj2, Object obj3) {
        C0311l c0311l = (C0311l) this.f3457l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c0311l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8520l(c0311l, 0);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC0509l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, null, AbstractC14566l.amazon(-965957744, new C7321l(c0311l), c6956l), null, c6956l, 196614, 476);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x028f  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f3458l;
        C16170l c16170l = C16170l.yandex;
        int i2 = 12;
        C13863l c13863l = C1867l.yandex;
        final int i3 = 2;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f3457l;
        boolean z2 = false;
        switch (i) {
            case 0:
                C7324l c7324l = (C7324l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.crashlytics(c4346l, 1.0f), 48.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(24.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
                    long j = c6956l.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
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
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 0.0f, 48.0f, 1);
                    if (0.75f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242lVip2.premium(new C9247l(0.75f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.75f, true));
                    C11205l c11205l = AbstractC0080l.loadAd;
                    c7324l.mopub(interfaceC17242lPremium.premium(c11205l), c6956l, 0);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    c7324l.admob(new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).premium(c11205l), c6956l, 0);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C1774l c1774l = (C1774l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zAdmob = c6956l2.admob(c1774l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C11646l(c1774l, 8);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC9334l.yandex, c6956l2, 1572864, 62);
                    boolean zAdmob2 = c6956l2.admob(c1774l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C11646l(c1774l, 9);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, AbstractC9334l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C9231l c9231l = (C9231l) obj4;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c9231l.ad(c6956l3, 0);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C13849l c13849l = (C13849l) obj4;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c13849l.m3786abstract(AbstractC11999l.purchase(c6956l4, R.string.book_about), 0, AbstractC3605l.metrica(c4346l, 16.0f, 16.0f, 16.0f, 8.0f), c6956l4, 48);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj;
                InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj2;
                float f = ((C14467l) ((C10312l) obj4).billing.getValue()).f28331l;
                int iMo870l = interfaceC7448l.mo870l(f);
                AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.purchase(((C15519l) obj3).yandex, AbstractC7563l.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, iMo870l, C14467l.loadAd(f, 0.0f) ? Integer.MAX_VALUE : iMo870l)));
                return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 3));
            case 5:
                C11390l c11390l = (C11390l) obj4;
                C11636l c11636l = (C11636l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? c6956l5.billing(c11636l) : c6956l5.admob(c11636l) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC7470l.yandex(c11636l, c11390l.billing.admob(), C9735l.loadAd(0.25f, ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.yandex), c6956l5, iIntValue5 & 14);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                return new Cprotected(obj3, (C7119l) obj4, (C2671l) obj, i2);
            case 7:
                ((C8250l) obj4).invoke((Throwable) obj);
                return Unit.INSTANCE;
            case 8:
                C18196l c18196l = (C18196l) obj4;
                C6956l c6956l6 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                boolean zAdmob3 = c6956l6.admob(c18196l);
                Object objM2132native3 = c6956l6.m2132native();
                if (zAdmob3 || objM2132native3 == c13863l) {
                    objM2132native3 = new C17259l(c18196l);
                    c6956l6.m2147try(objM2132native3);
                }
                AbstractC3383l.loadAd((Function0) objM2132native3, AbstractC0080l.amazon(c4346l, 1.0f), false, null, null, null, null, AbstractC17195l.yandex, c6956l6, 100663344, 252);
                return Unit.INSTANCE;
            case 9:
                C12487l c12487l = (C12487l) obj4;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l7.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l7, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l7, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l7, C3438l.firebase);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC7741l.amazon(c12487l.yandex, null, AbstractC0080l.crashlytics(c4346l, 1.0f), C4176l.billing, null, c6956l7, 1573296, 1976);
                    AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), C9735l.loadAd(0.5f, C9735l.loadAd), AbstractC16837l.yandex), c6956l7, 6);
                    AbstractC11282l.loadAd(c12487l.loadAd, c16170l.yandex(c4346l, C18450l.f36043l), C9735l.purchase, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l7.isPro(AbstractC3459l.yandex)).mopub, c6956l7, 384, 0, 65528);
                    c6956l7.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C10731l c10731l = (C10731l) obj4;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l8, 48);
                    long j3 = c6956l8.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l8, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l3);
                    } else {
                        c6956l8.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l8, c5062lYandex2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato3, c6415l2);
                    Integer numValueOf = Integer.valueOf(i6);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l8, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l8, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling3, c6415l4);
                    String str = c10731l.yandex;
                    String str2 = c10731l.crashlytics;
                    String str3 = c10731l.loadAd;
                    C10707l c10707l = AbstractC10689l.yandex;
                    AbstractC7741l.purchase(str, str3, AbstractC0080l.isPro(c4346l, 56.0f), new C18627l(((C10936l) c6956l8.isPro(c10707l)).loadAd()), null, null, c6956l8, 4480, 0, 32752);
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c4346l, 12.0f, 8.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l8, 0);
                    long j4 = c6956l8.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l8, interfaceC17242lRemoteconfig);
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l3);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l8, c6415l3, c6956l8, c11192l);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling4, c6415l4);
                    String str4 = c10731l.loadAd;
                    C10707l c10707l2 = AbstractC3459l.yandex;
                    AbstractC11282l.loadAd(str4, null, ((C10936l) c6956l8.isPro(c10707l)).purchase(), 0L, 0L, null, 0L, 2, false, str2.length() > 0 ? 1 : 2, 0, null, ((C9472l) c6956l8.isPro(c10707l2)).firebase, c6956l8, 0, 48, 55290);
                    if (str2.length() > 0) {
                        c6956l8.m2123default(1507401530);
                        AbstractC11282l.loadAd(c10731l.crashlytics, null, ((C10936l) c6956l8.isPro(c10707l)).billing(), 0L, 0L, null, 0L, 2, false, 1, 0, null, ((C9472l) c6956l8.isPro(c10707l2)).firebase, c6956l8, 0, 3120, 55290);
                    } else {
                        c6956l8.m2123default(1501366326);
                    }
                    c6956l8.startapp(false);
                    c6956l8.startapp(true);
                    c6956l8.startapp(true);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C13966l c13966l = (C13966l) obj4;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC7741l.amazon(c13966l.yandex, null, AbstractC0080l.isPro(c4346l, 120.0f), C4176l.loadAd, null, c6956l9, 1573296, 1976);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj4;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j5 = c6956l10.f14595continue;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l10, interfaceC17242lCrashlytics2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l4);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato5, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling5, C3438l.amazon);
                    boolean zBilling = c6956l10.billing(customCatalogBlockItem);
                    Object objM2132native4 = c6956l10.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        List list = customCatalogBlockItem.crashlytics;
                        String strCrashlytics = list != null ? AbstractC8320l.crashlytics(list) : null;
                        c6956l10.m2147try(strCrashlytics);
                        objM2132native4 = strCrashlytics;
                    }
                    AbstractC7741l.amazon((String) objM2132native4, null, c16170l.yandex(c4346l, C18450l.f36043l), null, new C0534l(((C9735l) c6956l10.isPro(AbstractC12502l.yandex)).yandex, 5), c6956l10, 48, 1784);
                    c6956l10.startapp(true);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C7044l c7044l = (C7044l) obj4;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    boolean zAdmob4 = c6956l11.admob(c7044l);
                    Object objM2132native5 = c6956l11.m2132native();
                    if (zAdmob4 || objM2132native5 == c13863l) {
                        objM2132native5 = new C17387l(c7044l, z2 ? 1 : 0);
                        c6956l11.m2147try(objM2132native5);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native5, c6956l11, 0, 511);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                Exception exc = (Exception) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= c6956l12.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l12, 6);
                    long j6 = c6956l12.f14595continue;
                    int i9 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l12, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l5 = C3438l.loadAd;
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l5);
                    } else {
                        c6956l12.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l12, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.billing(c6956l12, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l12, C3438l.firebase);
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling6, C3438l.amazon);
                    String strPurchase = AbstractC11999l.purchase(c6956l12, R.string.cdcm_wizard_fail);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l12.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l12.isPro(c10707l3)).loadAd.purchase, c6956l12, 0, 0, 131066);
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.cdcm_wizard_fail_text, new Object[]{message}, c6956l12), null, ((C14370l) c6956l12.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l12.isPro(c10707l3)).loadAd.firebase, c6956l12, 0, 0, 131066);
                    c6956l12.startapp(true);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C12221l c12221l = (C12221l) obj4;
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob5 = c6956l13.admob(c12221l);
                    Object objM2132native6 = c6956l13.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        objM2132native6 = new C5458l(c12221l, 1);
                        c6956l13.m2147try(objM2132native6);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native6, 15);
                    int i10 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC6725l.amazon, interfaceC17242lLoadAd, null, null, AbstractC14566l.amazon(-1027419871, new C1182l(c12221l, 3, z2 ? (byte) 1 : (byte) 0), c6956l13), null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l13, 510), c6956l13, 24582, 428);
                    AbstractC0555l.yandex(null, 0.0f, ((C14370l) c6956l13.isPro(AbstractC16964l.yandex)).yandex.signatures, c6956l13, 0, 3);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                C4456l c4456l = (C4456l) obj4;
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    c4456l.isVip(c4456l.f9070l, true, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l14, 432);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9879l c9879l = (C9879l) obj4;
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= c6956l15.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    c9879l.crashlytics(interfaceC15451l.yandex(c4346l, 1.0f, true), c6956l15, 0);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                final InterfaceC10807l interfaceC10807l = (InterfaceC10807l) obj4;
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                final int i11 = 1;
                if (c6956l16.m2127for(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    final int i12 = z2 ? 1 : 0;
                    C15578l c15578lAmazon = AbstractC14566l.amazon(347588790, new Function2() { // from class: lٍٜٞ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i13 = i12;
                            InterfaceC10807l interfaceC10807l2 = interfaceC10807l;
                            switch (i13) {
                                case 0:
                                    C6956l c6956l17 = (C6956l) obj5;
                                    int iIntValue16 = ((Integer) obj6).intValue();
                                    if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                        AbstractC13010l.loadAd(((C5185l) interfaceC10807l2).yandex.yandex(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l17, 0, 0, 262142);
                                    } else {
                                        c6956l17.m2124else();
                                    }
                                    break;
                                case 1:
                                    C6956l c6956l18 = (C6956l) obj5;
                                    int iIntValue17 = ((Integer) obj6).intValue();
                                    if (c6956l18.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                        AbstractC13010l.loadAd("ID: " + ((C5185l) interfaceC10807l2).yandex.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                                    } else {
                                        c6956l18.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l19 = (C6956l) obj5;
                                    int iIntValue18 = ((Integer) obj6).intValue();
                                    if (c6956l19.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                                        AbstractC7741l.amazon(((C5185l) interfaceC10807l2).yandex.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 42.0f), AbstractC7497l.yandex), null, null, c6956l19, 48, 2040);
                                    } else {
                                        c6956l19.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l16);
                    C15578l c15578lAmazon2 = AbstractC14566l.amazon(-885691655, new Function2() { // from class: lٍٜٞ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i13 = i11;
                            InterfaceC10807l interfaceC10807l2 = interfaceC10807l;
                            switch (i13) {
                                case 0:
                                    C6956l c6956l17 = (C6956l) obj5;
                                    int iIntValue16 = ((Integer) obj6).intValue();
                                    if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                        AbstractC13010l.loadAd(((C5185l) interfaceC10807l2).yandex.yandex(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l17, 0, 0, 262142);
                                    } else {
                                        c6956l17.m2124else();
                                    }
                                    break;
                                case 1:
                                    C6956l c6956l18 = (C6956l) obj5;
                                    int iIntValue17 = ((Integer) obj6).intValue();
                                    if (c6956l18.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                        AbstractC13010l.loadAd("ID: " + ((C5185l) interfaceC10807l2).yandex.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                                    } else {
                                        c6956l18.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l19 = (C6956l) obj5;
                                    int iIntValue18 = ((Integer) obj6).intValue();
                                    if (c6956l19.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                                        AbstractC7741l.amazon(((C5185l) interfaceC10807l2).yandex.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 42.0f), AbstractC7497l.yandex), null, null, c6956l19, 48, 2040);
                                    } else {
                                        c6956l19.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l16);
                    C15578l c15578lAmazon3 = AbstractC14566l.amazon(1566526394, new Function2() { // from class: lٍٜٞ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i13 = i3;
                            InterfaceC10807l interfaceC10807l2 = interfaceC10807l;
                            switch (i13) {
                                case 0:
                                    C6956l c6956l17 = (C6956l) obj5;
                                    int iIntValue16 = ((Integer) obj6).intValue();
                                    if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                        AbstractC13010l.loadAd(((C5185l) interfaceC10807l2).yandex.yandex(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l17, 0, 0, 262142);
                                    } else {
                                        c6956l17.m2124else();
                                    }
                                    break;
                                case 1:
                                    C6956l c6956l18 = (C6956l) obj5;
                                    int iIntValue17 = ((Integer) obj6).intValue();
                                    if (c6956l18.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                        AbstractC13010l.loadAd("ID: " + ((C5185l) interfaceC10807l2).yandex.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l18, 0, 0, 262142);
                                    } else {
                                        c6956l18.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l19 = (C6956l) obj5;
                                    int iIntValue18 = ((Integer) obj6).intValue();
                                    if (c6956l19.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                                        AbstractC7741l.amazon(((C5185l) interfaceC10807l2).yandex.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 42.0f), AbstractC7497l.yandex), null, null, c6956l19, 48, 2040);
                                    } else {
                                        c6956l19.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l16);
                    int i13 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(c15578lAmazon, null, null, c15578lAmazon2, c15578lAmazon3, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l16, 510), c6956l16, 27654, 422);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10038l c10038l = (C10038l) obj4;
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lRemoteconfig2 = AbstractC0080l.remoteconfig(C4346l.f8873l, 0.0f, 0.0f, 200.0f, 350.0f, 3);
                    boolean zAdmob6 = c6956l17.admob(c10038l);
                    Object objM2132native7 = c6956l17.m2132native();
                    if (zAdmob6 || objM2132native7 == c13863l) {
                        objM2132native7 = new C15079l(4, c10038l);
                        c6956l17.m2147try(objM2132native7);
                    }
                    AbstractC16336l.yandex(interfaceC17242lRemoteconfig2, null, null, null, null, null, false, null, (Function1) objM2132native7, c6956l17, 0, 510);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C14216l c14216l = (C14216l) obj4;
                int iIntValue17 = ((Integer) obj).intValue();
                int iIntValue18 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue17 = c14216l.f27810l.amazon(iIntValue17);
                }
                if (!zBooleanValue) {
                    iIntValue18 = c14216l.f27810l.amazon(iIntValue18);
                }
                if (c14216l.f27811l) {
                    long j7 = c14216l.f27815l.loadAd;
                    int i14 = C12814l.crashlytics;
                    if (iIntValue17 == ((int) (j7 >> 32)) && iIntValue18 == ((int) (j7 & 4294967295L))) {
                        z = false;
                    } else {
                        int iMin = Math.min(iIntValue17, iIntValue18);
                        EnumC7170l enumC7170l = EnumC7170l.f15004l;
                        if (iMin < 0 || Math.max(iIntValue17, iIntValue18) > c14216l.f27815l.yandex.f7563l.length()) {
                            C16173l c16173l = c14216l.f27809l;
                            c16173l.tapsense(false);
                            c16173l.adcel(enumC7170l);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue17 == iIntValue18) {
                                C16173l c16173l2 = c14216l.f27809l;
                                c16173l2.tapsense(false);
                                c16173l2.adcel(enumC7170l);
                            } else {
                                c14216l.f27809l.admob(true);
                            }
                            c14216l.f27813l.license.invoke(new C0639l(c14216l.f27815l.yandex, AbstractC2296l.loadAd(iIntValue17, iIntValue18), (C12814l) null));
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                C14593l c14593l = (C14593l) obj4;
                C6956l c6956l18 = (C6956l) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if (c6956l18.m2127for(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j8 = c6956l18.f14595continue;
                    int i15 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l18.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l18, interfaceC17242lCrashlytics3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l6 = C3438l.loadAd;
                    c6956l18.m2140super();
                    if (c6956l18.f14603switch) {
                        c6956l18.firebase(c16395l6);
                    } else {
                        c6956l18.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l18, interfaceC10835lAmazon3, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l18, interfaceC18556lSmaato7, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i15);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l18, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l18, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l18, interfaceC17242lBilling7, c6415l8);
                    AbstractC7741l.amazon(c14593l.crashlytics, null, AbstractC0080l.crashlytics(c4346l, 1.0f), C4176l.billing, null, c6956l18, 1573296, 1976);
                    C7537l c7537l = new C7537l(12.0f, true, new C8339l(12));
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lRemoteconfig3 = AbstractC3605l.remoteconfig(c16170l.yandex(c4346l, C18450l.f36043l), 16.0f, 8.0f);
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(c7537l, c0086l, c6956l18, 54);
                    long j9 = c6956l18.f14595continue;
                    int i16 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l18.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l18, interfaceC17242lRemoteconfig3);
                    c6956l18.m2140super();
                    if (c6956l18.f14603switch) {
                        c6956l18.firebase(c16395l6);
                    } else {
                        c6956l18.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l18, c5062lYandex3, c6415l5);
                    AbstractC8182l.billing(c6956l18, interfaceC18556lSmaato8, c6415l6);
                    AbstractC11043l.isPro(i16, c6956l18, c6415l7, c6956l18, c11192l2);
                    AbstractC8182l.billing(c6956l18, interfaceC17242lBilling8, c6415l8);
                    AbstractC1497l.loadAd(false, false, null, 12.0f, c6956l18, 3126, 4);
                    AbstractC13010l.loadAd(c14593l.loadAd, null, 0L, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l18.isPro(AbstractC16964l.yandex)).loadAd.admob, c6956l18, 1572864, 0, 130878);
                    c6956l18.startapp(true);
                    c6956l18.startapp(true);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                ((Function1) obj4).invoke(new C1187l(((C15730l) obj2).crashlytics));
                return Unit.INSTANCE;
            case 23:
                return yandex(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C9647l c9647l = (C9647l) obj4;
                C6956l c6956l19 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l19.m2123default(-18970124);
                float f2 = c9647l.loadAd;
                C6763l c6763l = AbstractC5341l.yandex;
                InterfaceC17242l interfaceC17242lVip4 = AbstractC0080l.vip(AbstractC4115l.mopub(AbstractC0080l.adcel(AbstractC0080l.amazon((InterfaceC17242l) obj, 1.0f), C18450l.f36021l), ((C14467l) AbstractC16245l.yandex(c9647l.yandex, AbstractC0532l.subs(250, 2, c6763l), null, c6956l19, 0, 12).getValue()).f28331l, 2), ((C14467l) AbstractC16245l.yandex(f2, AbstractC0532l.subs(250, 2, c6763l), null, c6956l19, 0, 12).getValue()).f28331l);
                c6956l19.startapp(false);
                return interfaceC17242lVip4;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return mopub(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return admob(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return subs(obj, obj2, obj3);
            default:
                C0228l c0228l = (C0228l) obj4;
                C6956l c6956l20 = (C6956l) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (c6956l20.m2127for(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob7 = c6956l20.admob(c0228l);
                    Object objM2132native8 = c6956l20.m2132native();
                    if (zAdmob7 || objM2132native8 == c13863l) {
                        objM2132native8 = new C6303l(c0228l, z2 ? 1 : 0);
                        c6956l20.m2147try(objM2132native8);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native8, 15);
                    int i17 = AbstractC15548l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13319l.yandex(AbstractC11184l.ads, interfaceC17242lLoadAd2, null, null, AbstractC11184l.subscription, null, AbstractC15548l.yandex(0L, ((C14370l) c6956l20.isPro(c10707l4)).yandex.yandex, ((C14370l) c6956l20.isPro(c10707l4)).yandex.yandex, 0L, c6956l20, 505), c6956l20, 24582, 428);
                } else {
                    c6956l20.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
