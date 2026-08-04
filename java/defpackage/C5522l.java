package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؘؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5522l implements InterfaceC17866l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Map f11792l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Map f11793l;

    public C5522l(Map map, Map map2) {
        this.f11793l = map;
        this.f11792l = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5522l)) {
            return false;
        }
        C5522l c5522l = (C5522l) obj;
        return this.f11793l.equals(c5522l.f11793l) && AbstractC8576l.yandex(this.f11792l, c5522l.f11792l);
    }

    public final int hashCode() {
        return this.f11792l.hashCode() + (this.f11793l.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.f11793l + ", outputSurfaceMap=" + this.f11792l + ')';
    }
}
