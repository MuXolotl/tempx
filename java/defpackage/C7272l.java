package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.loadAd;

/* JADX INFO: renamed from: lؚٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7272l {
    public AbstractC0294l admob;
    public PlaybackStateCompat billing;
    public final MediaSessionCompat$Token crashlytics;
    public final loadAd loadAd;
    public MediaMetadataCompat mopub;
    public C3070l subs;
    public final MediaSession yandex;
    public final Object amazon = new Object();
    public final RemoteCallbackList purchase = new RemoteCallbackList();

    public C7272l(Context context) {
        MediaSession mediaSessionYandex = yandex(context);
        this.yandex = mediaSessionYandex;
        loadAd loadad = new loadAd(this);
        this.loadAd = loadad;
        this.crashlytics = new MediaSessionCompat$Token(mediaSessionYandex.getSessionToken(), loadad);
        mediaSessionYandex.setFlags(3);
    }

    public final void amazon(AbstractC0294l abstractC0294l, Handler handler) {
        synchronized (this.amazon) {
            try {
                this.admob = abstractC0294l;
                this.yandex.setCallback(abstractC0294l == null ? null : (C13123l) abstractC0294l.purchase, handler);
                if (abstractC0294l != null) {
                    abstractC0294l.m411else(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3070l crashlytics() {
        C3070l c3070l;
        synchronized (this.amazon) {
            c3070l = this.subs;
        }
        return c3070l;
    }

    public final AbstractC0294l loadAd() {
        AbstractC0294l abstractC0294l;
        synchronized (this.amazon) {
            abstractC0294l = this.admob;
        }
        return abstractC0294l;
    }

    public void purchase(C3070l c3070l) {
        synchronized (this.amazon) {
            this.subs = c3070l;
        }
    }

    public MediaSession yandex(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }
}
