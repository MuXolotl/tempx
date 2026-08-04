package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lٍۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9799l {
    public Exception yandex;
    public long loadAd = -9223372036854775807L;
    public long crashlytics = -9223372036854775807L;

    public final void yandex(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.yandex == null) {
            this.yandex = exc;
        }
        if (this.loadAd == -9223372036854775807L && C7653l.f15751abstract.get() <= 0) {
            this.loadAd = 200 + jElapsedRealtime;
        }
        long j = this.loadAd;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.crashlytics = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.yandex;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.yandex;
        this.yandex = null;
        this.loadAd = -9223372036854775807L;
        this.crashlytics = -9223372036854775807L;
        throw exc3;
    }
}
