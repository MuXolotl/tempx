package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٜؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3798l implements Parcelable {
    public static final Parcelable.Creator<C3798l> CREATOR = new C17440l(14);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f7905l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f7906l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f7907l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7907l);
        parcel.writeInt(this.f7906l);
        parcel.writeInt(this.f7905l ? 1 : 0);
    }
}
