package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: renamed from: lؘّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5639l {
    public static void crashlytics(Object obj, Object obj2) {
        C8339l.billing(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback loadAd(Object obj, LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l) {
        Objects.requireNonNull(layoutInflaterFactory2C14405l);
        C10037l c10037l = new C10037l(0, layoutInflaterFactory2C14405l);
        C8339l.billing(obj).registerOnBackInvokedCallback(1000000, c10037l);
        return c10037l;
    }

    public static OnBackInvokedDispatcher yandex(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
