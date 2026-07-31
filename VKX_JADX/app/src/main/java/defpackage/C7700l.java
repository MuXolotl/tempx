package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lًٟؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7700l extends AbstractC9453l {
    public static final Parcelable.Creator<C7700l> CREATOR = new C15160l(6);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f16170l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16171l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f16172l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7700l) {
            C7700l c7700l = (C7700l) obj;
            if (Arrays.equals(this.f16172l, c7700l.f16172l) && AbstractC7236l.amazon(Integer.valueOf(this.f16171l), Integer.valueOf(c7700l.f16171l)) && AbstractC7236l.amazon(Integer.valueOf(this.f16170l), Integer.valueOf(c7700l.f16170l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f16172l)), Integer.valueOf(this.f16171l), Integer.valueOf(this.f16170l)});
    }

    public final String toString() {
        String string = Arrays.toString(this.f16172l);
        int i = this.f16171l;
        int i2 = this.f16170l;
        StringBuilder sb = new StringBuilder("UwbSenderInfo{address=");
        sb.append(string);
        sb.append(", channel=");
        sb.append(i);
        sb.append(", preambleIndex=");
        return AbstractC14814l.remoteconfig(i2, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.billing(parcel, 1, this.f16172l);
        int i2 = this.f16171l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.f16170l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i3);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
