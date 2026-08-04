package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؚؚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7118l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f14911l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f14912l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC8996l f14913l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7118l(AbstractC8996l abstractC8996l, int i) {
        super(7);
        int size = abstractC8996l.size();
        if (i < 0 || i > size) {
            C18262l.adcel(AbstractC5088l.ad(i, size, "index"));
            throw null;
        }
        this.f14912l = size;
        this.f14911l = i;
        this.f14913l = abstractC8996l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14911l < this.f14912l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14911l > 0;
    }

    public final Object loadAd(int i) {
        return this.f14913l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f14911l;
        this.f14911l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14911l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f14911l - 1;
        this.f14911l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14911l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
