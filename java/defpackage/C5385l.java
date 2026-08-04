package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؘؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C7055l.class)
public final class C5385l extends AbstractC3160l implements List<AbstractC3160l>, InterfaceC4742l {
    public static final C7060l Companion = new C7060l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f11531l = new ArrayList(C2580l.f5619l);

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f11531l.add((AbstractC3160l) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f11531l.addAll(collection);
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 5;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f11531l.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC3160l)) {
            return false;
        }
        return this.f11531l.contains((AbstractC3160l) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11531l.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C5385l.class), c2336l.loadAd(obj.getClass())) && AbstractC8576l.yandex(this.f11531l, ((C5385l) obj).f11531l);
    }

    @Override // java.util.List
    public final AbstractC3160l get(int i) {
        return (AbstractC3160l) this.f11531l.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f11531l.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC3160l)) {
            return -1;
        }
        return this.f11531l.indexOf((AbstractC3160l) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f11531l.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f11531l.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC3160l)) {
            return -1;
        }
        return this.f11531l.lastIndexOf((AbstractC3160l) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC3160l> listIterator() {
        return this.f11531l.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof AbstractC3160l)) {
            return false;
        }
        return this.f11531l.remove((AbstractC3160l) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f11531l.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f11531l.retainAll(collection);
    }

    @Override // java.util.List
    public final AbstractC3160l set(int i, AbstractC3160l abstractC3160l) {
        return (AbstractC3160l) this.f11531l.set(i, abstractC3160l);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f11531l.size();
    }

    @Override // java.util.List
    public final List<AbstractC3160l> subList(int i, int i2) {
        return this.f11531l.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("BsonArray(values="), AbstractC16901l.m4210case(this.f11531l, ",", "[", "]", null, 56), ')');
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC3160l> collection) {
        return this.f11531l.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC3160l> listIterator(int i) {
        return this.f11531l.listIterator(i);
    }

    @Override // java.util.List
    public final void add(int i, AbstractC3160l abstractC3160l) {
        this.f11531l.add(i, abstractC3160l);
    }

    @Override // java.util.List
    public final AbstractC3160l remove(int i) {
        return (AbstractC3160l) this.f11531l.remove(i);
    }
}
