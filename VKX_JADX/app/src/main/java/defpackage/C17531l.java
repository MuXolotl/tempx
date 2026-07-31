package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: lٗۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17531l extends C5547l implements NavigableMap {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15423l f34145l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17531l(C15423l c15423l, NavigableMap navigableMap) {
        super(c15423l, navigableMap);
        this.f34145l = c15423l;
    }

    @Override // defpackage.C5547l
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final NavigableMap amazon() {
        return (NavigableMap) ((SortedMap) this.f3093l);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = amazon().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return yandex(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return amazon().ceilingKey(obj);
    }

    @Override // defpackage.C5547l
    /* JADX INFO: renamed from: crashlytics */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C17531l(this.f34145l, amazon().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = amazon().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return yandex(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = amazon().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return yandex(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return amazon().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C17531l(this.f34145l, amazon().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = amazon().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return yandex(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return amazon().higherKey(obj);
    }

    @Override // defpackage.C5547l, defpackage.C1137l, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = amazon().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return yandex(entryLastEntry);
    }

    @Override // defpackage.C5547l
    public final SortedSet loadAd() {
        return new C6802l(this.f34145l, amazon());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = amazon().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return yandex(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return amazon().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return purchase(((C3045l) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return purchase(((C3045l) ((C1137l) descendingMap()).entrySet()).iterator());
    }

    public final C11896l purchase(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionSubs = this.f34145l.subs();
        collectionSubs.addAll((Collection) entry.getValue());
        it.remove();
        return new C11896l(entry.getKey(), DesugarCollections.unmodifiableList((List) collectionSubs));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C17531l(this.f34145l, amazon().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C17531l(this.f34145l, amazon().tailMap(obj, z));
    }

    @Override // defpackage.C5547l, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // defpackage.C5547l, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.C5547l, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
