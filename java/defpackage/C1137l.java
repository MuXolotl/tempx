package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: lؒٙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1137l extends AbstractMap {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient AbstractSet f3092l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final transient Map f3093l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3094l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f3095l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient AbstractCollection f3096l;

    public /* synthetic */ C1137l(Serializable serializable, Map map, int i) {
        this.f3094l = i;
        this.f3095l = serializable;
        this.f3093l = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.f3094l;
        Map map = this.f3093l;
        Serializable serializable = this.f3095l;
        switch (i) {
            case 0:
                AbstractC2168l abstractC2168l = (AbstractC2168l) serializable;
                if (map != abstractC2168l.f4808l) {
                    C11506l c11506l = new C11506l(this);
                    while (c11506l.hasNext()) {
                        c11506l.next();
                        c11506l.remove();
                    }
                } else {
                    abstractC2168l.clear();
                }
                break;
            default:
                C14164l c14164l = (C14164l) serializable;
                if (map != c14164l.f27696l) {
                    C11506l c11506l2 = new C11506l(this, (byte) 0);
                    while (c11506l2.hasNext()) {
                        c11506l2.next();
                        c11506l2.remove();
                    }
                } else {
                    C6756l c6756l = c14164l.f27696l;
                    Iterator it = c6756l.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    c6756l.clear();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.f3094l;
        Map map = this.f3093l;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f3094l) {
            case 0:
                C3045l c3045l = (C3045l) this.f3092l;
                if (c3045l != null) {
                    return c3045l;
                }
                C3045l c3045l2 = new C3045l(this, 0);
                this.f3092l = c3045l2;
                return c3045l2;
            default:
                C5339l c5339l = (C5339l) this.f3092l;
                if (c5339l != null) {
                    return c5339l;
                }
                C5339l c5339l2 = new C5339l(this);
                this.f3092l = c5339l2;
                return c5339l2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f3094l) {
            case 0:
                return this == obj || this.f3093l.equals(obj);
            default:
                return this == obj || this.f3093l.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.f3094l;
        Serializable serializable = this.f3095l;
        Map map = this.f3093l;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                return ((AbstractC2168l) serializable).firebase(obj, collection);
            default:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                C14164l c14164l = (C14164l) serializable;
                c14164l.getClass();
                List list = (List) collection2;
                return list instanceof RandomAccess ? new C9209l(c14164l, obj, list, null) : new C0819l(c14164l, obj, list, null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f3094l) {
            case 0:
                return this.f3093l.hashCode();
            default:
                return this.f3093l.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        int i = this.f3094l;
        Serializable serializable = this.f3095l;
        switch (i) {
            case 0:
                return ((AbstractC2168l) serializable).keySet();
            default:
                C14164l c14164l = (C14164l) serializable;
                C14679l c14679l = c14164l.f26937l;
                if (c14679l != null) {
                    return c14679l;
                }
                C14679l c14679l2 = new C14679l(c14164l, c14164l.f27696l);
                c14164l.f26937l = c14679l2;
                return c14679l2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = this.f3094l;
        Map map = this.f3093l;
        Serializable serializable = this.f3095l;
        switch (i) {
            case 0:
                AbstractC2168l abstractC2168l = (AbstractC2168l) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionSubs = abstractC2168l.subs();
                collectionSubs.addAll(collection);
                abstractC2168l.f4809l -= collection.size();
                collection.clear();
                return collectionSubs;
            default:
                C14164l c14164l = (C14164l) serializable;
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                c14164l.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f3094l) {
            case 0:
                break;
        }
        return this.f3093l.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f3094l) {
            case 0:
                break;
        }
        return this.f3093l.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f3094l) {
            case 0:
                C9897l c9897l = (C9897l) this.f3096l;
                if (c9897l != null) {
                    return c9897l;
                }
                C9897l c9897l2 = new C9897l(this, 3);
                this.f3096l = c9897l2;
                return c9897l2;
            default:
                C9897l c9897l3 = (C9897l) this.f3096l;
                if (c9897l3 != null) {
                    return c9897l3;
                }
                C9897l c9897l4 = new C9897l(this, 5);
                this.f3096l = c9897l4;
                return c9897l4;
        }
    }

    public C11896l yandex(Map.Entry entry) {
        Object key = entry.getKey();
        return new C11896l(key, ((AbstractC2168l) this.f3095l).firebase(key, (Collection) entry.getValue()));
    }
}
