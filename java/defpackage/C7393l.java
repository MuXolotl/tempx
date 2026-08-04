package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7393l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f15317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11780l f15318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15319l;

    public /* synthetic */ C7393l(InterfaceC11780l interfaceC11780l, Function3 function3, int i) {
        this.f15319l = i;
        this.f15318l = interfaceC11780l;
        this.f15317l = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15319l;
        C18295l c18295l = C18295l.yandex;
        C1461l c1461l = AbstractC8313l.purchase;
        C4346l c4346l = C4346l.f8873l;
        Function3 function3 = this.f15317l;
        InterfaceC11780l interfaceC11780l = this.f15318l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = C12719l.yandex;
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.yandex(c4346l, C12719l.crashlytics, C12719l.billing()), interfaceC11780l);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c1461l, C18450l.f36040l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    function3.invoke(c18295l, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lFirebase2 = AbstractC3605l.firebase(AbstractC0080l.yandex(c4346l, 58.0f, 40.0f), interfaceC11780l);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c1461l, C18450l.f36040l, c6956l, 54);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l2);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                    function3.invoke(c18295l, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
