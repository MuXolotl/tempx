package defpackage;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؚٞؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7406l {
    public static ServiceConnectionC14520l billing;
    public static String crashlytics;
    public final NotificationManager yandex;
    public static final Object loadAd = new Object();
    public static HashSet amazon = new HashSet();
    public static final Object purchase = new Object();

    public C7406l(Context context) {
        this.yandex = (NotificationManager) context.getSystemService("notification");
    }

    public static Set yandex(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (loadAd) {
            if (string != null) {
                try {
                    if (!string.equals(crashlytics)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        amazon = hashSet2;
                        crashlytics = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = amazon;
        }
        return hashSet;
    }
}
