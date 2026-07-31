package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lؘٛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5811l {
    public boolean loadAd;
    public final C18527l yandex;

    public C5811l() {
        this(C18527l.yandex);
    }

    public final synchronized boolean amazon() {
        if (this.loadAd) {
            return false;
        }
        this.loadAd = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean crashlytics(long j) {
        try {
            if (j <= 0) {
                return this.loadAd;
            }
            this.yandex.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                loadAd();
            } else {
                boolean z = false;
                while (!this.loadAd && jElapsedRealtime < j2) {
                    try {
                        this.yandex.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    this.yandex.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.loadAd;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void loadAd() {
        boolean z = false;
        while (!this.loadAd) {
            try {
                this.yandex.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void yandex() {
        while (!this.loadAd) {
            this.yandex.getClass();
            wait();
        }
    }

    public C5811l(C18527l c18527l) {
        this.yandex = c18527l;
    }
}
