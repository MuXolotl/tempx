package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import defpackage.AbstractC2101l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC7720l;
import defpackage.C1424l;
import defpackage.C16227l;
import defpackage.C2987l;
import defpackage.C8339l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int yandex = 0;

    public static ComponentName yandex(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbIsVip = AbstractC5020l.isVip("Expected 1 service that handles ", str, ", found ");
        sbIsVip.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbIsVip.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameYandex = yandex(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameYandex != null) {
            intent.setComponent(componentNameYandex);
            try {
                AbstractC7720l.mopub(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !AbstractC2101l.loadAd(e)) {
                    throw e;
                }
                Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + AbstractC2101l.yandex(e).getMessage());
                return;
            }
        }
        ComponentName componentNameYandex2 = yandex(context, "android.media.browse.MediaBrowserService");
        if (componentNameYandex2 == null) {
            C8339l.smaato("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            return;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C1424l c1424l = new C1424l();
        c1424l.f3603l = new C16227l(0, c1424l);
        c1424l.f3601l = applicationContext;
        c1424l.f3605l = intent;
        c1424l.f3604l = pendingResultGoAsync;
        C2987l c2987l = new C2987l(applicationContext, componentNameYandex2, c1424l);
        c1424l.f3606l = c2987l;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        c2987l.yandex.loadAd.connect();
    }
}
