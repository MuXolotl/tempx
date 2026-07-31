package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14604l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f28587l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f28588l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28589l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28590l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ Object f28591l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28592l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28593l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f28594l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ Object f28595l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f28596l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28597l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f28598l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f28599l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11090l f28600l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f28601l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f28602l;

    public /* synthetic */ C14604l(C0639l c0639l, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, C3790l c3790l, C6973l c6973l, boolean z2, int i, int i2, C10754l c10754l, Function1 function2, C2403l c2403l, C8990l c8990l, C15578l c15578l, int i3) {
        this.f28599l = c0639l;
        this.f28594l = function1;
        this.f28588l = interfaceC17242l;
        this.f28592l = z;
        this.f28600l = c11090l;
        this.f28598l = c3790l;
        this.f28587l = c6973l;
        this.f28597l = z2;
        this.f28589l = i;
        this.f28590l = i2;
        this.f28602l = c10754l;
        this.f28601l = function2;
        this.f28595l = c2403l;
        this.f28591l = c8990l;
        this.f28596l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28593l;
        Object obj3 = this.f28591l;
        Object obj4 = this.f28595l;
        Object obj5 = this.f28602l;
        Object obj6 = this.f28587l;
        Object obj7 = this.f28598l;
        Object obj8 = this.f28601l;
        InterfaceC14328l interfaceC14328l = this.f28594l;
        Object obj9 = this.f28599l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(1);
                AbstractC16363l.crashlytics((C0639l) obj9, (Function1) interfaceC14328l, this.f28588l, this.f28592l, this.f28600l, (C3790l) obj7, (C6973l) obj6, this.f28597l, this.f28589l, this.f28590l, (C10754l) obj5, (Function1) obj8, (C2403l) obj4, (C8990l) obj3, this.f28596l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(this.f28589l | 1);
                int iPurchase3 = AbstractC0545l.purchase(this.f28590l);
                AbstractC1544l.purchase(this.f28592l, this.f28588l, (Function0) obj9, this.f28597l, this.f28596l, this.f28600l, (Function2) interfaceC14328l, (InterfaceC6347l) obj8, (C12927l) obj7, (C1437l) obj6, (C5028l) obj5, (InterfaceC5404l) obj4, (InterfaceC11780l) obj3, (C6956l) obj, iPurchase2, iPurchase3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14604l(boolean z, InterfaceC17242l interfaceC17242l, Function0 function0, boolean z2, C15578l c15578l, C11090l c11090l, Function2 function2, InterfaceC6347l interfaceC6347l, C12927l c12927l, C1437l c1437l, C5028l c5028l, InterfaceC5404l interfaceC5404l, InterfaceC11780l interfaceC11780l, int i, int i2) {
        this.f28592l = z;
        this.f28588l = interfaceC17242l;
        this.f28599l = function0;
        this.f28597l = z2;
        this.f28596l = c15578l;
        this.f28600l = c11090l;
        this.f28594l = function2;
        this.f28601l = interfaceC6347l;
        this.f28598l = c12927l;
        this.f28587l = c1437l;
        this.f28602l = c5028l;
        this.f28595l = interfaceC5404l;
        this.f28591l = interfaceC11780l;
        this.f28589l = i;
        this.f28590l = i2;
    }
}
