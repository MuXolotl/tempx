package defpackage;

import java.math.RoundingMode;

/* JADX INFO: renamed from: lٖٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16391l {
    public final ThreadLocal amazon = new ThreadLocal();
    public long crashlytics;
    public long loadAd;
    public long yandex;

    public C16391l(long j) {
        mopub(j);
    }

    public final synchronized void admob(long j, boolean z) {
        try {
            AbstractC12442l.subscription(this.yandex == 9223372036854775806L);
            if (billing()) {
                return;
            }
            if (z) {
                this.amazon.set(Long.valueOf(j));
            } else {
                while (!billing()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long amazon() {
        long j;
        j = this.yandex;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean billing() {
        return this.loadAd != -9223372036854775807L;
    }

    public final synchronized long crashlytics(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.crashlytics;
        if (j2 != -9223372036854775807L) {
            String str = AbstractC15323l.yandex;
            long jM3970import = AbstractC15323l.m3970import(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = jM3970import / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j = j4 >= jM3970import ? j4 : ((j3 + 1) * 8589934592L) + j;
        }
        long j5 = j;
        String str2 = AbstractC15323l.yandex;
        return yandex(AbstractC15323l.m3970import(j5, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long loadAd(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.crashlytics;
            if (j2 != -9223372036854775807L) {
                String str = AbstractC15323l.yandex;
                long jM3970import = AbstractC15323l.m3970import(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jM3970import) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jM3970import) < Math.abs(j5 - jM3970import) ? j4 : j5;
            }
            long j6 = j;
            String str2 = AbstractC15323l.yandex;
            return yandex(AbstractC15323l.m3970import(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void mopub(long j) {
        this.yandex = j;
        this.loadAd = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.crashlytics = -9223372036854775807L;
    }

    public final synchronized long purchase() {
        return this.loadAd;
    }

    public final synchronized long yandex(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!billing()) {
                long jLongValue = this.yandex;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.amazon.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.loadAd = jLongValue - j;
                notifyAll();
            }
            this.crashlytics = j;
            return j + this.loadAd;
        } catch (Throwable th) {
            throw th;
        }
    }
}
