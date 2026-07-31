package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: renamed from: lِٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14434l implements Parcelable {
    public static final Parcelable.Creator<C14434l> CREATOR = new C17440l(6);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public Integer f28244l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public Integer f28245l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Integer f28247l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Integer f28248l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public Integer f28249l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Integer f28251l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public CharSequence f28252l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Integer f28253l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Integer f28254l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f28255l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Integer f28256l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f28257l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public Integer f28258l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public Integer f28259l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public String f28260l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public CharSequence f28261l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Integer f28262l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Integer f28263l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public Integer f28264l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public Integer f28265l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Integer f28268l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public Locale f28270l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public Boolean f28271l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f28272l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public Integer f28273l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f28267l = 255;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f28269l = -2;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f28266l = -2;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f28246l = -2;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Boolean f28250l = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28255l);
        parcel.writeSerializable(this.f28254l);
        parcel.writeSerializable(this.f28247l);
        parcel.writeSerializable(this.f28263l);
        parcel.writeSerializable(this.f28262l);
        parcel.writeSerializable(this.f28268l);
        parcel.writeSerializable(this.f28248l);
        parcel.writeSerializable(this.f28251l);
        parcel.writeInt(this.f28267l);
        parcel.writeString(this.f28260l);
        parcel.writeInt(this.f28269l);
        parcel.writeInt(this.f28266l);
        parcel.writeInt(this.f28246l);
        CharSequence charSequence = this.f28261l;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f28252l;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f28257l);
        parcel.writeSerializable(this.f28256l);
        parcel.writeSerializable(this.f28249l);
        parcel.writeSerializable(this.f28245l);
        parcel.writeSerializable(this.f28273l);
        parcel.writeSerializable(this.f28253l);
        parcel.writeSerializable(this.f28259l);
        parcel.writeSerializable(this.f28265l);
        parcel.writeSerializable(this.f28264l);
        parcel.writeSerializable(this.f28244l);
        parcel.writeSerializable(this.f28258l);
        parcel.writeSerializable(this.f28250l);
        parcel.writeSerializable(this.f28270l);
        parcel.writeSerializable(this.f28271l);
    }
}
