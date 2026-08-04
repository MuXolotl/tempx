package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؙْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3365l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f7165l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f7166l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC3343l f7167l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3365l(AbstractC3343l abstractC3343l, int i) {
        super(3);
        int size = abstractC3343l.size();
        AbstractC3105l.metrica(i, size);
        this.f7166l = size;
        this.f7165l = i;
        this.f7167l = abstractC3343l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7165l < this.f7166l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7165l > 0;
    }

    public final Object loadAd(int i) {
        return this.f7167l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f7165l;
        this.f7165l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7165l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f7165l - 1;
        this.f7165l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7165l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
