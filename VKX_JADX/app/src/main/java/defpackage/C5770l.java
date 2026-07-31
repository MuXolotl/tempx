package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؘّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5770l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f12164l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12165l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f12166l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12167l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f12168l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f12169l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f12170l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f12171l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770l(C18656l c18656l, InterfaceC17242l interfaceC17242l, Function1 function1, InterfaceC13460l interfaceC13460l, Function1 function2, Function4 function4, int i) {
        super(2);
        this.f12164l = c18656l;
        this.f12168l = interfaceC17242l;
        this.f12169l = function1;
        this.f12166l = interfaceC13460l;
        this.f12165l = function2;
        this.f12170l = function4;
        this.f12171l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f12167l;
        int i2 = this.f12171l;
        Object obj3 = this.f12166l;
        Object obj4 = this.f12165l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                C18656l c18656l = this.f12164l;
                InterfaceC17242l interfaceC17242l = this.f12168l;
                Function1 function1 = this.f12169l;
                AbstractC7741l.yandex(c18656l, interfaceC17242l, function1, (InterfaceC13460l) obj3, (Function1) obj4, this.f12170l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Number) obj2).intValue();
                C15578l c15578l = (C15578l) this.f12170l;
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                C18656l c18656l2 = this.f12164l;
                Function1 function2 = this.f12169l;
                InterfaceC17242l interfaceC17242l2 = this.f12168l;
                AbstractC3308l.purchase(c18656l2, function2, interfaceC17242l2, (C3000l) obj4, (C0274l) obj3, c15578l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770l(C18656l c18656l, Function1 function1, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, C15578l c15578l, int i) {
        super(2);
        this.f12164l = c18656l;
        this.f12169l = function1;
        this.f12168l = interfaceC17242l;
        this.f12165l = c3000l;
        this.f12166l = c0274l;
        this.f12170l = c15578l;
        this.f12171l = i;
    }
}
