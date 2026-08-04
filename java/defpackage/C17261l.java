package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٜٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17261l extends AbstractC9453l {
    public static final Parcelable.Creator<C17261l> CREATOR = new C15160l(14);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f33489l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33490l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f33491l;

    public C17261l(int i, long j, long j2) {
        this.f33491l = j;
        this.f33490l = i;
        this.f33489l = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(this.f33491l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f33490l);
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(this.f33489l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
