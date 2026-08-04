package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lؘ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5999l {
    public final Map loadAd;
    public final String yandex;

    public C5999l(String str, Map map) {
        this.yandex = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            linkedHashMap.put(str2 != null ? str2.toLowerCase(Locale.US) : null, (String) entry.getValue());
        }
        this.loadAd = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5999l)) {
            return false;
        }
        C5999l c5999l = (C5999l) obj;
        return c5999l.yandex.equals(this.yandex) && AbstractC8576l.yandex(c5999l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + AbstractC12589l.advert(899, 31, this.yandex);
    }

    public final String toString() {
        return this.yandex + " authParams=" + this.loadAd;
    }
}
