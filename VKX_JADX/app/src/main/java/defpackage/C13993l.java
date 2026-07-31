package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13993l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f27300l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f27301l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27302l;

    public /* synthetic */ C13993l(C0471l c0471l, int i, int i2) {
        this.f27302l = i2;
        this.f27301l = c0471l;
        this.f27300l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f27302l;
        C13863l c13863l = C1867l.yandex;
        int i2 = this.f27300l;
        C0471l c0471l = this.f27301l;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C17253l c17253l = new C17253l(16.0f, 8.0f, 16.0f, 8.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l.isPro(c10707l)).yandex.license, 0L, 0L, c6956l, 12);
                    C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
                    boolean zAdmob = c6956l.admob(c0471l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C16439l(c0471l, 1);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native, null, false, c6839lYandex, c13412lYandex, null, null, c17253l, AbstractC14566l.amazon(991698381, new C13993l(c0471l, i2, i3), c6956l), c6956l, 817889280, 358);
                    C6956l c6956l2 = c6956l;
                    if (c0471l.m566public().yandex.smaato.length() > 0) {
                        c6956l2.m2123default(-349088756);
                        boolean zAdmob2 = c6956l2.admob(c0471l);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zAdmob2 || objM2132native2 == c13863l) {
                            objM2132native2 = new C16439l(c0471l, 2);
                            c6956l2.m2147try(objM2132native2);
                        }
                        AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, C2287l.amazon, c6956l2, 1572864, 62);
                        c6956l2 = c6956l2;
                    } else {
                        c6956l2.m2123default(-368550587);
                    }
                    c6956l2.startapp(false);
                    c6956l2.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Boolean bool = (Boolean) c0471l.f1723l.getValue();
                    bool.booleanValue();
                    boolean zAmazon = c6956l3.amazon(i2);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAmazon || objM2132native3 == c13863l) {
                        objM2132native3 = new C2221l(i2, 18);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC7741l.loadAd(bool, null, (Function1) objM2132native3, null, null, null, C2287l.crashlytics, c6956l3, 1572864, 58);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
