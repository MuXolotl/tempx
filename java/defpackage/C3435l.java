package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3435l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f7300l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7301l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f7302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7304l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f7305l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7306l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f7307l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7308l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f7309l;

    public /* synthetic */ C3435l(C17136l c17136l, C15578l c15578l, C15578l c15578l2, boolean z, Function0 function0, InterfaceC17242l interfaceC17242l, Function2 function2, int i, int i2) {
        this.f7301l = c17136l;
        this.f7302l = c15578l;
        this.f7308l = c15578l2;
        this.f7303l = z;
        this.f7300l = function0;
        this.f7307l = interfaceC17242l;
        this.f7305l = function2;
        this.f7306l = i;
        this.f7309l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7304l;
        int i2 = this.f7306l;
        InterfaceC14328l interfaceC14328l = this.f7305l;
        Object obj3 = this.f7308l;
        Object obj4 = this.f7302l;
        Object obj5 = this.f7301l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC17457l.mopub(this.f7300l, this.f7307l, this.f7303l, (InterfaceC6347l) obj5, (C13412l) obj4, (InterfaceC11780l) obj3, (Function3) interfaceC14328l, (C6956l) obj, iPurchase, this.f7309l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                ((C17136l) obj5).m4272public((C15578l) obj4, (C15578l) obj3, this.f7303l, this.f7300l, this.f7307l, (Function2) interfaceC14328l, (C6956l) obj, iPurchase2, this.f7309l);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.billing(this.f7300l, this.f7307l, this.f7303l, (C17076l) obj4, (C2403l) obj3, (InterfaceC6347l) obj5, (Function2) interfaceC14328l, (C6956l) obj, iPurchase3, this.f7309l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(i2 | 1);
                AbstractC15645l.amazon((InterfaceC16711l) obj5, (C15578l) obj4, (C15178l) obj3, this.f7307l, this.f7300l, this.f7303l, (Function2) interfaceC14328l, (C6956l) obj, iPurchase4, this.f7309l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3435l(InterfaceC16711l interfaceC16711l, C15578l c15578l, C15178l c15178l, InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, Function2 function2, int i, int i2) {
        this.f7301l = interfaceC16711l;
        this.f7302l = c15578l;
        this.f7308l = c15178l;
        this.f7307l = interfaceC17242l;
        this.f7300l = function0;
        this.f7303l = z;
        this.f7305l = function2;
        this.f7306l = i;
        this.f7309l = i2;
    }

    public /* synthetic */ C3435l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, C17076l c17076l, C2403l c2403l, InterfaceC6347l interfaceC6347l, Function2 function2, int i, int i2) {
        this.f7300l = function0;
        this.f7307l = interfaceC17242l;
        this.f7303l = z;
        this.f7302l = c17076l;
        this.f7308l = c2403l;
        this.f7301l = interfaceC6347l;
        this.f7305l = function2;
        this.f7306l = i;
        this.f7309l = i2;
    }

    public /* synthetic */ C3435l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C13412l c13412l, InterfaceC11780l interfaceC11780l, Function3 function3, int i, int i2) {
        this.f7300l = function0;
        this.f7307l = interfaceC17242l;
        this.f7303l = z;
        this.f7301l = interfaceC6347l;
        this.f7302l = c13412l;
        this.f7308l = interfaceC11780l;
        this.f7305l = function3;
        this.f7306l = i;
        this.f7309l = i2;
    }
}
