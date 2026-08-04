package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11718l {
    public static final C15578l yandex = new C15578l(858414323, false, new C5142l(12));
    public static final C15578l loadAd = new C15578l(801267795, false, new C5142l(13));
    public static final C15578l crashlytics = new C15578l(-305792666, false, new C5142l(14));
    public static final C15578l amazon = new C15578l(-1062353811, false, new C2464l(21));

    public static void admob(Status status, Object obj, C2350l c2350l) {
        if (status.billing()) {
            c2350l.yandex.metrica(obj);
        } else {
            c2350l.crashlytics(AbstractC5578l.amazon(status));
        }
    }

    public static Intent amazon(Context context, ComponentName componentName) {
        String strPurchase = purchase(context, componentName);
        if (strPurchase == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strPurchase);
        return purchase(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static void billing(Status status, Object obj, C2350l c2350l) {
        if (status.billing()) {
            c2350l.loadAd(obj);
        } else {
            c2350l.yandex(AbstractC5578l.amazon(status));
        }
    }

    public static Intent crashlytics(AbstractActivityC16046l abstractActivityC16046l) {
        Intent parentActivityIntent = abstractActivityC16046l.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strPurchase = purchase(abstractActivityC16046l, abstractActivityC16046l.getComponentName());
            if (strPurchase == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC16046l, strPurchase);
            try {
                return purchase(abstractActivityC16046l, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strPurchase + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final void loadAd(C6222l c6222l, InterfaceC14859l interfaceC14859l, AbstractC9544l abstractC9544l, float f, C0387l c0387l, C9867l c9867l, AbstractC3239l abstractC3239l) {
        ArrayList arrayList = c6222l.admob;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5048l c5048l = (C5048l) arrayList.get(i);
            c5048l.yandex.isVip(interfaceC14859l, abstractC9544l, f, c0387l, c9867l, abstractC3239l);
            interfaceC14859l.startapp(0.0f, c5048l.yandex.subs());
        }
    }

    public static String mopub(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static String purchase(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else {
            i = i2 >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void yandex(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC4804l.yandex;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC4208l.yandex;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
