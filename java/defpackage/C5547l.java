package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: lٌؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5547l extends C1137l implements SortedMap {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15423l f11830l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public SortedSet f11831l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5547l(C15423l c15423l, SortedMap sortedMap) {
        super(c15423l, sortedMap, 0);
        this.f11830l = c15423l;
    }

    public SortedMap amazon() {
        return (SortedMap) this.f3093l;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return amazon().comparator();
    }

    @Override // defpackage.C1137l, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f11831l;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetLoadAd = loadAd();
        this.f11831l = sortedSetLoadAd;
        return sortedSetLoadAd;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return amazon().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C5547l(this.f11830l, amazon().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return amazon().lastKey();
    }

    public SortedSet loadAd() {
        return new C5255l(this.f11830l, amazon());
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C5547l(this.f11830l, amazon().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C5547l(this.f11830l, amazon().tailMap(obj));
    }
}
