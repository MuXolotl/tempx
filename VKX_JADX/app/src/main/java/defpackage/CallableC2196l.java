package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؓۢ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC2196l implements Callable {
    public final /* synthetic */ String crashlytics;
    public final /* synthetic */ C8315l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC2196l(C8315l c8315l, String str, int i) {
        this.yandex = i;
        this.loadAd = c8315l;
        this.crashlytics = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.yandex;
        String str = this.crashlytics;
        C8315l c8315l = this.loadAd;
        switch (i) {
            case 0:
                return new C8570l(new CallableC2196l(c8315l, str, 1));
            case 1:
                C8648l c8648l = c8315l.f13233l.f14451l;
                C6901l.m2082case(c8648l);
                C4729l c4729lM2342l = c8648l.m2342l(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((C17417l) c8315l.f833l).f33945l.m1678l();
                map.put("gmp_version", 161000L);
                if (c4729lM2342l != null) {
                    String strM1597throw = c4729lM2342l.m1597throw();
                    if (strM1597throw != null) {
                        map.put("app_version", strM1597throw);
                    }
                    map.put("app_version_int", Long.valueOf(c4729lM2342l.m1588else()));
                    map.put("dynamite_version", Long.valueOf(c4729lM2342l.loadAd()));
                }
                return map;
            default:
                C5633l c5633l = new C5633l(c8315l, str, false, 9);
                C7869l c7869l = new C7869l("internal.remoteConfig", 0);
                c7869l.f21268l.put("getValue", new C8570l(c7869l, c5633l));
                return c7869l;
        }
    }
}
