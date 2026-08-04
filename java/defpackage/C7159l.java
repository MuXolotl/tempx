package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7159l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f14975l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14976l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14977l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f14978l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14979l;

    public /* synthetic */ C7159l(boolean z, C2403l c2403l, C1351l c1351l, InterfaceC6347l interfaceC6347l) {
        this.f14977l = 8;
        this.f14976l = z;
        this.f14975l = c2403l;
        this.f14979l = c1351l;
        this.f14978l = interfaceC6347l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14977l;
        byte b = 0;
        Object obj3 = this.f14978l;
        Object obj4 = this.f14979l;
        Object obj5 = this.f14975l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0483l) obj5).loadAd(this.f14976l, (InterfaceC17242l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(433));
                break;
            case 1:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj5;
                C2391l c2391l = (C2391l) obj4;
                C13849l c13849l = (C13849l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    AbstractC18079l.amazon(AbstractC14566l.amazon(1100871412, new Cpublic(c2391l, interfaceC3102l), c6956l), null, AbstractC14566l.amazon(-212958474, new C13944l(c13849l), c6956l), AbstractC14566l.amazon(-1101597537, new C7182l(this.f14976l, c13849l, c2391l, b == true ? 1 : 0), c6956l), 0.0f, null, AbstractC0831l.billing(C9735l.isPro, 0L, 0L, 0L, 0L, c6956l, 62), interfaceC3102l, null, c6956l, 3462, 306);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C4456l) obj5).ad((InterfaceC13238l) obj3, this.f14976l, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C4456l) obj5).signatures((C15413l) obj3, this.f14976l, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC11028l.admob((C15578l) obj3, (Function2) obj5, this.f14976l, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(55));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C6408l) obj5).crashlytics(this.f14976l, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(3079));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC15042l.firebase((AbstractC18643l) obj5, (InterfaceC6347l) obj3, this.f14976l, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC15576l.amazon((String) obj5, (String) obj4, this.f14976l, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 8:
                C2403l c2403l = (C2403l) obj5;
                C1351l c1351l = (C1351l) obj4;
                InterfaceC6347l interfaceC6347l = (InterfaceC6347l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C11140l.f22364l.purchase(this.f14976l, false, c2403l, null, c1351l, interfaceC6347l, 0.0f, 0.0f, c6956l2, 100663296, 200);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((C17517l) obj5).pro(this.f14976l, (C14718l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC16670l.yandex((String) obj5, this.f14976l, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7159l(C2663l c2663l, C2391l c2391l, C13849l c13849l, boolean z) {
        this.f14977l = 1;
        this.f14975l = c2663l;
        this.f14979l = c2391l;
        this.f14978l = c13849l;
        this.f14976l = z;
    }

    public /* synthetic */ C7159l(Object obj, Object obj2, boolean z, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f14977l = i2;
        this.f14975l = obj;
        this.f14978l = obj2;
        this.f14976l = z;
        this.f14979l = interfaceC17242l;
    }

    public /* synthetic */ C7159l(Object obj, boolean z, Object obj2, InterfaceC14328l interfaceC14328l, int i, int i2) {
        this.f14977l = i2;
        this.f14975l = obj;
        this.f14976l = z;
        this.f14979l = obj2;
        this.f14978l = interfaceC14328l;
    }

    public /* synthetic */ C7159l(String str, String str2, boolean z, Function0 function0, int i) {
        this.f14977l = 7;
        this.f14975l = str;
        this.f14979l = str2;
        this.f14976l = z;
        this.f14978l = function0;
    }

    public /* synthetic */ C7159l(C15578l c15578l, Function2 function2, boolean z, Function1 function1, int i) {
        this.f14977l = 4;
        this.f14978l = c15578l;
        this.f14975l = function2;
        this.f14976l = z;
        this.f14979l = function1;
    }
}
