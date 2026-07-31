package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Accelerometer {
    private final CarValue<List<Float>> mForces;

    public Accelerometer(CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mForces = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Accelerometer) {
            return Objects.equals(this.mForces, ((Accelerometer) obj).mForces);
        }
        return false;
    }

    public CarValue<List<Float>> getForces() {
        return this.mForces;
    }

    public int hashCode() {
        return Objects.hash(this.mForces);
    }

    public String toString() {
        return "[ forces: " + this.mForces + " ]";
    }

    private Accelerometer() {
        this.mForces = CarValue.UNKNOWN_FLOAT_LIST;
    }
}
