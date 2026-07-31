package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: lْٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3546l {
    public static CharSequence admob(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static Bundle amazon(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static Uri billing(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static CharSequence crashlytics(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static void firebase(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void isPro(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static MediaDescription.Builder loadAd() {
        return new MediaDescription.Builder();
    }

    public static void metrica(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static String mopub(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static Bitmap purchase(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static void remoteconfig(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void smaato(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void startapp(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static CharSequence subs(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static void vip(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static MediaDescription yandex(MediaDescription.Builder builder) {
        return builder.build();
    }
}
