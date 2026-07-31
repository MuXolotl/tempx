package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lُْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13292l extends AbstractC0895l implements InterfaceC13311l {
    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final C16199l m3627l(BinderC14844l binderC14844l, C15360l c15360l) {
        C16199l c16199l;
        Parcel parcelM743l = m743l();
        int i = AbstractC12306l.yandex;
        parcelM743l.writeStrongBinder(binderC14844l);
        parcelM743l.writeInt(1);
        c15360l.writeToParcel(parcelM743l, 0);
        Parcel parcelM746l = m746l(parcelM743l, 1);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        if (strongBinder == null) {
            c16199l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c16199l = iInterfaceQueryLocalInterface instanceof C16199l ? (C16199l) iInterfaceQueryLocalInterface : new C16199l(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 3);
        }
        parcelM746l.recycle();
        return c16199l;
    }
}
