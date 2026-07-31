package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C10538l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C10538l(6);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f31l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32l;

    public RatingCompat(int i, float f) {
        this.f32l = i;
        this.f31l = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f32l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f32l);
        sb.append(" rating=");
        float f = this.f31l;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32l);
        parcel.writeFloat(this.f31l);
    }
}
