package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3133l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6733l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f6734l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6735l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C0022l f6732l = new C0022l("VideoInfo", null);
    public static final Parcelable.Creator<C3133l> CREATOR = new C5422l(8);

    public C3133l(int i, int i2, int i3) {
        this.f6735l = i;
        this.f6734l = i2;
        this.f6733l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3133l)) {
            return false;
        }
        C3133l c3133l = (C3133l) obj;
        return this.f6734l == c3133l.f6734l && this.f6735l == c3133l.f6735l && this.f6733l == c3133l.f6733l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6734l), Integer.valueOf(this.f6735l), Integer.valueOf(this.f6733l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f6735l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f6734l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f6733l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
