package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؘْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13173l extends AbstractC9453l {
    public static final Parcelable.Creator<C13173l> CREATOR = new C5422l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f25780l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f25781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f25782l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f25783l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f25784l;

    public C13173l(int i, int i2, int i3, int i4, long j) {
        this.f25782l = i;
        this.f25781l = i2;
        this.f25780l = i3;
        this.f25784l = i4;
        this.f25783l = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f25782l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f25781l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f25780l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f25784l);
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(this.f25783l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
