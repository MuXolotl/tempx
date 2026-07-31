package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lًؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7855l implements Map.Entry, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C7855l f16389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2392l f16390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f16391l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f16392l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7855l f16393l;

    public C7855l(InterfaceC1711l interfaceC1711l, C2392l c2392l) {
        this.f16391l = interfaceC1711l;
        this.f16390l = c2392l;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7855l) {
            C7855l c7855l = (C7855l) obj;
            return AbstractC8576l.yandex(this.f16391l, c7855l.f16391l) && this.f16390l == c7855l.f16390l;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16391l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16390l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f16391l;
        return this.f16390l.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f16391l + ", value=" + this.f16390l + ")";
    }
}
