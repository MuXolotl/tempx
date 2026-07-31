package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.AbstractC10774l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC6604l;
import defpackage.AbstractC9679l;
import defpackage.C0384l;
import defpackage.C14724l;
import defpackage.C3445l;
import defpackage.Ctransient;
import defpackage.InterfaceC14029l;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int yandex = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            C14724l c14724lPurchase = AbstractC9679l.purchase(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            C3445l c3445l = new C3445l(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (AbstractC6604l.loadAd(context, new Ctransient(string, c3445l, c14724lPurchase, 1))) {
                return;
            }
            AbstractC10774l.billing(this, AbstractC11463l.yandex, new C0384l(context, string, c3445l, c14724lPurchase, (InterfaceC14029l) null, 0));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }
}
