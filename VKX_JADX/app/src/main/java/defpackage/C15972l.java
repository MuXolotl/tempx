package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15972l extends AbstractC9453l {
    public static final Parcelable.Creator<C15972l> CREATOR = new C5422l(26);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f31347l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f31348l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f31349l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f31350l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f31351l;

    public C15972l(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f31349l = bArr;
        this.f31348l = bArr2;
        this.f31347l = bArr3;
        this.f31351l = bArr4;
        this.f31350l = bArr5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15972l) {
            C15972l c15972l = (C15972l) obj;
            if (Arrays.equals(this.f31349l, c15972l.f31349l) && Arrays.equals(this.f31348l, c15972l.f31348l) && Arrays.equals(this.f31347l, c15972l.f31347l) && Arrays.equals(this.f31351l, c15972l.f31351l) && Arrays.equals(this.f31350l, c15972l.f31350l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31349l)), Integer.valueOf(Arrays.hashCode(this.f31348l)), Integer.valueOf(Arrays.hashCode(this.f31347l)), Integer.valueOf(Arrays.hashCode(this.f31351l)), Integer.valueOf(Arrays.hashCode(this.f31350l))});
    }

    public final String toString() {
        String string;
        byte[] bArr = this.f31349l;
        if (bArr != null && bArr.length == 6) {
            StringBuilder sb = new StringBuilder(18);
            int i = 0;
            for (int i2 = 0; i2 < 6; i2++) {
                byte b = bArr[i2];
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            string = sb.toString();
            while (true) {
                int length = string.length();
                if (i >= length) {
                    break;
                }
                char cCharAt = string.charAt(i);
                if (cCharAt >= 'a' && cCharAt <= 'z') {
                    char[] charArray = string.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (c >= 'a' && c <= 'z') {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    string = String.valueOf(charArray);
                    break;
                }
                i++;
            }
        } else {
            string = null;
        }
        byte[] bArr2 = this.f31348l;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f31347l;
        Integer numValueOf2 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.f31351l;
        Integer numValueOf3 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.f31350l;
        return "BleConnectivityInfo:<bleMacAddress hash: " + string + ", bleGattCharacteristic hash: " + numValueOf + ", actions hash: " + numValueOf2 + ", psm hash: " + numValueOf3 + ", deviceToken hash : " + (bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        byte[] bArr = this.f31349l;
        AbstractC9968l.billing(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f31348l;
        AbstractC9968l.billing(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f31347l;
        AbstractC9968l.billing(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone());
        byte[] bArr4 = this.f31351l;
        AbstractC9968l.billing(parcel, 4, bArr4 == null ? null : (byte[]) bArr4.clone());
        byte[] bArr5 = this.f31350l;
        AbstractC9968l.billing(parcel, 5, bArr5 != null ? (byte[]) bArr5.clone() : null);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
