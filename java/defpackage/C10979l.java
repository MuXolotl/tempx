package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lُُۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10979l implements InterfaceC10867l {
    public IBinder purchase;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: finally */
    public final void mo1135finally(InterfaceC3145l interfaceC3145l) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((BinderC18564l) interfaceC3145l);
            if (!this.purchase.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: lؙؔؑ */
    public final void mo1136l(InterfaceC3145l interfaceC3145l) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((BinderC18564l) interfaceC3145l);
            if (!this.purchase.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final boolean mo1137l() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.purchase.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final int mo1138l() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.purchase.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC10867l
    public final int mopub() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.purchase.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC10867l
    public final C16830l purchase() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.purchase.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i = BinderC2430l.billing;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? C16830l.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
