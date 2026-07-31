package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lِّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11787l {
    public final int crashlytics;
    public final HashMap yandex = new HashMap();
    public final int loadAd = 64;

    public C11787l(int i) {
        this.crashlytics = i;
    }

    public static String loadAd(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized void amazon(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strLoadAd = loadAd(this.crashlytics, str);
                if (this.yandex.size() < this.loadAd || this.yandex.containsKey(strLoadAd)) {
                    String str2 = (String) entry.getValue();
                    this.yandex.put(strLoadAd, str2 == null ? "" : loadAd(this.crashlytics, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.loadAd, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean crashlytics(String str) {
        boolean zEquals;
        String strLoadAd = loadAd(this.crashlytics, "com.crashlytics.version-control-info");
        if (this.yandex.size() >= this.loadAd && !this.yandex.containsKey(strLoadAd)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.loadAd, null);
            return false;
        }
        String strLoadAd2 = loadAd(this.crashlytics, str);
        String str2 = (String) this.yandex.get(strLoadAd);
        if (str2 == null) {
            zEquals = strLoadAd2 == null;
        } else {
            zEquals = str2.equals(strLoadAd2);
        }
        if (zEquals) {
            return false;
        }
        this.yandex.put(strLoadAd, strLoadAd2);
        return true;
    }

    public final synchronized Map yandex() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.yandex));
    }
}
