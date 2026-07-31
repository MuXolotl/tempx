package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٌٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16276l implements Map.Entry, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f31877l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f31878l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31879l = 0;

    public C16276l(C9139l c9139l) {
        this.f31878l = c9139l.crashlytics;
        this.f31877l = c9139l.amazon;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        int i = this.f31879l;
        List list = this.f31877l;
        String str = this.f31878l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC8576l.yandex(entry.getKey(), str) && AbstractC8576l.yandex(entry.getValue(), list);
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return AbstractC8576l.yandex(entry2.getKey(), str) && AbstractC8576l.yandex(entry2.getValue(), list);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.f31879l;
        return this.f31878l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.f31879l;
        return this.f31877l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = this.f31879l;
        List list = this.f31877l;
        String str = this.f31878l;
        switch (i) {
            case 0:
                iHashCode = str.hashCode();
                iHashCode2 = list.hashCode();
                break;
            default:
                iHashCode = str.hashCode();
                iHashCode2 = list.hashCode();
                break;
        }
        return iHashCode ^ iHashCode2;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        switch (this.f31879l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        int i = this.f31879l;
        List list = this.f31877l;
        String str = this.f31878l;
        switch (i) {
            case 0:
                return str + '=' + list;
            default:
                return str + '=' + list;
        }
    }

    public C16276l(String str, List list) {
        this.f31878l = str;
        this.f31877l = list;
    }
}
