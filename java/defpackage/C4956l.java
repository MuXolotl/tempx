package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lْؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4956l implements ParameterizedType, Type {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Type[] f10104l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Type f10105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Class f10106l;

    public C4956l(Class cls, Type type, ArrayList arrayList) {
        this.f10106l = cls;
        this.f10105l = type;
        this.f10104l = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.f10106l.equals(parameterizedType.getRawType()) && AbstractC8576l.yandex(this.f10105l, parameterizedType.getOwnerType()) && Arrays.equals(this.f10104l, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f10104l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f10105l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f10106l;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f10106l;
        Type type = this.f10105l;
        if (type != null) {
            sb.append(AbstractC8020l.yandex(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC8020l.yandex(cls));
        }
        Type[] typeArr = this.f10104l;
        if (typeArr.length != 0) {
            AbstractC8669l.m2402else(typeArr, sb, ", ", "<", ">", "...", C6405l.f13391l);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f10106l.hashCode();
        Type type = this.f10105l;
        return Arrays.hashCode(this.f10104l) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
