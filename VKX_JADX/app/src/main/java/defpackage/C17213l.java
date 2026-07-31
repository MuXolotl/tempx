package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٗٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17213l {
    public final Set loadAd;
    public final SharedPreferences yandex;

    public C17213l(SharedPreferences sharedPreferences, Set set) {
        this.yandex = sharedPreferences;
        this.loadAd = set;
    }

    public final boolean crashlytics(String str, boolean z) {
        yandex(str);
        return this.yandex.getBoolean(str, z);
    }

    public final LinkedHashMap loadAd() {
        Map<String, ?> all = this.yandex.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.loadAd;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC16901l.m4229l((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final void yandex(String str) {
        Set set = this.loadAd;
        if (set == null || set.contains(str)) {
            return;
        }
        C8936l.subs("Can't access key outside migration: ".concat(str));
    }
}
