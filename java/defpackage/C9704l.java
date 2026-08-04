package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٍّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9704l extends LinkedHashMap {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C9704l f19789l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f19790l = true;

    static {
        C9704l c9704l = new C9704l();
        f19789l = c9704l;
        c9704l.f19790l = false;
    }

    public static int yandex(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof InterfaceC10402l)) {
                return obj.hashCode();
            }
            C3010l.mopub();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC6061l.yandex;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        loadAd();
        super.clear();
    }

    public final C9704l crashlytics() {
        if (isEmpty()) {
            return new C9704l();
        }
        C9704l c9704l = new C9704l(this);
        c9704l.f19790l = true;
        return c9704l;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iYandex = 0;
        for (Map.Entry entry : entrySet()) {
            iYandex += yandex(entry.getValue()) ^ yandex(entry.getKey());
        }
        return iYandex;
    }

    public final void loadAd() {
        if (this.f19790l) {
            return;
        }
        C3010l.mopub();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        loadAd();
        Charset charset = AbstractC6061l.yandex;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        loadAd();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC6061l.yandex;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        loadAd();
        return super.remove(obj);
    }
}
