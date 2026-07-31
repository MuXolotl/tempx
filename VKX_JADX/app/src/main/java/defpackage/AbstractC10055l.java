package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lَؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10055l {
    public static boolean amazon = false;
    public static Method crashlytics;
    public static final C13268l yandex = C13268l.loadAd;
    public static final Object loadAd = new Object();

    public static void loadAd(Context context, String str) throws C3412l {
        try {
            if (crashlytics == null) {
                crashlytics = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            crashlytics.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new C3412l(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x003e, B:15:0x0043, B:12:0x002a, B:17:0x0045, B:19:0x004c, B:25:0x0058, B:27:0x005c, B:30:0x0097, B:33:0x00a7, B:34:0x00ac, B:36:0x00ae, B:37:0x00bc), top: B:40:0x0014, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x003e, B:15:0x0043, B:12:0x002a, B:17:0x0045, B:19:0x004c, B:25:0x0058, B:27:0x005c, B:30:0x0097, B:33:0x00a7, B:34:0x00ac, B:36:0x00ae, B:37:0x00bc), top: B:40:0x0014, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void yandex(Context context) throws C3412l, C1226l {
        boolean z;
        Context contextCreatePackageContext;
        Context context2;
        AbstractC1051l.isPro(context, "Context must not be null");
        yandex.getClass();
        C13268l.amazon(context);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (loadAd) {
            Context context3 = null;
            if (amazon) {
                z = amazon;
                int i = AbstractC4197l.purchase;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    amazon = true;
                    if (!z) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        C17516l c17516l = new C17516l(Context.class, context, 5);
                        Class cls = Long.TYPE;
                        AbstractC17332l.purchase(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", c17516l, new C17181l(cls, Long.valueOf(jUptimeMillis), 5), new C17181l(cls, Long.valueOf(jUptimeMillis2), 5));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    loadAd(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C3412l(8);
                }
            }
            try {
                context2 = C7269l.crashlytics(context, C7269l.purchase, "com.google.android.gms.providerinstaller.dynamite").yandex;
            } catch (C2315l e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                loadAd(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = amazon;
            int i2 = AbstractC4197l.purchase;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                amazon = true;
                if (!z) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        C17516l c17516l2 = new C17516l(Context.class, context, 5);
                        Class cls2 = Long.TYPE;
                        AbstractC17332l.purchase(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", c17516l2, new C17181l(cls2, Long.valueOf(jUptimeMillis), 5), new C17181l(cls2, Long.valueOf(jUptimeMillis3), 5));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                loadAd(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C3412l(8);
            }
            throw th;
        }
    }
}
