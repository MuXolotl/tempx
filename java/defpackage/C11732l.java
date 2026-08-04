package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٍِۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11732l extends AbstractC9743l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2351l f23513l;

    public C11732l(C2351l c2351l) {
        this.f23513l = c2351l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f23513l.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C11732l) && this.f23513l == ((C11732l) obj).f23513l;
    }

    public final int hashCode() {
        return this.f23513l.hashCode();
    }

    public final String toString() {
        return this.f23513l.toString();
    }
}
