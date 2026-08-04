package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌٝ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8937l implements Parcelable {
    public static final Parcelable.Creator<C8937l> CREATOR;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String[] f18406l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11154l f18407l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f18408l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public MediaMetadata f18409l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Bundle f18410l;

    static {
        C11154l c11154l = new C11154l(0);
        f18407l = c11154l;
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
        f18406l = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new C17440l(20);
    }

    public C8937l(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f18410l = bundle2;
        ClassLoader classLoader = C0458l.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Bitmap loadAd() {
        String[] strArr = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            Bundle bundle = this.f18410l;
            if (bundle.containsKey(str)) {
                try {
                    return (Bitmap) bundle.getParcelable(str);
                } catch (Exception e) {
                    AbstractC6427l.metrica("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f18410l);
    }

    public final long yandex(String str) {
        return this.f18410l.getLong(str, 0L);
    }

    public C8937l(Parcel parcel) {
        Bundle bundle = parcel.readBundle(C0458l.class.getClassLoader());
        bundle.getClass();
        this.f18410l = bundle;
    }
}
