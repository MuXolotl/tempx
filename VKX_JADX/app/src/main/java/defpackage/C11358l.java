package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11358l extends AbstractC10851l implements Map {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final Map f22903l;

    public C11358l(Map map) {
        this.f22903l = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f22903l.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f22903l.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C8833l) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC10851l
    public final Object crashlytics() {
        return this.f22903l;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC5088l.billing(this.f22903l.entrySet(), new C0908l(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC5573l.amazon(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f22903l.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC5088l.admob(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f22903l;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC5088l.billing(this.f22903l.keySet(), new C0908l(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f22903l.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f22903l.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f22903l.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f22903l;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f22903l.values();
    }
}
