package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lَۛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10573l {
    public static int amazon;
    public static Boolean crashlytics;
    public static final Method loadAd;
    public static float purchase;
    public static final Field yandex;

    static {
        try {
            loadAd = AbstractC2648l.crashlytics(Class.forName("android.os.SystemProperties"), String.class);
            Field declaredField = null;
            NoSuchFieldException e = null;
            for (Class<Build.VERSION> superclass = Build.VERSION.class; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    declaredField = superclass.getDeclaredField("SEM_PLATFORM_INT");
                    break;
                } catch (NoSuchFieldException e2) {
                    e = e2;
                }
            }
            if (declaredField == null) {
                throw e;
            }
            declaredField.setAccessible(true);
            yandex = declaredField;
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static boolean crashlytics() {
        if (crashlytics != null) {
            return !TextUtils.isEmpty(yandex("ro.config.knox")) && crashlytics.booleanValue();
        }
        try {
            int i = yandex.getInt(null);
            if (i < 100000) {
                crashlytics = Boolean.FALSE;
                return false;
            }
            int i2 = i - 90000;
            amazon = i2 / ModuleDescriptor.MODULE_VERSION;
            purchase = (i2 % ModuleDescriptor.MODULE_VERSION) / 100;
            crashlytics = Boolean.TRUE;
            return crashlytics.booleanValue();
        } catch (Throwable unused) {
            crashlytics = Boolean.FALSE;
        }
    }

    public static boolean loadAd(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public static String yandex(String str) {
        try {
            return (String) loadAd.invoke(null, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
