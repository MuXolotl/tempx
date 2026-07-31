package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public interface ICarHardwareResultTypes extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareResultTypes".replace('$', '.');
    public static final int TYPE_INFO_ENERGY_LEVEL = 4;
    public static final int TYPE_INFO_ENERGY_PROFILE = 2;
    public static final int TYPE_INFO_EV_STATUS = 7;
    public static final int TYPE_INFO_MILEAGE = 6;
    public static final int TYPE_INFO_MODEL = 1;
    public static final int TYPE_INFO_SPEED = 5;
    public static final int TYPE_INFO_TOLL = 3;
    public static final int TYPE_SENSOR_ACCELEROMETER = 20;
    public static final int TYPE_SENSOR_CAR_LOCATION = 23;
    public static final int TYPE_SENSOR_COMPASS = 21;
    public static final int TYPE_SENSOR_GYROSCOPE = 22;
    public static final int TYPE_UNKNOWN = 0;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class Default implements ICarHardwareResultTypes {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static abstract class Stub extends Binder implements ICarHardwareResultTypes {

        /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
        public static class Proxy implements ICarHardwareResultTypes {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareResultTypes.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareResultTypes.DESCRIPTOR);
        }

        public static ICarHardwareResultTypes asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICarHardwareResultTypes.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICarHardwareResultTypes)) ? new Proxy(iBinder) : (ICarHardwareResultTypes) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICarHardwareResultTypes.DESCRIPTOR;
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(str);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
