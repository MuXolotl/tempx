package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lٜ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18056l implements InterfaceC17765l {
    public IBinder purchase;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17765l
    /* JADX INFO: renamed from: lْۥٞ */
    public final void mo2184l(InterfaceC1087l interfaceC1087l, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.purchase.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
