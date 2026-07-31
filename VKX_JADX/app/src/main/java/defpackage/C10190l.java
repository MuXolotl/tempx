package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: lٍَؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10190l implements GenericArrayType {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Type f20780l;

    public C10190l(Type type) {
        this.f20780l = AbstractC7694l.yandex(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC15639l.crashlytics(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f20780l;
    }

    public final int hashCode() {
        return this.f20780l.hashCode();
    }

    public final String toString() {
        return AbstractC7694l.subs(this.f20780l) + "[]";
    }
}
