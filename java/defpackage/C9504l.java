package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٍؙّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9504l implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3052l f19389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f19390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparable f19391l;

    public C9504l(C3052l c3052l, Comparable comparable, Object obj) {
        this.f19389l = c3052l;
        this.f19391l = comparable;
        this.f19390l = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19391l.compareTo(((C9504l) obj).f19391l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f19391l;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f19390l;
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
        return this.f19391l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19390l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19391l;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19390l;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19389l.billing();
        Object obj2 = this.f19390l;
        this.f19390l = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19391l);
        String strValueOf2 = String.valueOf(this.f19390l);
        return AbstractC9361l.ad(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
