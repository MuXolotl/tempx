package defpackage;

import android.os.SystemClock;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍِٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9489l {
    public Object crashlytics;
    public long loadAd;
    public int yandex;

    public C9489l(long j, Exception exc) {
        this.loadAd = SystemClock.elapsedRealtime() - j;
        if (exc instanceof C18281l) {
            this.yandex = 2;
            this.crashlytics = exc;
            return;
        }
        if (!(exc instanceof C7410l)) {
            this.yandex = 0;
            this.crashlytics = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.crashlytics = exc;
        if (exc instanceof C4155l) {
            this.yandex = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.yandex = 1;
        } else {
            this.yandex = 0;
        }
    }

    public synchronized void amazon() {
        this.yandex = 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public synchronized boolean crashlytics() {
        boolean z;
        if (this.yandex != 0) {
            ((C16382l) this.crashlytics).yandex.getClass();
            if (System.currentTimeMillis() > this.loadAd) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public int loadAd() {
        Iterator it = ((List) this.crashlytics).iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((C0611l) it.next()).loadAd.intValue();
        }
        return iIntValue;
    }

    public synchronized void purchase(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                amazon();
                return;
            }
            this.yandex++;
            long jYandex = yandex(i);
            ((C16382l) this.crashlytics).yandex.getClass();
            this.loadAd = System.currentTimeMillis() + jYandex;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long yandex(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return 86400000L;
        }
        double dPow = Math.pow(2.0d, this.yandex);
        ((C16382l) this.crashlytics).getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    public C9489l(long j, byte[] bArr, int i) {
        this.loadAd = j;
        this.yandex = i;
        this.crashlytics = bArr;
    }

    public C9489l(int i, URL url, long j) {
        this.yandex = i;
        this.crashlytics = url;
        this.loadAd = j;
    }
}
