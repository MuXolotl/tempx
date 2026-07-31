package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.IStartCarApp;
import androidx.car.app.utils.billing;
import defpackage.C5131l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int yandex = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IBinder binder;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
        } else {
            binder = null;
        }
        if (binder == null) {
            Log.e("CarApp.NBR", "Notification intent missing expected extra: " + intent);
        } else {
            IStartCarApp iStartCarAppAsInterface = IStartCarApp.Stub.asInterface(binder);
            Objects.requireNonNull(iStartCarAppAsInterface);
            billing.amazon("startCarApp from notification", new C5131l(iStartCarAppAsInterface, intent, 1));
        }
    }
}
