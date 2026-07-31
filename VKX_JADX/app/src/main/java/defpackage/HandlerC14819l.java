package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: lُٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC14819l extends HandlerC4052l {
    public final /* synthetic */ C7181l loadAd;
    public final Context yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14819l(C7181l c7181l, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.loadAd = c7181l;
        this.yandex = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = C13268l.yandex;
        C7181l c7181l = this.loadAd;
        Context context = this.yandex;
        int iCrashlytics = c7181l.crashlytics(context, i2);
        int i3 = AbstractC4197l.purchase;
        if (iCrashlytics == 1 || iCrashlytics == 2 || iCrashlytics == 3 || iCrashlytics == 9) {
            Intent intentLoadAd = c7181l.loadAd(iCrashlytics, context, "n");
            c7181l.admob(context, new C10602l(iCrashlytics, intentLoadAd == null ? null : PendingIntent.getActivity(context, 0, intentLoadAd, 201326592), null));
        }
    }
}
