package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9516l {
    public final C11117l admob;
    public final long amazon;
    public final ArrayBlockingQueue billing;
    public final long crashlytics;
    public long firebase;
    public int isPro;
    public final double loadAd;
    public final ThreadPoolExecutor mopub;
    public final int purchase;
    public final C2494l subs;
    public final double yandex;

    public C9516l(C11117l c11117l, C6871l c6871l, C2494l c2494l) {
        double d = c6871l.amazon;
        double d2 = c6871l.purchase;
        long j = ((long) c6871l.billing) * 1000;
        this.yandex = d;
        this.loadAd = d2;
        this.crashlytics = j;
        this.admob = c11117l;
        this.subs = c2494l;
        this.amazon = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.purchase = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.billing = arrayBlockingQueue;
        this.mopub = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.isPro = 0;
        this.firebase = 0L;
    }

    public final void loadAd(C4635l c4635l, C2350l c2350l) {
        String str = "Sending report through Google DataTransport: " + c4635l.loadAd;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.admob.yandex(new C11658l(null, c4635l.yandex, EnumC14251l.f27851l, null), new C4018l(SystemClock.elapsedRealtime() - this.amazon < 2000, this, c2350l, c4635l));
    }

    public final int yandex() {
        if (this.firebase == 0) {
            this.firebase = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.firebase) / this.crashlytics);
        int size = this.billing.size();
        int i = this.isPro;
        int iMin = size == this.purchase ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.isPro != iMin) {
            this.isPro = iMin;
            this.firebase = System.currentTimeMillis();
        }
        return iMin;
    }
}
