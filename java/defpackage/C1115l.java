package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lًؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1115l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f3056l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f3057l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f3058l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f3059l;

    public C1115l(char c, char c2, int i) {
        this.f3058l = i;
        this.f3057l = c2;
        boolean z = false;
        if (i <= 0 ? AbstractC8576l.subs(c, c2) >= 0 : AbstractC8576l.subs(c, c2) <= 0) {
            z = true;
        }
        this.f3056l = z;
        this.f3059l = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3056l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3059l;
        if (i != this.f3057l) {
            this.f3059l = this.f3058l + i;
        } else {
            if (!this.f3056l) {
                C4875l.firebase();
                return null;
            }
            this.f3056l = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
