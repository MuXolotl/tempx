package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.AbstractC13936l;
import defpackage.C14099l;
import defpackage.C17417l;
import defpackage.C8118l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC13936l {
    public C14099l crashlytics;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.crashlytics == null) {
            this.crashlytics = new C14099l(this);
        }
        C14099l c14099l = this.crashlytics;
        c14099l.getClass();
        C8118l c8118l = C17417l.vip(context, null, null, null).f33950l;
        C17417l.admob(c8118l);
        if (intent == null) {
            c8118l.f16910l.yandex("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c8118l.f16911l.loadAd(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c8118l.f16910l.yandex("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c8118l.f16911l.yandex("Starting wakeful intent.");
        ((AppMeasurementReceiver) c14099l.f27460l).getClass();
        SparseArray sparseArray = AbstractC13936l.yandex;
        synchronized (sparseArray) {
            try {
                int i = AbstractC13936l.loadAd;
                int i2 = i + 1;
                AbstractC13936l.loadAd = i2;
                if (i2 <= 0) {
                    AbstractC13936l.loadAd = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
