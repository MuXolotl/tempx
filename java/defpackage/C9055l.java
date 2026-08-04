package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٌۜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9055l implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2902l f18637l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f18638l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparable f18639l;

    public C9055l(C2902l c2902l, Comparable comparable, Object obj) {
        this.f18637l = c2902l;
        this.f18639l = comparable;
        this.f18638l = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18639l.compareTo(((C9055l) obj).f18639l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f18639l;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f18638l;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18639l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18638l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18639l;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18638l;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18637l.loadAd();
        Object obj2 = this.f18638l;
        this.f18638l = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18639l + "=" + this.f18638l;
    }
}
