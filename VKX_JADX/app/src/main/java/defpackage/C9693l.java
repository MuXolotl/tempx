package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: lٍٜٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9693l implements WildcardType {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Type f19767l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Type f19768l;

    public C9693l(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C11983l.crashlytics();
            throw null;
        }
        if (typeArr.length != 1) {
            C11983l.crashlytics();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC7694l.loadAd(typeArr[0]);
            this.f19767l = null;
            this.f19768l = AbstractC7694l.yandex(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        AbstractC7694l.loadAd(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C11983l.crashlytics();
            throw null;
        }
        this.f19767l = AbstractC7694l.yandex(typeArr2[0]);
        this.f19768l = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC15639l.crashlytics(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f19767l;
        return type != null ? new Type[]{type} : AbstractC7694l.loadAd;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f19768l};
    }

    public final int hashCode() {
        Type type = this.f19767l;
        return (this.f19768l.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f19767l;
        if (type != null) {
            return "? super " + AbstractC7694l.subs(type);
        }
        Type type2 = this.f19768l;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC7694l.subs(type2);
    }
}
