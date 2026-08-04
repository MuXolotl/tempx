package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔۛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15162l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f29744l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29745l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f29746l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f29747l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29748l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f29749l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f29750l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f29751l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f29752l;

    public /* synthetic */ C15162l(String str, EnumC3830l enumC3830l, Function0 function0, InterfaceC17242l interfaceC17242l, long j, long j2, long j3, long j4, int i) {
        this.f29752l = str;
        this.f29745l = enumC3830l;
        this.f29746l = function0;
        this.f29751l = interfaceC17242l;
        this.f29747l = j;
        this.f29744l = j2;
        this.f29750l = j3;
        this.f29749l = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C11090l c11090lYandex;
        C6415l c6415l;
        boolean z;
        int i = this.f29748l;
        Object obj3 = this.f29751l;
        InterfaceC14328l interfaceC14328l = this.f29746l;
        Object obj4 = this.f29745l;
        Object obj5 = this.f29752l;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj5;
                Function2 function3 = (Function2) obj4;
                Function2 function4 = (Function2) interfaceC14328l;
                C15578l c15578l = (C15578l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b = 0;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10086l c10086l = AbstractC7063l.yandex;
                    float f = ((Boolean) c10086l.getValue()).booleanValue() ? 20.0f : 24.0f;
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(C4346l.f8873l, new C17253l(f, f, f, f));
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
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
                    C6415l c6415l2 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l, c1853lYandex, c6415l2);
                    C6415l c6415l3 = C3438l.billing;
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l3);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l4 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l4);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l5 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l5);
                    if (function2 == null) {
                        c6956l.m2123default(346092326);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(346092327);
                        AbstractC10478l.yandex(AbstractC5020l.startapp(this.f29747l, AbstractC12502l.yandex), AbstractC14566l.amazon(-1128150638, new C13393l(function2, b, b), c6956l), c6956l, 56);
                        c6956l.startapp(false);
                    }
                    if (function3 == null) {
                        c6956l.m2123default(346408309);
                        c6956l.startapp(false);
                        c6415l = c6415l4;
                    } else {
                        c6956l.m2123default(346408310);
                        if (((Boolean) c10086l.getValue()).booleanValue()) {
                            c6956l.m2123default(1812109189);
                            c11090lYandex = C11090l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.billing, 0L, AbstractC7039l.isPro(20), null, null, 0L, AbstractC7039l.isPro(26), null, null, 16646141);
                            c6956l.startapp(false);
                        } else {
                            c6956l.m2123default(1812321322);
                            c11090lYandex = AbstractC8644l.yandex(c6956l, 9);
                            c6956l.startapp(false);
                        }
                        c6415l = c6415l4;
                        AbstractC3383l.billing(this.f29744l, c11090lYandex, AbstractC14566l.amazon(71284337, new Cpublic(function2, function3, 4), c6956l), c6956l, 384);
                        c6956l.startapp(false);
                    }
                    if (function4 == null) {
                        c6956l.m2123default(347551589);
                        c6956l.startapp(false);
                        z = true;
                    } else {
                        c6956l.m2123default(347551590);
                        C11090l c11090lYandex2 = AbstractC8644l.yandex(c6956l, 2);
                        C15578l c15578lAmazon = AbstractC14566l.amazon(705583346, new C13393l(function4, 1, b), c6956l);
                        z = true;
                        AbstractC3383l.billing(this.f29750l, c11090lYandex2, c15578lAmazon, c6956l, 384);
                        c6956l.startapp(false);
                    }
                    C14020l c14020l = new C14020l(C18450l.f36023l);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c14020l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l2);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l3);
                    AbstractC11043l.isPro(i3, c6956l, c6415l, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l5);
                    AbstractC3383l.billing(this.f29749l, AbstractC8644l.yandex(c6956l, 10), c15578l, c6956l, 0);
                    c6956l.startapp(z);
                    c6956l.startapp(z);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC18219l.adcel((String) obj5, (EnumC3830l) obj4, (Function0) interfaceC14328l, (InterfaceC17242l) obj3, this.f29747l, this.f29744l, this.f29750l, this.f29749l, (C6956l) obj, AbstractC0545l.purchase(3073));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15162l(Function2 function2, Function2 function3, Function2 function4, long j, long j2, long j3, long j4, C15578l c15578l) {
        this.f29752l = function2;
        this.f29745l = function3;
        this.f29746l = function4;
        this.f29747l = j;
        this.f29744l = j2;
        this.f29750l = j3;
        this.f29749l = j4;
        this.f29751l = c15578l;
    }
}
