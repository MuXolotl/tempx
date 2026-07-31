package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.C13432l;
import defpackage.C14513l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String yandex = C14513l.applovin("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C14513l.tapsense().vip(yandex, "Received intent " + intent);
        try {
            C13432l c13432lCrashlytics = C13432l.crashlytics(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C13432l.remoteconfig) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c13432lCrashlytics.subs;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c13432lCrashlytics.subs = pendingResultGoAsync;
                    if (c13432lCrashlytics.admob) {
                        pendingResultGoAsync.finish();
                        c13432lCrashlytics.subs = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            C14513l.tapsense().ads(yandex, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
