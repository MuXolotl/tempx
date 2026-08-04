package defpackage;

/* JADX INFO: renamed from: lٌؚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7139l {
    public final C3548l amazon;
    public final C6952l crashlytics;
    public final String loadAd;
    public final String yandex;

    public C7139l(String str, String str2, C6952l c6952l, C3548l c3548l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = c6952l;
        this.amazon = c3548l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7139l)) {
            return false;
        }
        C7139l c7139l = (C7139l) obj;
        return this.yandex.equals(c7139l.yandex) && AbstractC8576l.yandex(this.loadAd, c7139l.loadAd) && this.crashlytics.equals(c7139l.crashlytics) && AbstractC8576l.yandex(this.amazon, c7139l.amazon);
    }

    public final int hashCode() {
        return this.amazon.yandex.hashCode() + ((this.crashlytics.yandex.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd)) * 961);
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("NetworkRequest(url=", this.yandex, ", method=", this.loadAd, ", headers=");
        sbLicense.append(this.crashlytics);
        sbLicense.append(", body=null, extras=");
        sbLicense.append(this.amazon);
        sbLicense.append(")");
        return sbLicense.toString();
    }
}
