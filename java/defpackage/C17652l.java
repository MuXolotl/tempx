package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17652l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f34341l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f34342l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34343l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f34344l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34346l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34347l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34348l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34349l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f34350l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34351l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f34352l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f34353l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f34354l;

    public /* synthetic */ C17652l(InterfaceC17242l interfaceC17242l, C8232l c8232l, C1232l c1232l, C17253l c17253l, boolean z, InterfaceC14745l interfaceC14745l, boolean z2, C10306l c10306l, InterfaceC3501l interfaceC3501l, InterfaceC5404l interfaceC5404l, Function1 function1, int i, int i2) {
        this.f34342l = interfaceC17242l;
        this.f34343l = c8232l;
        this.f34344l = c1232l;
        this.f34351l = c17253l;
        this.f34345l = z;
        this.f34347l = interfaceC14745l;
        this.f34349l = z2;
        this.f34353l = c10306l;
        this.f34350l = interfaceC3501l;
        this.f34341l = interfaceC5404l;
        this.f34354l = function1;
        this.f34348l = i;
        this.f34352l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34346l;
        int i2 = this.f34348l;
        InterfaceC14328l interfaceC14328l = this.f34354l;
        Object obj3 = this.f34341l;
        Object obj4 = this.f34350l;
        Object obj5 = this.f34353l;
        Object obj6 = this.f34347l;
        Object obj7 = this.f34351l;
        Object obj8 = this.f34344l;
        Object obj9 = this.f34343l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                int iPurchase2 = AbstractC0545l.purchase(this.f34352l);
                AbstractC16837l.yandex(this.f34342l, (C8232l) obj9, (C1232l) obj8, (C17253l) obj7, this.f34345l, (InterfaceC14745l) obj6, this.f34349l, (C10306l) obj5, (InterfaceC3501l) obj4, (InterfaceC5404l) obj3, (Function1) interfaceC14328l, (C6956l) obj, iPurchase, iPurchase2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC17122l.crashlytics((C0275l) obj9, this.f34345l, (Function0) obj8, (InterfaceC6347l) obj7, this.f34342l, this.f34349l, (C13959l) obj6, (C5028l) obj5, (InterfaceC11780l) obj4, (Function2) obj3, (C15578l) interfaceC14328l, (C6956l) obj, iPurchase3, this.f34352l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17652l(C0275l c0275l, boolean z, Function0 function0, InterfaceC6347l interfaceC6347l, InterfaceC17242l interfaceC17242l, boolean z2, C13959l c13959l, C5028l c5028l, InterfaceC11780l interfaceC11780l, Function2 function2, C15578l c15578l, int i, int i2) {
        this.f34343l = c0275l;
        this.f34345l = z;
        this.f34344l = function0;
        this.f34351l = interfaceC6347l;
        this.f34342l = interfaceC17242l;
        this.f34349l = z2;
        this.f34347l = c13959l;
        this.f34353l = c5028l;
        this.f34350l = interfaceC11780l;
        this.f34341l = function2;
        this.f34354l = c15578l;
        this.f34348l = i;
        this.f34352l = i2;
    }
}
