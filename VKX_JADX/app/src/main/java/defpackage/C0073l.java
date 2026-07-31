package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lؑؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0073l implements InterfaceC0041l {
    public IBinder purchase;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC0041l
    /* JADX INFO: renamed from: lؙؗٗ */
    public final void mo249l(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0041l.amazon);
            parcelObtain.writeInt(i);
            parcelObtain.writeTypedObject(bundle, 0);
            this.purchase.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
