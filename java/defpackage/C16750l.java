package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖۤ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16750l {
    public final LinkedHashMap yandex;

    public C16750l(LinkedHashMap linkedHashMap) {
        this.yandex = linkedHashMap;
    }

    public final C16750l yandex() {
        LinkedHashMap linkedHashMap = this.yandex;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C9217l c9217l = (C9217l) entry.getValue();
            linkedHashMap2.put(key, new C9217l(c9217l.yandex, c9217l.loadAd, c9217l.crashlytics, true, true));
        }
        return new C16750l(linkedHashMap2);
    }
}
