package defpackage;

import android.os.Build;
import android.provider.Settings;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٜؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2617l {
    public static final C9385l yandex = AbstractC14707l.yandex(new C8864l(3));

    public static final String yandex() {
        if (Build.VERSION.SDK_INT < 25) {
            return Build.MODEL;
        }
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        String string = Settings.Global.getString(vKXApplication.getContentResolver(), "device_name");
        String str = Build.MODEL;
        if (AbstractC8576l.yandex(string, str)) {
            return str;
        }
        return string + " (" + str + ')';
    }
}
