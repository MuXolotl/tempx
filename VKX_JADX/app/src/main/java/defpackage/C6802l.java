package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: lؙ۠ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6802l extends C5255l implements NavigableSet {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C15423l f14240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6802l(C15423l c15423l, NavigableMap navigableMap) {
        super(c15423l, navigableMap);
        this.f14240l = c15423l;
    }

    @Override // defpackage.C5255l
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final NavigableMap amazon() {
        return (NavigableMap) ((SortedMap) this.f6621l);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return amazon().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C3087l) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C6802l(this.f14240l, amazon().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return amazon().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C6802l(this.f14240l, amazon().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return amazon().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return amazon().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C11506l c11506l = (C11506l) iterator();
        if (!c11506l.hasNext()) {
            return null;
        }
        Object next = c11506l.next();
        c11506l.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C6802l(this.f14240l, amazon().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C6802l(this.f14240l, amazon().tailMap(obj, z));
    }

    @Override // defpackage.C5255l, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.C5255l, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.C5255l, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
