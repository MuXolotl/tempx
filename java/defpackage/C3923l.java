package defpackage;

import android.app.Notification;

/* JADX INFO: renamed from: lًؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3923l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public CharSequence f8087l;

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؙؗٗ */
    public final String mo212l() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٌٖؖ */
    public final void mo229l(C10038l c10038l) {
        new Notification.BigTextStyle((Notification.Builder) c10038l.f20462l).setBigContentTitle(null).bigText(this.f8087l);
    }
}
