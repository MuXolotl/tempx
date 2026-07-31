package androidx.car.app;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import defpackage.AbstractC12179l;
import defpackage.AbstractC8960l;
import defpackage.AbstractC9859l;
import defpackage.C3185l;
import defpackage.C4444l;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class CarAppService extends Service {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C3185l f277l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AppInfo f278l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashMap f279l = new HashMap();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if ("AUTO_DRIVE".equals(str)) {
                AbstractC9859l.loadAd(new Runnable() { // from class: androidx.car.app.mopub
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarAppService carAppService = this.f310l;
                        synchronized (carAppService.f279l) {
                            try {
                                for (CarAppBinder carAppBinder : carAppService.f279l.values()) {
                                    if (Log.isLoggable("CarApp", 3)) {
                                        Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                                    }
                                    carAppBinder.onAutoDriveEnabled();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    public AbstractC12179l loadAd() {
        throw new RuntimeException("Please override and implement CarAppService#onCreateSession(SessionInfo).");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        Bundle extras = intent.getExtras();
        SessionInfo sessionInfoAdmob = extras == null ? false : extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE") ? AbstractC8960l.admob(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        synchronized (this.f279l) {
            try {
                if (!this.f279l.containsKey(sessionInfoAdmob)) {
                    this.f279l.put(sessionInfoAdmob, new CarAppBinder(this, sessionInfoAdmob));
                }
                carAppBinder = (CarAppBinder) this.f279l.get(sessionInfoAdmob);
                Objects.requireNonNull(carAppBinder);
            } catch (Throwable th) {
                throw th;
            }
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        synchronized (this.f279l) {
            try {
                Iterator it = this.f279l.values().iterator();
                while (it.hasNext()) {
                    ((CarAppBinder) it.next()).destroy();
                }
                this.f279l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onUnbind intent: " + intent);
        }
        Bundle extras = intent.getExtras();
        AbstractC9859l.loadAd(new admob(this, extras == null ? false : extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE") ? AbstractC8960l.admob(intent) : SessionInfo.DEFAULT_SESSION_INFO, 0));
        if (!Log.isLoggable("CarApp", 3)) {
            return true;
        }
        Log.d("CarApp", "onUnbind completed");
        return true;
    }

    public abstract C4444l yandex();
}
