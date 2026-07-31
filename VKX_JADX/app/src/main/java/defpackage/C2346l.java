package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2346l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f5104l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5106l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f5107l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f5108l;

    public /* synthetic */ C2346l(C10507l c10507l, boolean z, Function1 function1, InterfaceC17242l interfaceC17242l) {
        this.f5106l = 1;
        this.f5108l = c10507l;
        this.f5105l = z;
        this.f5107l = function1;
        this.f5104l = interfaceC17242l;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r5;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC11666l interfaceC11666l;
        int i = this.f5106l;
        C13863l c13863l = C1867l.yandex;
        boolean z4 = this.f5105l;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f5107l;
        Object obj5 = this.f5104l;
        Object obj6 = this.f5108l;
        switch (i) {
            case 0:
                AbstractC18643l abstractC18643l = (AbstractC18643l) obj6;
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj5;
                InterfaceC6347l interfaceC6347l = (InterfaceC6347l) obj4;
                C0923l c0923l = (C0923l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(c0923l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fLoadAd = c0923l.loadAd();
                    InterfaceC13490l interfaceC13490l = c0923l.yandex;
                    long j2 = c0923l.loadAd;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC17463l.loadAd(AbstractC0080l.amazon(interfaceC17242l, 1.0f), C14467l.yandex(fLoadAd, C15519l.crashlytics(j2) ? interfaceC13490l.mo872static(C15519l.mopub(j2)) : Float.POSITIVE_INFINITY) > 0), interfaceC6347l);
                    if (z4) {
                        c6956l.m2123default(903160918);
                        j = ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).amazon;
                        r5 = 0;
                        c6956l.startapp(false);
                    } else {
                        r5 = 0;
                        c6956l.m2123default(903161902);
                        c6956l.startapp(false);
                        j = C9735l.isPro;
                    }
                    AbstractC15042l.subs(abstractC18643l, AbstractC6660l.subs(AbstractC17551l.loadAd(interfaceC17242lCrashlytics, 1.0f, j, interfaceC6347l), 8.0f, null, r5, 30), c6956l, r5);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C10507l c10507l = (C10507l) obj6;
                Function1 function1 = (Function1) obj4;
                InterfaceC17242l interfaceC17242l2 = (InterfaceC17242l) obj5;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int iVip = c10507l.loadAd.vip();
                    C10707l c10707l = AbstractC5992l.yandex;
                    AbstractC5889l.crashlytics(iVip, true, ((C18718l) c6956l2.isPro(c10707l)).loadAd, c6956l2, 48, 0);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
                    long j3 = c6956l2.f14595continue;
                    int i2 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    if (z4) {
                        c6956l2.m2123default(1021334740);
                        boolean zBilling = c6956l2.billing(function1) | c6956l2.billing(c10507l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zBilling || objM2132native == c13863l) {
                            objM2132native = new C9810l(function1, c10507l, 21);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC7470l.billing((Function0) objM2132native, null, false, AbstractC12442l.isVip(((C18718l) c6956l2.isPro(c10707l)).yandex, c6956l2), null, null, AbstractC13251l.amazon, c6956l2, 1572864, 54);
                        z = false;
                    } else {
                        z = false;
                        c6956l2.m2123default(1004880126);
                    }
                    c6956l2.startapp(z);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C6573l(18);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC7470l.billing((Function0) objM2132native2, interfaceC17242l2, false, null, null, null, AbstractC13251l.purchase, c6956l2, 1572870, 60);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C18023l c18023l = (C18023l) obj6;
                C15578l c15578l = (C15578l) obj5;
                EnumC2546l enumC2546l = (EnumC2546l) obj4;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 8.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36034l, c6956l3, 54);
                    long j4 = c6956l3.f14595continue;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, C3438l.amazon);
                    String str = c18023l.loadAd;
                    String str2 = c18023l.yandex;
                    C15578l c15578l2 = AbstractC1214l.purchase;
                    if (z4) {
                        c6956l3.m2123default(1748444241);
                        if (str2.length() > 0) {
                            c6956l3.m2123default(2134613224);
                            c15578l.invoke(str2, c6956l3, 48);
                            z3 = false;
                        } else {
                            z3 = false;
                            c6956l3.m2123default(1718319278);
                        }
                        c6956l3.startapp(z3);
                        if (str.length() > 0) {
                            c6956l3.m2123default(2134615816);
                            c15578l2.invoke(str, c6956l3, 48);
                        } else {
                            c6956l3.m2123default(1718319278);
                        }
                        c6956l3.startapp(z3);
                        c6956l3.startapp(z3);
                    } else if (str.length() == 0 && (enumC2546l == EnumC2546l.f5544l || enumC2546l == EnumC2546l.f5550l)) {
                        c6956l3.m2123default(1748733378);
                        c15578l2.invoke(str2, c6956l3, 48);
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(1748817171);
                        c15578l.invoke(str.length() == 0 ? str2 : str, c6956l3, 48);
                        if (str.length() > 0) {
                            c6956l3.m2123default(2134627009);
                            c15578l2.invoke(str2, c6956l3, 48);
                            z2 = false;
                        } else {
                            z2 = false;
                            c6956l3.m2123default(1718319278);
                        }
                        c6956l3.startapp(z2);
                        c6956l3.startapp(z2);
                    }
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C5124l c5124l = (C5124l) obj6;
                C10086l c10086l = c5124l.f11154l;
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj5;
                C7473l c7473l = (C7473l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                C14855l c14855l = C18450l.f36017l;
                C14855l c14855l2 = C18450l.f36026l;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC11666l interfaceC11666l2 = (InterfaceC11666l) c10086l.getValue();
                    C13619l c13619l = interfaceC11666l2 instanceof C13619l ? (C13619l) interfaceC11666l2 : null;
                    if (c13619l == null || (interfaceC11666l = c13619l.yandex) == null) {
                        interfaceC11666l = (InterfaceC11666l) c10086l.getValue();
                    }
                    if (AbstractC8576l.yandex(interfaceC11666l, C8553l.yandex) || AbstractC8576l.yandex(interfaceC11666l, C12943l.yandex)) {
                        c6956l4.m2123default(1467384474);
                        AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l), false, 0L, c6956l4, 0, 6);
                        c6956l4.startapp(false);
                    } else {
                        boolean z5 = interfaceC11666l instanceof C4573l;
                        boolean z6 = this.f5105l;
                        C16170l c16170l = C16170l.yandex;
                        if (z5) {
                            c6956l4.m2123default(1467562910);
                            InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(AbstractC14707l.amazon(AbstractC3605l.firebase(AbstractC16422l.mopub(c4346l, interfaceC3102l.loadAd(), null), interfaceC11780l), c7473l), 1.0f);
                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l2, false);
                            long j5 = c6956l4.f14595continue;
                            int i4 = (int) (j5 ^ (j5 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lCrashlytics2);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l3 = C3438l.loadAd;
                            c6956l4.m2140super();
                            if (c6956l4.f14603switch) {
                                c6956l4.firebase(c16395l3);
                            } else {
                                c6956l4.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, C3438l.mopub);
                            AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                            AbstractC8182l.billing(c6956l4, Integer.valueOf(i4), C3438l.isPro);
                            AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                            AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                            InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC13841l.crashlytics(c6956l4), true);
                            InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C4573l) interfaceC11666l).yandex);
                            boolean zAdmob = c6956l4.admob(c5124l);
                            Object objM2132native3 = c6956l4.m2132native();
                            if (zAdmob || objM2132native3 == c13863l) {
                                objM2132native3 = new C6814l(0, c5124l, C5124l.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 14);
                                c6956l4.m2147try(objM2132native3);
                            }
                            AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) ((InterfaceC5059l) objM2132native3), interfaceC17242lPurchase, false, c6956l4, 0, 8);
                            AbstractC9962l.loadAd(z6, c7473l, c16170l.yandex(c4346l, c14855l), 0L, 0L, c6956l4, 64);
                            c6956l4.startapp(true);
                            c6956l4.startapp(false);
                        } else {
                            c6956l4.m2123default(1468769988);
                            InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0080l.crashlytics(AbstractC14707l.amazon(AbstractC3605l.firebase(AbstractC16422l.mopub(c4346l, interfaceC3102l.loadAd(), null), interfaceC11780l), c7473l), 1.0f);
                            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l2, false);
                            long j6 = c6956l4.f14595continue;
                            int i5 = (int) (j6 ^ (j6 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato4 = c6956l4.smaato();
                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l4, interfaceC17242lCrashlytics3);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l4 = C3438l.loadAd;
                            c6956l4.m2140super();
                            if (c6956l4.f14603switch) {
                                c6956l4.firebase(c16395l4);
                            } else {
                                c6956l4.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon2, C3438l.mopub);
                            AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato4, C3438l.billing);
                            AbstractC8182l.billing(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                            AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                            AbstractC8182l.billing(c6956l4, interfaceC17242lBilling4, C3438l.amazon);
                            InterfaceC17242l interfaceC17242lCrashlytics4 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                            C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
                            boolean zAdmob2 = c6956l4.admob(c5124l);
                            Object objM2132native4 = c6956l4.m2132native();
                            if (zAdmob2 || objM2132native4 == c13863l) {
                                objM2132native4 = new C6977l(c5124l, 0);
                                c6956l4.m2147try(objM2132native4);
                            }
                            AbstractC16336l.yandex(interfaceC17242lCrashlytics4, null, c17253lAmazon, c7537l, null, null, false, null, (Function1) objM2132native4, c6956l4, 24966, 490);
                            AbstractC9962l.loadAd(z6, c7473l, c16170l.yandex(c4346l, c14855l), 0L, 0L, c6956l4, 64);
                            c6956l4.startapp(true);
                            c6956l4.startapp(false);
                        }
                    }
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2346l(C18023l c18023l, boolean z, C15578l c15578l, EnumC2546l enumC2546l) {
        this.f5106l = 2;
        this.f5108l = c18023l;
        this.f5105l = z;
        this.f5104l = c15578l;
        this.f5107l = enumC2546l;
    }

    public /* synthetic */ C2346l(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f5106l = i;
        this.f5108l = obj;
        this.f5104l = obj2;
        this.f5107l = obj3;
        this.f5105l = z;
    }
}
