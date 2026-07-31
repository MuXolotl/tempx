package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1866l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4287l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4288l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4289l;

    public /* synthetic */ C1866l(Object obj, int i, int i2) {
        this.f4289l = i2;
        this.f4287l = obj;
        this.f4288l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3 = this.f4289l;
        int i4 = 14;
        InterfaceC14029l interfaceC14029l = null;
        int i5 = 4;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i6 = this.f4288l;
        Object obj4 = this.f4287l;
        int i7 = 1;
        switch (i3) {
            case 0:
                C1774l c1774l = (C1774l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c1774l.m1048instanceof(i6, 48, c6956l, AbstractC3605l.remoteconfig(c4346l, 16.0f, 8.0f));
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C13849l c13849l = (C13849l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Boolean bool = (Boolean) c13849l.f27085l.getValue();
                    bool.booleanValue();
                    boolean zAmazon = c6956l2.amazon(i6);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAmazon || objM2132native == c13863l) {
                        objM2132native = new C2221l(i6, 2);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC7741l.loadAd(bool, null, (Function1) objM2132native, null, null, null, AbstractC15918l.billing, c6956l2, 1572864, 58);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C18014l c18014l = (C18014l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC13779l interfaceC13779lM4456finally = c18014l.m4456finally();
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    boolean zAmazon2 = c6956l3.amazon(i6);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAmazon2 || objM2132native2 == c13863l) {
                        i = 3;
                        objM2132native2 = new C2221l(i6, 3);
                        c6956l3.m2147try(objM2132native2);
                    } else {
                        i = 3;
                    }
                    AbstractC7741l.loadAd(interfaceC13779lM4456finally, interfaceC17242lCrashlytics, (Function1) objM2132native2, null, null, null, AbstractC14566l.amazon(-1074356589, new C11050l(interfaceC11780l, c18014l, i), c6956l3), c6956l3, 1572912, 56);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C7044l c7044l = (C7044l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC6844l interfaceC6844l = (InterfaceC6844l) c7044l.f14766l.getValue();
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    boolean zAmazon3 = c6956l4.amazon(i6);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (zAmazon3 || objM2132native3 == c13863l) {
                        i2 = 4;
                        objM2132native3 = new C2221l(i6, 4);
                        c6956l4.m2147try(objM2132native3);
                    } else {
                        i2 = 4;
                    }
                    AbstractC7741l.loadAd(interfaceC6844l, interfaceC17242lCrashlytics2, (Function1) objM2132native3, null, null, null, AbstractC14566l.amazon(-506504883, new C11050l(interfaceC11780l2, c7044l, i2), c6956l4), c6956l4, 1572912, 56);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                boolean z = false;
                C15578l c15578l = (C15578l) obj4;
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(c7091l) ? 4 : 2;
                }
                if ((iIntValue5 & 19) != 18) {
                    z = true;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, z)) {
                    c15578l.invoke(c7091l, Integer.valueOf(i6), c6956l5, Integer.valueOf(14 & iIntValue5));
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C18023l c18023l = (C18023l) obj4;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c4346l, 8.0f, 4.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l6, 54);
                    long j = c6956l6.f14595continue;
                    int i8 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l6, interfaceC17242lRemoteconfig);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l6, c5062lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i8);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l6, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l6, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling, c6415l4);
                    C10707l c10707l = AbstractC16964l.yandex;
                    C11090l c11090l = ((C14370l) c6956l6.isPro(c10707l)).loadAd.admob;
                    C11090l c11090l2 = ((C14370l) c6956l6.isPro(c10707l)).loadAd.loadAd;
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36016l, c6956l6, 48);
                    long j2 = c6956l6.f14595continue;
                    int i9 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l6, c4346l);
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c5062lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i9, c6956l6, c6415l3, c6956l6, c11192l);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling2, c6415l4);
                    C18734l c18734l = new C18734l();
                    int iPurchase = c18734l.purchase(new C14264l(0L, c11090l.yandex.loadAd, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533));
                    try {
                        c18734l.crashlytics("#");
                        Unit unit = Unit.INSTANCE;
                        c18734l.amazon(iPurchase);
                        int iPurchase2 = c18734l.purchase(new C14264l(0L, c11090l2.yandex.loadAd, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533));
                        try {
                            c18734l.crashlytics(String.valueOf(i6 + 1));
                            c18734l.amazon(iPurchase2);
                            C3625l c3625lBilling = c18734l.billing();
                            C6886l c6886l = C6886l.f14420l;
                            C2122l c2122l = AbstractC1193l.crashlytics;
                            long j3 = C9735l.loadAd;
                            AbstractC13010l.crashlytics(c3625lBilling, null, j3, 0L, new C11617l(1), c6886l, c2122l, 0L, null, 0L, 0, false, 0, 0, null, null, null, c6956l6, 14156160, 0, 524058);
                            c6956l6.startapp(true);
                            C0415l c0415l = c18023l.purchase;
                            AbstractC7741l.amazon(c0415l != null ? c0415l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 56.0f), ((C14370l) c6956l6.isPro(c10707l)).crashlytics.amazon), C4176l.yandex, null, c6956l6, 1572912, 1976);
                            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l6, 0);
                            long j4 = c6956l6.f14595continue;
                            int i10 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato3 = c6956l6.smaato();
                            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l6, c4346l);
                            c6956l6.m2140super();
                            if (c6956l6.f14603switch) {
                                c6956l6.firebase(c16395l);
                            } else {
                                c6956l6.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l6, c1853lYandex, c6415l);
                            AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato3, c6415l2);
                            AbstractC11043l.isPro(i10, c6956l6, c6415l3, c6956l6, c11192l);
                            AbstractC8182l.billing(c6956l6, interfaceC17242lBilling3, c6415l4);
                            AbstractC13010l.loadAd(c18023l.yandex, null, j3, 0L, null, c6886l, null, 0L, null, 0L, 0, false, 1, 0, ((C14370l) c6956l6.isPro(c10707l)).loadAd.firebase, c6956l6, 1573248, 24576, 114618);
                            AbstractC13010l.loadAd(c18023l.loadAd, null, C9735l.loadAd(0.5f, j3), 0L, null, C6886l.f14425l, null, 0L, null, 0L, 0, false, 1, 0, ((C14370l) c6956l6.isPro(c10707l)).loadAd.firebase, c6956l6, 1573248, 24576, 114618);
                            c6956l6.startapp(true);
                            c6956l6.startapp(true);
                        } catch (Throwable th) {
                            c18734l.amazon(iPurchase2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c18734l.amazon(iPurchase);
                        throw th2;
                    }
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C10056l c10056l = (C10056l) obj4;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                C15089l c15089l = C18450l.f36046l;
                C0086l c0086l2 = C18450l.f36040l;
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    int i11 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC10000l.mopub, null, null, null, AbstractC10000l.admob, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l7, 510), c6956l7, 24582, 430);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l7, 0, 7);
                    InterfaceC13751l interfaceC13751l = (InterfaceC13751l) c10056l.f20513l.getValue();
                    if (interfaceC13751l instanceof C5242l) {
                        c6956l7.m2123default(1555053850);
                        InterfaceC17242l interfaceC17242lRemoteconfig2 = AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f);
                        C5062l c5062lYandex3 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l2, c6956l7, 54);
                        long j5 = c6956l7.f14595continue;
                        int i12 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato4 = c6956l7.smaato();
                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l7, interfaceC17242lRemoteconfig2);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l7.m2140super();
                        if (c6956l7.f14603switch) {
                            c6956l7.firebase(c16395l2);
                        } else {
                            c6956l7.m2136protected();
                        }
                        C6415l c6415l5 = C3438l.mopub;
                        AbstractC8182l.billing(c6956l7, c5062lYandex3, c6415l5);
                        C6415l c6415l6 = C3438l.billing;
                        AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato4, c6415l6);
                        Integer numValueOf2 = Integer.valueOf(i12);
                        C6415l c6415l7 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l7, numValueOf2, c6415l7);
                        C11192l c11192l2 = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l7, c11192l2);
                        C6415l c6415l8 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l7, interfaceC17242lBilling4, c6415l8);
                        C7537l c7537l2 = new C7537l(2.0f, true, new C8339l(12));
                        C9247l c9247l = new C9247l(1.0f, true);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l2, c15089l, c6956l7, 6);
                        long j6 = c6956l7.f14595continue;
                        int i13 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato5 = c6956l7.smaato();
                        InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l7, c9247l);
                        c6956l7.m2140super();
                        if (c6956l7.f14603switch) {
                            c6956l7.firebase(c16395l2);
                        } else {
                            c6956l7.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l7, c1853lYandex2, c6415l5);
                        AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato5, c6415l6);
                        AbstractC11043l.isPro(i13, c6956l7, c6415l7, c6956l7, c11192l2);
                        AbstractC8182l.billing(c6956l7, interfaceC17242lBilling5, c6415l8);
                        C5242l c5242l = (C5242l) interfaceC13751l;
                        String str = c5242l.loadAd;
                        boolean zAmazon4 = c6956l7.amazon(i6);
                        Object objM2132native4 = c6956l7.m2132native();
                        if (zAmazon4 || objM2132native4 == c13863l) {
                            objM2132native4 = new C2221l(i6, 17);
                            c6956l7.m2147try(objM2132native4);
                        }
                        AbstractC7741l.loadAd(str, null, (Function1) objM2132native4, null, "", null, AbstractC10000l.subs, c6956l7, 1597440, 42);
                        String strPurchase = AbstractC11999l.purchase(c6956l7, R.string.left);
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l7.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l2)).loadAd.firebase, c6956l7, 0, 0, 131066);
                        c6956l7.startapp(true);
                        boolean zAdmob = c6956l7.admob(c10056l) | c6956l7.admob(interfaceC13751l);
                        Object objM2132native5 = c6956l7.m2132native();
                        if (zAdmob || objM2132native5 == c13863l) {
                            objM2132native5 = new C8652l(c10056l, c5242l, 2);
                            c6956l7.m2147try(objM2132native5);
                        }
                        AbstractC7470l.billing((Function0) objM2132native5, null, false, AbstractC12442l.license(c6956l7), null, null, AbstractC10000l.isPro, c6956l7, 1572864, 54);
                        boolean zAdmob2 = c6956l7.admob(c10056l);
                        Object objM2132native6 = c6956l7.m2132native();
                        if (zAdmob2 || objM2132native6 == c13863l) {
                            objM2132native6 = new C6195l(c10056l, 3);
                            c6956l7.m2147try(objM2132native6);
                        }
                        AbstractC7470l.billing((Function0) objM2132native6, null, false, AbstractC12442l.license(c6956l7), null, null, AbstractC10000l.firebase, c6956l7, 1572864, 54);
                        c6956l7.startapp(true);
                        c6956l7.startapp(false);
                    } else if (AbstractC8576l.yandex(interfaceC13751l, C18052l.yandex)) {
                        c6956l7.m2123default(1557572817);
                        InterfaceC17242l interfaceC17242lRemoteconfig3 = AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f);
                        C5062l c5062lYandex4 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l2, c6956l7, 54);
                        long j7 = c6956l7.f14595continue;
                        int i14 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato6 = c6956l7.smaato();
                        InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l7, interfaceC17242lRemoteconfig3);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l3 = C3438l.loadAd;
                        c6956l7.m2140super();
                        if (c6956l7.f14603switch) {
                            c6956l7.firebase(c16395l3);
                        } else {
                            c6956l7.m2136protected();
                        }
                        C6415l c6415l9 = C3438l.mopub;
                        AbstractC8182l.billing(c6956l7, c5062lYandex4, c6415l9);
                        C6415l c6415l10 = C3438l.billing;
                        AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato6, c6415l10);
                        Integer numValueOf3 = Integer.valueOf(i14);
                        C6415l c6415l11 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l7, numValueOf3, c6415l11);
                        C11192l c11192l3 = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l7, c11192l3);
                        C6415l c6415l12 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l7, interfaceC17242lBilling6, c6415l12);
                        C7537l c7537l3 = new C7537l(2.0f, true, new C8339l(12));
                        C9247l c9247l2 = new C9247l(1.0f, true);
                        C1853l c1853lYandex3 = AbstractC1001l.yandex(c7537l3, c15089l, c6956l7, 6);
                        long j8 = c6956l7.f14595continue;
                        int i15 = (int) (j8 ^ (j8 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato7 = c6956l7.smaato();
                        InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l7, c9247l2);
                        c6956l7.m2140super();
                        if (c6956l7.f14603switch) {
                            c6956l7.firebase(c16395l3);
                        } else {
                            c6956l7.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l7, c1853lYandex3, c6415l9);
                        AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato7, c6415l10);
                        AbstractC11043l.isPro(i15, c6956l7, c6415l11, c6956l7, c11192l3);
                        AbstractC8182l.billing(c6956l7, interfaceC17242lBilling7, c6415l12);
                        String strPurchase2 = AbstractC11999l.purchase(c6956l7, R.string.sleep_timer_end_track_status);
                        C10707l c10707l3 = AbstractC16964l.yandex;
                        AbstractC13010l.loadAd(strPurchase2, null, ((C14370l) c6956l7.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l3)).loadAd.amazon, c6956l7, 0, 0, 131066);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.left), null, ((C14370l) c6956l7.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l3)).loadAd.firebase, c6956l7, 0, 0, 131066);
                        c6956l7.startapp(true);
                        boolean zAdmob3 = c6956l7.admob(c10056l);
                        Object objM2132native7 = c6956l7.m2132native();
                        if (zAdmob3 || objM2132native7 == c13863l) {
                            objM2132native7 = new C6195l(c10056l, 4);
                            c6956l7.m2147try(objM2132native7);
                        }
                        AbstractC7470l.billing((Function0) objM2132native7, null, false, AbstractC12442l.license(c6956l7), null, null, AbstractC10000l.smaato, c6956l7, 1572864, 54);
                        c6956l7.startapp(true);
                        c6956l7.startapp(false);
                    } else {
                        if (!AbstractC8576l.yandex(interfaceC13751l, C13701l.yandex)) {
                            throw AbstractC12900l.billing(742900142, c6956l7, false);
                        }
                        c6956l7.m2123default(1559243035);
                        AbstractC7039l.amazon(AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 12.0f), new C7537l(10.0f, true, new C8339l(12)), new C7537l(0.0f, true, new C8339l(12)), null, 0, 0, AbstractC14566l.amazon(-1998527994, new C3596l(c10056l, 2), c6956l7), c6956l7, 1573302, 56);
                        c6956l7.startapp(false);
                    }
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C14089l c14089l = (C14089l) obj4;
                C7091l c7091l2 = (C7091l) obj;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c6956l8.billing(c7091l2) ? 4 : 2;
                }
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean zAdmob4 = c6956l8.admob(c14089l) | c6956l8.amazon(i6);
                    Object objM2132native8 = c6956l8.m2132native();
                    if (zAdmob4 || objM2132native8 == c13863l) {
                        objM2132native8 = new C13017l(c14089l, i6, interfaceC14029l, 7);
                        c6956l8.m2147try(objM2132native8);
                    }
                    AbstractC12311l.amazon(c6956l8, unit2, (Function2) objM2132native8);
                    AbstractC7209l.yandex(AbstractC5020l.smaato(c7091l2, c4346l), false, 0L, c6956l8, 0, 6);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C7679l c7679l = (C7679l) obj4;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean z2 = c7679l.m2196instanceof() != null;
                    C14855l c14855l = C18450l.f36043l;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    boolean zAmazon5 = c6956l9.amazon(i6);
                    Object objM2132native9 = c6956l9.m2132native();
                    if (zAmazon5 || objM2132native9 == c13863l) {
                        objM2132native9 = new C2221l(i6, 27);
                        c6956l9.m2147try(objM2132native9);
                    }
                    AbstractC7741l.loadAd(boolValueOf, interfaceC17242lAmazon, (Function1) objM2132native9, c14855l, null, null, AbstractC14566l.amazon(1774119000, new C4241l(c7679l, i7), c6956l9), c6956l9, 1575984, 48);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C0675l c0675l = (C0675l) obj4;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    C8147l c8147l = (C8147l) c0675l.f2152l.getValue();
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zAmazon6 = c6956l10.amazon(i6);
                    Object objM2132native10 = c6956l10.m2132native();
                    if (zAmazon6 || objM2132native10 == c13863l) {
                        objM2132native10 = new C4119l(i6, i7);
                        c6956l10.m2147try(objM2132native10);
                    }
                    AbstractC7741l.loadAd(c8147l, interfaceC17242lStartapp, (Function1) objM2132native10, null, "", null, AbstractC14566l.amazon(-1398443632, new C4508l(i4, c0675l), c6956l10), c6956l10, 1597488, 40);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC11666l interfaceC11666l = (InterfaceC11666l) obj4;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(c4346l, null, 3);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j9 = c6956l11.f14595continue;
                    int i16 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l11, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l4);
                    } else {
                        c6956l11.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l11, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato8, C3438l.billing);
                    AbstractC8182l.billing(c6956l11, Integer.valueOf(i16), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l11, C3438l.firebase);
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling8, C3438l.amazon);
                    Boolean boolValueOf2 = Boolean.valueOf(AbstractC8576l.yandex(interfaceC11666l, C17079l.yandex));
                    boolean zAmazon7 = c6956l11.amazon(i6);
                    Object objM2132native11 = c6956l11.m2132native();
                    if (zAmazon7 || objM2132native11 == c13863l) {
                        objM2132native11 = new C4119l(i6, i5);
                        c6956l11.m2147try(objM2132native11);
                    }
                    AbstractC7741l.loadAd(boolValueOf2, null, (Function1) objM2132native11, null, "", null, AbstractC14566l.amazon(1873811203, new C15811l(interfaceC11666l, i7), c6956l11), c6956l11, 1597440, 42);
                    c6956l11.startapp(true);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
