package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16377l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final NotificationManager f32026l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractServiceC5477l f32027l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f32029l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f32030l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f32028l = AbstractC11990l.loadAd();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8688l f32031l = new C8688l(new C9636l(19, this));

    public AbstractC16377l(AbstractServiceC5477l abstractServiceC5477l) {
        this.f32027l = abstractServiceC5477l;
        this.f32026l = (NotificationManager) abstractServiceC5477l.getSystemService("notification");
    }

    public abstract String admob();

    public final int amazon() {
        return ((Number) this.f32031l.getValue()).intValue();
    }

    public abstract int crashlytics();

    public final void firebase() {
        AbstractServiceC5477l abstractServiceC5477l = this.f32027l;
        boolean z = abstractServiceC5477l.f11731l == 1;
        if (!this.f32029l) {
            int iAmazon = z ? amazon() : abstractServiceC5477l.f11724l.yandex.hashCode();
            C11757l c11757lPurchase = purchase();
            c11757lPurchase.loadAd.clear();
            c11757lPurchase.isVip.icon = R.drawable.ic_check;
            VKXApplication.Companion companion = VKXApplication.f36628l;
            c11757lPurchase.amazon(VKXApplication.Companion.loadAd(R.string.completed));
            c11757lPurchase.purchase(2, false);
            c11757lPurchase.metrica = 0;
            c11757lPurchase.startapp = 0;
            Unit unit = Unit.INSTANCE;
            this.f32026l.notify(iAmazon, c11757lPurchase.loadAd());
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.premium(abstractServiceC5477l, 2);
            } else {
                abstractServiceC5477l.stopForeground(false);
            }
        }
    }

    public final void isPro(Exception exc) {
        C15589l c15589l = C5013l.yandex;
        C5013l.amazon(exc, C14054l.f27396l);
        AbstractServiceC5477l abstractServiceC5477l = this.f32027l;
        boolean z = abstractServiceC5477l.f11731l == 1;
        if (!this.f32029l) {
            int iAmazon = z ? amazon() : abstractServiceC5477l.f11724l.yandex.hashCode();
            C11757l c11757lPurchase = purchase();
            c11757lPurchase.loadAd.clear();
            c11757lPurchase.isVip.icon = R.drawable.ic_cancel_outline_28;
            String message = exc.getMessage();
            if (message == null) {
                message = exc.getClass().getName();
            }
            c11757lPurchase.amazon("error: ".concat(message));
            c11757lPurchase.purchase(2, false);
            Unit unit = Unit.INSTANCE;
            this.f32026l.notify(iAmazon, c11757lPurchase.loadAd());
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.premium(abstractServiceC5477l, 2);
            } else {
                abstractServiceC5477l.stopForeground(false);
            }
        }
    }

    public abstract String loadAd();

    public abstract String mopub();

    public final C11757l purchase() {
        String str;
        String strLoadAd = loadAd();
        AbstractServiceC5477l abstractServiceC5477l = this.f32027l;
        C11757l c11757l = new C11757l(abstractServiceC5477l, strLoadAd);
        Notification notification = c11757l.isVip;
        notification.icon = android.R.drawable.stat_sys_download;
        c11757l.isPro = -1;
        C12463l c12463l = AbstractC6145l.yandex;
        c11757l.Signature = AbstractC13209l.yandex(R.attr.global_accent);
        c11757l.subscription = "progress";
        c11757l.adcel = mopub();
        c11757l.purchase(2, true);
        notification.tickerText = C11757l.crashlytics("");
        VKXApplication.Companion companion = VKXApplication.f36628l;
        String strLoadAd2 = VKXApplication.Companion.loadAd(R.string.cancel);
        Intent intent = new Intent(abstractServiceC5477l, abstractServiceC5477l.getClass());
        intent.setAction(AbstractServiceC5477l.f11723l);
        Unit unit = Unit.INSTANCE;
        c11757l.yandex(R.drawable.ic_delete_outline_android_28, PendingIntent.getService(abstractServiceC5477l, 1400, intent, AbstractC3058l.ads()), strLoadAd2);
        AbstractC7317l abstractC7317l = abstractServiceC5477l.f11724l;
        if ((abstractC7317l instanceof C17685l) || (abstractC7317l instanceof C17050l) || (abstractC7317l instanceof C4778l) || (abstractC7317l instanceof C5108l)) {
            int i = abstractC7317l.yandex().yandex;
            int i2 = abstractC7317l.yandex().loadAd;
            c11757l.metrica = i;
            c11757l.startapp = i2;
            if (abstractC7317l instanceof C5108l) {
                String str2 = ((C5108l) abstractC7317l).purchase.tapsense;
                if (str2 == null) {
                    str2 = "";
                }
                c11757l.purchase = C11757l.crashlytics(str2);
                StringBuilder sb = new StringBuilder("[");
                sb.append(abstractC7317l.yandex().loadAd);
                sb.append('/');
                sb.append(abstractC7317l.yandex().yandex);
                sb.append("] ");
                AudioTrack audioTrack = abstractServiceC5477l.f11730l;
                str = audioTrack != null ? audioTrack.amazon : null;
                sb.append(str != null ? str : "");
                c11757l.amazon(sb.toString());
            } else {
                c11757l.purchase = C11757l.crashlytics(abstractC7317l.loadAd);
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(abstractC7317l.yandex().loadAd);
                sb2.append('/');
                sb2.append(abstractC7317l.yandex().yandex);
                sb2.append("] ");
                AudioTrack audioTrack2 = abstractServiceC5477l.f11730l;
                String str3 = audioTrack2 != null ? audioTrack2.yandex : null;
                if (str3 == null) {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(" - ");
                AudioTrack audioTrack3 = abstractServiceC5477l.f11730l;
                str = audioTrack3 != null ? audioTrack3.amazon : null;
                sb2.append(str != null ? str : "");
                c11757l.amazon(sb2.toString());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                c11757l.vip = C11757l.crashlytics(admob().concat(" плейлиста"));
            }
        } else if (abstractC7317l instanceof C9808l) {
            C9808l c9808l = (C9808l) abstractC7317l;
            c11757l.purchase = C11757l.crashlytics(c9808l.loadAd);
            c11757l.amazon(admob().concat(" трека"));
            int i3 = c9808l.yandex().yandex;
            int i4 = c9808l.yandex().loadAd;
            c11757l.metrica = i3;
            c11757l.startapp = i4;
            return c11757l;
        }
        return c11757l;
    }

    public final void subs() {
        AbstractServiceC5477l abstractServiceC5477l = this.f32027l;
        if (abstractServiceC5477l.f11724l == null) {
            return;
        }
        if (this.f32029l) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.premium(abstractServiceC5477l, 1);
                return;
            } else {
                abstractServiceC5477l.stopForeground(true);
                return;
            }
        }
        Notification notificationLoadAd = purchase().loadAd();
        int iAmazon = amazon();
        if (System.currentTimeMillis() - this.f32030l >= 1000) {
            this.f32026l.notify(iAmazon, notificationLoadAd);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    abstractServiceC5477l.startForeground(iAmazon, notificationLoadAd);
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "[startForeground] downloader service got ForegroundServiceStartNotAllowedException", null);
                }
            } else {
                abstractServiceC5477l.startForeground(iAmazon, notificationLoadAd);
            }
            this.f32030l = System.currentTimeMillis();
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f32028l.f36440l;
    }

    public abstract int yandex();
}
