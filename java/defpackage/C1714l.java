package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1714l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f4100l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4101l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4102l;

    public /* synthetic */ C1714l(long j, InterfaceC17242l interfaceC17242l) {
        this.f4102l = 0;
        this.f4100l = j;
        this.f4101l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4102l;
        long j = this.f4100l;
        Object obj3 = this.f4101l;
        switch (i) {
            case 0:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2124else();
                } else if (j != 9205357640488583168L) {
                    c6956l.m2123default(-1244013944);
                    InterfaceC17242l interfaceC17242lSubs = AbstractC0080l.subs(interfaceC17242l, C2261l.loadAd(j), C2261l.yandex(j), 0.0f, 0.0f, 12);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36017l, false);
                    long j2 = c6956l.f14595continue;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSubs);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC6852l.loadAd(0, 1, c6956l, null);
                    c6956l.startapp(true);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1243644858);
                    AbstractC6852l.loadAd(0, 0, c6956l, interfaceC17242l);
                    c6956l.startapp(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC15918l.purchase(AbstractC0545l.purchase(3073), j, (C6956l) obj, (InterfaceC17242l) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC9256l.yandex((InterfaceC6477l) obj3, j, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1714l(Object obj, long j, int i, int i2) {
        this.f4102l = i2;
        this.f4101l = obj;
        this.f4100l = j;
    }
}
