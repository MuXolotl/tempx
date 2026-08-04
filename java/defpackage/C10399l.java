package defpackage;

/* JADX INFO: renamed from: lَٚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10399l {
    public static final C16156l Companion = new C16156l();
    public final String admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String yandex;

    public /* synthetic */ C10399l(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str3;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str4;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str5;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str6;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str7;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10399l)) {
            return false;
        }
        C10399l c10399l = (C10399l) obj;
        return AbstractC8576l.yandex(this.yandex, c10399l.yandex) && AbstractC8576l.yandex(this.loadAd, c10399l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c10399l.crashlytics) && AbstractC8576l.yandex(this.amazon, c10399l.amazon) && AbstractC8576l.yandex(this.purchase, c10399l.purchase) && AbstractC8576l.yandex(this.billing, c10399l.billing) && AbstractC8576l.yandex(this.mopub, c10399l.mopub) && AbstractC8576l.yandex(this.admob, c10399l.admob);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amazon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchase;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billing;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mopub;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.admob;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthDeviceInfoDto(browserName=");
        sb.append(this.yandex);
        sb.append(", browserPackage=");
        sb.append(this.loadAd);
        sb.append(", browserPageLink=");
        sb.append(this.crashlytics);
        sb.append(", browserUrlScheme=");
        sb.append(this.amazon);
        sb.append(", ip=");
        sb.append(this.purchase);
        sb.append(", location=");
        sb.append(this.billing);
        sb.append(", locationMap=");
        sb.append(this.mopub);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.admob, ')');
    }
}
