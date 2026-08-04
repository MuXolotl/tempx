package defpackage;

import android.util.Range;

/* JADX INFO: renamed from: lٌّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8887l {
    public Range amazon;
    public double crashlytics;
    public long loadAd;
    public long yandex;

    public C8887l() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.amazon = range;
        this.crashlytics = ((Double) range.getUpper()).doubleValue();
        this.yandex = -9223372036854775807L;
        this.loadAd = -9223372036854775807L;
    }

    public final void crashlytics(float f) {
        AbstractC12442l.admob(f > 0.0f);
        this.amazon = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        loadAd();
    }

    public final void loadAd() {
        this.crashlytics = ((Double) this.amazon.getUpper()).doubleValue();
        this.yandex = -9223372036854775807L;
        this.loadAd = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void yandex(long j, long j2) {
        double dDoubleValue;
        AbstractC12442l.admob(j != -9223372036854775807L);
        AbstractC12442l.admob(j2 != -9223372036854775807L);
        long j3 = this.yandex;
        if (j3 != -9223372036854775807L) {
            long j4 = this.loadAd;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.amazon.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.amazon.getUpper()).doubleValue();
        }
        this.crashlytics = (((Double) this.amazon.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.crashlytics * 0.800000011920929d);
        this.yandex = j;
        this.loadAd = j2;
    }
}
