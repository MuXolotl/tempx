package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: lًؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6441l extends AbstractC1132l implements InterfaceC7760l, InterfaceC11977l {
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    public final ArrayList amazon(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        Method method;
        ArrayList arrayList;
        AbstractC11072l c12681l;
        AbstractC11072l c13064l;
        String str;
        boolean z2;
        C2494l c2494l;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C2782l c2782l = C2782l.f6067l;
        Member memberYandex = yandex();
        C2494l c2494l2 = C2782l.f6052l;
        int i = 0;
        Object obj = null;
        if (c2494l2 == null) {
            synchronized (c2782l) {
                c2494l2 = C2782l.f6052l;
                if (c2494l2 == null) {
                    Class<?> cls = memberYandex.getClass();
                    try {
                        c2494l = new C2494l(cls.getMethod("getParameters", null), AbstractC1845l.amazon(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null), i);
                    } catch (NoSuchMethodException unused) {
                        c2494l = new C2494l(obj, obj, i);
                    }
                    C2782l.f6052l = c2494l;
                    c2494l2 = c2494l;
                }
            }
        }
        Method method2 = (Method) c2494l2.f5291l;
        if (method2 == null || (method = (Method) c2494l2.f5290l) == null) {
            arrayList = null;
        } else {
            Object[] objArr = (Object[]) method2.invoke(memberYandex, null);
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add((String) method.invoke(obj2, null));
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    c13064l = new C13064l(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        c12681l = new C12681l(type);
                    } else {
                        c12681l = type instanceof WildcardType ? new C6962l((WildcardType) type) : new C5637l(type);
                    }
                    c13064l = c12681l;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    c12681l = new C12681l(type);
                } else {
                    c12681l = new C12681l(type);
                }
                c13064l = c12681l;
            }
            if (arrayList != null) {
                str = (String) AbstractC16901l.m4220for(i2 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + crashlytics() + " type=" + c13064l + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i2 != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList2.add(new C2324l(c13064l, annotationArr[i2], str, z2));
        }
        return arrayList2;
    }

    public final C3498l crashlytics() {
        String name = yandex().getName();
        return name != null ? C3498l.purchase(name) : AbstractC13589l.yandex;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC6441l) && AbstractC8576l.yandex(yandex(), ((AbstractC6441l) obj).yandex());
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElement = (AnnotatedElement) yandex();
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C2580l.f5619l : AbstractC14312l.admob(declaredAnnotations);
    }

    public final int hashCode() {
        return yandex().hashCode();
    }

    @Override // defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElement = (AnnotatedElement) yandex();
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC14312l.mopub(declaredAnnotations, c2312l);
    }

    public final AbstractC6107l purchase() {
        int modifiers = yandex().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C13429l.f26345l;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C13429l.f26347l;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? C13429l.f26341l : C13429l.f26349l;
        }
        return C13429l.f26346l;
    }

    public final String toString() {
        return getClass().getName() + ": " + yandex();
    }

    public abstract Member yandex();
}
