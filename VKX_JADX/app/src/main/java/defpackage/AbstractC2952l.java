package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؔ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2952l {
    public static final /* synthetic */ AtomicReference yandex = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final C13177l yandex(Context context) {
        C13177l c13177l;
        C13177l c13177l2;
        InterfaceC6461l interfaceC6461l;
        InterfaceC6461l interfaceC6461l2;
        InterfaceC6461l interfaceC6461l3;
        InterfaceC6461l interfaceC6461l4;
        AtomicReference atomicReference = yandex;
        Object obj = atomicReference.get();
        C13177l c13177l3 = obj instanceof C13177l ? (C13177l) obj : null;
        if (c13177l3 != null) {
            return c13177l3;
        }
        C13177l c13177lYandex = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof C13177l) {
                c13177l = (C13177l) obj2;
                c13177l2 = c13177lYandex;
            } else {
                if (c13177lYandex == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof InterfaceC6461l) {
                        interfaceC6461l4 = (InterfaceC6461l) obj2;
                    } else {
                        interfaceC6461l = null;
                    }
                    if (interfaceC6461l != null) {
                        interfaceC6461l = interfaceC6461l4;
                        c13177lYandex = interfaceC6461l.yandex(applicationContext);
                    } else {
                        if (applicationContext instanceof InterfaceC6461l) {
                            interfaceC6461l3 = (InterfaceC6461l) applicationContext;
                        } else {
                            interfaceC6461l2 = null;
                        }
                        if (interfaceC6461l2 != null) {
                            interfaceC6461l = interfaceC6461l4;
                            interfaceC6461l = interfaceC6461l4;
                            interfaceC6461l2 = interfaceC6461l3;
                            c13177lYandex = interfaceC6461l2.yandex(applicationContext);
                        } else {
                            interfaceC6461l = interfaceC6461l4;
                            interfaceC6461l = interfaceC6461l4;
                            interfaceC6461l2 = interfaceC6461l3;
                            c13177lYandex = AbstractC10626l.yandex.yandex(applicationContext);
                        }
                    }
                }
                c13177l = c13177lYandex;
                c13177l2 = c13177l;
            }
            while (!atomicReference.compareAndSet(obj2, c13177l)) {
                if (atomicReference.get() != obj2) {
                    c13177lYandex = c13177l2;
                }
            }
            return c13177l;
        }
    }
}
