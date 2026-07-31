package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: lًُۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11341l implements GenericArrayType, Type {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Type f22877l;

    public C11341l(Type type) {
        this.f22877l = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC8576l.yandex(this.f22877l, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f22877l;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC8020l.yandex(this.f22877l) + "[]";
    }

    public final int hashCode() {
        return this.f22877l.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
