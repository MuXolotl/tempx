package androidx.car.app.model;

import android.annotation.SuppressLint;
import defpackage.AbstractC15560l;
import defpackage.InterfaceC12208l;
import j$.time.Duration;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static DurationSpan create(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    @SuppressLint({"MethodNameUnits"})
    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return AbstractC15560l.ads(this.mDurationSeconds, "]", new StringBuilder("[seconds: "));
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }
}
