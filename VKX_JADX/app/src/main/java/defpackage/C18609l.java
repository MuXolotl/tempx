package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: l۠ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18609l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8204l f36359l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f36360l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f36361l;

    public C18609l(C8204l c8204l, ListIterator listIterator) {
        this.f36360l = listIterator;
        this.f36359l = c8204l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f36360l;
        listIterator.add(obj);
        listIterator.previous();
        this.f36361l = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f36360l.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36360l.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f36360l;
        if (listIterator.hasPrevious()) {
            this.f36361l = true;
            return listIterator.previous();
        }
        C4875l.firebase();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36359l.amazon(this.f36360l.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f36360l;
        if (listIterator.hasNext()) {
            this.f36361l = true;
            return listIterator.next();
        }
        C4875l.firebase();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC12442l.ads("no calls to next() since the last call to remove()", this.f36361l);
        this.f36360l.remove();
        this.f36361l = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC12442l.subscription(this.f36361l);
        this.f36360l.set(obj);
    }
}
