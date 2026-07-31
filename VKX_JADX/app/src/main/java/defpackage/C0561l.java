package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: lؑۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0561l implements InterfaceC17227l {
    public static final Locale[] crashlytics = new Locale[0];
    public final String loadAd;
    public final Locale[] yandex;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C2462l c2462l = C2462l.loadAd;
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            return;
        }
        if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else if (strArrSplit.length == 1) {
            new Locale(strArrSplit[0]);
        } else {
            C8339l.metrica("Can not parse language tag: [en-Latn]");
        }
    }

    public C0561l(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.yandex = crashlytics;
            this.loadAd = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                C6541l.subs(AbstractC15560l.tapsense("list[", i, "] is null"));
                throw null;
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.yandex = (Locale[]) arrayList.toArray(new Locale[0]);
        this.loadAd = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0561l)) {
            return false;
        }
        Locale[] localeArr = ((C0561l) obj).yandex;
        Locale[] localeArr2 = this.yandex;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC17227l
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.yandex;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.yandex) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.InterfaceC17227l
    public final boolean isEmpty() {
        return this.yandex.length == 0;
    }

    @Override // defpackage.InterfaceC17227l
    public final Object loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC17227l
    public final int size() {
        return this.yandex.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.yandex;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC17227l
    public final String yandex() {
        return this.loadAd;
    }
}
