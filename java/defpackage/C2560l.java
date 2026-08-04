package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lِؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2560l extends AbstractC9453l {
    public static final Parcelable.Creator<C2560l> CREATOR = new C15160l(2);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public double f5567l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public double f5568l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        double d = this.f5568l;
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f5567l;
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeDouble(d2);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
