package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٍۢۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C9897l extends AbstractCollection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f20130l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20131l;

    public /* synthetic */ C9897l(int i, Object obj) {
        this.f20131l = i;
        this.f20130l = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.f20131l;
        Object obj = this.f20130l;
        switch (i) {
            case 0:
                ((AbstractC6671l) obj).clear();
                break;
            case 1:
                ((AbstractC2168l) obj).clear();
                break;
            case 2:
                ((C6756l) obj).clear();
                break;
            case 3:
                ((AbstractMap) obj).clear();
                break;
            case 4:
                ((C6756l) obj).clear();
                break;
            default:
                ((C1137l) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.f20131l;
        Object obj2 = this.f20130l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC6671l) obj2).yandex(entry.getKey(), entry.getValue());
            case 1:
                return ((AbstractC2168l) obj2).loadAd(obj);
            case 2:
            case 4:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) obj2).containsValue(obj);
            case 5:
                return ((C1137l) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f20131l) {
            case 3:
                return ((AbstractMap) this.f20130l).isEmpty();
            case 4:
            default:
                return super.isEmpty();
            case 5:
                return ((C1137l) this.f20130l).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f20131l;
        int i2 = 2;
        Object obj = this.f20130l;
        switch (i) {
            case 0:
                return ((AbstractC6671l) obj).billing();
            case 1:
                return new C0979l((AbstractC2168l) obj, 0);
            case 2:
                C6756l c6756l = (C6756l) obj;
                Map mapCrashlytics = c6756l.crashlytics();
                return mapCrashlytics != null ? mapCrashlytics.values().iterator() : new C2873l(c6756l, i2);
            case 3:
                return new C6877l(((AbstractMap) obj).entrySet().iterator());
            case 4:
                C6756l c6756l2 = (C6756l) obj;
                Map mapStartapp = c6756l2.startapp();
                return mapStartapp != null ? mapStartapp.values().iterator() : new C17384l(c6756l2, i2);
            default:
                return new C14572l(((C1137l) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.f20131l;
        Object obj2 = this.f20130l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC6671l) obj2).remove(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (AbstractC7000l.loadAd(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                C1137l c1137l = (C1137l) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : c1137l.entrySet()) {
                        if (AbstractC7574l.firebase(obj, entry3.getValue())) {
                            c1137l.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.f20131l;
        Object obj = this.f20130l;
        switch (i) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 4:
            default:
                return super.removeAll(collection);
            case 5:
                C1137l c1137l = (C1137l) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c1137l.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C14164l) c1137l.f3095l).loadAd().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.f20131l;
        Object obj = this.f20130l;
        switch (i) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 4:
            default:
                return super.retainAll(collection);
            case 5:
                C1137l c1137l = (C1137l) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c1137l.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C14164l) c1137l.f3095l).loadAd().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f20131l;
        Object obj = this.f20130l;
        switch (i) {
            case 0:
                return ((AbstractC6671l) obj).size();
            case 1:
                return ((AbstractC2168l) obj).f4809l;
            case 2:
                return ((C6756l) obj).size();
            case 3:
                return ((AbstractMap) obj).size();
            case 4:
                return ((C6756l) obj).size();
            default:
                return ((C1137l) obj).f3093l.size();
        }
    }

    public /* synthetic */ C9897l(AbstractMap abstractMap, int i) {
        this.f20131l = i;
        this.f20130l = abstractMap;
    }
}
