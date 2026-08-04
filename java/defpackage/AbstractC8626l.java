package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌٌؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8626l {
    public static final Object yandex = new Object();
    public static final HashMap loadAd = new HashMap();

    public static Context yandex(Context context) {
        Context applicationContext = context.getApplicationContext();
        int iHashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(i >= 34 ? AbstractC5917l.remoteconfig(context) : 0), i >= 30 ? AbstractC5121l.crashlytics(context) : null);
        synchronized (yandex) {
            try {
                HashMap map = loadAd;
                WeakReference weakReference = (WeakReference) map.get(str);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        map.remove(str);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i >= 34) {
                    applicationContext = AbstractC5917l.crashlytics(applicationContext, AbstractC5917l.remoteconfig(context));
                }
                if (i >= 30) {
                    String strCrashlytics = AbstractC5121l.crashlytics(context);
                    if (!Objects.equals(strCrashlytics, AbstractC5121l.crashlytics(applicationContext))) {
                        applicationContext = AbstractC5121l.yandex(applicationContext, strCrashlytics);
                    }
                }
                map.put(str, new WeakReference(applicationContext));
                return applicationContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
