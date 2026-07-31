package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.C6591l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public Mileage(C6591l c6591l) {
        CarValue<Float> carValue = c6591l.yandex;
        Objects.requireNonNull(carValue);
        this.mOdometerMeters = carValue;
        CarValue<Integer> carValue2 = c6591l.loadAd;
        Objects.requireNonNull(carValue2);
        this.mDistanceDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getOdometerInKilometers() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @Deprecated
    public CarValue<Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
