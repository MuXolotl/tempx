package androidx.car.app.hardware;

import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Accelerometer;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.car.app.hardware.info.Compass;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Gyroscope;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;
import androidx.car.app.isPro;
import androidx.car.app.subs;
import defpackage.C12166l;
import defpackage.C12315l;
import defpackage.C12565l;
import defpackage.C18638l;
import defpackage.C18642l;
import defpackage.C4337l;
import defpackage.C4467l;
import defpackage.C6425l;
import defpackage.C6591l;
import defpackage.C9997l;
import defpackage.InterfaceC10744l;
import defpackage.InterfaceC11692l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC2555l;
import defpackage.InterfaceC9864l;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class ProjectedCarHardwareManager implements InterfaceC10744l {
    private final C4337l mVehicleInfo;
    private final C12166l mVehicleSensors;

    public ProjectedCarHardwareManager(subs subsVar, isPro ispro) {
        C12565l c12565l = new C12565l(ispro);
        C4337l c4337l = new C4337l();
        C12315l c12315l = new C12315l();
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        c12315l.yandex = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        c12315l.loadAd = carValue2;
        c12315l.crashlytics = carValue;
        new CarResultStub(1, null, true, new Model(c12315l), c12565l);
        C18638l c18638l = new C18638l();
        CarValue<List<Integer>> carValue3 = CarValue.UNKNOWN_INTEGER_LIST;
        c18638l.yandex = carValue3;
        c18638l.loadAd = carValue3;
        new CarResultStub(2, null, true, new EnergyProfile(c18638l), c12565l);
        C9997l c9997l = new C9997l();
        c9997l.yandex = carValue2;
        new CarResultStub(3, null, false, new TollCard(c9997l), c12565l);
        C18642l c18642l = new C18642l();
        CarValue<Float> carValue4 = CarValue.UNKNOWN_FLOAT;
        c18642l.yandex = carValue4;
        c18642l.loadAd = carValue4;
        CarValue<Boolean> carValue5 = CarValue.UNKNOWN_BOOLEAN;
        c18642l.crashlytics = carValue5;
        c18642l.amazon = carValue4;
        c18642l.purchase = carValue2;
        c18642l.billing = carValue2;
        new CarResultStub(4, null, false, new EnergyLevel(c18642l), c12565l);
        C4467l c4467l = new C4467l();
        c4467l.yandex = carValue4;
        c4467l.loadAd = carValue4;
        c4467l.crashlytics = carValue2;
        new CarResultStub(5, null, false, new Speed(c4467l), c12565l);
        C6591l c6591l = new C6591l();
        c6591l.yandex = carValue4;
        c6591l.loadAd = carValue2;
        new CarResultStub(6, null, false, new Mileage(c6591l), c12565l);
        C6425l c6425l = new C6425l();
        c6425l.yandex = carValue5;
        c6425l.loadAd = carValue5;
        new CarResultStub(7, null, false, new EvStatus(c6425l), c12565l);
        this.mVehicleInfo = c4337l;
        C12166l c12166l = new C12166l();
        CarValue carValue6 = C12166l.yandex;
        new Accelerometer(carValue6);
        new HashMap();
        new Gyroscope(carValue6);
        new HashMap();
        new Compass(carValue6);
        new HashMap();
        new CarHardwareLocation(new CarValue(null, 0L, 2));
        new HashMap();
        this.mVehicleSensors = c12166l;
    }

    public InterfaceC11692l getCarClimate() {
        throw new UnsupportedOperationException();
    }

    public InterfaceC2555l getCarInfo() {
        return this.mVehicleInfo;
    }

    public InterfaceC9864l getCarSensors() {
        return this.mVehicleSensors;
    }
}
