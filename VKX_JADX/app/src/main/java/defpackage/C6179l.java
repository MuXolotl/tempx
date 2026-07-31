package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6179l extends AbstractC9453l {
    public static final Parcelable.Creator<C6179l> CREATOR = new C18485l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f13025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f13026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f13027l;

    public C6179l(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f13027l = bArr;
        this.f13026l = bArr2;
        this.f13025l = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6179l) {
            C6179l c6179l = (C6179l) obj;
            if (Arrays.equals(this.f13027l, c6179l.f13027l) && Arrays.equals(this.f13026l, c6179l.f13026l) && Arrays.equals(this.f13025l, c6179l.f13025l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f13027l)), Integer.valueOf(Arrays.hashCode(this.f13026l)), Integer.valueOf(Arrays.hashCode(this.f13025l))});
    }

    public final String toString() {
        byte[] bArr = this.f13027l;
        Integer numValueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.f13026l;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f13025l;
        return "BluetoothConnectivityInfo:<bluetoothMacAddress hash: " + numValueOf + ", bluetoothUuid hash: " + numValueOf2 + ", actions hash: " + (bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        byte[] bArr = this.f13027l;
        AbstractC9968l.billing(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f13026l;
        AbstractC9968l.billing(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f13025l;
        AbstractC9968l.billing(parcel, 3, bArr3 != null ? (byte[]) bArr3.clone() : null);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
