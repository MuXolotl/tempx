package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17164l extends AbstractC9453l {
    public static final Parcelable.Creator<C17164l> CREATOR = new C1800l(21);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final double f33341l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final double f33342l;

    public C17164l(double d, double d2) {
        this.f33342l = d;
        this.f33341l = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeDouble(this.f33342l);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeDouble(this.f33341l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
