package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734l extends AbstractC6441l implements InterfaceC11977l, InterfaceC18335l {
    public final Method yandex;

    public C1734l(Method method) {
        this.yandex = method;
    }

    public final AbstractC11072l billing() {
        Type genericReturnType = this.yandex.getGenericReturnType();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C13064l(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new C12681l(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new C6962l((WildcardType) genericReturnType) : new C5637l(genericReturnType);
    }

    @Override // defpackage.InterfaceC18335l
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.yandex.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C16765l(typeVariable));
        }
        return arrayList;
    }

    public final List mopub() {
        Method method = this.yandex;
        return amazon(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
    }

    @Override // defpackage.AbstractC6441l
    public final Member yandex() {
        return this.yandex;
    }
}
