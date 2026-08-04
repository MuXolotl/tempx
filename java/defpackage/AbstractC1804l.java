package defpackage;

import android.os.Build;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1804l {
    public static C14025l loadAd() {
        String str = C14025l.f27330l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return C6162l.ads(vKXApplication.getDir("ota", 0)).purchase("vkx_ota_payload.apk");
    }

    public static boolean yandex() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getPackageManager().canRequestPackageInstalls();
    }
}
