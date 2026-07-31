package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٌۥؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9165l extends BroadcastReceiver {
    public final /* synthetic */ RunnableC17276l loadAd;
    public RunnableC17276l yandex;

    public C9165l(RunnableC17276l runnableC17276l, RunnableC17276l runnableC17276l2) {
        this.loadAd = runnableC17276l;
        this.yandex = runnableC17276l2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            RunnableC17276l runnableC17276l = this.yandex;
            if (runnableC17276l == null) {
                return;
            }
            if (runnableC17276l.amazon()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                RunnableC17276l runnableC17276l2 = this.yandex;
                ((C7920l) runnableC17276l2.f33519l).billing.schedule(runnableC17276l2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.yandex = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void yandex() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.loadAd.f33514l).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
