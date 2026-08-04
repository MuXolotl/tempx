package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؔۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2829l {
    public static final int amazon = 12;
    public static final int crashlytics = 10;
    public static final int loadAd = 9;
    public static final int[] yandex = {13, 15, 14};

    public static final void crashlytics(Object obj) {
        if (obj instanceof C18435l) {
            throw ((C18435l) obj).f36003l;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int loadAd(String str) {
        switch (str.hashCode()) {
            case -1568706863:
                if (str.equals("solarized")) {
                    return R.string.themes_category_solarized;
                }
                break;
            case -1480249367:
                if (str.equals("community")) {
                    return R.string.themes_category_community;
                }
                break;
            case -1130647735:
                if (str.equals("adwaita")) {
                    return R.string.themes_category_adwaita;
                }
                break;
            case 3789:
                if (str.equals("wd")) {
                    return R.string.themes_category_wd;
                }
                break;
            case 104461:
                if (str.equals("ios")) {
                    return R.string.themes_category_ios;
                }
                break;
            case 116238:
                if (str.equals("uwp")) {
                    return R.string.themes_category_uwp;
                }
                break;
            case 118797:
                if (str.equals("xmb")) {
                    return R.string.themes_category_xmb;
                }
                break;
            case 3075958:
                if (str.equals("dark")) {
                    return R.string.themes_category_dark;
                }
                break;
            case 3387315:
                if (str.equals("nord")) {
                    return R.string.themes_category_nord;
                }
                break;
            case 102970646:
                if (str.equals("light")) {
                    return R.string.themes_category_light;
                }
                break;
            case 112257890:
                if (str.equals("vk_me")) {
                    return R.string.themes_category_vk_me;
                }
                break;
            case 298986879:
                if (str.equals("gruvbox")) {
                    return R.string.themes_category_gruvbox;
                }
                break;
            case 1131700897:
                if (str.equals("android_q")) {
                    return R.string.themes_category_q;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    return R.string.themes_category_default;
                }
                break;
        }
        C1759l.subs(63, str, "ThemeCatalog2 id -> res not defined for id ");
        return 0;
    }

    public static void yandex(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC5121l.adcel(window, z);
        } else {
            if (i >= 30) {
                AbstractC5121l.startapp(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
