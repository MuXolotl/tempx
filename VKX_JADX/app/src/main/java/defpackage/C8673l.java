package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٌٍؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8673l extends AbstractC1132l implements InterfaceC5014l {
    public final Annotation yandex;

    public C8673l(Annotation annotation) {
        this.yandex = annotation;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8673l) {
            return this.yandex == ((C8673l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.yandex);
    }

    public final String toString() {
        return C8673l.class.getName() + ": " + this.yandex;
    }

    public final ArrayList yandex() throws IllegalAccessException, InvocationTargetException {
        InterfaceC0808l c5652l;
        Annotation annotation = this.yandex;
        Method[] declaredMethods = ((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private().getDeclaredMethods();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            C3498l c3498lPurchase = C3498l.purchase(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC1845l.yandex;
            if (Enum.class.isAssignableFrom(cls)) {
                c5652l = new C15917l(c3498lPurchase, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                c5652l = new C15808l(c3498lPurchase, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                c5652l = new C12325l(c3498lPurchase, (Object[]) objInvoke);
            } else {
                c5652l = objInvoke instanceof Class ? new C5652l(c3498lPurchase, (Class) objInvoke) : new C13013l(c3498lPurchase, objInvoke);
            }
            arrayList.add(c5652l);
        }
        return arrayList;
    }
}
