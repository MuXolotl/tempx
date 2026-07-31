package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lّۙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12823l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f25198l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f25199l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f25200l;

    public C12823l(Object obj, Object obj2, Object obj3) {
        this.f25200l = obj;
        this.f25199l = obj2;
        this.f25198l = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12823l)) {
            return false;
        }
        C12823l c12823l = (C12823l) obj;
        return AbstractC8576l.yandex(this.f25200l, c12823l.f25200l) && AbstractC8576l.yandex(this.f25199l, c12823l.f25199l) && AbstractC8576l.yandex(this.f25198l, c12823l.f25198l);
    }

    public final int hashCode() {
        Object obj = this.f25200l;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f25199l;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f25198l;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f25200l + ", " + this.f25199l + ", " + this.f25198l + ')';
    }
}
