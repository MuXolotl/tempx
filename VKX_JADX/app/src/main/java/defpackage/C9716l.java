package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lًٍٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9716l implements Handler.Callback {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f19799l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final NotificationManager f19800l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f19801l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final HashMap f19802l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f19803l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5138l f19804l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractServiceC3639l f19805l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f19806l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final long f19807l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ExecutorC12010l f19808l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Handler f19809l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f19810l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public InterfaceC14544l f19811l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Intent f19812l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C16543l f19813l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f19814l;

    public C9716l(AbstractServiceC3639l abstractServiceC3639l, InterfaceC14544l interfaceC14544l, C5138l c5138l) {
        this.f19805l = abstractServiceC3639l;
        this.f19811l = interfaceC14544l;
        this.f19804l = c5138l;
        NotificationManager notificationManager = (NotificationManager) abstractServiceC3639l.getSystemService("notification");
        notificationManager.getClass();
        this.f19800l = notificationManager;
        Looper mainLooper = Looper.getMainLooper();
        String str = AbstractC15323l.yandex;
        this.f19809l = new Handler(mainLooper, this);
        this.f19808l = new ExecutorC12010l(3, this);
        Intent intent = new Intent(abstractServiceC3639l, abstractServiceC3639l.getClass());
        this.f19812l = intent;
        String string = UUID.randomUUID().toString();
        this.f19801l = string;
        intent.putExtra("androidx.media3.session.intent.uid", string);
        this.f19802l = new HashMap();
        this.f19810l = false;
        this.f19814l = true;
        this.f19807l = 600000L;
        this.f19803l = 3;
    }

    public final boolean amazon(C13572l c13572l) {
        C16811l c16811lLoadAd = loadAd(c13572l);
        if (c16811lLoadAd != null && !c16811lLoadAd.mo2791l().startapp()) {
            C4806l c4806l = (C4806l) this.f19802l.get(c13572l);
            c4806l.getClass();
            if (c16811lLoadAd.purchase() != 1) {
                c4806l.loadAd = false;
                c4806l.crashlytics = true;
                return true;
            }
            int i = this.f19803l;
            if (i == 1) {
                return !c4806l.loadAd;
            }
            if (i != 2) {
                if (i != 3) {
                    C18073l.admob();
                    return false;
                }
                if (!c4806l.loadAd && c4806l.crashlytics) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean crashlytics(boolean z) {
        boolean z2;
        ArrayList arrayListMopub = this.f19805l.mopub();
        int i = 0;
        while (true) {
            if (i >= arrayListMopub.size()) {
                z2 = false;
                break;
            }
            C16811l c16811lLoadAd = loadAd((C13572l) arrayListMopub.get(i));
            if (c16811lLoadAd != null && ((c16811lLoadAd.startapp() || z) && (c16811lLoadAd.purchase() == 3 || c16811lLoadAd.purchase() == 2))) {
                z2 = true;
                break;
            }
            i++;
        }
        boolean z3 = this.f19814l;
        long j = this.f19807l;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.f19799l;
        Handler handler = this.f19809l;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.f19799l = z2;
        return z2 || handler.hasMessages(1);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        AbstractServiceC3639l abstractServiceC3639l = this.f19805l;
        ArrayList arrayListMopub = abstractServiceC3639l.mopub();
        for (int i = 0; i < arrayListMopub.size(); i++) {
            abstractServiceC3639l.firebase((C13572l) arrayListMopub.get(i), false);
        }
        return true;
    }

    public final C16811l loadAd(C13572l c13572l) {
        C4806l c4806l = (C4806l) this.f19802l.get(c13572l);
        if (c4806l != null) {
            C6845l c6845l = c4806l.yandex;
            if (c6845l.isDone()) {
                try {
                    return (C16811l) AbstractC7151l.crashlytics(c6845l);
                } catch (ExecutionException e) {
                    C11983l.ads(e);
                }
            }
        }
        return null;
    }

    public final void purchase(C13572l c13572l, C16543l c16543l, boolean z) {
        MediaSession.Token token = ((C1139l) c13572l.yandex.admob.vip.f1691l).crashlytics.f10328l;
        Notification notification = (Notification) c16543l.f32482l;
        notification.extras.putParcelable("android.mediaSession", token);
        this.f19813l = c16543l;
        AbstractServiceC3639l abstractServiceC3639l = this.f19805l;
        if (z) {
            AbstractC7720l.mopub(abstractServiceC3639l, this.f19812l);
            String str = AbstractC15323l.yandex;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC11880l.m3284throw(abstractServiceC3639l, 1001, notification);
            } else {
                abstractServiceC3639l.startForeground(1001, notification);
            }
            this.f19810l = true;
            return;
        }
        this.f19800l.notify(1001, notification);
        String str2 = AbstractC15323l.yandex;
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC11965l.yandex(abstractServiceC3639l, false);
        } else {
            abstractServiceC3639l.stopForeground(false);
        }
    }

    public final void yandex() {
        this.f19814l = false;
        Handler handler = this.f19809l;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            AbstractServiceC3639l abstractServiceC3639l = this.f19805l;
            ArrayList arrayListMopub = abstractServiceC3639l.mopub();
            for (int i = 0; i < arrayListMopub.size(); i++) {
                abstractServiceC3639l.firebase((C13572l) arrayListMopub.get(i), false);
            }
        }
    }
}
