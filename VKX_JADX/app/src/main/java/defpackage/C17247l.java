package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٗٛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17247l extends AbstractC9453l {
    public static final Parcelable.Creator<C17247l> CREATOR = new C13546l(10);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final double f33471l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final double f33472l;

    public C17247l(double d, double d2) {
        this.f33472l = d;
        this.f33471l = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeDouble(this.f33472l);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeDouble(this.f33471l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
