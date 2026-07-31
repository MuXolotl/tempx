package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5383l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f11519l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11520l;

    public /* synthetic */ C5383l(C6111l c6111l) {
        this.f11520l = 3;
        this.f11519l = c6111l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        int i = this.f11520l;
        C6111l c6111l = this.f11519l;
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                c6111l.m1941finally(c6956l, AbstractC0545l.purchase(1));
                break;
            case 1:
                num.getClass();
                c6111l.m1954try(c6956l, AbstractC0545l.purchase(1));
                break;
            case 2:
                num.getClass();
                c6111l.m1953transient(c6956l, AbstractC0545l.purchase(1));
                break;
            case 3:
                int iIntValue = num.intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(c6111l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C0131l(c6111l, 3);
                        c6956l.m2147try(objM2132native);
                    }
                    c6111l.m1948l((Function0) objM2132native, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 4:
                num.getClass();
                c6111l.m1949protected(c6956l, AbstractC0545l.purchase(1));
                break;
            case 5:
                num.getClass();
                c6111l.m1939break(c6956l, AbstractC0545l.purchase(1));
                break;
            case 6:
                num.getClass();
                c6111l.m1944l(c6956l, AbstractC0545l.purchase(1));
                break;
            case 7:
                num.getClass();
                c6111l.mo271new(c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                num.getClass();
                c6111l.mo271new(c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5383l(C6111l c6111l, int i, int i2) {
        this.f11520l = i2;
        this.f11519l = c6111l;
    }
}
