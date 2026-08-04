package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lًٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14302l {
    public static int admob;
    public static final Pattern isPro = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static PendingIntent subs;
    public final ScheduledThreadPoolExecutor amazon;
    public Messenger billing;
    public final C5601l crashlytics;
    public final Context loadAd;
    public C1882l mopub;
    public final C5128l yandex = new C5128l(0);
    public final Messenger purchase = new Messenger(new HandlerC17601l(this, Looper.getMainLooper()));

    public C14302l(Context context) {
        this.loadAd = context;
        this.crashlytics = new C5601l(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.amazon = scheduledThreadPoolExecutor;
    }

    public static synchronized void crashlytics(Context context, Intent intent) {
        try {
            if (subs == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                subs = PendingIntent.getBroadcast(context, 0, intent2, AbstractC3656l.yandex);
            }
            intent.putExtra("app", subs);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized String loadAd() {
        int i;
        i = admob;
        admob = i + 1;
        return Integer.toString(i);
    }

    public final void amazon(String str, Bundle bundle) {
        synchronized (this.yandex) {
            try {
                C2350l c2350l = (C2350l) this.yandex.remove(str);
                if (c2350l != null) {
                    c2350l.loadAd(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    public final C3823l yandex(Bundle bundle) {
        int iVip;
        Context context;
        String strLoadAd = loadAd();
        C2350l c2350l = new C2350l();
        synchronized (this.yandex) {
            this.yandex.put(strLoadAd, c2350l);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.crashlytics.vip() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        crashlytics(this.loadAd, intent);
        intent.putExtra("kid", "|ID|" + strLoadAd + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.purchase);
        if (this.billing == null && this.mopub == null) {
            iVip = this.crashlytics.vip();
            context = this.loadAd;
            if (iVip == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.billing;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.mopub.f4311l;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iVip = this.crashlytics.vip();
                context = this.loadAd;
                if (iVip == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        c2350l.yandex.loadAd(ExecutorC12908l.f25368l, new C4816l(this, strLoadAd, this.amazon.schedule(new RunnableC9281l(0, c2350l), 30L, TimeUnit.SECONDS), 11));
        return c2350l.yandex;
    }
}
