package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: lؗۤؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5255l extends C3087l implements SortedSet {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C15423l f11338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5255l(C15423l c15423l, SortedMap sortedMap) {
        super(c15423l, sortedMap);
        this.f11338l = c15423l;
    }

    public SortedMap amazon() {
        return (SortedMap) this.f6621l;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return amazon().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return amazon().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C5255l(this.f11338l, amazon().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return amazon().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C5255l(this.f11338l, amazon().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C5255l(this.f11338l, amazon().tailMap(obj));
    }
}
