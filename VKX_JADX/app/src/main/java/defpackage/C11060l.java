package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lُٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11060l extends AbstractC9453l {
    public static final Parcelable.Creator<C11060l> CREATOR = new C5422l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f22255l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8495l f22256l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f22257l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f22258l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f22259l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BluetoothDevice f22260l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f22261l;

    public C11060l(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, C8495l c8495l) {
        this.f22258l = str;
        this.f22257l = str2;
        this.f22255l = str3;
        this.f22260l = bluetoothDevice;
        this.f22259l = bArr;
        this.f22261l = i;
        this.f22256l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11060l) {
            C11060l c11060l = (C11060l) obj;
            if (AbstractC7236l.amazon(this.f22258l, c11060l.f22258l) && AbstractC7236l.amazon(this.f22257l, c11060l.f22257l) && AbstractC7236l.amazon(this.f22255l, c11060l.f22255l) && AbstractC7236l.amazon(this.f22260l, c11060l.f22260l) && Arrays.equals(this.f22259l, c11060l.f22259l) && AbstractC7236l.amazon(Integer.valueOf(this.f22261l), Integer.valueOf(c11060l.f22261l)) && AbstractC7236l.amazon(this.f22256l, c11060l.f22256l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22258l, this.f22257l, this.f22255l, this.f22260l, Integer.valueOf(Arrays.hashCode(this.f22259l)), Integer.valueOf(this.f22261l), this.f22256l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f22258l);
        AbstractC9968l.vip(parcel, 2, this.f22257l);
        AbstractC9968l.vip(parcel, 3, this.f22255l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f22260l, i);
        AbstractC9968l.billing(parcel, 5, this.f22259l);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f22261l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f22256l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
