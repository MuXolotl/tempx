package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؘَِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5615l extends AbstractMap {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1666l f11934l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Map f11935l;

    public C5615l(Map map, InterfaceC1666l interfaceC1666l) {
        map.getClass();
        this.f11935l = map;
        this.f11934l = interfaceC1666l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f11935l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f11935l.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C3045l(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.f11935l;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.f11934l.purchase(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f11935l.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.f11935l;
        if (map.containsKey(obj)) {
            return this.f11934l.purchase(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11935l.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C9897l(this, 3);
    }
}
