package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٓ۠ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC14455l implements Callable {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public CallableC14455l(C6901l c6901l, C10462l c10462l) {
        this.yandex = 3;
        this.loadAd = c10462l;
        Objects.requireNonNull(c6901l);
        this.crashlytics = c6901l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C6237l c6237l;
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                AbstractC3940l abstractC3940l = (AbstractC3940l) obj2;
                C3049l c3049l = (C3049l) obj;
                HashMap map = C6237l.f13169l;
                C8565l.isVip();
                int i2 = AbstractC15437l.yandex;
                C8565l.isVip();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = C6237l.f13169l;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new C6237l("detectorTaskWithResource#run"));
                    }
                    c6237l = (C6237l) map2.get("detectorTaskWithResource#run");
                } else {
                    c6237l = C12928l.f25376l;
                }
                c6237l.yandex();
                try {
                    List listLoadAd = abstractC3940l.f8115l.loadAd(c3049l);
                    c6237l.close();
                    return listLoadAd;
                } catch (Throwable th) {
                    try {
                        c6237l.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            case 1:
                BinderC15526l binderC15526l = (BinderC15526l) obj;
                binderC15526l.purchase.m2089continue();
                C8648l c8648l = binderC15526l.purchase.f14451l;
                C6901l.m2082case(c8648l);
                return c8648l.m2369l((String) obj2);
            case 2:
                BinderC15526l binderC15526l2 = (BinderC15526l) obj;
                binderC15526l2.purchase.m2089continue();
                return new C15927l(binderC15526l2.purchase.m2088const(((C10462l) obj2).f21296l));
            case 3:
                C10462l c10462l = (C10462l) obj2;
                String str = c10462l.f21296l;
                AbstractC1051l.subs(str);
                C6901l c6901l = (C6901l) obj;
                C10559l c10559lYandex = c6901l.yandex(str);
                EnumC3170l enumC3170l = EnumC3170l.ANALYTICS_STORAGE;
                if (c10559lYandex.subs(enumC3170l) && C10559l.crashlytics(100, c10462l.f21297l).subs(enumC3170l)) {
                    return c6901l.m2095goto(c10462l).m1598throws();
                }
                c6901l.mo200else().f16911l.yandex("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                C0223l c0223l = (C0223l) obj2;
                C15643l c15643l = (C15643l) obj;
                C7447l c7447l = c0223l.yandex;
                C5633l c5633l = new C5633l(13);
                try {
                    C2830l c2830l = (C2830l) c7447l.billing.get();
                    Uri uri = c0223l.loadAd;
                    C17516l c17516l = new C17516l(c15643l);
                    c17516l.f34133l = new C5633l[]{c5633l};
                    break;
                } catch (IOException | RuntimeException e) {
                    AbstractC3234l.firebase(Level.WARNING, c7447l.yandex(), e, "Failed to update snapshot for %s flags may be stale.", c0223l.crashlytics);
                }
                return null;
        }
    }

    public /* synthetic */ CallableC14455l(BinderC15526l binderC15526l, Object obj, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = binderC15526l;
    }

    public /* synthetic */ CallableC14455l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }
}
