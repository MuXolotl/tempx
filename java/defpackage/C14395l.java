package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lٓۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14395l implements InterfaceC3669l {
    public IBinder purchase;

    @Override // defpackage.InterfaceC3669l
    public final int appmetrica(InterfaceC6779l interfaceC6779l, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC3669l.loadAd);
            parcelObtain.writeStrongInterface(interfaceC6779l);
            parcelObtain.writeString(str);
            this.purchase.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC3669l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final void mo1408l(int i, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC3669l.loadAd);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.purchase.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3669l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final void mo1409l(InterfaceC6779l interfaceC6779l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC3669l.loadAd);
            parcelObtain.writeStrongInterface(interfaceC6779l);
            parcelObtain.writeInt(i);
            this.purchase.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
