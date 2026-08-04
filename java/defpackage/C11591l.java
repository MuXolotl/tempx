package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11591l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11780l f23292l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23293l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f23294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f23295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23296l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23297l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23298l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23299l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f23300l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f23301l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f23302l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f23303l;

    public /* synthetic */ C11591l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C13412l c13412l, C1570l c1570l, C5028l c5028l, InterfaceC11780l interfaceC11780l, Function3 function3, int i, int i2) {
        this.f23296l = 0;
        this.f23293l = function0;
        this.f23295l = interfaceC17242l;
        this.f23299l = z;
        this.f23294l = interfaceC6347l;
        this.f23301l = c13412l;
        this.f23297l = c1570l;
        this.f23303l = c5028l;
        this.f23292l = interfaceC11780l;
        this.f23300l = function3;
        this.f23298l = i;
        this.f23302l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23296l;
        int i2 = this.f23298l;
        InterfaceC14328l interfaceC14328l = this.f23300l;
        Object obj3 = this.f23303l;
        Object obj4 = this.f23297l;
        Object obj5 = this.f23301l;
        Object obj6 = this.f23294l;
        Object obj7 = this.f23293l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC17457l.loadAd((Function0) obj7, this.f23295l, this.f23299l, (InterfaceC6347l) obj6, (C13412l) obj5, (C1570l) obj4, (C5028l) obj3, this.f23292l, (Function3) interfaceC14328l, (C6956l) obj, iPurchase, this.f23302l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC16336l.yandex(this.f23295l, (C5866l) obj7, this.f23292l, (InterfaceC3501l) obj6, (InterfaceC6947l) obj5, (InterfaceC14745l) obj4, this.f23299l, (C10306l) obj3, (Function1) interfaceC14328l, (C6956l) obj, iPurchase2, this.f23302l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC16336l.loadAd(this.f23295l, (C5866l) obj7, this.f23292l, (InterfaceC5404l) obj6, (C0086l) obj5, (InterfaceC14745l) obj4, this.f23299l, (C10306l) obj3, (Function1) interfaceC14328l, (C6956l) obj, iPurchase3, this.f23302l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C11591l(InterfaceC17242l interfaceC17242l, C5866l c5866l, InterfaceC11780l interfaceC11780l, Object obj, Object obj2, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, Function1 function1, int i, int i2, int i3) {
        this.f23296l = i3;
        this.f23295l = interfaceC17242l;
        this.f23293l = c5866l;
        this.f23292l = interfaceC11780l;
        this.f23294l = obj;
        this.f23301l = obj2;
        this.f23297l = interfaceC14745l;
        this.f23299l = z;
        this.f23303l = c10306l;
        this.f23300l = function1;
        this.f23298l = i;
        this.f23302l = i2;
    }
}
