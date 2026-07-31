package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* JADX INFO: renamed from: lّۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12808l extends AbstractC0895l implements IInterface {
    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public final InterfaceC2695l m3502l(C12100l c12100l, InterfaceC3396l interfaceC3396l, BinderC3285l binderC3285l) {
        InterfaceC2695l c17513l;
        Parcel parcelM743l = m743l();
        AbstractC14627l.loadAd(parcelM743l, c12100l);
        AbstractC14627l.crashlytics(parcelM743l, interfaceC3396l);
        AbstractC14627l.crashlytics(parcelM743l, binderC3285l);
        Parcel parcelM746l = m746l(parcelM743l, 3);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i = AbstractBinderC10421l.billing;
        if (strongBinder == null) {
            c17513l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            c17513l = iInterfaceQueryLocalInterface instanceof InterfaceC2695l ? (InterfaceC2695l) iInterfaceQueryLocalInterface : new C17513l(strongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        parcelM746l.recycle();
        return c17513l;
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public final InterfaceC9741l m3503l(BinderC14844l binderC14844l, InterfaceC3396l interfaceC3396l, InterfaceC3396l interfaceC3396l2) {
        InterfaceC9741l c1942l;
        Parcel parcelM743l = m743l();
        AbstractC14627l.crashlytics(parcelM743l, binderC14844l);
        AbstractC14627l.crashlytics(parcelM743l, interfaceC3396l);
        AbstractC14627l.crashlytics(parcelM743l, interfaceC3396l2);
        Parcel parcelM746l = m746l(parcelM743l, 5);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i = AbstractBinderC16481l.billing;
        if (strongBinder == null) {
            c1942l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            c1942l = iInterfaceQueryLocalInterface instanceof InterfaceC9741l ? (InterfaceC9741l) iInterfaceQueryLocalInterface : new C1942l(strongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        parcelM746l.recycle();
        return c1942l;
    }

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public final InterfaceC12267l m3504l(BinderC14844l binderC14844l, BinderC3285l binderC3285l, int i, int i2) {
        InterfaceC12267l c10214l;
        Parcel parcelM743l = m743l();
        AbstractC14627l.crashlytics(parcelM743l, binderC14844l);
        AbstractC14627l.crashlytics(parcelM743l, binderC3285l);
        parcelM743l.writeInt(i);
        parcelM743l.writeInt(i2);
        parcelM743l.writeInt(0);
        parcelM743l.writeLong(2097152L);
        parcelM743l.writeInt(5);
        parcelM743l.writeInt(333);
        parcelM743l.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelM746l = m746l(parcelM743l, 6);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i3 = AbstractBinderC13184l.billing;
        if (strongBinder == null) {
            c10214l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            c10214l = iInterfaceQueryLocalInterface instanceof InterfaceC12267l ? (InterfaceC12267l) iInterfaceQueryLocalInterface : new C10214l(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        parcelM746l.recycle();
        return c10214l;
    }

    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public final InterfaceC12267l m3505l(BinderC14844l binderC14844l, BinderC14844l binderC14844l2, BinderC3285l binderC3285l, int i, int i2) {
        InterfaceC12267l c10214l;
        Parcel parcelM743l = m743l();
        AbstractC14627l.crashlytics(parcelM743l, binderC14844l);
        AbstractC14627l.crashlytics(parcelM743l, binderC14844l2);
        AbstractC14627l.crashlytics(parcelM743l, binderC3285l);
        parcelM743l.writeInt(i);
        parcelM743l.writeInt(i2);
        parcelM743l.writeInt(0);
        parcelM743l.writeLong(2097152L);
        parcelM743l.writeInt(5);
        parcelM743l.writeInt(333);
        parcelM743l.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelM746l = m746l(parcelM743l, 7);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i3 = AbstractBinderC13184l.billing;
        if (strongBinder == null) {
            c10214l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            c10214l = iInterfaceQueryLocalInterface instanceof InterfaceC12267l ? (InterfaceC12267l) iInterfaceQueryLocalInterface : new C10214l(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        parcelM746l.recycle();
        return c10214l;
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final InterfaceC13996l m3506l(String str, String str2, BinderC3285l binderC3285l) {
        InterfaceC13996l c10679l;
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC14627l.crashlytics(parcelM743l, binderC3285l);
        Parcel parcelM746l = m746l(parcelM743l, 2);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i = AbstractBinderC12982l.billing;
        if (strongBinder == null) {
            c10679l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            c10679l = iInterfaceQueryLocalInterface instanceof InterfaceC13996l ? (InterfaceC13996l) iInterfaceQueryLocalInterface : new C10679l(strongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        parcelM746l.recycle();
        return c10679l;
    }
}
