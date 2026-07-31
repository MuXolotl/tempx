package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖ۠ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16674l extends AbstractC9453l {
    public static final Parcelable.Creator<C16674l> CREATOR = new C13546l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f32688l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f32689l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f32690l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f32691l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32692l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f32693l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f32694l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f32695l;

    public C16674l(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f32692l = i;
        this.f32691l = i2;
        this.f32688l = i3;
        this.f32694l = i4;
        this.f32693l = i5;
        this.f32695l = i6;
        this.f32689l = z;
        this.f32690l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f32692l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f32691l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f32688l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f32694l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f32693l);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f32695l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f32689l ? 1 : 0);
        AbstractC9968l.vip(parcel, 8, this.f32690l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
