package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lُٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC15611l extends AbstractBinderC17401l implements InterfaceC11106l {
    public static InterfaceC11106l asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC11106l ? (InterfaceC11106l) iInterfaceQueryLocalInterface : new C1103l(iBinder);
    }

    @Override // defpackage.AbstractBinderC17401l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcel.readStrongBinder());
        C15194l c15194l = (C15194l) AbstractC12343l.yandex(parcel, C15194l.CREATOR);
        AbstractC12343l.loadAd(parcel);
        IInterface iInterfaceNewBarcodeScanner = newBarcodeScanner(interfaceC3396lM3896l, c15194l);
        parcel2.writeNoException();
        if (iInterfaceNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
            return true;
        }
        parcel2.writeStrongBinder(((AbstractBinderC17401l) iInterfaceNewBarcodeScanner).asBinder());
        return true;
    }
}
