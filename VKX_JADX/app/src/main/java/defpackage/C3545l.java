package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lُٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3545l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f7447l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7448l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f7449l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7450l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f7451l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f7452l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7453l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7454l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f7455l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3545l(C18656l c18656l, InterfaceC17242l interfaceC17242l, Function1 function1, InterfaceC13460l interfaceC13460l, Function1 function2, Function1 function3, Function4 function4, int i) {
        super(2);
        this.f7447l = c18656l;
        this.f7452l = interfaceC17242l;
        this.f7453l = function1;
        this.f7454l = interfaceC13460l;
        this.f7448l = function2;
        this.f7449l = function3;
        this.f7451l = function4;
        this.f7455l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7450l;
        int i2 = this.f7455l;
        Object obj3 = this.f7454l;
        Object obj4 = this.f7449l;
        Object obj5 = this.f7448l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                C18656l c18656l = this.f7447l;
                InterfaceC17242l interfaceC17242l = this.f7452l;
                Function1 function1 = this.f7453l;
                AbstractC7741l.crashlytics(c18656l, interfaceC17242l, function1, (InterfaceC13460l) obj3, (Function1) obj5, (Function1) obj4, this.f7451l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Number) obj2).intValue();
                C15578l c15578l = (C15578l) this.f7451l;
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                C18656l c18656l2 = this.f7447l;
                Function1 function2 = this.f7453l;
                InterfaceC17242l interfaceC17242l2 = this.f7452l;
                AbstractC3308l.yandex(c18656l2, function2, interfaceC17242l2, (C3000l) obj5, (C0274l) obj4, (Function2) obj3, c15578l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3545l(C18656l c18656l, Function1 function1, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, Function2 function2, C15578l c15578l, int i) {
        super(2);
        this.f7447l = c18656l;
        this.f7453l = function1;
        this.f7452l = interfaceC17242l;
        this.f7448l = c3000l;
        this.f7449l = c0274l;
        this.f7454l = function2;
        this.f7451l = c15578l;
        this.f7455l = i;
    }
}
