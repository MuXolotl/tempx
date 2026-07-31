package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؘؙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5976l {
    public static final C6168l crashlytics = new C6168l(28);
    public final AtomicReference loadAd = new AtomicReference(null);
    public final C1263l yandex;

    public C5976l(C1263l c1263l) {
        this.yandex = c1263l;
        c1263l.yandex(new C2683l(15, this));
    }

    public final void amazon(String str, long j, C11024l c11024l) {
        String strStartapp = AbstractC14814l.startapp("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strStartapp, null);
        }
        this.yandex.yandex(new C8000l(str, j, c11024l));
    }

    public final boolean crashlytics(String str) {
        C5976l c5976l = (C5976l) this.loadAd.get();
        return c5976l != null && c5976l.crashlytics(str);
    }

    public final boolean loadAd() {
        C5976l c5976l = (C5976l) this.loadAd.get();
        return c5976l != null && c5976l.loadAd();
    }

    public final C6168l yandex(String str) {
        C5976l c5976l = (C5976l) this.loadAd.get();
        return c5976l == null ? crashlytics : c5976l.yandex(str);
    }
}
