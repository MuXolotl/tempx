package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: lٍؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9374l {
    public static void amazon(Configuration configuration, C2462l c2462l) {
        configuration.setLocales(LocaleList.forLanguageTags(c2462l.yandex.yandex()));
    }

    public static void crashlytics(C2462l c2462l) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2462l.yandex.yandex()));
    }

    public static C2462l loadAd(Configuration configuration) {
        return C2462l.loadAd(configuration.getLocales().toLanguageTags());
    }

    public static void yandex(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
