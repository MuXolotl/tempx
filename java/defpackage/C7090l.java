package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؘؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7090l implements InterfaceC16176l, Map, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7090l f14856l = new C7090l(C7250l.purchase, 0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f14857l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7250l f14858l;

    public C7090l(C7250l c7250l, int i) {
        this.f14858l = c7250l;
        this.f14857l = i;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f14858l.amazon(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC8576l.yandex(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final C7090l crashlytics(Object obj, C10966l c10966l) {
        C14785l c14785lSignature = this.f14858l.Signature(obj != null ? obj.hashCode() : 0, obj, c10966l, 0);
        return c14785lSignature == null ? this : new C7090l((C7250l) c14785lSignature.f28907l, this.f14857l + c14785lSignature.f28908l);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C9116l(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f14857l != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (AbstractC8576l.yandex(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f14858l.mopub(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14857l == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C9116l(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14857l;
    }

    public final String toString() {
        return AbstractC16901l.m4210case(entrySet(), ", ", "{", "}", new C1412l(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C7067l(1, this);
    }

    @Override // defpackage.InterfaceC16176l
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public C0046l builder() {
        return new C0046l(this);
    }
}
