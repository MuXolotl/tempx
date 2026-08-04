package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5742l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12127l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12128l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12129l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f12130l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f12131l;

    public /* synthetic */ C5742l(C4587l c4587l, C4456l c4456l, boolean z, boolean z2) {
        this.f12131l = c4587l;
        this.f12130l = c4456l;
        this.f12128l = z;
        this.f12127l = z2;
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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f12129l;
        boolean z = this.f12127l;
        Object obj4 = this.f12130l;
        Object obj5 = this.f12131l;
        boolean z2 = true;
        int i2 = 0;
        switch (i) {
            case 0:
                C4587l c4587l = (C4587l) obj5;
                C4456l c4456l = (C4456l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0133l.amazon(AbstractC14566l.amazon(-1013403986, new C7442l(c4587l, c4456l, 23), c6956l), AbstractC14566l.amazon(1417346479, new C8985l(c4587l, this.f12128l, i2), c6956l), AbstractC3605l.smaato(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f), AbstractC14566l.amazon(1983880113, new C8985l(z, (Object) c4456l, (int) (z2 ? 1 : 0)), c6956l), c6956l, 3510, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C2403l c2403l = (C2403l) obj5;
                C1351l c1351l = (C1351l) obj4;
                Function2 function2 = (Function2) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.admob(function2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C8565l c8565l = C8565l.f17654l;
                    c6956l2.m2123default(1691265870);
                    c6956l2.startapp(false);
                    c6956l2.m2123default(1691490155);
                    c6956l2.startapp(false);
                    C7038l c7038l = C7038l.yandex;
                    InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l2, 7);
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    boolean z3 = this.f12128l;
                    c8565l.crashlytics("", function2, z3, c2403l, null, null, null, interfaceC6347lLoadAd, c1351l, c17253l, AbstractC14566l.amazon(-1197464330, new C0802l(i2, c1351l, z3, z), c6956l2), c6956l2, ((iIntValue2 << 3) & 112) | 27648);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5742l(boolean z, C2403l c2403l, C1351l c1351l, boolean z2) {
        this.f12128l = z;
        this.f12131l = c2403l;
        this.f12130l = c1351l;
        this.f12127l = z2;
    }
}
