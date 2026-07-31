package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؔٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2612l implements Map.Entry, InterfaceC16383l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6429l f5675l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f5676l;

    public C2612l(InterfaceC6429l interfaceC6429l, Object obj) {
        this.f5676l = obj;
        this.f5675l = interfaceC6429l;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        boolean z = getValue() instanceof byte[];
        Object obj2 = this.f5676l;
        if (z) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getValue() instanceof byte[]) {
                return AbstractC8576l.yandex(obj2, entry.getKey()) && Arrays.equals((byte[]) getValue(), (byte[]) entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        return AbstractC8576l.yandex(obj2, entry2.getKey()) && AbstractC8576l.yandex(getValue(), entry2.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5676l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5675l.get(this.f5676l);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5676l;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        InterfaceC6429l interfaceC6429l = this.f5675l;
        Object obj2 = this.f5676l;
        Object obj3 = interfaceC6429l.get(obj2);
        interfaceC6429l.appmetrica(obj2, obj, new LinkedHashMap());
        return obj3;
    }

    public final String toString() {
        return "ManagedRealmMapEntry{" + this.f5676l + "," + getValue() + "}";
    }
}
