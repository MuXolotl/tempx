package defpackage;

/* JADX INFO: renamed from: lُُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11085l {
    public final int admob;
    public final int amazon;
    public final String billing;
    public final int crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final String loadAd;
    public final long mopub;
    public final String purchase;
    public final boolean remoteconfig;
    public final boolean smaato;
    public final boolean subs;
    public final String yandex;

    public C11085l(String str, String str2, int i, int i2, String str3, String str4, long j, int i3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = j;
        this.admob = i3;
        this.subs = (i3 & 1) != 0;
        this.isPro = (i3 & 2) != 0;
        this.firebase = (i3 & 4) != 0;
        this.smaato = (i3 & 8) != 0;
        this.remoteconfig = i == 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11085l)) {
            return false;
        }
        C11085l c11085l = (C11085l) obj;
        return this.yandex.equals(c11085l.yandex) && this.loadAd.equals(c11085l.loadAd) && this.crashlytics == c11085l.crashlytics && this.amazon == c11085l.amazon && this.purchase.equals(c11085l.purchase) && this.billing.equals(c11085l.billing) && this.mopub == c11085l.mopub && this.admob == c11085l.admob;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(AbstractC0653l.firebase(this.amazon, AbstractC0653l.firebase(this.crashlytics, AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31), 31), 31, this.purchase), 31, this.billing);
        long j = this.mopub;
        return ((((int) (j ^ (j >>> 32))) + iAdvert) * 31) + this.admob;
    }

    public final String toString() {
        String strSubscription = AbstractC2812l.subscription(this.mopub, "PropertyKey(key=", ")");
        StringBuilder sbLicense = AbstractC14814l.license("PropertyInfo(name=", this.yandex, ", publicName=", this.loadAd, ", type=");
        sbLicense.append(AbstractC4338l.m1529extends(this.crashlytics));
        sbLicense.append(", collectionType=");
        sbLicense.append(AbstractC11043l.license(this.amazon));
        sbLicense.append(", linkTarget=");
        AbstractC9361l.appmetrica(sbLicense, this.purchase, ", linkOriginPropertyName=", this.billing, ", key=");
        sbLicense.append(strSubscription);
        sbLicense.append(", flags=");
        sbLicense.append(this.admob);
        sbLicense.append(")");
        return sbLicense.toString();
    }
}
