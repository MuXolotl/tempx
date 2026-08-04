package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: lؖۢۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4465l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12332l f9090l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f9091l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f9092l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f9093l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16657l f9094l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f9095l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C0022l f9089l = new C0022l("CastMediaOptions", null);
    public static final Parcelable.Creator<C4465l> CREATOR = new C10538l(28);

    public C4465l(String str, String str2, IBinder iBinder, C16657l c16657l, boolean z, boolean z2) {
        C12332l c12332l;
        this.f9092l = str;
        this.f9091l = str2;
        if (iBinder == null) {
            c12332l = null;
        } else {
            String str3 = "com.google.android.gms.cast.framework.media.IImagePicker";
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c12332l = iInterfaceQueryLocalInterface instanceof C12332l ? (C12332l) iInterfaceQueryLocalInterface : new C12332l(iBinder, str3, 1);
        }
        this.f9090l = c12332l;
        this.f9094l = c16657l;
        this.f9093l = z;
        this.f9095l = z2;
    }

    public final void billing() {
        C12332l c12332l = this.f9090l;
        if (c12332l != null) {
            try {
                Parcel parcelM746l = c12332l.m746l(c12332l.m743l(), 2);
                InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM746l.readStrongBinder());
                parcelM746l.recycle();
                if (BinderC14844l.m3897l(interfaceC3396lM3896l) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                f9089l.yandex(e, "Unable to call %s on %s.", "getWrappedClientObject", C12332l.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f9092l);
        AbstractC9968l.vip(parcel, 3, this.f9091l);
        C12332l c12332l = this.f9090l;
        AbstractC9968l.admob(parcel, 4, c12332l == null ? null : c12332l.billing);
        AbstractC9968l.remoteconfig(parcel, 5, this.f9094l, i);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f9093l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f9095l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
