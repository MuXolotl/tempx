package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: lٖۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16776l {
    public static void Signature(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    public static void ad(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    public static long adcel(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    public static long admob(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static int ads(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static PlaybackState.Builder amazon() {
        return new PlaybackState.Builder();
    }

    public static String billing(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static PlaybackState crashlytics(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static CharSequence firebase(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static List<PlaybackState.CustomAction> isPro(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    public static void license(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    public static PlaybackState.CustomAction loadAd(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    public static CharSequence metrica(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static long mopub(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static void pro(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static PlaybackState.CustomAction.Builder purchase(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    public static int remoteconfig(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static Bundle smaato(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static float startapp(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static long subs(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static void subscription(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    public static void tapsense(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    public static long vip(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static void yandex(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }
}
