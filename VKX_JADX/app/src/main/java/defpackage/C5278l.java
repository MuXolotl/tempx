package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؗۥۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5278l implements Parcelable {
    public static final Parcelable.Creator<C5278l> CREATOR = new C10538l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f11379l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ArrayList f11380l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f11381l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f11382l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f11383l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f11384l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f11385l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f11386l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f11387l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int[] f11388l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11383l);
        parcel.writeInt(this.f11382l);
        parcel.writeInt(this.f11379l);
        if (this.f11379l > 0) {
            parcel.writeIntArray(this.f11386l);
        }
        parcel.writeInt(this.f11385l);
        if (this.f11385l > 0) {
            parcel.writeIntArray(this.f11388l);
        }
        parcel.writeInt(this.f11381l ? 1 : 0);
        parcel.writeInt(this.f11387l ? 1 : 0);
        parcel.writeInt(this.f11384l ? 1 : 0);
        parcel.writeList(this.f11380l);
    }
}
