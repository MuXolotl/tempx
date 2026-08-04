package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lِۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12050l implements InterfaceC14029l, InterfaceC1840l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14029l f23978l;

    public AbstractC12050l(InterfaceC14029l interfaceC14029l) {
        this.f23978l = interfaceC14029l;
    }

    public abstract Object Signature(Object obj);

    public InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        C9958l c9958l = AbstractC7572l.yandex;
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = this.f23978l;
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    public InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC12050l abstractC12050l = (AbstractC12050l) r2;
            InterfaceC14029l interfaceC14029l = abstractC12050l.f23978l;
            try {
                obj = abstractC12050l.Signature(obj);
                if (obj == EnumC9342l.f19165l) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C18435l(th);
            }
            abstractC12050l.license();
            if (!(interfaceC14029l instanceof AbstractC12050l)) {
                interfaceC14029l.subs(obj);
                return;
            }
            r2 = interfaceC14029l;
        }
    }

    public StackTraceElement subscription() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC0320l interfaceC0320l = (InterfaceC0320l) getClass().getAnnotation(InterfaceC0320l.class);
        String str = null;
        if (interfaceC0320l == null || interfaceC0320l.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC0320l.l()[iIntValue] : -1;
        C0554l c0554l = AbstractC0136l.loadAd;
        C0554l c0554l2 = AbstractC0136l.yandex;
        if (c0554l == null) {
            try {
                C0554l c0554l3 = new C0554l(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0136l.loadAd = c0554l3;
                c0554l = c0554l3;
            } catch (Exception unused2) {
                AbstractC0136l.loadAd = c0554l2;
                c0554l = c0554l2;
            }
        }
        if (c0554l != c0554l2 && (method = (Method) c0554l.f1958l) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0554l.f1957l) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c0554l.f1956l;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = interfaceC0320l.c();
        } else {
            strC = str + '/' + interfaceC0320l.c();
        }
        return new StackTraceElement(strC, interfaceC0320l.m(), interfaceC0320l.f(), i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objSubscription = subscription();
        if (objSubscription == null) {
            objSubscription = getClass().getName();
        }
        sb.append(objSubscription);
        return sb.toString();
    }

    public void license() {
    }
}
