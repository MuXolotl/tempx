package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُِۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11768l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f23560l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14267l f23561l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23562l;

    public /* synthetic */ C11768l(C14267l c14267l, C9879l c9879l) {
        this.f23562l = 1;
        this.f23561l = c14267l;
        this.f23560l = c9879l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23562l;
        C13863l c13863l = C1867l.yandex;
        C9879l c9879l = this.f23560l;
        C14267l c14267l = this.f23561l;
        int i2 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), C9735l.loadAd, AbstractC16837l.yandex);
                    C14855l c14855l = C18450l.f36026l;
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C10086l c10086l = c9879l.amazon;
                    C10086l c10086l2 = c9879l.purchase;
                    ((InterfaceC18298l) c10086l.getValue()).yandex(c6956l, 0);
                    if (((Boolean) c9879l.metrica.getValue()).booleanValue()) {
                        c6956l.m2123default(-1403356169);
                        EnumC11447l enumC11447l = c14267l.crashlytics;
                        EnumC11447l enumC11447l2 = EnumC11447l.f23033l;
                        C16170l c16170l = C16170l.yandex;
                        if (enumC11447l != enumC11447l2) {
                            c6956l.m2123default(-554365580);
                            C13530l c13530l = c9879l.yandex.f36642l;
                            boolean zAdmob = c6956l.admob(c13530l);
                            Object objM2132native = c6956l.m2132native();
                            if (zAdmob || objM2132native == c13863l) {
                                C6335l c6335l = new C6335l(0, c13530l, C13530l.class, "open", "open()V", 0, 0, 9);
                                c6956l.m2147try(c6335l);
                                objM2132native = c6335l;
                            }
                            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                            boolean zAdmob2 = c6956l.admob(c9879l);
                            Object objM2132native2 = c6956l.m2132native();
                            if (zAdmob2 || objM2132native2 == c13863l) {
                                objM2132native2 = new C15079l(3, c9879l);
                                c6956l.m2147try(objM2132native2);
                            }
                            InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2), 61.0f), 1.0f), c14855l);
                            C10707l c10707l = AbstractC16964l.yandex;
                            AbstractC3274l.crashlytics(function0, interfaceC17242lYandex, false, null, ((C14370l) c6956l.isPro(c10707l)).yandex.smaato, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0.0f, 0.0f, null, null, AbstractC14566l.amazon(1048721567, new C11768l(c14267l, c9879l), c6956l), c6956l, 0, 972);
                            c6956l.startapp(false);
                        } else if (((C10235l) c10086l2.getValue()) != null) {
                            c6956l.m2123default(-552580569);
                            C10235l c10235l = (C10235l) c10086l2.getValue();
                            if (c10235l == null) {
                                c6956l.m2123default(-552477588);
                                c6956l.startapp(false);
                            } else {
                                c6956l.m2123default(-552477587);
                                InterfaceC17242l interfaceC17242lYandex2 = c16170l.yandex(AbstractC0080l.amazon(AbstractC0080l.purchase(c4346l, 61.0f), 1.0f), c14855l);
                                C10707l c10707l2 = AbstractC16964l.yandex;
                                AbstractC3274l.yandex(interfaceC17242lYandex2, null, ((C14370l) c6956l.isPro(c10707l2)).yandex.smaato, ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, 0.0f, 0.0f, null, AbstractC14566l.amazon(980600527, new C9772l(c9879l, c10235l, 16), c6956l), c6956l, 12582912, 114);
                                c6956l.startapp(false);
                                Unit unit = Unit.INSTANCE;
                            }
                            c6956l.startapp(false);
                        } else {
                            c6956l.m2123default(-549702343);
                            InterfaceC17242l interfaceC17242lYandex3 = c16170l.yandex(AbstractC0080l.amazon(AbstractC0080l.purchase(c4346l, 61.0f), 1.0f), c14855l);
                            C10707l c10707l3 = AbstractC16964l.yandex;
                            AbstractC3274l.yandex(interfaceC17242lYandex3, null, ((C14370l) c6956l.isPro(c10707l3)).yandex.smaato, ((C14370l) c6956l.isPro(c10707l3)).yandex.adcel, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1818052936, new C9802l(c9879l, b, b), c6956l), c6956l, 12582912, 114);
                            c6956l.startapp(false);
                        }
                    } else {
                        c6956l.m2123default(-591250620);
                    }
                    c6956l.startapp(false);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z = c14267l.crashlytics == EnumC11447l.f23032l;
                    C9879l c9879l2 = this.f23560l;
                    boolean zAdmob3 = c6956l2.admob(c9879l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C6335l c6335l2 = new C6335l(0, c9879l2, C9879l.class, "cyclePlayPause", "cyclePlayPause()V", 0, 0, 10);
                        c6956l2.m2147try(c6335l2);
                        objM2132native3 = c6335l2;
                    }
                    c9879l2.purchase(AbstractC14566l.amazon(-959180981, new C9802l(c9879l2, i2, b), c6956l2), AbstractC14566l.amazon(965042996, new C1350l(17, c9879l2), c6956l2), z, (Function0) ((InterfaceC5059l) objM2132native3), c6956l2, 438);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC18678l.yandex.yandex(c9879l.loadAd), AbstractC14566l.amazon(1926642264, new C11768l(c9879l, c14267l, b), c6956l3), c6956l3, 56);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C11768l(C9879l c9879l, C14267l c14267l, int i) {
        this.f23562l = i;
        this.f23560l = c9879l;
        this.f23561l = c14267l;
    }
}
