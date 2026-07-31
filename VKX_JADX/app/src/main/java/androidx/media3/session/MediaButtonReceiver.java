package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import defpackage.AbstractC5020l;
import defpackage.AbstractC6427l;
import defpackage.AbstractC7720l;
import defpackage.C1759l;
import defpackage.C4875l;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static final String[] yandex = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            AbstractC6427l.billing("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 79) {
            AbstractC6427l.vip("MediaButtonReceiver", "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = yandex;
            if (i >= 3) {
                C1759l.isPro(Arrays.toString(strArr), "Could not find any Service that handles any of the actions ");
                return;
            }
            String str = strArr[i];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    StringBuilder sbIsVip = AbstractC5020l.isVip("Expected 1 service that handles ", str, ", found ");
                    sbIsVip.append(listQueryIntentServices.size());
                    throw new IllegalStateException(sbIsVip.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                Intent intent3 = new Intent();
                intent3.setComponent(componentName);
                intent3.fillIn(intent, 0);
                try {
                    AbstractC7720l.mopub(context, intent3);
                    return;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT < 31 || !C4875l.vip(e)) {
                        throw e;
                    }
                    AbstractC6427l.admob("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + C4875l.yandex(e).getMessage());
                    return;
                }
            }
            i++;
        }
    }
}
