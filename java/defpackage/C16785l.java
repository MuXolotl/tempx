package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16785l extends AbstractC9453l {
    public static final Parcelable.Creator<C16785l> CREATOR = new C10538l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10602l f32791l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final IBinder f32792l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32793l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f32794l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f32795l;

    public C16785l(int i, IBinder iBinder, C10602l c10602l, boolean z, boolean z2) {
        this.f32793l = i;
        this.f32792l = iBinder;
        this.f32791l = c10602l;
        this.f32795l = z;
        this.f32794l = z2;
    }

    public final boolean equals(Object obj) {
        Object c1548l;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16785l)) {
            return false;
        }
        C16785l c16785l = (C16785l) obj;
        if (!this.f32791l.equals(c16785l.f32791l)) {
            return false;
        }
        Object c1548l2 = null;
        IBinder iBinder = this.f32792l;
        if (iBinder == null) {
            c1548l = null;
        } else {
            int i = AbstractBinderC14321l.billing;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c1548l = iInterfaceQueryLocalInterface instanceof InterfaceC12652l ? (InterfaceC12652l) iInterfaceQueryLocalInterface : new C1548l(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = c16785l.f32792l;
        if (iBinder2 != null) {
            int i2 = AbstractBinderC14321l.billing;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c1548l2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC12652l ? (InterfaceC12652l) iInterfaceQueryLocalInterface2 : new C1548l(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return AbstractC7236l.amazon(c1548l, c1548l2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f32793l);
        AbstractC9968l.admob(parcel, 2, this.f32792l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f32791l, i);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f32795l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f32794l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
