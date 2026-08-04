package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8175l extends AbstractC9453l {
    public static final Parcelable.Creator<C8175l> CREATOR = new C1800l(10);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f17068l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f17069l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f17070l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f17071l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f17072l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f17073l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f17074l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17075l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f17072l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.f17071l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.f17068l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.f17074l;
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.f17073l;
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.f17075l;
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.f17069l;
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.vip(parcel, 9, this.f17070l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
