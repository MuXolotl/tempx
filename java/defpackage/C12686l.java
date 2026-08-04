package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّٚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12686l {
    public int crashlytics;
    public final NotificationManager loadAd;
    public final Service yandex;

    public C12686l(Service service) {
        this.yandex = service;
        this.loadAd = (NotificationManager) service.getSystemService("notification");
    }

    public final void yandex(AbstractC0085l abstractC0085l) {
        Service service = this.yandex;
        AbstractC5941l.startapp(service, "cacheChannel", R.string.cache_ch, R.string.cache_ch_desc);
        NotificationManager notificationManager = this.loadAd;
        if (abstractC0085l == null) {
            notificationManager.cancel(this.crashlytics);
            service.stopForeground(true);
            return;
        }
        this.crashlytics = abstractC0085l.loadAd().hashCode();
        C11757l c11757l = new C11757l(service, "cacheChannel");
        Notification notification = c11757l.isVip;
        notification.icon = android.R.drawable.stat_sys_download;
        c11757l.isPro = -1;
        C12463l c12463l = AbstractC6145l.yandex;
        c11757l.Signature = AbstractC13209l.yandex(R.attr.global_accent);
        c11757l.subscription = "progress";
        c11757l.adcel = "cache_migration";
        c11757l.purchase(2, true);
        notification.tickerText = C11757l.crashlytics("");
        c11757l.purchase = C11757l.crashlytics("Миграция кеша");
        c11757l.billing = C11757l.crashlytics("на " + abstractC0085l.amazon());
        Notification notificationLoadAd = c11757l.loadAd();
        notificationManager.notify(this.crashlytics, notificationLoadAd);
        service.startForeground(this.crashlytics, notificationLoadAd);
    }
}
