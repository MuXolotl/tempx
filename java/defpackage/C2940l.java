package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2940l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6397l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f6398l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f6399l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6400l = 3;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f6401l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6402l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f6403l;

    public /* synthetic */ C2940l(int i, InterfaceC17242l interfaceC17242l, String str, String str2, String str3, Function0 function0, boolean z) {
        this.f6402l = str;
        this.f6401l = str2;
        this.f6403l = str3;
        this.f6397l = z;
        this.f6398l = function0;
        this.f6399l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6400l;
        InterfaceC14328l interfaceC14328l = this.f6398l;
        Object obj3 = this.f6403l;
        Object obj4 = this.f6401l;
        Object obj5 = this.f6402l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(196993);
                AbstractC11839l.yandex(this.f6397l, (EnumC11447l) obj5, (AbstractC18082l) obj4, (Function2) obj3, (Function2) interfaceC14328l, this.f6399l, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1572913);
                AbstractC7470l.crashlytics((Function0) obj5, this.f6399l, this.f6397l, (InterfaceC6347l) obj4, (C17076l) obj3, (C15578l) interfaceC14328l, (C6956l) obj, iPurchase2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(196609);
                AbstractC8007l.amazon((EnumC12999l) obj5, (Function1) obj4, this.f6397l, (Function0) obj3, (Function0) interfaceC14328l, this.f6399l, (C6956l) obj, iPurchase3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(1);
                AbstractC10704l.loadAd(iPurchase4, (C6956l) obj, this.f6399l, (String) obj5, (String) obj4, (String) obj3, (Function0) interfaceC14328l, this.f6397l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2940l(EnumC12999l enumC12999l, Function1 function1, boolean z, Function0 function0, Function0 function2, InterfaceC17242l interfaceC17242l, int i) {
        this.f6402l = enumC12999l;
        this.f6401l = function1;
        this.f6397l = z;
        this.f6403l = function0;
        this.f6398l = function2;
        this.f6399l = interfaceC17242l;
    }

    public /* synthetic */ C2940l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C15578l c15578l, int i) {
        this.f6402l = function0;
        this.f6399l = interfaceC17242l;
        this.f6397l = z;
        this.f6401l = interfaceC6347l;
        this.f6403l = c17076l;
        this.f6398l = c15578l;
    }

    public /* synthetic */ C2940l(boolean z, EnumC11447l enumC11447l, AbstractC18082l abstractC18082l, Function2 function2, Function2 function3, InterfaceC17242l interfaceC17242l, int i) {
        this.f6397l = z;
        this.f6402l = enumC11447l;
        this.f6401l = abstractC18082l;
        this.f6403l = function2;
        this.f6398l = function3;
        this.f6399l = interfaceC17242l;
    }
}
