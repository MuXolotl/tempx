package defpackage;

import android.os.Looper;
import java.util.Locale;

/* JADX INFO: renamed from: lٟؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3723l {
    public static final Object subs = new Object();
    public RunnableC10799l admob;
    public final String crashlytics;
    public final long loadAd;
    public InterfaceC5194l mopub;
    public final C0022l yandex;
    public long purchase = -1;
    public long billing = 0;
    public final HandlerC4052l amazon = new HandlerC4052l(Looper.getMainLooper(), 6);

    public C3723l(long j, String str) {
        this.loadAd = j;
        this.crashlytics = str;
        this.yandex = new C0022l("RequestTracker", str);
    }

    public final void amazon(long j, int i, C2183l c2183l) {
        synchronized (subs) {
            try {
                if (crashlytics(j)) {
                    Locale locale = Locale.ROOT;
                    billing(i, c2183l, "request " + j + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing(int i, Object obj, String str) {
        this.yandex.loadAd(str, new Object[0]);
        Object obj2 = subs;
        synchronized (obj2) {
            try {
                if (this.mopub != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC5194l interfaceC5194l = this.mopub;
                    AbstractC1051l.subs(interfaceC5194l);
                    interfaceC5194l.subs(this.crashlytics, this.purchase, i, obj, this.billing, jCurrentTimeMillis);
                }
                this.purchase = -1L;
                this.mopub = null;
                synchronized (obj2) {
                    try {
                        RunnableC10799l runnableC10799l = this.admob;
                        if (runnableC10799l != null) {
                            this.amazon.removeCallbacks(runnableC10799l);
                            this.admob = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean crashlytics(long j) {
        boolean z;
        synchronized (subs) {
            long j2 = this.purchase;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean loadAd() {
        boolean z;
        synchronized (subs) {
            z = this.purchase != -1;
        }
        return z;
    }

    public final boolean purchase(int i) {
        synchronized (subs) {
            try {
                if (!loadAd()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                billing(i, null, "clearing request " + this.purchase);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(long j, InterfaceC5194l interfaceC5194l) {
        InterfaceC5194l interfaceC5194l2;
        long j2;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = subs;
        synchronized (obj) {
            interfaceC5194l2 = this.mopub;
            j2 = this.purchase;
            j3 = this.billing;
            this.purchase = j;
            this.mopub = interfaceC5194l;
            this.billing = jCurrentTimeMillis;
        }
        if (interfaceC5194l2 != null) {
            interfaceC5194l2.billing(this.crashlytics, j2, j3, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                RunnableC10799l runnableC10799l = this.admob;
                if (runnableC10799l != null) {
                    this.amazon.removeCallbacks(runnableC10799l);
                }
                RunnableC10799l runnableC10799l2 = new RunnableC10799l(5, this);
                this.admob = runnableC10799l2;
                this.amazon.postDelayed(runnableC10799l2, this.loadAd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
