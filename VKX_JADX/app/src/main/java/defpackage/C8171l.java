package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًٞ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8171l extends AbstractC9453l {
    public static final Parcelable.Creator<C8171l> CREATOR = new C5422l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f17053l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f17054l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f17055l;

    public C8171l(int i, boolean z, boolean z2) {
        this.f17055l = z;
        this.f17054l = z2;
        this.f17053l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f17055l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f17054l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f17053l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
