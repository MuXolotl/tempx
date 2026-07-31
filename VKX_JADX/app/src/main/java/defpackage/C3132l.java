package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lؕؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3132l implements Map, InterfaceC2356l, j$.util.Map {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6874l f6728l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C6874l f6729l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13660l f6730l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C6106l f6731l;

    public C3132l(C13660l c13660l) {
        this.f6730l = c13660l;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f6730l.crashlytics(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f6730l.amazon(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6874l c6874l = this.f6729l;
        if (c6874l != null) {
            return c6874l;
        }
        C6874l c6874l2 = new C6874l(this.f6730l, 0);
        this.f6729l = c6874l2;
        return c6874l2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3132l.class != obj.getClass()) {
            return false;
        }
        return this.f6730l.equals(((C3132l) obj).f6730l);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f6730l.mopub(obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f6730l.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6730l.subs();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C6874l c6874l = this.f6728l;
        if (c6874l != null) {
            return c6874l;
        }
        C6874l c6874l2 = new C6874l(this.f6730l, 1);
        this.f6728l = c6874l2;
        return c6874l2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6730l.purchase;
    }

    public final String toString() {
        return this.f6730l.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C6106l c6106l = this.f6731l;
        if (c6106l != null) {
            return c6106l;
        }
        C6106l c6106l2 = new C6106l(this.f6730l);
        this.f6731l = c6106l2;
        return c6106l2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
