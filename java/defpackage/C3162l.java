package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؕؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3162l implements Map.Entry, InterfaceC16383l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f6795l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f6796l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6797l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2356l f6798l;

    public C3162l(C13293l c13293l) {
        this.f6798l = c13293l;
        this.f6796l = ((Map.Entry) c13293l.f1974l).getKey();
        this.f6795l = ((Map.Entry) c13293l.f1974l).getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f6797l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC8576l.yandex((String) this.f6795l, entry.getKey()) && AbstractC8576l.yandex(this.f6796l, entry.getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f6797l) {
            case 0:
                return (String) this.f6795l;
            default:
                return this.f6796l;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f6797l) {
            case 0:
                return this.f6796l;
            default:
                return this.f6795l;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f6797l) {
            case 0:
                return this.f6796l.hashCode() ^ ((String) this.f6795l).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.f6797l;
        InterfaceC2356l interfaceC2356l = this.f6798l;
        switch (i) {
            case 0:
                Object obj2 = this.f6796l;
                this.f6796l = obj;
                C11349l c11349l = (C11349l) interfaceC2356l;
                int iYandex = c11349l.yandex((String) this.f6795l);
                if (iYandex >= 0) {
                    c11349l.f22892l[iYandex] = obj;
                }
                return obj2;
            default:
                C13293l c13293l = (C13293l) interfaceC2356l;
                C12376l c12376l = (C12376l) c13293l.f1971l;
                if (c12376l.purchase().amazon != c13293l.f1972l) {
                    C8339l.mopub();
                    return null;
                }
                Object obj3 = this.f6795l;
                c12376l.put(this.f6796l, obj);
                this.f6795l = obj;
                return obj3;
        }
    }

    public String toString() {
        switch (this.f6797l) {
            case 0:
                return ((String) this.f6795l) + '=' + this.f6796l;
            default:
                return super.toString();
        }
    }

    public C3162l(C11349l c11349l, String str, Object obj) {
        this.f6798l = c11349l;
        this.f6795l = str;
        this.f6796l = obj;
    }
}
