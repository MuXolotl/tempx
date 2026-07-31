package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C17440l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C17440l(17);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MediaDescriptionCompat f17l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f18l;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f18l = parcel.readInt();
        this.f17l = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f18l + ", mDescription=" + this.f17l + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18l);
        this.f17l.writeToParcel(parcel, i);
    }
}
