package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lُْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13675l implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient AbstractC5511l f26703l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient AbstractC8481l f26704l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient AbstractC8481l f26705l;

    public static AbstractC13675l loadAd(Map map) {
        if ((map instanceof AbstractC13675l) && !(map instanceof SortedMap)) {
            return (AbstractC13675l) map;
        }
        Set setEntrySet = map.entrySet();
        C13698l c13698l = new C13698l(setEntrySet instanceof Collection ? setEntrySet.size() : 4, 11);
        c13698l.mo3671else(setEntrySet);
        return c13698l.metrica(true);
    }

    public static C13698l yandex() {
        return new C13698l(4, 11);
    }

    public abstract C5179l amazon();

    @Override // java.util.Map
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final AbstractC8481l keySet() {
        AbstractC8481l abstractC8481l = this.f26704l;
        if (abstractC8481l != null) {
            return abstractC8481l;
        }
        C5179l c5179lAmazon = amazon();
        this.f26704l = c5179lAmazon;
        return c5179lAmazon;
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
        return values().contains(obj);
    }

    public abstract C0547l crashlytics();

    @Override // java.util.Map
    public final Set entrySet() {
        AbstractC8481l abstractC8481l = this.f26705l;
        if (abstractC8481l != null) {
            return abstractC8481l;
        }
        C0547l c0547lCrashlytics = crashlytics();
        this.f26705l = c0547lCrashlytics;
        return c0547lCrashlytics;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC5573l.amazon(obj, this);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        AbstractC8481l abstractC8481lCrashlytics = this.f26705l;
        if (abstractC8481lCrashlytics == null) {
            abstractC8481lCrashlytics = crashlytics();
            this.f26705l = abstractC8481lCrashlytics;
        }
        return AbstractC5088l.admob(abstractC8481lCrashlytics);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public AbstractC5511l values() {
        AbstractC5511l abstractC5511l = this.f26703l;
        if (abstractC5511l != null) {
            return abstractC5511l;
        }
        AbstractC5511l abstractC5511lPurchase = purchase();
        this.f26703l = abstractC5511lPurchase;
        return abstractC5511lPurchase;
    }

    public abstract AbstractC5511l purchase();

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

    public final String toString() {
        int size = size();
        AbstractC12832l.loadAd(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
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

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }
}
