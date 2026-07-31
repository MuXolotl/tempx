package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٗۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17468l extends AbstractC9453l {
    public static final Parcelable.Creator<C17468l> CREATOR = new C1800l(8);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C13063l f34021l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f34022l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C8992l f34023l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C0050l f34024l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f34025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f34026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f34027l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public double f34028l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C7245l f34029l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public byte[] f34030l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Point[] f34031l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f34032l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C6174l f34033l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C3172l f34034l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C17118l f34035l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C2560l f34036l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C6580l f34037l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f34027l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.vip(parcel, 3, this.f34026l);
        AbstractC9968l.vip(parcel, 4, this.f34022l);
        int i3 = this.f34032l;
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(i3);
        AbstractC9968l.adcel(parcel, 6, this.f34031l, i);
        AbstractC9968l.remoteconfig(parcel, 7, this.f34035l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f34023l, i);
        AbstractC9968l.remoteconfig(parcel, 9, this.f34024l, i);
        AbstractC9968l.remoteconfig(parcel, 10, this.f34034l, i);
        AbstractC9968l.remoteconfig(parcel, 11, this.f34029l, i);
        AbstractC9968l.remoteconfig(parcel, 12, this.f34036l, i);
        AbstractC9968l.remoteconfig(parcel, 13, this.f34033l, i);
        AbstractC9968l.remoteconfig(parcel, 14, this.f34021l, i);
        AbstractC9968l.remoteconfig(parcel, 15, this.f34037l, i);
        AbstractC9968l.billing(parcel, 16, this.f34030l);
        boolean z = this.f34025l;
        AbstractC9968l.subscription(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.f34028l;
        AbstractC9968l.subscription(parcel, 18, 8);
        parcel.writeDouble(d);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
