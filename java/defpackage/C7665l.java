package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؚۧؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7665l extends BroadcastReceiver {
    public static final IntentFilter crashlytics;
    public static final List loadAd;
    public final C12242l yandex;

    static {
        List listRemoteconfig = AbstractC14055l.remoteconfig("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        loadAd = listRemoteconfig;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listRemoteconfig.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        crashlytics = intentFilter;
    }

    public C7665l(C12242l c12242l) {
        this.yandex = c12242l;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC16901l.inmobi(loadAd, intent.getAction())) {
            yandex(context);
        }
    }

    public final void yandex(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || AbstractC2847l.license(powerManager);
        }
        if (zIsDeviceIdleMode) {
            this.yandex.invoke();
        }
    }
}
