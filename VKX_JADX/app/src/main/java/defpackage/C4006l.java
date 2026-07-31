package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lٌۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4006l implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient C15424l f8225l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C9076l f8226l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C5526l f8227l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object[] f8228l;

    public C4006l(Object[] objArr) {
        this.f8228l = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C15424l c15424l = this.f8225l;
        if (c15424l == null) {
            c15424l = new C15424l(1, this.f8228l);
            this.f8225l = c15424l;
        }
        return c15424l.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C5526l c5526l = this.f8227l;
        if (c5526l != null) {
            return c5526l;
        }
        C5526l c5526l2 = new C5526l(this, this.f8228l);
        this.f8227l = c5526l2;
        return c5526l2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f8228l;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C5526l c5526l = this.f8227l;
        if (c5526l == null) {
            c5526l = new C5526l(this, this.f8228l);
            this.f8227l = c5526l;
        }
        Iterator it = c5526l.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9076l c9076l = this.f8226l;
        if (c9076l != null) {
            return c9076l;
        }
        C9076l c9076l2 = new C9076l(this, new C15424l(0, this.f8228l));
        this.f8226l = c9076l2;
        return c9076l2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (C5526l) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C15424l c15424l = this.f8225l;
        if (c15424l != null) {
            return c15424l;
        }
        C15424l c15424l2 = new C15424l(1, this.f8228l);
        this.f8225l = c15424l2;
        return c15424l2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }
}
