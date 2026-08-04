package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘٞٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5853l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f12345l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f12346l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12347l;

    public /* synthetic */ C5853l(Function2 function2, long j) {
        this.f12347l = 0;
        this.f12345l = function2;
        this.f12346l = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l;
        int i = this.f12347l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f12345l;
        switch (i) {
            case 0:
                C6956l c6956l2 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                Function2 function2Mopub = AbstractC1544l.mopub((Function2) obj4, this.f12346l, c6956l2);
                Object objM2132native = c6956l2.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC8020l.smaato(function2Mopub);
                    c6956l2.m2147try(objM2132native);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
                if (function2Mopub != null) {
                    interfaceC8714l.setValue(function2Mopub);
                }
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j = c6956l2.f14595continue;
                int i2 = (int) (j ^ (j >>> 32));
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
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                Function2 function2 = (Function2) interfaceC8714l.getValue();
                if (function2 == null) {
                    c6956l2.m2123default(2094511935);
                } else {
                    c6956l2.m2123default(1037396226);
                    function2.invoke(c6956l2, 0);
                }
                c6956l2.startapp(false);
                c6956l2.startapp(true);
                break;
            case 1:
                C7473l c7473l = (C7473l) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l3.mopub(zBooleanValue) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    int iLoadAd = AbstractC8238l.loadAd(c6956l3);
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, C3438l.billing);
                    C6415l c6415l = C3438l.isPro;
                    if (c6956l3.f14603switch || !AbstractC8576l.yandex(c6956l3.m2132native(), Integer.valueOf(iLoadAd))) {
                        c6956l3.m2147try(Integer.valueOf(iLoadAd));
                        c6956l3.loadAd(Integer.valueOf(iLoadAd), c6415l);
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, C3438l.amazon);
                    float f = AbstractC9962l.loadAd;
                    float f2 = AbstractC9962l.crashlytics;
                    float f3 = (f + f2) * 2.0f;
                    long j2 = this.f12346l;
                    if (zBooleanValue) {
                        c6956l3.m2123default(-1916589279);
                        AbstractC16978l.yandex(f2, 0, 390, j2, 0L, c6956l3, AbstractC0080l.isPro(c4346l, f3));
                        c6956l = c6956l3;
                        c6956l.startapp(false);
                    } else {
                        c6956l = c6956l3;
                        c6956l.m2123default(-1916362142);
                        AbstractC9962l.yandex(c7473l, j2, AbstractC0080l.isPro(c4346l, f3), c6956l, 384);
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C7806l c7806l = (C7806l) obj4;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l4.mopub(zBooleanValue2) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long j3 = this.f12346l;
                    if (zBooleanValue2) {
                        c6956l4.m2123default(-499763759);
                        int i3 = AbstractC9256l.yandex;
                        AbstractC4332l.yandex(AbstractC0080l.isPro(c4346l, 16.0f), j3, 2.5f, 0L, 0, 0.0f, c6956l4, 390, 56);
                        c6956l4.startapp(false);
                    } else {
                        c6956l4.m2123default(-499540745);
                        boolean zBilling = c6956l4.billing(c7806l);
                        Object objM2132native2 = c6956l4.m2132native();
                        if (zBilling || objM2132native2 == c13863l) {
                            objM2132native2 = new C13443l(2, c7806l);
                            c6956l4.m2147try(objM2132native2);
                        }
                        AbstractC9256l.yandex((InterfaceC6477l) objM2132native2, j3, c6956l4, 0);
                        c6956l4.startapp(false);
                    }
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5853l(long j, Object obj, int i) {
        this.f12347l = i;
        this.f12346l = j;
        this.f12345l = obj;
    }
}
