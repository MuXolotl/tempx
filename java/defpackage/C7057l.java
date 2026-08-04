package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؚؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7057l {
    public final int amazon;
    public final int billing;
    public final boolean crashlytics;
    public final String loadAd;
    public final int mopub;
    public final String purchase;
    public final String yandex;

    public C7057l(int i, int i2, String str, String str2, String str3, boolean z) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = z;
        this.amazon = i;
        this.purchase = str3;
        this.billing = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.mopub = AbstractC12024l.appmetrica(upperCase, "INT", false) ? 3 : (AbstractC12024l.appmetrica(upperCase, "CHAR", false) || AbstractC12024l.appmetrica(upperCase, "CLOB", false) || AbstractC12024l.appmetrica(upperCase, "TEXT", false)) ? 2 : AbstractC12024l.appmetrica(upperCase, "BLOB", false) ? 5 : (AbstractC12024l.appmetrica(upperCase, "REAL", false) || AbstractC12024l.appmetrica(upperCase, "FLOA", false) || AbstractC12024l.appmetrica(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7057l) {
                boolean z = this.amazon > 0;
                C7057l c7057l = (C7057l) obj;
                int i = c7057l.billing;
                if (z == (c7057l.amazon > 0) && AbstractC8576l.yandex(this.yandex, c7057l.yandex) && this.crashlytics == c7057l.crashlytics) {
                    String str = c7057l.purchase;
                    int i2 = this.billing;
                    String str2 = this.purchase;
                    if ((i2 != 1 || i != 2 || str2 == null || AbstractC0124l.admob(str2, str)) && ((i2 != 2 || i != 1 || str == null || AbstractC0124l.admob(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC0124l.admob(str2, str))) && this.mopub == c7057l.mopub))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.yandex.hashCode() * 31) + this.mopub) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.yandex);
        sb.append("',\n            |   type = '");
        sb.append(this.loadAd);
        sb.append("',\n            |   affinity = '");
        sb.append(this.mopub);
        sb.append("',\n            |   notNull = '");
        sb.append(this.crashlytics);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.amazon);
        sb.append("',\n            |   defaultValue = '");
        String str = this.purchase;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return AbstractC1833l.subs(AbstractC1833l.smaato(sb.toString()), "    ");
    }
}
