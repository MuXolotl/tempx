package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8745l extends AbstractC9453l {
    public static final Parcelable.Creator<C8745l> CREATOR = new C15160l(23);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f18001l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C9369l f18002l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8495l f18003l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6534l f18004l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC8051l f18005l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC15885l f18006l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f18007l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f18008l;

    public C8745l(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, C9369l c9369l, C8495l c8495l) {
        InterfaceC8051l c9869l;
        C6534l c6534l;
        InterfaceC15885l c16885l = null;
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
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            c16885l = iInterfaceQueryLocalInterface3 instanceof InterfaceC15885l ? (InterfaceC15885l) iInterfaceQueryLocalInterface3 : new C16885l(iBinder3, "com.google.android.gms.nearby.internal.connection.IPayloadListener", 4);
        }
        this.f18005l = c9869l;
        this.f18004l = c6534l;
        this.f18001l = str;
        this.f18007l = bArr;
        this.f18006l = c16885l;
        this.f18008l = i;
        this.f18002l = c9369l;
        this.f18003l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8745l) {
            C8745l c8745l = (C8745l) obj;
            if (AbstractC7236l.amazon(this.f18005l, c8745l.f18005l) && AbstractC7236l.amazon(this.f18004l, c8745l.f18004l) && AbstractC7236l.amazon(this.f18001l, c8745l.f18001l) && Arrays.equals(this.f18007l, c8745l.f18007l) && AbstractC7236l.amazon(this.f18006l, c8745l.f18006l) && AbstractC7236l.amazon(Integer.valueOf(this.f18008l), Integer.valueOf(c8745l.f18008l)) && AbstractC7236l.amazon(this.f18002l, c8745l.f18002l) && AbstractC7236l.amazon(this.f18003l, c8745l.f18003l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18005l, this.f18004l, this.f18001l, Integer.valueOf(Arrays.hashCode(this.f18007l)), this.f18006l, Integer.valueOf(this.f18008l), this.f18002l, this.f18003l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        InterfaceC8051l interfaceC8051l = this.f18005l;
        AbstractC9968l.admob(parcel, 1, interfaceC8051l == null ? null : interfaceC8051l.asBinder());
        C6534l c6534l = this.f18004l;
        AbstractC9968l.admob(parcel, 2, c6534l == null ? null : c6534l.billing);
        AbstractC9968l.vip(parcel, 3, this.f18001l);
        AbstractC9968l.billing(parcel, 4, this.f18007l);
        InterfaceC15885l interfaceC15885l = this.f18006l;
        AbstractC9968l.admob(parcel, 5, interfaceC15885l != null ? interfaceC15885l.asBinder() : null);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f18008l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f18002l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f18003l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C8745l() {
        this.f18008l = 0;
    }
}
