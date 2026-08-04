package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.Concert;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1674l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4036l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4038l;

    public /* synthetic */ C1674l(int i, Function2 function2) {
        this.f4038l = 17;
        this.f4037l = i;
        this.f4036l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLoadAd;
        long jLoadAd2;
        int i = this.f4038l;
        C4346l c4346l = C4346l.f8873l;
        float f = 0.0f;
        C13863l c13863l = C1867l.yandex;
        int i2 = 0;
        int i3 = this.f4037l;
        Object obj3 = this.f4036l;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC16829l.yandex((CatalogArtist) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C4456l) obj3).m1550throws((C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC3836l.loadAd((Concert) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            case 3:
                C13994l c13994l = (C13994l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C2443l c2443lAdvert = c13994l.loadAd.amazon.advert(i3);
                    ((C7526l) c2443lAdvert.crashlytics).amazon.invoke(C3571l.yandex, Integer.valueOf(i3 - c2443lAdvert.yandex), c6956l, 6);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 4:
                C17602l c17602l = (C17602l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C2443l c2443lAdvert2 = c17602l.loadAd.crashlytics.advert(i3);
                    ((C13810l) c2443lAdvert2.crashlytics).crashlytics.invoke(c17602l.crashlytics, Integer.valueOf(i3 - c2443lAdvert2.yandex), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 5:
                C11862l c11862l = (C11862l) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C2443l c2443lAdvert3 = c11862l.loadAd.crashlytics.advert(i3);
                    ((C8609l) c2443lAdvert3.crashlytics).amazon.invoke(C14273l.yandex, Integer.valueOf(i3 - c2443lAdvert3.yandex), c6956l3, 6);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((C17731l) obj3).license((C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C16385l) obj3).mo2666finally(i3, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((C9502l) obj3).mo2666finally(i3, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((C16385l) obj3).mo2666finally(i3, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((C11749l) obj3).ad(i3, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 11:
                C7212l c7212l = (C7212l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C2443l c2443lAdvert4 = c7212l.loadAd.billing().advert(i3);
                    ((C10873l) c2443lAdvert4.crashlytics).loadAd.invoke(C18522l.yandex, Integer.valueOf(i3 - c2443lAdvert4.yandex), c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 12:
                C1253l c1253l = (C1253l) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC4927l.crashlytics(AbstractC3605l.startapp(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(12)), 0.0f, 0.0f, 0.0f, ((C15700l) c6956l5.isPro(AbstractC18678l.yandex)).yandex(c6956l5), 7), C1083l.license(AbstractC14055l.remoteconfig(new C9735l(AbstractC13106l.purchase(c6956l5).ads), new C9735l(AbstractC12953l.loadAd(AbstractC13209l.yandex(R.attr.nextdock_background)))), 0.0f, 0.0f, 14)), 16.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l5.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    long j2 = AbstractC13106l.purchase(c6956l5).adcel;
                    C11362l c11362l = c1253l.f3281l;
                    float f2 = 650.0f;
                    InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(Math.min(1.0f, c11362l.size() * 0.2f), AbstractC0532l.admob(0.0f, 650.0f, null, 5), null, null, c6956l5, 48, 28);
                    if (c11362l.isEmpty()) {
                        c6956l5.m2123default(-313356520);
                        jLoadAd = C9735l.loadAd(0.38f, AbstractC13106l.purchase(c6956l5).adcel);
                        c6956l5.startapp(false);
                        f2 = 650.0f;
                    } else {
                        c6956l5.m2123default(-313358379);
                        jLoadAd = AbstractC13106l.purchase(c6956l5).license;
                        c6956l5.startapp(false);
                    }
                    InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(jLoadAd, AbstractC0532l.admob(0.0f, f2, null, 5), null, null, c6956l5, 48, 12);
                    if (c11362l.size() >= 5) {
                        c6956l5.m2123default(-313348043);
                        jLoadAd2 = AbstractC13106l.purchase(c6956l5).license;
                        c6956l5.startapp(false);
                    } else {
                        c6956l5.m2123default(-313346184);
                        jLoadAd2 = C9735l.loadAd(0.38f, AbstractC13106l.purchase(c6956l5).adcel);
                        c6956l5.startapp(false);
                        f = 0.0f;
                    }
                    InterfaceC12244l interfaceC12244lYandex2 = AbstractC0703l.yandex(jLoadAd2, AbstractC0532l.admob(f, 650.0f, null, 5), null, null, c6956l5, 48, 12);
                    boolean zAdmob = c6956l5.admob(c1253l);
                    Object objM2132native = c6956l5.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C4936l(0, c1253l, C1253l.class, "finishOnboarding", "finishOnboarding()V", 0, 0, 27);
                        c6956l5.m2147try(objM2132native);
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), AbstractC7497l.yandex(8.0f));
                    boolean zBilling = c6956l5.billing(interfaceC12244lLoadAd) | c6956l5.purchase(j2);
                    Object objM2132native2 = c6956l5.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C0928l(interfaceC12244lLoadAd, j2, 1);
                        c6956l5.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC14289l.isPro(interfaceC17242lCrashlytics, (Function1) objM2132native2);
                    C17253l c17253l = C12719l.yandex;
                    long j3 = C9735l.isPro;
                    AbstractC17457l.loadAd((Function0) interfaceC5059l, interfaceC17242lIsPro, c11362l.size() >= 5, AbstractC7497l.yandex(8.0f), C12719l.yandex(j3, 0L, j3, 0L, c6956l5, 10), null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC14566l.amazon(-1503118603, new C5173l(interfaceC12244lYandex, c1253l, this.f4037l, interfaceC12244lYandex2, 2), c6956l5), c6956l5, 817889280, 352);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 13:
                EnumC10474l enumC10474l = (EnumC10474l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zAmazon = c6956l6.amazon(i3);
                    Object objM2132native3 = c6956l6.m2132native();
                    if (zAmazon || objM2132native3 == c13863l) {
                        objM2132native3 = new C2221l(i3, 23);
                        c6956l6.m2147try(objM2132native3);
                    }
                    AbstractC7741l.loadAd(enumC10474l, null, (Function1) objM2132native3, null, "", null, AbstractC2438l.purchase, c6956l6, 1597440, 42);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 14:
                String[] strArr = (String[]) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC13010l.loadAd(strArr[i3], null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 15:
                C17517l c17517l = (C17517l) obj3;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l8.isPro(AbstractC18678l.yandex)).yandex(c6956l8) + 16.0f;
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 0.0f, 0.0f, 0.0f, fYandex, 7);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l8, 48);
                    long j4 = c6956l8.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l8, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l2);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l8, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling2, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l8, 196608, 31);
                    InterfaceC13643l interfaceC13643l = (InterfaceC13643l) c17517l.f34138l.getValue();
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l2, 1.0f);
                    boolean zAmazon2 = c6956l8.amazon(i3);
                    Object objM2132native4 = c6956l8.m2132native();
                    if (zAmazon2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C2221l(i3, 24);
                        c6956l8.m2147try(objM2132native4);
                    }
                    AbstractC7741l.loadAd(interfaceC13643l, interfaceC17242lAmazon, (Function1) objM2132native4, null, "", null, AbstractC14566l.amazon(-1816234513, new C4508l(13, c17517l), c6956l8), c6956l8, 1597488, 40);
                    c6956l8.startapp(true);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 16:
                C7679l c7679l = (C7679l) obj3;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(12)), 0.0f, 0.0f, 0.0f, ((C15700l) c6956l9.isPro(AbstractC18678l.yandex)).yandex(c6956l9), 7);
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lStartapp3 = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC4927l.crashlytics(interfaceC17242lStartapp2, C1083l.license(AbstractC14055l.remoteconfig(new C9735l(((C14370l) c6956l9.isPro(c10707l)).yandex.ads), new C9735l(AbstractC12953l.loadAd(AbstractC13209l.yandex(R.attr.nextdock_background)))), 0.0f, 0.0f, 14)), 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j5 = c6956l9.f14595continue;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l9, interfaceC17242lStartapp3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l3);
                    } else {
                        c6956l9.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l9, interfaceC10835lAmazon2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato3, c6415l2);
                    Integer numValueOf = Integer.valueOf(i6);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l9, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l9, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling3, c6415l4);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l9, 6);
                    long j6 = c6956l9.f14595continue;
                    int i7 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l9, c4346l);
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l3);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l9, c6415l3, c6956l9, c11192l);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling4, c6415l4);
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0019l.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), AbstractC7497l.yandex(8.0f));
                    C17253l c17253l2 = C12719l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l9.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l9.isPro(c10707l)).yandex.license, C9735l.loadAd(0.12f, ((C14370l) c6956l9.isPro(c10707l)).yandex.adcel), C9735l.loadAd(0.38f, ((C14370l) c6956l9.isPro(c10707l)).yandex.adcel), c6956l9, 0);
                    C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
                    C17253l c17253l3 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    boolean z = c7679l.m2196instanceof() != null;
                    boolean zAdmob2 = c6956l9.admob(c7679l);
                    Object objM2132native5 = c6956l9.m2132native();
                    if (zAdmob2 || objM2132native5 == c13863l) {
                        objM2132native5 = new C10575l(c7679l, 0);
                        c6956l9.m2147try(objM2132native5);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native5, interfaceC17242lCrashlytics2, z, c6839lYandex, c13412lYandex, null, null, c17253l3, AbstractC14566l.amazon(-354274475, new C1866l(c7679l, i3, 8), c6956l9), c6956l9, 817889280, 352);
                    boolean z2 = c7679l.m2196instanceof() != null;
                    C14855l c14855l = C18450l.f36043l;
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    boolean zAmazon3 = c6956l9.amazon(i3);
                    Object objM2132native6 = c6956l9.m2132native();
                    if (zAmazon3 || objM2132native6 == c13863l) {
                        objM2132native6 = new C2221l(i3, 26);
                        c6956l9.m2147try(objM2132native6);
                    }
                    AbstractC7741l.loadAd(boolValueOf, interfaceC17242lAmazon2, (Function1) objM2132native6, c14855l, null, null, AbstractC14566l.amazon(-1530908190, new C4241l(c7679l, 0), c6956l9), c6956l9, 1575984, 48);
                    c6956l9.startapp(true);
                    c6956l9.startapp(true);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Function2 function2 = (Function2) obj3;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    for (int i8 = 0; i8 < i3; i8++) {
                        function2.invoke(c6956l10, 0);
                    }
                } else {
                    c6956l10.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC11666l interfaceC11666l = (InterfaceC11666l) obj3;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Boolean boolValueOf2 = Boolean.valueOf(AbstractC8576l.yandex(interfaceC11666l, C17079l.yandex));
                    boolean zAmazon4 = c6956l11.amazon(i3);
                    Object objM2132native7 = c6956l11.m2132native();
                    if (zAmazon4 || objM2132native7 == c13863l) {
                        objM2132native7 = new C4119l(i3, 3);
                        c6956l11.m2147try(objM2132native7);
                    }
                    AbstractC7741l.loadAd(boolValueOf2, null, (Function1) objM2132native7, null, "", null, AbstractC14566l.amazon(-951342419, new C15811l(interfaceC11666l, i2), c6956l11), c6956l11, 1597440, 42);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C5124l) obj3).m1699public(i3, AbstractC0545l.purchase(1), (C6956l) obj);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((C2603l) obj3).license((C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3324l.yandex((InterfaceC15725l) obj3, (C6956l) obj, AbstractC0545l.purchase(1), i3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1674l(InterfaceC15725l interfaceC15725l, int i, int i2) {
        this.f4038l = 21;
        this.f4036l = interfaceC15725l;
        this.f4037l = i2;
    }

    public /* synthetic */ C1674l(InterfaceC3177l interfaceC3177l, int i, int i2, int i3) {
        this.f4038l = i3;
        this.f4036l = interfaceC3177l;
        this.f4037l = i;
    }

    public /* synthetic */ C1674l(Object obj, int i, int i2) {
        this.f4038l = i2;
        this.f4036l = obj;
        this.f4037l = i;
    }
}
