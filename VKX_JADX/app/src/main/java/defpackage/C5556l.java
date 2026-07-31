package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌؘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5556l implements InterfaceC11483l, Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2317l f11840l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f11841l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2859l f11842l;

    public C5556l(C2859l c2859l, int i, AbstractC2155l abstractC2155l, C2317l c2317l) {
        this.f11842l = c2859l;
        this.f11841l = i;
        this.f11840l = c2317l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5556l)) {
            return false;
        }
        C5556l c5556l = (C5556l) obj;
        return c5556l.f11841l == this.f11841l && c5556l.f11842l == this.f11842l && c5556l.f11840l.equals(this.f11840l);
    }

    public final int hashCode() {
        return this.f11840l.hashCode() + ((this.f11842l.hashCode() + (this.f11841l * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C17582l(this.f11842l, this.f11841l, null, this.f11840l);
    }
}
