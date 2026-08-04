package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖۡۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16704l {
    public static final C16704l loadAd = new C16704l();
    public final HashMap yandex = new HashMap();

    public final synchronized void loadAd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            yandex((String) entry.getKey(), (AbstractC3302l) entry.getValue());
        }
    }

    public final synchronized void yandex(String str, AbstractC3302l abstractC3302l) {
        try {
            boolean zContainsKey = this.yandex.containsKey(str);
            HashMap map = this.yandex;
            if (!zContainsKey) {
                map.put(str, abstractC3302l);
                return;
            }
            if (((AbstractC3302l) map.get(str)).equals(abstractC3302l)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.yandex.get(str)) + "), cannot insert " + String.valueOf(abstractC3302l));
        } catch (Throwable th) {
            throw th;
        }
    }
}
