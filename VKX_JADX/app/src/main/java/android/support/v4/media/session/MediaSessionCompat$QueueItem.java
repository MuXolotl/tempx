package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.AbstractC15560l;
import defpackage.C17440l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C17440l(23);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f34l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MediaDescriptionCompat f35l;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f35l = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f34l = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f35l);
        sb.append(", Id=");
        return AbstractC15560l.ads(this.f34l, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f35l.writeToParcel(parcel, i);
        parcel.writeLong(this.f34l);
    }
}
