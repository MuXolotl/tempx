package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lَؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3158l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6787l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6788l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6789l;

    public /* synthetic */ C3158l(Object obj, Object obj2, int i) {
        this.f6789l = i;
        this.f6788l = obj;
        this.f6787l = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.f6789l;
        int i2 = 15;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C9946l c9946l = AbstractC16837l.yandex;
        Object obj3 = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i3 = 1;
        Object obj4 = this.f6787l;
        Object obj5 = this.f6788l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C16385l) obj5).m4176protected((C14286l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C9502l) obj5).m2667protected((C13884l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C9502l) obj5).mo2668public((Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                EnumC9700l enumC9700l = (EnumC9700l) obj5;
                C16385l c16385l = (C16385l) obj4;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (enumC9700l == ((EnumC9700l) c16385l.f32037l.getValue())) {
                        c6956l.m2123default(-2127687575);
                        z = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l), null, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex, c6956l, 56, 4);
                    } else {
                        z = false;
                        c6956l.m2123default(-2132921987);
                    }
                    c6956l.startapp(z);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C16385l) obj5).m4175implements((C16820l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C16385l) obj5).mo2668public((Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC1295l.loadAd((CustomCatalogBlockItem) obj5, (Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C11655l) obj5).m3184try((CachedTrack) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 8:
                C11655l c11655l = (C11655l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2124else();
                } else if (((InterfaceC13238l) interfaceC12244l.getValue()).isEmpty()) {
                    c6956l2.m2123default(1302653882);
                    c11655l.m3180finally(c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(1301932326);
                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 12.0f, 1);
                    boolean zAdmob = c6956l2.admob(c11655l) | c6956l2.billing(interfaceC12244l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == obj3) {
                        objM2132native = new C8854l(c11655l, interfaceC12244l, 9);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(C4346l.f8873l, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native, c6956l2, 390, 506);
                    c6956l2.startapp(false);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((C11655l) obj5).m3181public((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 10:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj5;
                C1463l c1463l = (C1463l) obj4;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC12396l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1486128028, new C10362l(c1463l), c6956l3), null, null, 0.0f, 0.0f, ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).purchase(c6956l3), AbstractC0831l.amazon(((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l3.isPro(c10707l)).yandex.ads, 0L, c6956l3, 28), interfaceC3102l, c6956l3, 3078, 244);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 11:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj5;
                C17408l c17408l = (C17408l) obj4;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C17253l c17253l2 = AbstractC0831l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC8317l.billing, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(c10707l2)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-262004484, new C4961l(c17408l), c6956l4), null, null, 0.0f, 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).purchase(c6956l4), AbstractC0831l.amazon(((C14370l) c6956l4.isPro(c10707l2)).yandex.startapp, ((C14370l) c6956l4.isPro(c10707l2)).yandex.ads, 0L, c6956l4, 28), interfaceC3102l2, c6956l4, 3078, 244);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC15042l.admob((C14473l) obj5, (C10507l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC15042l.isPro((C10507l) obj5, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                C5795l.yandex((InterfaceC3082l) obj5, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((C9197l) obj5).m2623instanceof((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 16:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj5;
                C9197l c9197l = (C9197l) obj4;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C17253l c17253l3 = AbstractC0831l.yandex;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC11141l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l5.isPro(c10707l3)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1466473613, new C2674l(c9197l), c6956l5), AbstractC14566l.amazon(-1514029898, new C17356l(c9197l, 0), c6956l5), null, 0.0f, 0.0f, ((C15700l) c6956l5.isPro(AbstractC18678l.yandex)).purchase(c6956l5), AbstractC0831l.billing(((C14370l) c6956l5.isPro(c10707l3)).yandex.startapp, ((C14370l) c6956l5.isPro(c10707l3)).yandex.ads, 0L, 0L, 0L, c6956l5, 60), interfaceC3102l3, c6956l5, 27654, 228);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17284l c17284l = (C17284l) obj5;
                Object obj6 = (InterfaceC12244l) obj4;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l6, 0);
                    long j = c6956l6.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l6.smaato();
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l6, c4346l2);
                    InterfaceC8801l.firebase.getClass();
                    Function0 function0 = C3438l.loadAd;
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(function0);
                    } else {
                        c6956l6.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l6, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i4);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l6, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l6, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling, c6415l4);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l6, 0, 7);
                    C6956l c6956l7 = c6956l6;
                    if (((Boolean) c17284l.f33540l.getValue()).booleanValue()) {
                        c6956l7.m2123default(-32659473);
                        c17284l.m4293finally(c6956l7, 0);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l7, 0, 7);
                        c6956l7 = c6956l7;
                    } else {
                        c6956l7.m2123default(-43638309);
                    }
                    c6956l7.startapp(false);
                    C0086l c0086l = C18450l.f36040l;
                    C6956l c6956l8 = c6956l7;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l8, 48);
                    long j2 = c6956l8.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l8, interfaceC17242lStartapp);
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(function0);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i5, c6956l8, c6415l3, c6956l8, c11192l);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling2, c6415l4);
                    C17253l c17253l4 = new C17253l(16.0f, 8.0f, 16.0f, 8.0f);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    C9247l c9247l = new C9247l(1.0f, true);
                    boolean zBilling = c6956l8.billing(obj6) | c6956l8.admob(c17284l);
                    Object objM2132native2 = c6956l8.m2132native();
                    if (zBilling || objM2132native2 == obj3) {
                        objM2132native2 = new C8854l(c17284l, obj6, 15);
                        c6956l8.m2147try(objM2132native2);
                    }
                    AbstractC16336l.loadAd(c9247l, null, c17253l4, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l8, 24576, 490);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l8.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l8, c4346l2);
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(function0);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, interfaceC10835lAmazon, c6415l);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i6, c6956l8, c6415l3, c6956l8, c11192l);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling3, c6415l4);
                    boolean zAdmob2 = c6956l8.admob(c17284l);
                    Object objM2132native3 = c6956l8.m2132native();
                    if (zAdmob2 || objM2132native3 == obj3) {
                        objM2132native3 = new C11762l(c17284l, 0);
                        c6956l8.m2147try(objM2132native3);
                    }
                    AbstractC7470l.billing((Function0) objM2132native3, null, false, null, null, null, AbstractC15342l.yandex, c6956l8, 1572864, 62);
                    c17284l.m4297this(c6956l8, 0);
                    c6956l8.startapp(true);
                    boolean zAdmob3 = c6956l8.admob(c17284l);
                    Object objM2132native4 = c6956l8.m2132native();
                    if (zAdmob3 || objM2132native4 == obj3) {
                        Object c5735l = new C5735l(0, c17284l, C17284l.class, "navigateToSearch", "navigateToSearch()V", 0, 0, 23);
                        c6956l8.m2147try(c5735l);
                        objM2132native4 = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native4), null, false, null, null, null, AbstractC15342l.loadAd, c6956l8, 1572864, 62);
                    c6956l8.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l8, 0, 7);
                    c6956l8.startapp(true);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C12708l c12708l = (C12708l) obj5;
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj4;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC13010l.loadAd(c12708l.yandex.mopub, AbstractC15788l.yandex(c4346l, interfaceC3102l4.yandex().loadAd()), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l9, 0, 24960, 241660);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18306l c18306l = (C18306l) obj5;
                C12708l c12708l2 = (C12708l) obj4;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c18306l.m4509break(c12708l2.loadAd, c6956l10, 0);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((C18306l) obj5).m4517public((String) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((C18306l) obj5).m4509break((InterfaceC3509l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((C18306l) obj5).m4518return((C10378l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 23:
                C9270l c9270l = (C9270l) obj5;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj4;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!c6956l11.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    c6956l11.m2124else();
                } else if (((Boolean) interfaceC12244l2.getValue()).booleanValue()) {
                    c6956l11.m2123default(-873379197);
                    boolean zBooleanValue = ((Boolean) c9270l.f19058l.getValue()).booleanValue();
                    boolean zAdmob4 = c6956l11.admob(c9270l);
                    Object objM2132native5 = c6956l11.m2132native();
                    if (zAdmob4 || objM2132native5 == obj3) {
                        objM2132native5 = new C8250l(i2, c9270l);
                        c6956l11.m2147try(objM2132native5);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native5, null, false, null, c6956l11, 0, 124);
                    c6956l11.startapp(false);
                } else {
                    c6956l11.m2123default(-873070158);
                    AbstractC4597l.yandex(AbstractC3234l.billing(), null, null, ((C14370l) c6956l11.isPro(AbstractC16964l.yandex)).yandex.subscription, c6956l11, 48, 4);
                    c6956l11.startapp(false);
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC3102l interfaceC3102l5 = (InterfaceC3102l) obj5;
                C9270l c9270l2 = (C9270l) obj4;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C17253l c17253l5 = AbstractC0831l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC2130l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l12.isPro(c10707l4)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-698093340, new C16435l(c9270l2), c6956l12), null, null, 0.0f, 0.0f, ((C15700l) c6956l12.isPro(AbstractC18678l.yandex)).purchase(c6956l12), AbstractC0831l.amazon(((C14370l) c6956l12.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l12.isPro(c10707l4)).yandex.ads, 0L, c6956l12, 28), interfaceC3102l5, c6956l12, 3078, 244);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C11013l) obj5).crashlytics((C15578l) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13250l c13250l = (C13250l) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                c13250l.f26029l += ((C5092l) obj4).loadAd.yandex(fFloatValue - c13250l.f26029l);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC8441l.yandex((C2832l) obj5, (EnumC14812l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC16088l interfaceC16088l = (InterfaceC16088l) obj5;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj4;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l13, 0);
                    long j4 = c6956l13.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l13.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l13, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l13.m2140super();
                    if (c6956l13.f14603switch) {
                        c6956l13.firebase(c16395l);
                    } else {
                        c6956l13.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l13, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l13, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l13, Integer.valueOf(i7), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l13, C3438l.firebase);
                    AbstractC8182l.billing(c6956l13, interfaceC17242lBilling4, C3438l.amazon);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l13, 0, 7);
                    boolean z2 = !((InterfaceC13238l) interfaceC12244l3.getValue()).isEmpty();
                    boolean zAdmob5 = c6956l13.admob(interfaceC16088l);
                    Object objM2132native6 = c6956l13.m2132native();
                    if (zAdmob5 || objM2132native6 == obj3) {
                        Object c4936l = new C4936l(0, interfaceC16088l, InterfaceC16088l.class, "onPickFinished", "onPickFinished()V", 0, 0, 8);
                        c6956l13.m2147try(c4936l);
                        objM2132native6 = c4936l;
                    }
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native6), AbstractC3605l.startapp(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), 0.0f, 0.0f, 0.0f, ((C15700l) c6956l13.isPro(AbstractC18678l.yandex)).yandex(c6956l13), 7), z2, ((C14370l) c6956l13.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC14566l.amazon(-1949949475, new C10457l(interfaceC12244l3, i3), c6956l13), c6956l13, 817889280, 368);
                    c6956l13.startapp(true);
                } else {
                    c6956l13.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((C8583l) obj5).ad((InterfaceC16088l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3158l(Object obj, Object obj2, int i, int i2) {
        this.f6789l = i2;
        this.f6788l = obj;
        this.f6787l = obj2;
    }
}
