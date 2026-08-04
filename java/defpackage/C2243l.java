package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؓۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2243l extends AbstractC9453l {
    public static final Parcelable.Creator<C2243l> CREATOR = new C15160l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f4924l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f4925l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f4926l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f4927l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2243l) {
            C2243l c2243l = (C2243l) obj;
            if (AbstractC7236l.amazon(Integer.valueOf(this.f4926l), Integer.valueOf(c2243l.f4926l)) && AbstractC7236l.amazon(Integer.valueOf(this.f4925l), Integer.valueOf(c2243l.f4925l)) && AbstractC7236l.amazon(Integer.valueOf(this.f4924l), Integer.valueOf(c2243l.f4924l)) && AbstractC7236l.amazon(Boolean.valueOf(this.f4927l), Boolean.valueOf(c2243l.f4927l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4926l), Integer.valueOf(this.f4925l), Integer.valueOf(this.f4924l), Boolean.valueOf(this.f4927l)});
    }

    public final String toString() {
        int i = this.f4926l;
        int i2 = this.f4925l;
        int i3 = this.f4924l;
        boolean z = this.f4927l;
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "UwbRangingData{rawDistance=", ", rawAngleOfArrivalAzimuth=", ", rawAngleOfArrivalPolar=");
        sbSubscription.append(i3);
        sbSubscription.append(", isValidAngleOfArrivalData=");
        sbSubscription.append(z);
        sbSubscription.append("}");
        return sbSubscription.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f4926l;
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f4925l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.f4924l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i4);
        boolean z = this.f4927l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
