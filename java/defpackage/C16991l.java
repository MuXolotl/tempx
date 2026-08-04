package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16991l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f33123l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33124l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f33125l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33126l;

    public C16991l(int i, int i2, int i3) {
        this.f33125l = i3;
        this.f33124l = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f33123l = z;
        this.f33126l = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33123l;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f33126l;
        if (i != this.f33124l) {
            this.f33126l = this.f33125l + i;
            return i;
        }
        if (this.f33123l) {
            this.f33123l = false;
            return i;
        }
        C4875l.firebase();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
