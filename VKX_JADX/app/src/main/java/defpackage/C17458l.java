package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٗ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17458l implements InterfaceC11483l, Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f34015l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2859l f34017l;

    public C17458l(C2859l c2859l, int i, int i2) {
        this.f34017l = c2859l;
        this.f34016l = i;
        this.f34015l = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17458l)) {
            return false;
        }
        C17458l c17458l = (C17458l) obj;
        return c17458l.f34016l == this.f34016l && c17458l.f34015l == this.f34015l && c17458l.f34017l == this.f34017l;
    }

    public final int hashCode() {
        return (this.f34017l.hashCode() * 31) + this.f34016l;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2859l c2859l = this.f34017l;
        if (c2859l.f6219l != this.f34015l) {
            AbstractC0736l.billing();
        }
        int i = this.f34016l;
        c2859l.smaato(i);
        return new C6494l(c2859l, i + 1, c2859l.f6221l[(i * 5) + 3] + i);
    }
}
