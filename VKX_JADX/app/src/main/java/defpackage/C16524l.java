package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٖٝۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16524l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f32294l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32295l;

    public /* synthetic */ C16524l(C15578l c15578l, int i) {
        this.f32295l = i;
        this.f32294l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f32295l;
        C4346l c4346l = C4346l.f8873l;
        C15578l c15578l = this.f32294l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
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
                    AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    c15578l.invoke(C0397l.yandex, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.purchase, C18450l.f36040l, c6956l, 54);
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
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                    c15578l.invoke(C18295l.yandex, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
