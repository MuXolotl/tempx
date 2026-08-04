package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: lؘٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5693l implements ParameterizedType {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Type[] f12080l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Type f12081l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Type f12082l;

    public C5693l(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC15639l.purchase(type) != enclosingClass) {
                    C1759l.smaato("unexpected owner type for ", type2, ": ", type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                C10754l.startapp(type2, ": null", "unexpected owner type for ");
                throw null;
            }
        }
        this.f12082l = type != null ? AbstractC7694l.yandex(type) : null;
        this.f12081l = AbstractC7694l.yandex(type2);
        this.f12080l = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f12080l;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            AbstractC7694l.loadAd(this.f12080l[i]);
            Type[] typeArr3 = this.f12080l;
            typeArr3[i] = AbstractC7694l.yandex(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC15639l.crashlytics(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f12080l.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12082l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f12081l;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f12080l) ^ this.f12081l.hashCode();
        Set set = AbstractC7694l.yandex;
        Type type = this.f12082l;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f12080l;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC7694l.subs(this.f12081l));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(AbstractC7694l.subs(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC7694l.subs(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
