package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3167l implements WildcardType, Type {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C3167l f6802l = new C3167l(null, null);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Type f6803l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Type f6804l;

    public C3167l(Type type, Type type2) {
        this.f6804l = type;
        this.f6803l = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6803l;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f6803l;
        if (type != null) {
            return "? super " + AbstractC8020l.yandex(type);
        }
        Type type2 = this.f6804l;
        if (type2 == null || AbstractC8576l.yandex(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC8020l.yandex(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f6804l;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
