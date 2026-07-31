package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13585l implements Parcelable {
    public static final Parcelable.Creator<C13585l> CREATOR = new C17440l(11);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C12862l[] f26599l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ArrayList f26600l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ArrayList f26601l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f26602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ArrayList f26603l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f26604l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26605l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ArrayList f26606l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f26603l);
        parcel.writeStringList(this.f26602l);
        parcel.writeTypedArray(this.f26599l, i);
        parcel.writeInt(this.f26605l);
        parcel.writeString(this.f26604l);
        parcel.writeStringList(this.f26606l);
        parcel.writeTypedList(this.f26600l);
        parcel.writeTypedList(this.f26601l);
    }
}
