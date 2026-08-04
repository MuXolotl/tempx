package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٍؘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3212l extends AbstractC9453l {
    public static final Parcelable.Creator<C3212l> CREATOR = new C1800l(15);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C1959l f6887l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f6888l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13426l f6889l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C3261l f6890l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f6891l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6892l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C16516l f6893l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C14763l f6894l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Point[] f6895l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f6896l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C17164l f6897l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C6350l f6898l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f6899l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C10003l f6900l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C18038l f6901l;

    public C3212l(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C13426l c13426l, C3261l c3261l, C6350l c6350l, C16516l c16516l, C10003l c10003l, C17164l c17164l, C1959l c1959l, C18038l c18038l, C14763l c14763l) {
        this.f6892l = i;
        this.f6891l = str;
        this.f6888l = str2;
        this.f6896l = bArr;
        this.f6895l = pointArr;
        this.f6899l = i2;
        this.f6889l = c13426l;
        this.f6890l = c3261l;
        this.f6898l = c6350l;
        this.f6893l = c16516l;
        this.f6900l = c10003l;
        this.f6897l = c17164l;
        this.f6887l = c1959l;
        this.f6901l = c18038l;
        this.f6894l = c14763l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f6892l);
        AbstractC9968l.vip(parcel, 2, this.f6891l);
        AbstractC9968l.vip(parcel, 3, this.f6888l);
        AbstractC9968l.billing(parcel, 4, this.f6896l);
        AbstractC9968l.adcel(parcel, 5, this.f6895l, i);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f6899l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f6889l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f6890l, i);
        AbstractC9968l.remoteconfig(parcel, 9, this.f6898l, i);
        AbstractC9968l.remoteconfig(parcel, 10, this.f6893l, i);
        AbstractC9968l.remoteconfig(parcel, 11, this.f6900l, i);
        AbstractC9968l.remoteconfig(parcel, 12, this.f6897l, i);
        AbstractC9968l.remoteconfig(parcel, 13, this.f6887l, i);
        AbstractC9968l.remoteconfig(parcel, 14, this.f6901l, i);
        AbstractC9968l.remoteconfig(parcel, 15, this.f6894l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
