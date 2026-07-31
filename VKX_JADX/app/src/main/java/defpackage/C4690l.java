package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؗؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4690l {
    public static WeakReference amazon;
    public final ScheduledThreadPoolExecutor crashlytics;
    public C3557l loadAd;
    public final SharedPreferences yandex;

    public C4690l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.crashlytics = scheduledThreadPoolExecutor;
        this.yandex = sharedPreferences;
    }

    public final synchronized void crashlytics(C6016l c6016l) {
        this.loadAd.amazon(c6016l.crashlytics);
    }

    public final synchronized void loadAd() {
        this.loadAd = C3557l.loadAd(this.yandex, this.crashlytics);
    }

    public final synchronized C6016l yandex() {
        C6016l c6016l;
        String strCrashlytics = this.loadAd.crashlytics();
        Pattern pattern = C6016l.amazon;
        c6016l = null;
        if (!TextUtils.isEmpty(strCrashlytics)) {
            String[] strArrSplit = strCrashlytics.split("!", -1);
            if (strArrSplit.length == 2) {
                c6016l = new C6016l(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c6016l;
    }
}
