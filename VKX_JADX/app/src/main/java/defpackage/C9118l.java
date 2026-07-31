package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: lٌۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9118l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public IconCompat f18742l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f18743l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public IconCompat f18744l;

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؙؗٗ */
    public final String mo212l() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٌٖؖ */
    public final void mo229l(C10038l c10038l) {
        Bitmap bitmapLoadAd;
        Context context = (Context) c10038l.f20463l;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) c10038l.f20462l).setBigContentTitle(null);
        IconCompat iconCompat = this.f18742l;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC18553l.yandex(bigContentTitle, iconCompat.subs(context));
            } else if (iconCompat.billing() == 1) {
                IconCompat iconCompat2 = this.f18742l;
                int i = iconCompat2.yandex;
                if (i == -1) {
                    Object obj = iconCompat2.loadAd;
                    bitmapLoadAd = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapLoadAd = (Bitmap) iconCompat2.loadAd;
                } else {
                    if (i != 5) {
                        C11983l.ad(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapLoadAd = IconCompat.loadAd((Bitmap) iconCompat2.loadAd, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapLoadAd);
            }
        }
        if (this.f18743l) {
            IconCompat iconCompat3 = this.f18744l;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.subs(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC18553l.crashlytics(bigContentTitle, false);
            AbstractC18553l.loadAd(bigContentTitle, null);
        }
    }
}
