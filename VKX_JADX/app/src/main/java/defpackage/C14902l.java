package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lۣٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14902l implements Parcelable {
    public static final Parcelable.Creator<C14902l> CREATOR = new C10538l(8);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int[] f29311l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f29312l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f29313l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f29314l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f29313l + ", mGapDir=" + this.f29312l + ", mHasUnwantedGapAfter=" + this.f29314l + ", mGapPerSpan=" + Arrays.toString(this.f29311l) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29313l);
        parcel.writeInt(this.f29312l);
        parcel.writeInt(this.f29314l ? 1 : 0);
        int[] iArr = this.f29311l;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f29311l);
        }
    }
}
