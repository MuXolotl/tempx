package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٓٚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14235l extends AbstractC9453l {
    public static final Parcelable.Creator<C14235l> CREATOR = new C15160l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f27833l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f27834l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f27835l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f27836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f27837l;

    public C14235l(int i, int i2, int i3, int i4, long j) {
        this.f27835l = i;
        this.f27834l = i2;
        this.f27833l = i3;
        this.f27837l = j;
        this.f27836l = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f27835l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f27834l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f27833l);
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(this.f27837l);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f27836l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
