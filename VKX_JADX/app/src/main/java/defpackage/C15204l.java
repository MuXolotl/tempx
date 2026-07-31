package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15204l extends AbstractC9453l {
    public static final Parcelable.Creator<C15204l> CREATOR = new C5422l(12);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f29805l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f29806l;

    public C15204l(boolean z, int i) {
        this.f29806l = z;
        this.f29805l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f29806l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f29805l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
