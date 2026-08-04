package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lًِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7971l implements InterfaceC3145l {
    public IBinder purchase;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC3145l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final void mo1291l(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.purchase.transact(12, parcelObtain, null, 1)) {
                int i2 = BinderC18564l.billing;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3145l
    public final void subs(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.purchase.transact(9, parcelObtain, null, 1)) {
                int i2 = BinderC18564l.billing;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3145l
    public final void subscription(C16830l c16830l) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            c16830l.writeToParcel(parcelObtain, 0);
            if (!this.purchase.transact(3, parcelObtain, null, 1)) {
                int i = BinderC18564l.billing;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
