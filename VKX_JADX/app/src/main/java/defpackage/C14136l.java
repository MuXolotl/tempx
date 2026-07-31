package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٓٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C14136l implements Map.Entry, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f27629l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f27630l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27631l;

    public /* synthetic */ C14136l(Object obj, Object obj2, int i) {
        this.f27631l = i;
        this.f27630l = obj;
        this.f27629l = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f27631l) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC8576l.yandex(entry.getKey(), this.f27630l) && AbstractC8576l.yandex(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f27631l) {
            case 0:
                break;
        }
        return this.f27630l;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f27631l) {
            case 0:
                break;
        }
        return this.f27629l;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f27631l) {
            case 0:
                Object obj = this.f27630l;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f27631l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f27631l) {
            case 0:
                return this.f27630l + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
