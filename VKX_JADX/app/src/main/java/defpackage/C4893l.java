package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؚٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4893l extends AbstractC9453l {
    public static final Parcelable.Creator<C4893l> CREATOR = new C5422l(27);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f9982l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9983l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f9984l;

    public C4893l(int i, int i2, int i3) {
        this.f9984l = i;
        this.f9983l = i2;
        this.f9982l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f9984l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f9983l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f9982l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
