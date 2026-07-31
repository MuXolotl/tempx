package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.AbstractC13936l;
import defpackage.BinderC15526l;
import defpackage.C10846l;
import defpackage.C17417l;
import defpackage.C6901l;
import defpackage.C8118l;
import defpackage.InterfaceC5193l;
import defpackage.RunnableC15098l;
import defpackage.RunnableC16301l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements InterfaceC5193l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10846l f588l;

    public final C10846l amazon() {
        if (this.f588l == null) {
            this.f588l = new C10846l(this);
        }
        return this.f588l;
    }

    @Override // defpackage.InterfaceC5193l
    public final void crashlytics(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC5193l
    public final void loadAd(Intent intent) {
        SparseArray sparseArray = AbstractC13936l.yandex;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC13936l.yandex;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C10846l c10846lAmazon = amazon();
        c10846lAmazon.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC15526l(C6901l.ad((Service) c10846lAmazon.f21908l));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) amazon().f21908l).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) amazon().f21908l).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        amazon();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C10846l c10846lAmazon = amazon();
        if (intent == null) {
            c10846lAmazon.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) c10846lAmazon.f21908l;
        C8118l c8118l = C17417l.vip(service, null, null, null).f33950l;
        C17417l.admob(c8118l);
        String action = intent.getAction();
        c8118l.f16911l.crashlytics(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC15098l runnableC15098l = new RunnableC15098l(c10846lAmazon, i2, c8118l, intent);
        C6901l c6901lAd = C6901l.ad(service);
        c6901lAd.mo224l().m4449l(new RunnableC16301l(c10846lAmazon, c6901lAd, runnableC15098l, 20));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        amazon();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.InterfaceC5193l
    public final boolean yandex(int i) {
        return stopSelfResult(i);
    }
}
