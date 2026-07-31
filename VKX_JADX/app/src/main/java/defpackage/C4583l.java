package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lُؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4583l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9312l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9313l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC12128l f9314l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4583l(AbstractC12128l abstractC12128l, int i) {
        super(2);
        int size = abstractC12128l.size();
        if (i < 0 || i > size) {
            C18262l.adcel(AbstractC13693l.metrica(i, size, "index"));
            throw null;
        }
        this.f9313l = size;
        this.f9312l = i;
        this.f9314l = abstractC12128l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9312l < this.f9313l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9312l > 0;
    }

    public final Object loadAd(int i) {
        return this.f9314l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f9312l;
        this.f9312l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9312l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f9312l - 1;
        this.f9312l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9312l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
