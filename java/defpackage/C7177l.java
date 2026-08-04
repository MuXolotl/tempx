package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lَؚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7177l implements Map.Entry, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f15012l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f15013l;

    public C7177l(Object obj, Object obj2) {
        this.f15013l = obj;
        this.f15012l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7177l)) {
            return false;
        }
        C7177l c7177l = (C7177l) obj;
        return AbstractC8576l.yandex(this.f15013l, c7177l.f15013l) && AbstractC8576l.yandex(this.f15012l, c7177l.f15012l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15013l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15012l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f15013l;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15012l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f15013l + ", value=" + this.f15012l + ')';
    }
}
