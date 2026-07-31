package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lُٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11154l extends C5128l implements Map, j$.util.Map {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C5386l f22427l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C6542l f22428l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C10220l f22429l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11154l(C5128l c5128l) {
        super(0);
        int i = c5128l.f11161l;
        loadAd(this.f11161l + i);
        if (this.f11161l != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c5128l.billing(i2), c5128l.subs(i2));
            }
        } else if (i > 0) {
            AbstractC8669l.ad(0, 0, c5128l.f11163l, this.f11163l, i);
            AbstractC8669l.pro(0, 0, i << 1, c5128l.f11162l, this.f11162l);
            this.f11161l = i;
        }
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
    public final Set entrySet() {
        C6542l c6542l = this.f22428l;
        if (c6542l != null) {
            return c6542l;
        }
        C6542l c6542l2 = new C6542l(0, this);
        this.f22428l = c6542l2;
        return c6542l2;
    }

    public final boolean firebase(Collection collection) {
        int i = this.f11161l;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f11161l;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean isPro(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5386l c5386l = this.f22427l;
        if (c5386l != null) {
            return c5386l;
        }
        C5386l c5386l2 = new C5386l(this);
        this.f22427l = c5386l2;
        return c5386l2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        loadAd(map.size() + this.f11161l);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C10220l c10220l = this.f22429l;
        if (c10220l != null) {
            return c10220l;
        }
        C10220l c10220l2 = new C10220l(this);
        this.f22429l = c10220l2;
        return c10220l2;
    }

    public C11154l() {
        super(0);
    }
}
