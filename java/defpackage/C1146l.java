package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lؒٚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1146l {
    public final Throwable amazon;
    public final C6288l crashlytics;
    public final long loadAd;
    public final int yandex;

    public C1146l(int i, C6288l c6288l, Exception exc, int i2) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        c6288l = (i2 & 4) != 0 ? null : c6288l;
        exc = (i2 & 8) != 0 ? null : exc;
        this.yandex = i;
        this.loadAd = jElapsedRealtimeNanos;
        this.crashlytics = c6288l;
        this.amazon = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146l)) {
            return false;
        }
        C1146l c1146l = (C1146l) obj;
        return this.yandex == c1146l.yandex && this.loadAd == c1146l.loadAd && AbstractC8576l.yandex(this.crashlytics, c1146l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1146l.amazon);
    }

    public final int hashCode() {
        int iInmobi = AbstractC5020l.inmobi(this.yandex) * 31;
        long j = this.loadAd;
        int i = (((int) (j ^ (j >>> 32))) + iInmobi) * 31;
        C6288l c6288l = this.crashlytics;
        int i2 = (i + (c6288l == null ? 0 : c6288l.yandex)) * 31;
        Throwable th = this.amazon;
        return i2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + AbstractC11043l.Signature(this.yandex) + ", closingTimestamp=" + ((Object) C9386l.yandex(this.loadAd)) + ", errorCode=" + this.crashlytics + ", exception=" + this.amazon + ')';
    }
}
