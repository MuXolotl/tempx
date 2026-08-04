package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: renamed from: lؑۦۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0716l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f2203l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f2204l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f2205l;

    public C0716l(C13572l c13572l) {
        super(12, false);
        this.f2204l = c13572l;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٌٖؖ */
    public final void mo229l(C10038l c10038l) {
        switch (this.f2203l) {
            case 0:
                Notification.Builder builder = (Notification.Builder) c10038l.f20462l;
                Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                C13572l c13572l = (C13572l) this.f2204l;
                Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((C1139l) c13572l.yandex.admob.vip.f1691l).crashlytics.f10328l);
                int[] iArr = this.f2205l;
                if (iArr != null) {
                    mediaSession.setShowActionsInCompactView(iArr);
                }
                builder.setStyle(mediaSession);
                Bundle bundle = new Bundle();
                bundle.putBundle("androidx.media3.session", c13572l.yandex.isPro.loadAd());
                builder.addExtras(bundle);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                Notification.Builder builder2 = (Notification.Builder) c10038l.f20462l;
                if (i < 34) {
                    AbstractC8429l.amazon(builder2, AbstractC8429l.loadAd(AbstractC8429l.yandex(), this.f2205l, (MediaSessionCompat$Token) this.f2204l));
                } else {
                    AbstractC8429l.amazon(builder2, AbstractC8429l.loadAd(AbstractC9580l.yandex(AbstractC8429l.yandex(), null, 0, null, Boolean.FALSE), this.f2205l, (MediaSessionCompat$Token) this.f2204l));
                }
                break;
        }
    }

    public /* synthetic */ C0716l() {
        super(12, false);
    }
}
