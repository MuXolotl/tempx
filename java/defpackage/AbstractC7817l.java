package defpackage;

import android.media.Rating;

/* JADX INFO: renamed from: lًؘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7817l {
    public static Rating admob(float f) {
        return Rating.newPercentageRating(f);
    }

    public static boolean amazon(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean billing(Rating rating) {
        return rating.isThumbUp();
    }

    public static float crashlytics(Rating rating) {
        return rating.getStarRating();
    }

    public static Rating firebase(int i) {
        return Rating.newUnratedRating(i);
    }

    public static Rating isPro(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static int loadAd(Rating rating) {
        return rating.getRatingStyle();
    }

    public static Rating mopub(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static boolean purchase(Rating rating) {
        return rating.isRated();
    }

    public static Rating subs(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    public static float yandex(Rating rating) {
        return rating.getPercentRating();
    }
}
