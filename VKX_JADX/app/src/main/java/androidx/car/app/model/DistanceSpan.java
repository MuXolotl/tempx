package androidx.car.app.model;

import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class DistanceSpan extends CarSpan {
    private final Distance mDistance;

    private DistanceSpan() {
        this.mDistance = null;
    }

    public static DistanceSpan create(Distance distance) {
        Objects.requireNonNull(distance);
        return new DistanceSpan(distance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceSpan) {
            return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
        }
        return false;
    }

    public Distance getDistance() {
        Distance distance = this.mDistance;
        Objects.requireNonNull(distance);
        return distance;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    public String toString() {
        return "[distance: " + this.mDistance + "]";
    }

    private DistanceSpan(Distance distance) {
        this.mDistance = distance;
    }
}
