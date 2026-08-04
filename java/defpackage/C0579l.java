package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؑۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0579l implements Parcelable {
    public static final Parcelable.Creator<C0579l> CREATOR = new C17440l(18);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CharSequence f1988l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Uri f1989l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Bundle f1990l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CharSequence f1991l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f1992l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public MediaDescription f1993l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Bitmap f1994l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final CharSequence f1995l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Uri f1996l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f1997l;

    public C0579l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1992l = str;
        this.f1991l = charSequence;
        this.f1988l = charSequence2;
        this.f1995l = charSequence3;
        this.f1994l = bitmap;
        this.f1989l = uri;
        this.f1990l = bundle;
        this.f1996l = uri2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static C0579l yandex(MediaDescription mediaDescription) {
        Uri mediaUri;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleStartapp = AbstractC15323l.startapp(mediaDescription.getExtras());
        if (bundleStartapp != null) {
            bundleStartapp = new Bundle(bundleStartapp);
        }
        Bundle bundle = null;
        if (bundleStartapp != null) {
            mediaUri = (Uri) bundleStartapp.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (mediaUri != null) {
                if (!bundleStartapp.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleStartapp.size() != 2) {
                    bundleStartapp.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleStartapp.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            if (mediaUri == null) {
                mediaUri = mediaDescription.getMediaUri();
            }
            C0579l c0579l = new C0579l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
            c0579l.f1993l = mediaDescription;
            return c0579l;
        }
        mediaUri = null;
        bundle = bundleStartapp;
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        C0579l c0579l2 = new C0579l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        c0579l2.f1993l = mediaDescription;
        return c0579l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaDescription loadAd() {
        MediaDescription mediaDescription = this.f1993l;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f1992l);
        builder.setTitle(this.f1991l);
        builder.setSubtitle(this.f1988l);
        builder.setDescription(this.f1995l);
        builder.setIconBitmap(this.f1994l);
        builder.setIconUri(this.f1989l);
        builder.setExtras(this.f1990l);
        builder.setMediaUri(this.f1996l);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.f1993l = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public final String toString() {
        return ((Object) this.f1991l) + ", " + ((Object) this.f1988l) + ", " + ((Object) this.f1995l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        loadAd().writeToParcel(parcel, i);
    }
}
