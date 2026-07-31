package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* JADX INFO: renamed from: lؒٙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1139l {
    public List admob;
    public final Object amazon = new Object();
    public final RemoteCallbackList billing = new RemoteCallbackList();
    public final C5057l crashlytics;
    public int firebase;
    public int isPro;
    public final BinderC2430l loadAd;
    public C16830l mopub;
    public final Bundle purchase;
    public C16701l remoteconfig;
    public AbstractC0294l smaato;
    public C8937l subs;
    public final MediaSession yandex;

    public C1139l(Context context, Bundle bundle, String str) {
        MediaSession mediaSessionYandex = yandex(context, bundle, str);
        this.yandex = mediaSessionYandex;
        BinderC2430l binderC2430l = new BinderC2430l(this);
        this.loadAd = binderC2430l;
        this.crashlytics = new C5057l(mediaSessionYandex.getSessionToken(), binderC2430l);
        this.purchase = bundle;
        mediaSessionYandex.setFlags(3);
    }

    public void amazon(C16701l c16701l) {
        synchronized (this.amazon) {
            this.remoteconfig = c16701l;
        }
    }

    public C16701l crashlytics() {
        C16701l c16701l;
        synchronized (this.amazon) {
            c16701l = this.remoteconfig;
        }
        return c16701l;
    }

    public final AbstractC0294l loadAd() {
        AbstractC0294l abstractC0294l;
        synchronized (this.amazon) {
            abstractC0294l = this.smaato;
        }
        return abstractC0294l;
    }

    public MediaSession yandex(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str);
    }
}
