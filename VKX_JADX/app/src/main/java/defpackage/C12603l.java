package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lّْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12603l implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C16515l f24824l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f24825l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparable f24826l;

    public C12603l(C16515l c16515l, Comparable comparable, Object obj) {
        this.f24824l = c16515l;
        this.f24826l = comparable;
        this.f24825l = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24826l.compareTo(((C12603l) obj).f24826l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f24826l;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f24825l;
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
        return this.f24826l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24825l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f24826l;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f24825l;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f24824l.loadAd();
        Object obj2 = this.f24825l;
        this.f24825l = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f24826l);
        String strValueOf2 = String.valueOf(this.f24825l);
        return AbstractC9361l.ad(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
