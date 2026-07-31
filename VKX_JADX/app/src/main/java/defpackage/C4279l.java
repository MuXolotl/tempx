package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؖٞٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4279l {
    public static final C4279l loadAd;
    public final HashMap yandex;

    static {
        C4279l c4279l = new C4279l(new LinkedHashMap());
        AbstractC7280l.admob(c4279l);
        loadAd = c4279l;
    }

    public C4279l(C4279l c4279l) {
        this.yandex = new HashMap(c4279l.yandex);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C4279l.class.equals(obj.getClass())) {
                HashMap map = ((C4279l) obj).yandex;
                HashMap map2 = this.yandex;
                Set<String> setKeySet = map2.keySet();
                if (AbstractC8576l.yandex(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = AbstractC8669l.Signature(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.yandex.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("Data {"), AbstractC16901l.m4210case(this.yandex.entrySet(), null, null, null, new C4741l(3), 31), "}");
    }

    public final boolean yandex(String str) {
        Object obj = this.yandex.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public C4279l(LinkedHashMap linkedHashMap) {
        this.yandex = new HashMap(linkedHashMap);
    }
}
