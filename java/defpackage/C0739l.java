package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0739l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7246l f2232l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7652l f2233l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2234l = 0;

    public C0739l(C7652l c7652l, C7246l c7246l) {
        this.f2233l = c7652l;
        this.f2232l = c7246l;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x01da  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13863l c13863l;
        C7246l c7246l;
        boolean zBilling;
        Object objM2132native;
        boolean zBilling2;
        Object objM2132native2;
        boolean zIsFixedOffset;
        C15876l c15876l;
        int i = this.f2234l;
        C7246l c7246l2 = this.f2232l;
        C7652l c7652l = this.f2233l;
        C13863l c13863l2 = C1867l.yandex;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Boolean bool = (Boolean) c7246l2.f15075l.get(c7652l.crashlytics);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    boolean zAdmob = c6956l.admob(c7246l2) | c6956l.admob(c7652l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob || objM2132native3 == c13863l2) {
                        objM2132native3 = new C3768l(c7246l2, c7652l, 9);
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC6710l.yandex(zBooleanValue, (Function1) objM2132native3, null, false, null, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
                    Integer numValueOf = Integer.valueOf(i4);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    C7246l c7246l3 = c7246l2;
                    C13863l c13863l3 = c13863l2;
                    AbstractC0133l.amazon(AbstractC14566l.amazon(-720555422, new C15970l(c7652l, i3), c6956l2), AbstractC14566l.amazon(-744246271, new C15970l(c7652l, i2), c6956l2), AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), AbstractC14566l.amazon(-791627969, new C0739l(c7246l2, c7652l), c6956l2), c6956l2, 3510, 0);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l2, 6);
                    long j2 = c6956l2.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    c6956l2.m2123default(-608180111);
                    for (C14654l c14654l : c7652l.loadAd) {
                        boolean zAmazon = c6956l2.amazon(c14654l.crashlytics);
                        Object objM2132native4 = c6956l2.m2132native();
                        if (zAmazon) {
                            c13863l = c13863l3;
                        } else {
                            c13863l = c13863l3;
                            if (objM2132native4 != c13863l) {
                                c7246l = c7246l3;
                            }
                            String strStartapp = AbstractC14814l.startapp("- ", (String) objM2132native4);
                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                            InterfaceC2186l interfaceC2186l = (InterfaceC2186l) c6956l2.isPro(AbstractC14631l.yandex);
                            zBilling = c6956l2.billing(c14654l) | c6956l2.admob(c7246l);
                            objM2132native = c6956l2.m2132native();
                            if (zBilling || objM2132native == c13863l) {
                                objM2132native = new C0340l(c14654l, c7246l, false, 19);
                                c6956l2.m2147try(objM2132native);
                            }
                            Function0 function0 = (Function0) objM2132native;
                            zBilling2 = c6956l2.billing(c14654l);
                            objM2132native2 = c6956l2.m2132native();
                            if (zBilling2 || objM2132native2 == c13863l) {
                                objM2132native2 = new C7646l(20, c14654l);
                                c6956l2.m2147try(objM2132native2);
                            }
                            C6956l c6956l3 = c6956l2;
                            AbstractC13010l.loadAd(strStartapp, AbstractC9151l.crashlytics(interfaceC17242lAmazon, null, interfaceC2186l, false, function0, (Function0) objM2132native2, 444), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262140);
                            c4346l = c4346l;
                            c13863l3 = c13863l;
                            c7246l3 = c7246l;
                            c6956l2 = c6956l3;
                        }
                        c7246l = c7246l3;
                        DateTimeFormatter dateTimeFormatter = c7246l.f15078l;
                        C2106l c2106l = C2106l.f4733l;
                        C2106l c2106lLicense = C16367l.license(c14654l.crashlytics, 0L);
                        C4341l c4341l = C15876l.loadAd;
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        if (zoneIdSystemDefault instanceof ZoneOffset) {
                            c15876l = new C4341l((ZoneOffset) zoneIdSystemDefault);
                        } else {
                            try {
                                zIsFixedOffset = zoneIdSystemDefault.getRules().isFixedOffset();
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                zIsFixedOffset = false;
                            }
                            if (zIsFixedOffset) {
                                c15876l = new C4341l(zoneIdSystemDefault);
                            } else {
                                c15876l = new C15876l(zoneIdSystemDefault);
                            }
                        }
                        objM2132native4 = dateTimeFormatter.format(AbstractC1214l.amazon(c2106lLicense, c15876l).f4137l);
                        c6956l2.m2147try(objM2132native4);
                        String strStartapp2 = AbstractC14814l.startapp("- ", (String) objM2132native4);
                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                        InterfaceC2186l interfaceC2186l2 = (InterfaceC2186l) c6956l2.isPro(AbstractC14631l.yandex);
                        zBilling = c6956l2.billing(c14654l) | c6956l2.admob(c7246l);
                        objM2132native = c6956l2.m2132native();
                        if (zBilling) {
                            objM2132native = new C0340l(c14654l, c7246l, false, 19);
                            c6956l2.m2147try(objM2132native);
                        } else {
                            objM2132native = new C0340l(c14654l, c7246l, false, 19);
                            c6956l2.m2147try(objM2132native);
                        }
                        Function0 function1 = (Function0) objM2132native;
                        zBilling2 = c6956l2.billing(c14654l);
                        objM2132native2 = c6956l2.m2132native();
                        if (zBilling2) {
                            objM2132native2 = new C7646l(20, c14654l);
                            c6956l2.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C7646l(20, c14654l);
                            c6956l2.m2147try(objM2132native2);
                        }
                        C6956l c6956l4 = c6956l2;
                        AbstractC13010l.loadAd(strStartapp2, AbstractC9151l.crashlytics(interfaceC17242lAmazon2, null, interfaceC2186l2, false, function1, (Function0) objM2132native2, 444), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262140);
                        c4346l = c4346l;
                        c13863l3 = c13863l;
                        c7246l3 = c7246l;
                        c6956l2 = c6956l4;
                        break;
                    }
                    AbstractC12900l.ads(c6956l2, false, true, true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public C0739l(C7246l c7246l, C7652l c7652l) {
        this.f2232l = c7246l;
        this.f2233l = c7652l;
    }
}
