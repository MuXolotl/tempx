package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0554l;
import defpackage.C11154l;
import defpackage.C17440l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11154l f28l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public MediaMetadata f29l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Bundle f30l;

    static {
        C11154l c11154l = new C11154l(0);
        f28l = c11154l;
        c11154l.put("android.media.metadata.TITLE", 1);
        c11154l.put("android.media.metadata.ARTIST", 1);
        c11154l.put("android.media.metadata.DURATION", 0);
        c11154l.put("android.media.metadata.ALBUM", 1);
        c11154l.put("android.media.metadata.AUTHOR", 1);
        c11154l.put("android.media.metadata.WRITER", 1);
        c11154l.put("android.media.metadata.COMPOSER", 1);
        c11154l.put("android.media.metadata.COMPILATION", 1);
        c11154l.put("android.media.metadata.DATE", 1);
        c11154l.put("android.media.metadata.YEAR", 0);
        c11154l.put("android.media.metadata.GENRE", 1);
        c11154l.put("android.media.metadata.TRACK_NUMBER", 0);
        c11154l.put("android.media.metadata.NUM_TRACKS", 0);
        c11154l.put("android.media.metadata.DISC_NUMBER", 0);
        c11154l.put("android.media.metadata.ALBUM_ARTIST", 1);
        c11154l.put("android.media.metadata.ART", 2);
        c11154l.put("android.media.metadata.ART_URI", 1);
        c11154l.put("android.media.metadata.ALBUM_ART", 2);
        c11154l.put("android.media.metadata.ALBUM_ART_URI", 1);
        c11154l.put("android.media.metadata.USER_RATING", 3);
        c11154l.put("android.media.metadata.RATING", 3);
        c11154l.put("android.media.metadata.DISPLAY_TITLE", 1);
        c11154l.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c11154l.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c11154l.put("android.media.metadata.DISPLAY_ICON", 2);
        c11154l.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c11154l.put("android.media.metadata.MEDIA_ID", 1);
        c11154l.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c11154l.put("android.media.metadata.MEDIA_URI", 1);
        c11154l.put("android.media.metadata.ADVERTISEMENT", 0);
        c11154l.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C17440l(21);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f30l = parcel.readBundle(C0554l.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f30l);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f30l = bundle2;
        C0554l.appmetrica(bundle2);
    }
}
