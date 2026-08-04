package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٓۢۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14500l {
    public static final ArrayList loadAd = new ArrayList(50);
    public final Handler yandex;

    public C14500l(Handler handler) {
        this.yandex = handler;
    }

    public static C3485l crashlytics() {
        C3485l c3485l;
        ArrayList arrayList = loadAd;
        synchronized (arrayList) {
            try {
                c3485l = arrayList.isEmpty() ? new C3485l() : (C3485l) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3485l;
    }

    public final boolean admob(int i, int i2) {
        return this.yandex.sendEmptyMessageDelayed(i, i2);
    }

    public final boolean amazon(Runnable runnable) {
        return this.yandex.post(runnable);
    }

    public final void billing(int i) {
        AbstractC12442l.admob(i != 0);
        this.yandex.removeMessages(i);
    }

    public final C3485l loadAd(int i, Object obj) {
        C3485l c3485lCrashlytics = crashlytics();
        c3485lCrashlytics.yandex = this.yandex.obtainMessage(i, obj);
        return c3485lCrashlytics;
    }

    public final boolean mopub(int i) {
        return this.yandex.sendEmptyMessage(i);
    }

    public final void purchase() {
        this.yandex.removeCallbacksAndMessages(null);
    }

    public final C3485l yandex(int i) {
        C3485l c3485lCrashlytics = crashlytics();
        c3485lCrashlytics.yandex = this.yandex.obtainMessage(i);
        return c3485lCrashlytics;
    }
}
