package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C10538l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C10538l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f41l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f42l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f43l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f44l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f45l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43l);
        parcel.writeInt(this.f41l);
        parcel.writeInt(this.f45l);
        parcel.writeInt(this.f44l);
        parcel.writeInt(this.f42l);
    }
}
