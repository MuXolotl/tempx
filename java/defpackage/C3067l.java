package defpackage;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lْؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3067l {
    public static final /* synthetic */ InterfaceC13922l[] yandex = {AbstractC18202l.yandex.subs(new C7953l(C3067l.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

    public static final C16033l loadAd(C3067l c3067l, String str) {
        c3067l.getClass();
        return new C16033l("provider:" + str);
    }

    public static final String yandex(C3067l c3067l) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
        declaredMethod.setAccessible(true);
        return (String) declaredMethod.invoke(null, null);
    }
}
