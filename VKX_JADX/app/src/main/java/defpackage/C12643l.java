package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lّٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12643l extends LinkedHashMap {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C12643l f24869l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f24870l = true;

    static {
        C12643l c12643l = new C12643l();
        f24869l = c12643l;
        c12643l.f24870l = false;
    }

    public static int loadAd(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof InterfaceC6759l)) {
                return obj.hashCode();
            }
            C3010l.mopub();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iYandex = AbstractC16728l.yandex(bArr, length, 0, length);
        if (iYandex == 0) {
            return 1;
        }
        return iYandex;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        crashlytics();
        super.clear();
    }

    public final void crashlytics() {
        if (this.f24870l) {
            return;
        }
        C3010l.mopub();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iLoadAd = 0;
        for (Map.Entry entry : entrySet()) {
            iLoadAd += loadAd(entry.getValue()) ^ loadAd(entry.getKey());
        }
        return iLoadAd;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        crashlytics();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        crashlytics();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        crashlytics();
        return super.remove(obj);
    }

    public final C12643l yandex() {
        if (isEmpty()) {
            return new C12643l();
        }
        C12643l c12643l = new C12643l(this);
        c12643l.f24870l = true;
        return c12643l;
    }
}
