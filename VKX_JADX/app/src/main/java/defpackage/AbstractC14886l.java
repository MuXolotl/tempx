package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: renamed from: lٔٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14886l {
    public static final C13268l yandex = C13268l.loadAd;
    public static final Object loadAd = new Object();
    public static C7269l crashlytics = null;
    public static String amazon = "0";

    public static void loadAd(Context context) {
        synchronized (loadAd) {
            try {
                if (yandex()) {
                    return;
                }
                AbstractC1051l.isPro(context, "Context must not be null");
                ClassLoader classLoader = AbstractC14886l.class.getClassLoader();
                AbstractC1051l.subs(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    C13268l c13268l = yandex;
                    c13268l.getClass();
                    C13268l.amazon(context);
                    try {
                        C7269l c7269lCrashlytics = C7269l.crashlytics(context, C7269l.loadAd, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = c7269lCrashlytics.yandex.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == AbstractC14886l.class.getClassLoader()) {
                                Log.e("lٔٓٗ", "ImplVersion class is missing from Cronet module.");
                                throw new C3412l(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) method.invoke(null, null);
                            AbstractC1051l.subs(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, null);
                            AbstractC1051l.subs(str);
                            amazon = str;
                            if (apiLevel <= iIntValue) {
                                crashlytics = c7269lCrashlytics;
                                return;
                            }
                            if (c13268l.loadAd(2, context, "cr") == null) {
                                Log.e("lٔٓٗ", "Unable to fetch error resolution intent");
                                throw new C3412l(2);
                            }
                            String str2 = amazon;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(iIntValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str2);
                            throw new C1226l(2, sb.toString());
                        } catch (Exception e) {
                            Log.e("lٔٓٗ", "Unable to read Cronet version from the Cronet module ", e);
                            throw ((C3412l) new C3412l(8).initCause(e));
                        }
                    } catch (C2315l e2) {
                        Log.e("lٔٓٗ", "Unable to load Cronet module", e2);
                        throw ((C3412l) new C3412l(8).initCause(e2));
                    }
                } catch (ClassNotFoundException e3) {
                    Log.e("lٔٓٗ", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C3412l) new C3412l(10).initCause(e3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean yandex() {
        C7269l c7269l;
        synchronized (loadAd) {
            c7269l = crashlytics;
        }
        return c7269l != null;
    }
}
