package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: renamed from: lِّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12681l extends AbstractC11072l implements InterfaceC8657l {
    public final C2580l crashlytics;
    public final AbstractC11072l loadAd;
    public final Type yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C12681l(Type type) {
        AbstractC11072l c13064l;
        AbstractC11072l c13064l2;
        this.yandex = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    c13064l = componentType.isPrimitive() ? new C13064l(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C12681l(componentType) : componentType instanceof WildcardType ? new C6962l((WildcardType) componentType) : new C5637l(componentType);
                }
            }
            C8936l.remoteconfig("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            c13064l2 = cls2.isPrimitive() ? new C13064l(cls2) : c13064l2;
            this.loadAd = c13064l2;
            this.crashlytics = C2580l.f5619l;
        }
        c13064l = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C12681l(genericComponentType) : genericComponentType instanceof WildcardType ? new C6962l((WildcardType) genericComponentType) : new C5637l(genericComponentType);
        c13064l2 = c13064l;
        this.loadAd = c13064l2;
        this.crashlytics = C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC11072l
    public final Type yandex() {
        return this.yandex;
    }
}
