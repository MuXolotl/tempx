package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lًۥ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8394l {
    public static volatile C8394l crashlytics;
    public static final Object loadAd = new Object();
    public final ConcurrentHashMap yandex = new ConcurrentHashMap();

    public static C8394l loadAd() {
        if (crashlytics == null) {
            synchronized (loadAd) {
                try {
                    if (crashlytics == null) {
                        crashlytics = new C8394l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C8394l c8394l = crashlytics;
        AbstractC1051l.subs(c8394l);
        return c8394l;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public final boolean amazon(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            try {
                if ((C16797l.yandex(context).yandex(0, component.getPackageName()).flags & 2097152) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (serviceConnection instanceof ServiceConnectionC14198l) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.yandex;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public final void crashlytics(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC14198l)) {
            ConcurrentHashMap concurrentHashMap = this.yandex;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean yandex(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return amazon(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }
}
