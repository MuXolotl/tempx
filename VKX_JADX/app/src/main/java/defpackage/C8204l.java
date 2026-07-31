package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lًۗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8204l extends AbstractList {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f17104l;

    public C8204l(List list) {
        list.getClass();
        this.f17104l = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f17104l.add(amazon(i), obj);
    }

    public final int amazon(int i) {
        int size = this.f17104l.size();
        AbstractC12442l.startapp(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f17104l.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f17104l;
        int size = list.size();
        AbstractC12442l.smaato(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C18609l(this, this.f17104l.listIterator(amazon(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f17104l;
        int size = list.size();
        AbstractC12442l.smaato(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f17104l;
        int size = list.size();
        AbstractC12442l.smaato(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17104l.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f17104l;
        AbstractC12442l.adcel(i, i2, list.size());
        return AbstractC7280l.purchase(list.subList(amazon(i2), amazon(i)));
    }
}
