package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lًۖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8195l implements Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f17097l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f17098l;

    public C8195l(Object obj, Object obj2) {
        this.f17098l = obj;
        this.f17097l = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8195l)) {
            return false;
        }
        C8195l c8195l = (C8195l) obj;
        return AbstractC8576l.yandex(this.f17098l, c8195l.f17098l) && AbstractC8576l.yandex(this.f17097l, c8195l.f17097l);
    }

    public final int hashCode() {
        Object obj = this.f17098l;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f17097l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f17098l + ", " + this.f17097l + ')';
    }
}
