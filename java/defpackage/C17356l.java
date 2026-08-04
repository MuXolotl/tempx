package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17356l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9197l f33819l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33820l;

    public /* synthetic */ C17356l(C9197l c9197l, int i) {
        this.f33820l = i;
        this.f33819l = c9197l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l;
        int i = this.f33820l;
        C13863l c13863l = C1867l.yandex;
        int i2 = 2;
        C4346l c4346l = C4346l.f8873l;
        C9197l c9197l = this.f33819l;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (c9197l.f18908l) {
                        c6956l2.m2123default(1281901062);
                        boolean zAdmob = c6956l2.admob(c9197l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new C5840l(c9197l, i3);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC11141l.crashlytics, c6956l2, 1572864, 62);
                        c6956l = c6956l2;
                    } else {
                        c6956l = c6956l2;
                        c6956l.m2123default(1275735596);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 1:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l3, 0);
                    long j = c6956l3.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, c4346l);
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
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l3.admob(c9197l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C5840l(c9197l, i2);
                        c6956l3.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native2, 15);
                    int i5 = AbstractC15548l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13319l.yandex(AbstractC11141l.purchase, interfaceC17242lLoadAd, null, null, AbstractC11141l.billing, null, AbstractC15548l.yandex(0L, ((C14370l) c6956l3.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l3.isPro(c10707l)).yandex.yandex, 0L, c6956l3, 505), c6956l3, 24582, 428);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l3, 0, 7);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c9197l.m2623instanceof(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l4, 6);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
