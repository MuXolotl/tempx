package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: lٍؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2462l {
    public static final C2462l loadAd = yandex(new Locale[0]);
    public final InterfaceC17227l yandex;

    public C2462l(InterfaceC17227l interfaceC17227l) {
        this.yandex = interfaceC17227l;
    }

    public static C2462l loadAd(String str) {
        if (str == null || str.isEmpty()) {
            return loadAd;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return yandex(localeArr);
    }

    public static C2462l yandex(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C2462l(new C15621l(AbstractC11965l.subs(localeArr))) : new C2462l(new C0561l(localeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2462l) {
            return this.yandex.equals(((C2462l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex.toString();
    }
}
