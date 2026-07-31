package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: l٘ٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17913l extends AbstractC9453l {
    public static final Parcelable.Creator<C17913l> CREATOR = new C13546l(26);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f34873l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34874l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34875l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f34876l;

    public C17913l(int i, int i2, int i3, boolean z) {
        this.f34875l = i;
        this.f34874l = i2;
        this.f34873l = i3;
        this.f34876l = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17913l)) {
            return false;
        }
        C17913l c17913l = (C17913l) obj;
        return this.f34875l == c17913l.f34875l && this.f34874l == c17913l.f34874l && this.f34873l == c17913l.f34873l && this.f34876l == c17913l.f34876l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34875l), Integer.valueOf(this.f34874l), Integer.valueOf(this.f34873l), Boolean.valueOf(this.f34876l)});
    }

    public final String toString() {
        int i = this.f34875l;
        int length = String.valueOf(i).length();
        int i2 = this.f34874l;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f34873l;
        int length3 = String.valueOf(i3).length();
        boolean z = this.f34876l;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f34875l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f34874l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f34873l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f34876l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
