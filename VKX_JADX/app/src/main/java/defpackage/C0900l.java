package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؚؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0900l implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13639l f2551l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f2552l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparable f2553l;

    public C0900l(C13639l c13639l, Comparable comparable, Object obj) {
        this.f2551l = c13639l;
        this.f2553l = comparable;
        this.f2552l = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2553l.compareTo(((C0900l) obj).f2553l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2553l;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f2552l;
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
    public final /* synthetic */ Object getKey() {
        return this.f2553l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2552l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2553l;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2552l;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2551l.mopub();
        Object obj2 = this.f2552l;
        this.f2552l = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC9361l.pro(String.valueOf(this.f2553l), "=", String.valueOf(this.f2552l));
    }
}
