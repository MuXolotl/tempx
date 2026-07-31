package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: renamed from: lؘٟۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5940l extends BroadcastReceiver {
    public Object crashlytics;
    public Context loadAd;
    public final /* synthetic */ int yandex = 0;

    public C5940l(C13645l c13645l) {
        this.crashlytics = c13645l;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.yandex) {
            case 0:
                RunnableC3094l runnableC3094l = (RunnableC3094l) this.crashlytics;
                if (runnableC3094l != null && runnableC3094l.yandex()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC3094l runnableC3094l2 = (RunnableC3094l) this.crashlytics;
                    ((FirebaseMessaging) runnableC3094l2.f6638l).getClass();
                    FirebaseMessaging.loadAd(runnableC3094l2, 0L);
                    Context context2 = this.loadAd;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.crashlytics = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((RunnableC10799l) ((C13645l) this.crashlytics).f26670l).getClass();
                    throw null;
                }
                return;
        }
    }

    public void yandex() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        RunnableC3094l runnableC3094l = (RunnableC3094l) this.crashlytics;
        if (runnableC3094l != null) {
            Context context = ((FirebaseMessaging) runnableC3094l.f6638l).loadAd;
            this.loadAd = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public /* synthetic */ C5940l() {
    }
}
