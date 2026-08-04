package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٖٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC4922l implements ServiceConnection {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor f10027l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Intent f10028l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f10029l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public BinderC0806l f10030l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayDeque f10031l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f10032l;

    public ServiceConnectionC4922l(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6995l("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10031l = new ArrayDeque();
        this.f10032l = false;
        Context applicationContext = context.getApplicationContext();
        this.f10029l = applicationContext;
        this.f10028l = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f10027l = scheduledThreadPoolExecutor;
    }

    public final void crashlytics() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f10032l);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f10032l) {
            return;
        }
        this.f10032l = true;
        try {
            if (C8394l.loadAd().yandex(this.f10029l, this.f10028l, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f10031l;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C5744l) arrayDeque.poll()).loadAd.amazon(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f10032l = false;
    }

    public final synchronized C3823l loadAd(Intent intent) {
        C5744l c5744l;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c5744l = new C5744l(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f10027l;
            c5744l.loadAd.yandex.loadAd(scheduledThreadPoolExecutor, new C4568l(19, scheduledThreadPoolExecutor.schedule(new RunnableC6665l(18, c5744l), 20L, TimeUnit.SECONDS)));
            this.f10031l.add(c5744l);
            yandex();
        } catch (Throwable th) {
            throw th;
        }
        return c5744l.loadAd.yandex;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f10032l = false;
            if (iBinder instanceof BinderC0806l) {
                this.f10030l = (BinderC0806l) iBinder;
                yandex();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f10031l;
            while (!arrayDeque.isEmpty()) {
                ((C5744l) arrayDeque.poll()).loadAd.amazon(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        yandex();
    }

    public final synchronized void yandex() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f10031l.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC0806l binderC0806l = this.f10030l;
                if (binderC0806l == null || !binderC0806l.isBinderAlive()) {
                    crashlytics();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f10030l.yandex((C5744l) this.f10031l.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
