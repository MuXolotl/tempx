package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lٟ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18110l implements InterfaceC6235l {
    public static volatile C18110l crashlytics;
    public final ConcurrentHashMap loadAd;
    public final AppMeasurementSdk yandex;

    public C18110l(AppMeasurementSdk appMeasurementSdk) {
        AbstractC1051l.subs(appMeasurementSdk);
        this.yandex = appMeasurementSdk;
        this.loadAd = new ConcurrentHashMap();
    }

    public final C1083l loadAd(String str, C3797l c3797l) {
        InterfaceC11545l c10866l;
        if (!AbstractC7561l.crashlytics.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.loadAd;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.yandex;
                if (zEquals) {
                    c10866l = new C0848l(appMeasurementSdk, c3797l);
                } else {
                    c10866l = "clx".equals(str) ? new C10866l(appMeasurementSdk, c3797l) : null;
                }
                if (c10866l != null) {
                    concurrentHashMap.put(str, c10866l);
                    return new C1083l(23);
                }
            }
        }
        return null;
    }

    public final void yandex(String str, String str2, Bundle bundle) {
        if (AbstractC7561l.crashlytics.contains(str) || AbstractC7561l.loadAd.contains(str2)) {
            return;
        }
        C13708l c13708l = AbstractC7561l.amazon;
        int i = c13708l.f26765l;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) c13708l.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (AbstractC7561l.crashlytics.contains(str)) {
                return;
            }
            C13708l c13708l2 = AbstractC7561l.amazon;
            int i4 = c13708l2.f26765l;
            while (i2 < i4) {
                boolean zContainsKey2 = bundle.containsKey((String) c13708l2.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.yandex.logEvent(str, str2, bundle);
    }
}
