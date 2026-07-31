package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٌؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8495l extends AbstractC9453l {
    public static final Parcelable.Creator<C8495l> CREATOR = new C1800l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f17554l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f17555l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f17556l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17557l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f17558l;

    public C8495l(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f17556l = str;
        this.f17555l = bArr;
        this.f17554l = bArr2;
        this.f17558l = bArr3;
        this.f17557l = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8495l) {
            C8495l c8495l = (C8495l) obj;
            if (AbstractC7236l.amazon(this.f17556l, c8495l.f17556l) && Arrays.equals(this.f17555l, c8495l.f17555l) && Arrays.equals(this.f17554l, c8495l.f17554l) && Arrays.equals(this.f17558l, c8495l.f17558l) && this.f17557l == c8495l.f17557l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17556l, Integer.valueOf(Arrays.hashCode(this.f17555l)), Integer.valueOf(Arrays.hashCode(this.f17554l)), Integer.valueOf(Arrays.hashCode(this.f17558l)), Integer.valueOf(this.f17557l)});
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f17555l;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f17558l;
        String string2 = bArr2 != null ? Arrays.toString(bArr2) : null;
        int i = this.f17557l;
        if (i == 0) {
            str = "UNKNOWN";
        } else if (i != 1) {
            str = i != 2 ? "OTHER" : "Secondary";
        } else {
            str = "Main";
        }
        return AbstractC9361l.advert(AbstractC14814l.license("ConnectionsDevice:<endpointId: ", this.f17556l, ", endpointInfo: ", string, ", connectivityBytes: "), string2, ", instanceType : ", str, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f17556l);
        byte[] bArr = this.f17555l;
        AbstractC9968l.billing(parcel, 2, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f17554l;
        AbstractC9968l.billing(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null);
        AbstractC9968l.billing(parcel, 4, this.f17558l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f17557l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
