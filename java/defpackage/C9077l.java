package defpackage;

/* JADX INFO: renamed from: lٌؘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9077l implements InterfaceC18302l {
    public final int admob;
    public final C13299l amazon;
    public final C3183l billing;
    public final long crashlytics;
    public final int loadAd;
    public final int mopub;
    public final C4361l purchase;
    public final C10068l subs;
    public final int yandex;

    public C9077l(int i, int i2, long j, C13299l c13299l, C4361l c4361l, C3183l c3183l, int i3, int i4, C10068l c10068l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = j;
        this.amazon = c13299l;
        this.purchase = c4361l;
        this.billing = c3183l;
        this.mopub = i3;
        this.admob = i4;
        this.subs = c10068l;
        if (C1794l.yandex(j, C1794l.crashlytics) || C1794l.crashlytics(j) >= 0.0f) {
            return;
        }
        AbstractC1786l.loadAd("lineHeight can't be negative (" + C1794l.crashlytics(j) + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9077l)) {
            return false;
        }
        C9077l c9077l = (C9077l) obj;
        return this.yandex == c9077l.yandex && this.loadAd == c9077l.loadAd && C1794l.yandex(this.crashlytics, c9077l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9077l.amazon) && AbstractC8576l.yandex(this.purchase, c9077l.purchase) && AbstractC8576l.yandex(this.billing, c9077l.billing) && this.mopub == c9077l.mopub && this.admob == c9077l.admob && AbstractC8576l.yandex(this.subs, c9077l.subs);
    }

    public final int hashCode() {
        int iAmazon = (C1794l.amazon(this.crashlytics) + (((this.yandex * 31) + this.loadAd) * 31)) * 31;
        C13299l c13299l = this.amazon;
        int iHashCode = (iAmazon + (c13299l != null ? c13299l.hashCode() : 0)) * 31;
        C4361l c4361l = this.purchase;
        int iHashCode2 = (iHashCode + (c4361l != null ? c4361l.hashCode() : 0)) * 31;
        C3183l c3183l = this.billing;
        int iHashCode3 = (((((iHashCode2 + (c3183l != null ? c3183l.hashCode() : 0)) * 31) + this.mopub) * 31) + this.admob) * 31;
        C10068l c10068l = this.subs;
        return iHashCode3 + (c10068l != null ? c10068l.hashCode() : 0);
    }

    public final String toString() {
        String strYandex = C10258l.yandex(this.yandex);
        String strYandex2 = C16546l.yandex(this.loadAd);
        String strPurchase = C1794l.purchase(this.crashlytics);
        String strYandex3 = C17427l.yandex(this.mopub);
        String strYandex4 = C0106l.yandex(this.admob);
        StringBuilder sbLicense = AbstractC14814l.license("ParagraphStyle(textAlign=", strYandex, ", textDirection=", strYandex2, ", lineHeight=");
        sbLicense.append(strPurchase);
        sbLicense.append(", textIndent=");
        sbLicense.append(this.amazon);
        sbLicense.append(", platformStyle=");
        sbLicense.append(this.purchase);
        sbLicense.append(", lineHeightStyle=");
        sbLicense.append(this.billing);
        sbLicense.append(", lineBreak=");
        AbstractC9361l.appmetrica(sbLicense, strYandex3, ", hyphens=", strYandex4, ", textMotion=");
        sbLicense.append(this.subs);
        sbLicense.append(")");
        return sbLicense.toString();
    }

    public final C9077l yandex(C9077l c9077l) {
        return c9077l == null ? this : AbstractC6992l.yandex(this, c9077l.yandex, c9077l.loadAd, c9077l.crashlytics, c9077l.amazon, c9077l.purchase, c9077l.billing, c9077l.mopub, c9077l.admob, c9077l.subs);
    }
}
