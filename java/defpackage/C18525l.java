package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18525l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f36160l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0324l f36161l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36162l;

    public /* synthetic */ C18525l(C0324l c0324l, InterfaceC12244l interfaceC12244l, int i) {
        this.f36162l = i;
        this.f36161l = c0324l;
        this.f36160l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        int i = this.f36162l;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C9946l c9946l = AbstractC16837l.yandex;
        final C0324l c0324l = this.f36161l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        InterfaceC12244l interfaceC12244l = this.f36160l;
        int i2 = 2;
        final int i3 = 1;
        final byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((String) interfaceC12244l.getValue()).length() > 0) {
                        c6956l2.m2123default(-266772337);
                        AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_cancel_outline_28, 0, c6956l2);
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 20.0f);
                        boolean zAdmob = c6956l2.admob(c0324l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new Function0() { // from class: lؖٓٞ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4 = b;
                                    C0324l c0324l2 = c0324l;
                                    switch (i4) {
                                        case 0:
                                            c0324l2.admob.subscription("");
                                            break;
                                        default:
                                            c0324l2.admob.subscription("");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l2.m2147try(objM2132native);
                        }
                        c6956l = c6956l2;
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC9151l.loadAd(interfaceC17242lIsPro, false, null, (Function0) objM2132native, 15), 0L, c6956l, 56, 8);
                    } else {
                        c6956l = c6956l2;
                        c6956l.m2123default(-273987866);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 1:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(c4346l, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, c9946l);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l3, 0);
                    long j = c6956l3.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    C5587l c5587l = AbstractC10439l.yandex;
                    C0324l c0324l2 = this.f36161l;
                    AbstractC18079l.amazon(AbstractC5006l.yandex, null, AbstractC14566l.amazon(-1491645318, new C17876l(c0324l2, b, b), c6956l3), null, 0.0f, c5587l, null, null, null, c6956l3, 390, 474);
                    String str = (String) interfaceC12244l.getValue();
                    boolean zAdmob2 = c6956l3.admob(c0324l2);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C2176l(1, c0324l2, C0324l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 14);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC10704l.purchase(str, (Function1) ((InterfaceC5059l) objM2132native2), null, AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), ((C14370l) c6956l3.isPro(c10707l)).crashlytics.crashlytics), ((C14370l) c6956l3.isPro(c10707l)).yandex.ads, c9946l), null, AbstractC5006l.crashlytics, AbstractC5006l.amazon, AbstractC14566l.amazon(1414875036, new C18525l(c0324l2, interfaceC12244l, b), c6956l3), null, null, c6956l3, 14352384, 788);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l3, 6, 6);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 2:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(c10707l2)).yandex.startapp, c9946l);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l4, 0);
                    long j2 = c6956l4.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                    C5587l c5587l2 = AbstractC10439l.yandex;
                    C0324l c0324l3 = this.f36161l;
                    AbstractC18079l.amazon(AbstractC5473l.f11721l, null, AbstractC14566l.amazon(-1020544217, new C17876l(c0324l3, i2, b), c6956l4), null, 0.0f, c5587l2, null, null, null, c6956l4, 196998, 474);
                    String str2 = (String) interfaceC12244l.getValue();
                    boolean zAdmob3 = c6956l4.admob(c0324l3);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C15406l(1, c0324l3, C0324l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 14);
                        c6956l4.m2147try(objM2132native3);
                    }
                    AbstractC10704l.purchase(str2, (Function1) ((InterfaceC5059l) objM2132native3), null, AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), ((C14370l) c6956l4.isPro(c10707l2)).crashlytics.crashlytics), ((C14370l) c6956l4.isPro(c10707l2)).yandex.ads, c9946l), null, AbstractC5473l.f11719l, AbstractC5473l.f11722l, AbstractC14566l.amazon(-693003575, new C18525l(c0324l3, interfaceC12244l, 3), c6956l4), null, null, c6956l4, 14352384, 788);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l4, 6, 6);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (((String) interfaceC12244l.getValue()).length() > 0) {
                        c6956l5.m2123default(638353064);
                        AbstractC14165l abstractC14165lCrashlytics2 = AbstractC16759l.crashlytics(R.drawable.ic_cancel_outline_28, 0, c6956l5);
                        InterfaceC17242l interfaceC17242lIsPro2 = AbstractC0080l.isPro(c4346l, 20.0f);
                        boolean zAdmob4 = c6956l5.admob(c0324l);
                        Object objM2132native4 = c6956l5.m2132native();
                        if (zAdmob4 || objM2132native4 == c13863l) {
                            objM2132native4 = new Function0() { // from class: lؖٓٞ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i6 = i3;
                                    C0324l c0324l4 = c0324l;
                                    switch (i6) {
                                        case 0:
                                            c0324l4.admob.subscription("");
                                            break;
                                        default:
                                            c0324l4.admob.subscription("");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l5.m2147try(objM2132native4);
                        }
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics2, null, AbstractC9151l.loadAd(interfaceC17242lIsPro2, false, null, (Function0) objM2132native4, 15), 0L, c6956l5, 56, 8);
                    } else {
                        c6956l5.m2123default(634352793);
                    }
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
