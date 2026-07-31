package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lُّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12525l extends AbstractC10199l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f24676l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24677l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC0933l f24678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12525l(AbstractC0933l abstractC0933l, int i) {
        super(6);
        int size = abstractC0933l.size();
        AbstractC4603l.isPro(i, size);
        this.f24677l = size;
        this.f24676l = i;
        this.f24678l = abstractC0933l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24676l < this.f24677l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24676l > 0;
    }

    public final Object loadAd(int i) {
        return this.f24678l.get(i);
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f24676l;
        this.f24676l = i + 1;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24676l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f24676l - 1;
        this.f24676l = i;
        return loadAd(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24676l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
