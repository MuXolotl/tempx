package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: lْؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13140l {
    public final C3585l amazon;
    public Object crashlytics;
    public final MediaSessionManager loadAd;
    public Method yandex = null;
    public final C18247l purchase = new C18247l(this);

    public C13140l(Context context, C3585l c3585l) {
        this.loadAd = (MediaSessionManager) context.getSystemService("media_session");
        this.amazon = c3585l;
        crashlytics(context);
    }

    public static Method loadAd() {
        for (Method method : MediaSessionManager.class.getMethods()) {
            if (method.getName().equals("setOnVolumeKeyLongPressListener")) {
                return method;
            }
        }
        return null;
    }

    public static String yandex(Context context) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT < 26) {
            return "Android version is not supported";
        }
        if (context.checkCallingOrSelfPermission("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") != 0) {
            return "Permission android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER not granted!";
        }
        if (loadAd() == null) {
            return "setOnVolumeKeyLongPressListener method not found!";
        }
        try {
            cls = Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return "onVolumeKeyLongPressListener interface not found!";
        }
        return null;
    }

    public final void crashlytics(Context context) {
        Class<?> cls;
        if ((this.yandex == null || this.crashlytics == null) && yandex(context) == null) {
            this.yandex = loadAd();
            ClassLoader classLoader = C3585l.class.getClassLoader();
            try {
                cls = Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            this.crashlytics = Proxy.newProxyInstance(classLoader, new Class[]{cls}, this.purchase);
        }
    }
}
