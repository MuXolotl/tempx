package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؕ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C3446l {
    public static final C3699l amazon = new C3699l();
    public long crashlytics;
    public long loadAd;
    public boolean yandex;

    public C3446l amazon(long j) {
        this.yandex = true;
        this.loadAd = j;
        return this;
    }

    public void billing() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.yandex && this.loadAd - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long crashlytics() {
        if (this.yandex) {
            return this.loadAd;
        }
        C8339l.smaato("No deadline");
        return 0L;
    }

    public C3446l loadAd() {
        this.crashlytics = 0L;
        return this;
    }

    public C3446l mopub(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.crashlytics = timeUnit.toNanos(j);
            return this;
        }
        C10754l.metrica(AbstractC2812l.ads(j, "timeout < 0: "));
        return null;
    }

    public boolean purchase() {
        return this.yandex;
    }

    public C3446l yandex() {
        this.yandex = false;
        return this;
    }
}
