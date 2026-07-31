package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lَؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7441l extends AbstractC9453l {
    public static final Parcelable.Creator<C7441l> CREATOR = new C18485l(2);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final byte[] f15400l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13632l f15401l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC11948l f15402l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f15403l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6534l f15404l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC8051l f15405l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f15406l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f15407l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f15408l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C8495l f15409l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10119l f15410l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f15411l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C9369l f15412l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f15413l;

    public C7441l(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, C10119l c10119l, int i, C9369l c9369l, C8495l c8495l, byte[] bArr3, String str3) {
        InterfaceC8051l c9869l;
        C6534l c6534l;
        C13632l c13632l;
        InterfaceC11948l c3807l = null;
        if (iBinder == null) {
            c9869l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            c9869l = iInterfaceQueryLocalInterface instanceof InterfaceC8051l ? (InterfaceC8051l) iInterfaceQueryLocalInterface : new C9869l(iBinder);
        }
        if (iBinder2 == null) {
            c6534l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            c6534l = iInterfaceQueryLocalInterface2 instanceof C6534l ? (C6534l) iInterfaceQueryLocalInterface2 : new C6534l(iBinder2);
        }
        if (iBinder3 == null) {
            c13632l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            c13632l = iInterfaceQueryLocalInterface3 instanceof C13632l ? (C13632l) iInterfaceQueryLocalInterface3 : new C13632l(iBinder3, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener", 4);
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            c3807l = iInterfaceQueryLocalInterface4 instanceof InterfaceC11948l ? (InterfaceC11948l) iInterfaceQueryLocalInterface4 : new C3807l(iBinder4);
        }
        this.f15405l = c9869l;
        this.f15404l = c6534l;
        this.f15401l = c13632l;
        this.f15408l = str;
        this.f15407l = str2;
        this.f15411l = bArr;
        this.f15402l = c3807l;
        this.f15403l = bArr2;
        this.f15410l = c10119l;
        this.f15406l = i;
        this.f15412l = c9369l;
        this.f15409l = c8495l;
        this.f15400l = bArr3;
        this.f15413l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7441l) {
            C7441l c7441l = (C7441l) obj;
            if (AbstractC7236l.amazon(this.f15405l, c7441l.f15405l) && AbstractC7236l.amazon(this.f15404l, c7441l.f15404l) && AbstractC7236l.amazon(this.f15401l, c7441l.f15401l) && AbstractC7236l.amazon(this.f15408l, c7441l.f15408l) && AbstractC7236l.amazon(this.f15407l, c7441l.f15407l) && Arrays.equals(this.f15411l, c7441l.f15411l) && AbstractC7236l.amazon(this.f15402l, c7441l.f15402l) && Arrays.equals(this.f15403l, c7441l.f15403l) && AbstractC7236l.amazon(this.f15410l, c7441l.f15410l) && AbstractC7236l.amazon(Integer.valueOf(this.f15406l), Integer.valueOf(c7441l.f15406l)) && AbstractC7236l.amazon(this.f15412l, c7441l.f15412l) && AbstractC7236l.amazon(this.f15409l, c7441l.f15409l) && Arrays.equals(this.f15400l, c7441l.f15400l) && AbstractC7236l.amazon(this.f15413l, c7441l.f15413l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15405l, this.f15404l, this.f15401l, this.f15408l, this.f15407l, Integer.valueOf(Arrays.hashCode(this.f15411l)), this.f15402l, Integer.valueOf(Arrays.hashCode(this.f15403l)), this.f15410l, Integer.valueOf(this.f15406l), this.f15412l, this.f15409l, Integer.valueOf(Arrays.hashCode(this.f15400l)), this.f15413l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        InterfaceC8051l interfaceC8051l = this.f15405l;
        AbstractC9968l.admob(parcel, 1, interfaceC8051l == null ? null : interfaceC8051l.asBinder());
        C6534l c6534l = this.f15404l;
        AbstractC9968l.admob(parcel, 2, c6534l == null ? null : c6534l.billing);
        C13632l c13632l = this.f15401l;
        AbstractC9968l.admob(parcel, 3, c13632l == null ? null : c13632l.billing);
        AbstractC9968l.vip(parcel, 4, this.f15408l);
        AbstractC9968l.vip(parcel, 5, this.f15407l);
        AbstractC9968l.billing(parcel, 6, this.f15411l);
        InterfaceC11948l interfaceC11948l = this.f15402l;
        AbstractC9968l.admob(parcel, 7, interfaceC11948l != null ? interfaceC11948l.asBinder() : null);
        AbstractC9968l.billing(parcel, 8, this.f15403l);
        AbstractC9968l.remoteconfig(parcel, 9, this.f15410l, i);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f15406l);
        AbstractC9968l.remoteconfig(parcel, 11, this.f15412l, i);
        AbstractC9968l.billing(parcel, 12, this.f15400l);
        AbstractC9968l.vip(parcel, 13, this.f15413l);
        AbstractC9968l.remoteconfig(parcel, 14, this.f15409l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C7441l() {
        this.f15406l = 0;
    }
}
