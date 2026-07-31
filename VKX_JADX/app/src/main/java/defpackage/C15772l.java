package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15772l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30966l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30967l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f30968l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30969l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f30970l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30971l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f30972l;

    public /* synthetic */ C15772l(C16911l c16911l, boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, Integer num, boolean z2, int i) {
        this.f30970l = c16911l;
        this.f30966l = z;
        this.f30972l = function1;
        this.f30968l = interfaceC17242l;
        this.f30967l = num;
        this.f30971l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30969l;
        Object obj3 = this.f30967l;
        Object obj4 = this.f30972l;
        Object obj5 = this.f30970l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C16911l) obj5).m4250import(this.f30966l, (Function1) obj4, this.f30968l, (Integer) obj3, this.f30971l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0130l) obj5).pro(this.f30968l, (C6417l) obj4, (C9894l) obj3, this.f30966l, this.f30971l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                InterfaceC2186l interfaceC2186l = (InterfaceC2186l) obj5;
                Function0 function0 = (Function0) obj4;
                C15578l c15578l = (C15578l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC10586l.admob(this.f30968l, this.f30966l, null, interfaceC2186l, this.f30971l, new C6402l(4), function0), 1.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.purchase, C18450l.f36034l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
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
                    c15578l.invoke(C0397l.yandex, c6956l, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15772l(InterfaceC17242l interfaceC17242l, boolean z, C8372l c8372l, boolean z2, Function0 function0, C15578l c15578l) {
        this.f30968l = interfaceC17242l;
        this.f30966l = z;
        this.f30970l = c8372l;
        this.f30971l = z2;
        this.f30972l = function0;
        this.f30967l = c15578l;
    }

    public /* synthetic */ C15772l(C0130l c0130l, InterfaceC17242l interfaceC17242l, C6417l c6417l, C9894l c9894l, boolean z, boolean z2, int i) {
        this.f30970l = c0130l;
        this.f30968l = interfaceC17242l;
        this.f30972l = c6417l;
        this.f30967l = c9894l;
        this.f30966l = z;
        this.f30971l = z2;
    }
}
