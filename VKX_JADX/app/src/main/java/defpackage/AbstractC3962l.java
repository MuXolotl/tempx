package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: lؙؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3962l {
    public static void loadAd(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static LocaleList yandex(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
