package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.AbstractC8576l;
import defpackage.C6096l;
import defpackage.C8339l;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final C6096l yandex = new C6096l(13);
    public static final LinkedHashMap loadAd = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !AbstractC8576l.yandex(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            C8339l.smaato("Intent is missing ActionKey extra");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            C8339l.smaato("Intent is missing AppWidgetId extra");
        } else {
            C6096l.amazon(intExtra);
            Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
        }
    }
}
