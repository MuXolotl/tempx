package ua.itaysonlab.vkx.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC10586l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC1295l;
import defpackage.C0469l;
import defpackage.C16287l;
import defpackage.C16968l;
import defpackage.C18662l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class AutostartReceiver extends BroadcastReceiver {
    public static final C16968l yandex = new C16968l();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1676458352) {
                if (iHashCode != 1244161670 || !action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) != 2) {
                    return;
                }
            } else if (!action.equals("android.intent.action.HEADSET_PLUG") || intent.getIntExtra("state", 0) != 1) {
                return;
            }
            C16287l.yandex.getClass();
            if (C16287l.yandex()) {
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(AbstractC1295l.crashlytics(), AbstractC11463l.yandex));
                AbstractC10999l.mopub(c18662lYandex, null, 0, new C0469l(pendingResultGoAsync, c18662lYandex, applicationContext, intent, null, 2), 3);
            }
        }
    }
}
