package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؔٝؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2770l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f6014l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f6015l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC13582l f6016l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770l(AbstractC13582l abstractC13582l, int i) {
        super(1);
        int size = abstractC13582l.size();
        if (i < 0 || i > size) {
            C18262l.adcel(AbstractC17122l.subs(i, size, "index"));
            throw null;
        }
        this.f6015l = size;
        this.f6014l = i;
        this.f6016l = abstractC13582l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6014l < this.f6015l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6014l > 0;
    }

    public final Object loadAd(int i) {
        return this.f6016l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f6014l;
        this.f6014l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6014l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f6014l - 1;
        this.f6014l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6014l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
