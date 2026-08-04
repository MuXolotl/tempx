package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lؙۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6847l extends Binder implements InterfaceC0041l {
    public static final /* synthetic */ int billing = 0;
    public final /* synthetic */ C1102l purchase;

    public BinderC6847l(C1102l c1102l) {
        this.purchase = c1102l;
        attachInterface(this, InterfaceC0041l.amazon);
    }

    @Override // defpackage.InterfaceC0041l
    /* JADX INFO: renamed from: lؙؗٗ */
    public final void mo249l(int i, Bundle bundle) {
        this.purchase.yandex(i, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0041l.amazon;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo249l(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
