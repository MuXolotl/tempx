package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6960l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f14615l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f14617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14618l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f14619l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14620l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f14621l;

    public /* synthetic */ C6960l(C11194l c11194l, C15578l c15578l, C15578l c15578l2, float f, int i, C15578l c15578l3) {
        this.f14620l = c11194l;
        this.f14619l = c15578l;
        this.f14621l = c15578l2;
        this.f14617l = f;
        this.f14615l = i;
        this.f14616l = c15578l3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14618l;
        int i2 = this.f14615l;
        Object obj3 = this.f14616l;
        InterfaceC14328l interfaceC14328l = this.f14621l;
        Object obj4 = this.f14619l;
        Object obj5 = this.f14620l;
        switch (i) {
            case 0:
                C11194l c11194l = (C11194l) obj5;
                C15578l c15578l = (C15578l) obj4;
                C15578l c15578l2 = (C15578l) interfaceC14328l;
                C15578l c15578l3 = (C15578l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC12311l.isPro(c6956l);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
                    boolean zBilling = c6956l.billing(c11194l) | c6956l.billing(interfaceC2262l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C8527l(c11194l, interfaceC2262l);
                        c6956l.m2147try(objM2132native2);
                    }
                    C8527l c8527l = (C8527l) objM2132native2;
                    Object objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C11636l();
                        c6956l.m2147try(objM2132native3);
                    }
                    C11636l c11636l = (C11636l) objM2132native3;
                    List listRemoteconfig = AbstractC14055l.remoteconfig(c15578l, c15578l2, AbstractC14566l.amazon(1300883543, new C9772l(c15578l3, c11636l, 10), c6956l));
                    float f = this.f14617l;
                    boolean zCrashlytics = c6956l.crashlytics(f) | c6956l.amazon(i2) | c6956l.admob(c8527l);
                    Object objM2132native4 = c6956l.m2132native();
                    if (zCrashlytics || objM2132native4 == c13863l) {
                        objM2132native4 = new C1927l(f, c11636l, i2, c8527l);
                        c6956l.m2147try(objM2132native4);
                    }
                    InterfaceC5344l interfaceC5344l = (InterfaceC5344l) objM2132native4;
                    C15578l c15578lAmazon = AbstractC16164l.amazon(listRemoteconfig);
                    boolean zBilling2 = c6956l.billing(interfaceC5344l);
                    Object objM2132native5 = c6956l.m2132native();
                    if (zBilling2 || objM2132native5 == c13863l) {
                        objM2132native5 = new C1855l(interfaceC5344l);
                        c6956l.m2147try(objM2132native5);
                    }
                    InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native5;
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578lAmazon, c6956l, true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC11028l.mopub((String) obj5, (String) obj4, this.f14617l, (Function1) interfaceC14328l, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6960l(String str, String str2, float f, Function1 function1, InterfaceC17242l interfaceC17242l, int i) {
        this.f14620l = str;
        this.f14619l = str2;
        this.f14617l = f;
        this.f14621l = function1;
        this.f14616l = interfaceC17242l;
        this.f14615l = i;
    }
}
