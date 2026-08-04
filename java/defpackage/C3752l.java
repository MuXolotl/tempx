package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٟؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3752l implements Map.Entry {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C3752l f7834l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f7835l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f7836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C3752l f7837l;

    public C3752l(Object obj, Object obj2) {
        this.f7836l = obj;
        this.f7835l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3752l)) {
            return false;
        }
        C3752l c3752l = (C3752l) obj;
        return this.f7836l.equals(c3752l.f7836l) && this.f7835l.equals(c3752l.f7835l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7836l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7835l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7835l.hashCode() ^ this.f7836l.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7836l + "=" + this.f7835l;
    }
}
