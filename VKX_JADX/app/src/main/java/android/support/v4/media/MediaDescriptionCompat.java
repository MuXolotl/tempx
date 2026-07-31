package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC15746l;
import defpackage.AbstractC3546l;
import defpackage.C17440l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C17440l(19);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CharSequence f19l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Bundle f20l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Uri f21l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CharSequence f22l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f23l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Bitmap f24l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final CharSequence f25l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public MediaDescription f26l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Uri f27l;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f23l = str;
        this.f22l = charSequence;
        this.f19l = charSequence2;
        this.f25l = charSequence3;
        this.f24l = bitmap;
        this.f27l = uri;
        this.f20l = bundle;
        this.f21l = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f22l) + ", " + ((Object) this.f19l) + ", " + ((Object) this.f25l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionYandex = this.f26l;
        if (mediaDescriptionYandex == null) {
            MediaDescription.Builder builderLoadAd = AbstractC3546l.loadAd();
            AbstractC3546l.vip(builderLoadAd, this.f23l);
            AbstractC3546l.startapp(builderLoadAd, this.f22l);
            AbstractC3546l.metrica(builderLoadAd, this.f19l);
            AbstractC3546l.isPro(builderLoadAd, this.f25l);
            AbstractC3546l.smaato(builderLoadAd, this.f24l);
            AbstractC3546l.remoteconfig(builderLoadAd, this.f27l);
            AbstractC3546l.firebase(builderLoadAd, this.f20l);
            AbstractC15746l.loadAd(builderLoadAd, this.f21l);
            mediaDescriptionYandex = AbstractC3546l.yandex(builderLoadAd);
            this.f26l = mediaDescriptionYandex;
        }
        mediaDescriptionYandex.writeToParcel(parcel, i);
    }
}
