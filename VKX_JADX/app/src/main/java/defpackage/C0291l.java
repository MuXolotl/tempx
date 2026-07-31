package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lُْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0291l extends AbstractC9453l {
    public static final Parcelable.Creator<C0291l> CREATOR = new C1800l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f1335l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f1336l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f1337l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1338l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f1339l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f1340l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f1341l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f1342l;

    public C0291l(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f1339l = i;
        this.f1338l = i2;
        this.f1335l = i3;
        this.f1341l = i4;
        this.f1340l = i5;
        this.f1342l = i6;
        this.f1336l = z;
        this.f1337l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f1339l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f1338l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f1335l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f1341l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f1340l);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f1342l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f1336l ? 1 : 0);
        AbstractC9968l.vip(parcel, 8, this.f1337l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
