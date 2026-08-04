package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٔؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C9372l.class)
public final class C14705l extends AbstractC3160l implements Map<String, AbstractC3160l>, InterfaceC17350l {
    public static final C16106l Companion = new C16106l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinkedHashMap f28763l = new LinkedHashMap();

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 4;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f28763l.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f28763l.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC3160l)) {
            return false;
        }
        return this.f28763l.containsValue((AbstractC3160l) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC3160l>> entrySet() {
        return this.f28763l.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14705l)) {
            return false;
        }
        return this.f28763l.entrySet().equals(((C14705l) obj).f28763l.entrySet());
    }

    @Override // java.util.Map
    public final AbstractC3160l get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC3160l) this.f28763l.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f28763l.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f28763l.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f28763l.keySet();
    }

    @Override // java.util.Map
    public final AbstractC3160l put(String str, AbstractC3160l abstractC3160l) {
        return (AbstractC3160l) this.f28763l.put(str, abstractC3160l);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC3160l> map) {
        this.f28763l.putAll(map);
    }

    @Override // java.util.Map
    public final AbstractC3160l remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC3160l) this.f28763l.remove((String) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f28763l.size();
    }

    public final String toString() {
        return "BsonDocument(" + this.f28763l + ')';
    }

    @Override // java.util.Map
    public final Collection<AbstractC3160l> values() {
        return this.f28763l.values();
    }
}
