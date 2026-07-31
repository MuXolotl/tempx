package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٌٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17335l {
    public final boolean admob;
    public final String amazon;
    public final boolean billing;
    public final long crashlytics;
    public final String isPro;
    public final String loadAd;
    public final boolean mopub;
    public final String purchase;
    public final boolean subs;
    public final String yandex;
    public static final Pattern firebase = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern smaato = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern remoteconfig = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern vip = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C17335l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = z;
        this.mopub = z2;
        this.admob = z3;
        this.subs = z4;
        this.isPro = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17335l)) {
            return false;
        }
        C17335l c17335l = (C17335l) obj;
        return c17335l.yandex.equals(this.yandex) && c17335l.loadAd.equals(this.loadAd) && c17335l.crashlytics == this.crashlytics && c17335l.amazon.equals(this.amazon) && c17335l.purchase.equals(this.purchase) && c17335l.billing == this.billing && c17335l.mopub == this.mopub && c17335l.admob == this.admob && c17335l.subs == this.subs && AbstractC8576l.yandex(c17335l.isPro, this.isPro);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(527, 31, this.yandex), 31, this.loadAd);
        long j = this.crashlytics;
        int iAdvert2 = (((((((AbstractC12589l.advert(AbstractC12589l.advert((iAdvert + ((int) (j ^ (j >>> 32)))) * 31, 31, this.amazon), 31, this.purchase) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237)) * 31) + (this.subs ? 1231 : 1237)) * 31;
        String str = this.isPro;
        return iAdvert2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append('=');
        sb.append(this.loadAd);
        if (this.admob) {
            long j = this.crashlytics;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) AbstractC3655l.yandex.get()).format(new Date(j)));
            }
        }
        if (!this.subs) {
            sb.append("; domain=");
            sb.append(this.amazon);
        }
        sb.append("; path=");
        sb.append(this.purchase);
        if (this.billing) {
            sb.append("; secure");
        }
        if (this.mopub) {
            sb.append("; httponly");
        }
        String str = this.isPro;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
