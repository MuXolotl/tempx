package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: renamed from: lٍۣۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9749l {
    public static final String admob;
    public static final String firebase;
    public static final String isPro;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String subs;
    public static final String vip;
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final int purchase;
    public final Uri yandex;

    static {
        String str = AbstractC15323l.yandex;
        admob = Integer.toString(0, 36);
        subs = Integer.toString(1, 36);
        isPro = Integer.toString(2, 36);
        firebase = Integer.toString(3, 36);
        smaato = Integer.toString(4, 36);
        remoteconfig = Integer.toString(5, 36);
        vip = Integer.toString(6, 36);
    }

    public C9749l(C1652l c1652l) {
        this.yandex = (Uri) c1652l.amazon;
        this.loadAd = c1652l.yandex;
        this.crashlytics = (String) c1652l.purchase;
        this.amazon = c1652l.loadAd;
        this.purchase = c1652l.crashlytics;
        this.billing = (String) c1652l.billing;
        this.mopub = (String) c1652l.mopub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9749l)) {
            return false;
        }
        C9749l c9749l = (C9749l) obj;
        return this.yandex.equals(c9749l.yandex) && Objects.equals(this.loadAd, c9749l.loadAd) && Objects.equals(this.crashlytics, c9749l.crashlytics) && this.amazon == c9749l.amazon && this.purchase == c9749l.purchase && Objects.equals(this.billing, c9749l.billing) && Objects.equals(this.mopub, c9749l.mopub);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.amazon) * 31) + this.purchase) * 31;
        String str3 = this.billing;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mopub;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
