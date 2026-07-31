package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lِۣۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12215l {
    public static final Locale yandex;

    static {
        Locale locale;
        new HashMap();
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            locale = Locale.getDefault();
        } else {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                }
            }
            locale = Locale.getDefault();
        }
        yandex = locale;
    }
}
