package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.C15858l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public interface ICarHardwareHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareHost".replace('$', '.');

    void getCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult);

    void subscribeCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult);

    void unsubscribeCarHardwareResult(int i, C15858l c15858l);

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static abstract class Stub extends Binder implements ICarHardwareHost {
        static final int TRANSACTION_getCarHardwareResult = 2;
        static final int TRANSACTION_subscribeCarHardwareResult = 3;
        static final int TRANSACTION_unsubscribeCarHardwareResult = 4;

        /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
        public static class Proxy implements ICarHardwareHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void getCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(c15858l, 0);
                    parcelObtain.writeStrongInterface(iCarHardwareResult);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void subscribeCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(c15858l, 0);
                    parcelObtain.writeStrongInterface(iCarHardwareResult);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void unsubscribeCarHardwareResult(int i, C15858l c15858l) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(c15858l, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareHost.DESCRIPTOR);
        }

        public static ICarHardwareHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICarHardwareHost.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICarHardwareHost)) ? new Proxy(iBinder) : (ICarHardwareHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICarHardwareHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                getCarHardwareResult(parcel.readInt(), (C15858l) parcel.readTypedObject(C15858l.CREATOR), ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                subscribeCarHardwareResult(parcel.readInt(), (C15858l) parcel.readTypedObject(C15858l.CREATOR), ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                unsubscribeCarHardwareResult(parcel.readInt(), (C15858l) parcel.readTypedObject(C15858l.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class Default implements ICarHardwareHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void unsubscribeCarHardwareResult(int i, C15858l c15858l) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void getCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void subscribeCarHardwareResult(int i, C15858l c15858l, ICarHardwareResult iCarHardwareResult) {
        }
    }
}
