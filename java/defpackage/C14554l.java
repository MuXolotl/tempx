package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: lٓۦّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14554l implements Map.Entry, InterfaceC16383l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f28500l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f28501l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17963l f28502l;

    public C14554l(C17963l c17963l, int i) {
        this.f28502l = c17963l;
        this.f28501l = i;
        this.f28500l = c17963l.f34959l;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC8576l.yandex(entry.getKey(), getKey()) && AbstractC8576l.yandex(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        yandex();
        return this.f28502l.f34961l[this.f28501l];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        yandex();
        return this.f28502l.f34960l[this.f28501l];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        yandex();
        C17963l c17963l = this.f28502l;
        c17963l.amazon();
        Object[] objArr = c17963l.f34960l;
        if (objArr == null) {
            int length = c17963l.f34961l.length;
            if (length < 0) {
                C8339l.metrica("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            c17963l.f34960l = objArr;
        }
        int i = this.f28501l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public final void yandex() {
        if (this.f28502l.f34959l != this.f28500l) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
