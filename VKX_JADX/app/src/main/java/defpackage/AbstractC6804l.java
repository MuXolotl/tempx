package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: renamed from: lؙٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6804l {
    public static void loadAd(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static Bundle yandex(PlaybackState playbackState) {
        return playbackState.getExtras();
    }
}
