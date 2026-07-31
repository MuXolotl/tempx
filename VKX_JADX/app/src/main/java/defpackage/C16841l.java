package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٗؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16841l extends AbstractC9743l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC9743l f32869l;

    public C16841l(AbstractC9743l abstractC9743l) {
        this.f32869l = abstractC9743l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f32869l.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16841l) {
            return this.f32869l.equals(((C16841l) obj).f32869l);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f32869l.hashCode();
    }

    public final String toString() {
        return this.f32869l + ".reverse()";
    }

    @Override // defpackage.AbstractC9743l
    public final AbstractC9743l yandex() {
        return this.f32869l;
    }
}
