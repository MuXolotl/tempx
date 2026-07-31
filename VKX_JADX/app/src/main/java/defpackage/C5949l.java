package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًؘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5949l extends AbstractC9453l {
    public static final Parcelable.Creator<C5949l> CREATOR = new C15160l(24);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C16051l f12539l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f12540l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13115l f12541l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C9652l f12542l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f12543l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f12544l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C0008l f12545l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C8894l f12546l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Point[] f12547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f12548l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C17247l f12549l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C11703l f12550l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f12551l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C12330l f12552l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C15996l f12553l;

    public C5949l(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C13115l c13115l, C9652l c9652l, C11703l c11703l, C0008l c0008l, C12330l c12330l, C17247l c17247l, C16051l c16051l, C15996l c15996l, C8894l c8894l) {
        this.f12544l = i;
        this.f12543l = str;
        this.f12540l = str2;
        this.f12548l = bArr;
        this.f12547l = pointArr;
        this.f12551l = i2;
        this.f12541l = c13115l;
        this.f12542l = c9652l;
        this.f12550l = c11703l;
        this.f12545l = c0008l;
        this.f12552l = c12330l;
        this.f12549l = c17247l;
        this.f12539l = c16051l;
        this.f12553l = c15996l;
        this.f12546l = c8894l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f12544l);
        AbstractC9968l.vip(parcel, 2, this.f12543l);
        AbstractC9968l.vip(parcel, 3, this.f12540l);
        AbstractC9968l.billing(parcel, 4, this.f12548l);
        AbstractC9968l.adcel(parcel, 5, this.f12547l, i);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f12551l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f12541l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f12542l, i);
        AbstractC9968l.remoteconfig(parcel, 9, this.f12550l, i);
        AbstractC9968l.remoteconfig(parcel, 10, this.f12545l, i);
        AbstractC9968l.remoteconfig(parcel, 11, this.f12552l, i);
        AbstractC9968l.remoteconfig(parcel, 12, this.f12549l, i);
        AbstractC9968l.remoteconfig(parcel, 13, this.f12539l, i);
        AbstractC9968l.remoteconfig(parcel, 14, this.f12553l, i);
        AbstractC9968l.remoteconfig(parcel, 15, this.f12546l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
