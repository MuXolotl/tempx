package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؑۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0507l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f1830l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1831l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC14904l f1832l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507l(AbstractC14904l abstractC14904l, int i) {
        super(5);
        int size = abstractC14904l.size();
        if (i < 0 || i > size) {
            C18262l.adcel(AbstractC4654l.subscription(i, size, "index"));
            throw null;
        }
        this.f1831l = size;
        this.f1830l = i;
        this.f1832l = abstractC14904l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1830l < this.f1831l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1830l > 0;
    }

    public final Object loadAd(int i) {
        return this.f1832l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f1830l;
        this.f1830l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1830l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f1830l - 1;
        this.f1830l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1830l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
