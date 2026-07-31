package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: renamed from: lًٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8429l {
    public static void amazon(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void crashlytics(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static Notification.MediaStyle loadAd(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            purchase(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            crashlytics(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f38l);
        }
        return mediaStyle;
    }

    public static void purchase(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    public static Notification.MediaStyle yandex() {
        return new Notification.MediaStyle();
    }
}
