package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3256l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ int f6956l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f6957l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C3790l f6958l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C6973l f6959l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f6960l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f6961l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6962l = 0;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f6963l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ Object f6964l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6965l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ Object f6966l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C11090l f6967l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6968l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ int f6969l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6970l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10754l f6971l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ int f6972l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ int f6973l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6974l;

    public /* synthetic */ C3256l(C0639l c0639l, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, Function2 function2, Function2 function3, C10754l c10754l, C3790l c3790l, C6973l c6973l, boolean z2, int i, int i2, InterfaceC6347l interfaceC6347l, C1351l c1351l, int i3, int i4, int i5) {
        this.f6966l = c0639l;
        this.f6961l = function1;
        this.f6957l = interfaceC17242l;
        this.f6968l = z;
        this.f6967l = c11090l;
        this.f6960l = function2;
        this.f6964l = function3;
        this.f6971l = c10754l;
        this.f6958l = c3790l;
        this.f6959l = c6973l;
        this.f6970l = z2;
        this.f6965l = i;
        this.f6972l = i2;
        this.f6974l = interfaceC6347l;
        this.f6963l = c1351l;
        this.f6969l = i3;
        this.f6956l = i4;
        this.f6973l = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6962l;
        int i2 = this.f6956l;
        int i3 = this.f6969l;
        Object obj3 = this.f6963l;
        Object obj4 = this.f6974l;
        Object obj5 = this.f6964l;
        InterfaceC14328l interfaceC14328l = this.f6960l;
        Object obj6 = this.f6966l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                int iPurchase2 = AbstractC0545l.purchase(i2);
                AbstractC16363l.amazon((String) obj6, this.f6961l, this.f6957l, this.f6968l, this.f6967l, this.f6958l, this.f6959l, this.f6970l, this.f6965l, this.f6972l, this.f6971l, (Function1) interfaceC14328l, (C2403l) obj5, (C8990l) obj4, (C15578l) obj3, (C6956l) obj, iPurchase, iPurchase2, this.f6973l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i3 | 1);
                int iPurchase4 = AbstractC0545l.purchase(i2);
                AbstractC2130l.crashlytics((C0639l) obj6, this.f6961l, this.f6957l, this.f6968l, this.f6967l, (Function2) interfaceC14328l, (Function2) obj5, this.f6971l, this.f6958l, this.f6959l, this.f6970l, this.f6965l, this.f6972l, (InterfaceC6347l) obj4, (C1351l) obj3, (C6956l) obj, iPurchase3, iPurchase4, this.f6973l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3256l(String str, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, C3790l c3790l, C6973l c6973l, boolean z2, int i, int i2, C10754l c10754l, Function1 function2, C2403l c2403l, C8990l c8990l, C15578l c15578l, int i3, int i4, int i5) {
        this.f6966l = str;
        this.f6961l = function1;
        this.f6957l = interfaceC17242l;
        this.f6968l = z;
        this.f6967l = c11090l;
        this.f6958l = c3790l;
        this.f6959l = c6973l;
        this.f6970l = z2;
        this.f6965l = i;
        this.f6972l = i2;
        this.f6971l = c10754l;
        this.f6960l = function2;
        this.f6964l = c2403l;
        this.f6974l = c8990l;
        this.f6963l = c15578l;
        this.f6969l = i3;
        this.f6956l = i4;
        this.f6973l = i5;
    }
}
