package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؙۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6705l {
    public final String admob;
    public final String amazon;
    public final ArrayList billing;
    public final String crashlytics;
    public final String loadAd;
    public final List mopub;
    public final int purchase;
    public final String subs;
    public final String yandex;

    public C6705l(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = i;
        this.billing = arrayList;
        this.mopub = arrayList2;
        this.admob = str5;
        this.subs = str6;
    }

    public final URI admob() {
        C13170l c13170lBilling = billing();
        ArrayList arrayList = c13170lBilling.crashlytics;
        String str = (String) c13170lBilling.admob;
        c13170lBilling.admob = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC1068l.yandex(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = c13170lBilling.amazon;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC1068l.yandex(0, 0, 67, str2, "\\^`{|}") : null);
            }
        }
        String str3 = (String) c13170lBilling.subs;
        c13170lBilling.subs = str3 != null ? AbstractC1068l.yandex(0, 0, 35, str3, " \"#<>\\^`{|}") : null;
        String string = c13170lBilling.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                C11467l.metrica(e);
                return null;
            }
        }
    }

    public final String amazon() {
        if (this.mopub == null) {
            return null;
        }
        String str = this.subs;
        int iM3321extends = AbstractC12024l.m3321extends(str, '?', 0, 6) + 1;
        return str.substring(iM3321extends, AbstractC7712l.amazon(str, '#', iM3321extends, str.length()));
    }

    public final C13170l billing() {
        int i;
        C13170l c13170l = new C13170l();
        String str = this.yandex;
        c13170l.purchase = str;
        c13170l.billing = purchase();
        c13170l.mopub = yandex();
        c13170l.admob = this.amazon;
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? 443 : -1;
        }
        int i2 = this.purchase;
        c13170l.loadAd = i2 != i ? i2 : -1;
        ArrayList arrayList = c13170l.crashlytics;
        arrayList.clear();
        arrayList.addAll(crashlytics());
        String strAmazon = amazon();
        String strSubstring = null;
        c13170l.amazon = strAmazon != null ? C13170l.firebase(AbstractC1068l.yandex(0, 0, 83, strAmazon, " \"'<>#")) : null;
        if (this.admob != null) {
            String str2 = this.subs;
            strSubstring = str2.substring(AbstractC12024l.m3321extends(str2, '#', 0, 6) + 1);
        }
        c13170l.subs = strSubstring;
        return c13170l;
    }

    public final ArrayList crashlytics() {
        int length = this.yandex.length() + 3;
        String str = this.subs;
        int iM3321extends = AbstractC12024l.m3321extends(str, '/', length, 4);
        int iCrashlytics = AbstractC7712l.crashlytics(iM3321extends, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM3321extends < iCrashlytics) {
            int i = iM3321extends + 1;
            int iAmazon = AbstractC7712l.amazon(str, '/', i, iCrashlytics);
            arrayList.add(str.substring(i, iAmazon));
            iM3321extends = iAmazon;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6705l) && ((C6705l) obj).subs.equals(this.subs);
    }

    public final int hashCode() {
        return this.subs.hashCode();
    }

    public final String loadAd() {
        int length = this.yandex.length() + 3;
        String str = this.subs;
        int iM3321extends = AbstractC12024l.m3321extends(str, '/', length, 4);
        return str.substring(iM3321extends, AbstractC7712l.crashlytics(iM3321extends, str.length(), str, "?#"));
    }

    public final String mopub() {
        C13170l c13170l;
        try {
            c13170l = new C13170l();
            c13170l.isPro(this, "/...");
        } catch (IllegalArgumentException unused) {
            c13170l = null;
        }
        c13170l.getClass();
        c13170l.billing = AbstractC1068l.yandex(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        c13170l.mopub = AbstractC1068l.yandex(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return c13170l.crashlytics().subs;
    }

    public final String purchase() {
        if (this.loadAd.length() == 0) {
            return "";
        }
        int length = this.yandex.length() + 3;
        String str = this.subs;
        return str.substring(length, AbstractC7712l.crashlytics(length, str.length(), str, ":@"));
    }

    public final String toString() {
        return this.subs;
    }

    public final String yandex() {
        if (this.crashlytics.length() == 0) {
            return "";
        }
        int length = this.yandex.length() + 3;
        String str = this.subs;
        return str.substring(AbstractC12024l.m3321extends(str, ':', length, 4) + 1, AbstractC12024l.m3321extends(str, '@', 0, 6));
    }
}
