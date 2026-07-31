package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lًٝؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8142l extends AbstractC9453l {
    public static final Parcelable.Creator<C8142l> CREATOR = new C15160l(10);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f17025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f17026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f17027l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f17028l;

    public C8142l(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f17027l = bArr;
        this.f17026l = bArr2;
        this.f17025l = bArr3;
        this.f17028l = bArr4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8142l) {
            C8142l c8142l = (C8142l) obj;
            if (Arrays.equals(this.f17027l, c8142l.f17027l) && Arrays.equals(this.f17026l, c8142l.f17026l) && Arrays.equals(this.f17025l, c8142l.f17025l) && Arrays.equals(this.f17028l, c8142l.f17028l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f17027l)), Integer.valueOf(Arrays.hashCode(this.f17026l)), Integer.valueOf(Arrays.hashCode(this.f17025l)), Integer.valueOf(Arrays.hashCode(this.f17028l))});
    }

    public final String toString() {
        int iHashCode = Arrays.hashCode(this.f17027l);
        int iHashCode2 = Arrays.hashCode(this.f17026l);
        int iHashCode3 = Arrays.hashCode(this.f17025l);
        int iHashCode4 = Arrays.hashCode(this.f17028l);
        StringBuilder sbSubscription = AbstractC14814l.subscription(iHashCode, iHashCode2, "WifiLanConnectivityInfo:<wifiLanPort hash: ", ">, <wifiLanIp hash: ", ">, <BSSID hash: ");
        sbSubscription.append(iHashCode3);
        sbSubscription.append(">, <actions hash: ");
        sbSubscription.append(iHashCode4);
        sbSubscription.append(">");
        return sbSubscription.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        byte[] bArr = this.f17027l;
        AbstractC9968l.billing(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f17026l;
        AbstractC9968l.billing(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f17025l;
        AbstractC9968l.billing(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone());
        byte[] bArr4 = this.f17028l;
        AbstractC9968l.billing(parcel, 4, bArr4 != null ? (byte[]) bArr4.clone() : null);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
