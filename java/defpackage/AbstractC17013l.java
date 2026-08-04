package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: renamed from: lٍٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17013l {
    static {
        C14513l.applovin("WakeLocks");
    }

    public static final PowerManager.WakeLock yandex(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (C5107l.yandex) {
        }
        return wakeLockNewWakeLock;
    }
}
