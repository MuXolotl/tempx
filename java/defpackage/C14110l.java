package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lّٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14110l implements IInterface {
    public final IBinder purchase;

    public C14110l(IBinder iBinder) {
        this.purchase = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    public final void crashlytics(BinderC14935l binderC14935l, C7613l c7613l) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC14935l);
            parcelObtain.writeInt(1);
            C18485l.yandex(c7613l, parcelObtain, 0);
            this.purchase.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
