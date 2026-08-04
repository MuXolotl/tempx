package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؔۦٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3045l extends AbstractC16136l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f6565l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3045l(AbstractMap abstractMap, int i) {
        super(0);
        this.f6566l = i;
        this.f6565l = abstractMap;
    }

    public final boolean amazon(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapBilling = billing();
        mapBilling.getClass();
        try {
            obj2 = mapBilling.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (AbstractC7000l.loadAd(obj2, entry.getValue())) {
            return obj2 != null || billing().containsKey(key);
        }
        return false;
    }

    public final Map billing() {
        int i = this.f6566l;
        AbstractMap abstractMap = this.f6565l;
        switch (i) {
            case 0:
                return (C1137l) abstractMap;
            default:
                return (C5615l) abstractMap;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        billing().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f6566l) {
            case 0:
                Set setEntrySet = ((C1137l) this.f6565l).f3093l.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return amazon(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return billing().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f6566l;
        AbstractMap abstractMap = this.f6565l;
        switch (i) {
            case 0:
                return new C11506l((C1137l) abstractMap);
            default:
                C5615l c5615l = (C5615l) abstractMap;
                Iterator it = c5615l.f11935l.entrySet().iterator();
                InterfaceC1666l interfaceC1666l = c5615l.f11934l;
                interfaceC1666l.getClass();
                return new C10219l(it, new C1164l(0, interfaceC1666l));
        }
    }

    public final boolean mopub(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return billing().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.f6566l) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC2168l abstractC2168l = (AbstractC2168l) ((C1137l) this.f6565l).f3095l;
                Object key = entry.getKey();
                Map map = abstractC2168l.f4808l;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractC2168l.f4809l -= size;
                }
                return true;
            default:
                return mopub(obj);
        }
    }

    @Override // defpackage.AbstractC16136l, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return AbstractC5088l.adcel(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // defpackage.AbstractC16136l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetStartapp = AbstractC5088l.startapp(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetStartapp.add(((Map.Entry) obj).getKey());
                }
            }
            return billing().keySet().retainAll(hashSetStartapp);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return billing().size();
    }
}
