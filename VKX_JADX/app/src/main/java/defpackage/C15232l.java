package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔۡؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15232l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f29829l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29830l;

    public /* synthetic */ C15232l(int i, Function3 function3) {
        this.f29830l = i;
        this.f29829l = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f29830l;
        C0397l c0397l = C0397l.yandex;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C4346l c4346l = C4346l.f8873l;
        Function3 function3 = this.f29829l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    function3.invoke(C18295l.yandex, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l, 0);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    function3.invoke(c0397l, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l, 0);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l2);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                    function3.invoke(c0397l, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lYandex = AbstractC0080l.yandex(c4346l, 32.0f, 32.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j3 = c6956l.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l3);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, C3438l.amazon);
                    function3.invoke(C16170l.yandex, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
