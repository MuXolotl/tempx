package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٗۤؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17512l implements Map.Entry {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C17512l f34123l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f34124l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f34125l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C17512l f34126l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17512l f34127l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17512l f34128l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C17512l f34129l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f34130l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f34131l;

    public C17512l(C17512l c17512l, Object obj, int i, C17512l c17512l2, C17512l c17512l3) {
        this.f34127l = c17512l;
        this.f34131l = obj;
        this.f34124l = i;
        this.f34130l = 1;
        this.f34129l = c17512l2;
        this.f34128l = c17512l3;
        c17512l3.f34129l = this;
        c17512l2.f34128l = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f34131l;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f34125l;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34131l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34125l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f34131l;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f34125l;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f34125l;
        this.f34125l = obj;
        return obj2;
    }

    public final String toString() {
        return this.f34131l + "=" + this.f34125l;
    }

    public C17512l() {
        this.f34131l = null;
        this.f34124l = -1;
        this.f34128l = this;
        this.f34129l = this;
    }
}
