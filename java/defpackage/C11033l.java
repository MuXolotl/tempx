package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lُٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11033l implements InterfaceC11334l, InterfaceC14681l, List, InterfaceC4742l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f22235l = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f22235l.add(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f22235l.addAll(i, collection);
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        throw new UnsupportedOperationException("Unmanaged lists cannot be deleted.");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f22235l.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22235l.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f22235l.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC8576l.yandex(this.f22235l, obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f22235l.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f22235l.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f22235l.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f22235l.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f22235l.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f22235l.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f22235l.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f22235l.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f22235l.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f22235l.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f22235l.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f22235l.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f22235l.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return AbstractC15560l.Signature("UnmanagedRealmList{", AbstractC16901l.m4210case(this, null, null, null, null, 63), "}");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f22235l.add(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f22235l.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f22235l.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22235l.remove(obj);
    }
}
