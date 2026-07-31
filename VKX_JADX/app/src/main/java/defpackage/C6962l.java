package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: renamed from: lؚؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6962l extends AbstractC11072l implements InterfaceC8657l {
    public final WildcardType yandex;

    public C6962l(WildcardType wildcardType) {
        this.yandex = wildcardType;
    }

    public final AbstractC11072l crashlytics() {
        WildcardType wildcardType = this.yandex;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C1759l.adcel(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Type type = (Type) AbstractC8669l.m2401default(lowerBounds);
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C13064l(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new C12681l(type);
            }
            return type instanceof WildcardType ? new C6962l((WildcardType) type) : new C5637l(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) AbstractC8669l.m2401default(upperBounds);
            if (!AbstractC8576l.yandex(type2, Object.class)) {
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new C13064l(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new C12681l(type2);
                }
                return type2 instanceof WildcardType ? new C6962l((WildcardType) type2) : new C5637l(type2);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC11072l
    public final Type yandex() {
        return this.yandex;
    }
}
