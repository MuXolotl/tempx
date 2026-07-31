package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؔۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2894l implements ListIterator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ListIterator f6297l;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6297l.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6297l.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f6297l.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6297l.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f6297l.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6297l.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
