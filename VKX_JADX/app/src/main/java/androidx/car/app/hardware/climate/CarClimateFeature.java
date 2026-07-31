package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import defpackage.AbstractC0653l;
import defpackage.AbstractC9638l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    public CarClimateFeature(AbstractC9638l abstractC9638l) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CarClimateFeature.class == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClimateProfileFeature{mFeature='");
        sb.append(this.mFeature);
        sb.append("', mCarZones=");
        return AbstractC0653l.subscription(sb, this.mCarZones, '}');
    }
}
