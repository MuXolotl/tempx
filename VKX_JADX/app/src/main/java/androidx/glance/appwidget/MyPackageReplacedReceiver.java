package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC10774l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC6604l;
import defpackage.C1306l;
import defpackage.C5003l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int yandex = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            C8339l.smaato("onReceive context is null");
            return;
        }
        if (intent == null) {
            C8339l.smaato("onReceive intent is null");
        } else {
            if (AbstractC6604l.loadAd(context, new C1306l(1))) {
                return;
            }
            AbstractC10774l.billing(this, AbstractC11463l.yandex, new C5003l(context, null, 3));
        }
    }
}
