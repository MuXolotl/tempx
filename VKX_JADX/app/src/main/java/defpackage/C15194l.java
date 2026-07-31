package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15194l extends AbstractC9453l {
    public static final Parcelable.Creator<C15194l> CREATOR = new C13546l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f29789l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f29790l;

    public C15194l(int i, boolean z) {
        this.f29790l = i;
        this.f29789l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f29790l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f29789l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
