package defpackage;

/* JADX INFO: renamed from: lٍۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9923l implements InterfaceC7493l {
    public static final C0924l Companion = new C0924l();
    public final double amazon;
    public final String billing;
    public final double crashlytics;
    public final String loadAd;
    public final int purchase;
    public final String yandex;

    public /* synthetic */ C9923l(int i, String str, String str2, double d, double d2, int i2, String str3) {
        if ((i & 1) == 0) {
            this.yandex = "";
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0.0d;
        } else {
            this.crashlytics = d;
        }
        if ((i & 8) == 0) {
            this.amazon = 0.0d;
        } else {
            this.amazon = d2;
        }
        if ((i & 16) == 0) {
            this.purchase = 0;
        } else {
            this.purchase = i2;
        }
        if ((i & 32) == 0) {
            this.billing = "";
        } else {
            this.billing = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9923l)) {
            return false;
        }
        C9923l c9923l = (C9923l) obj;
        return AbstractC8576l.yandex(this.yandex, c9923l.yandex) && AbstractC8576l.yandex(this.loadAd, c9923l.loadAd) && Double.compare(this.crashlytics, c9923l.crashlytics) == 0 && Double.compare(this.amazon, c9923l.amazon) == 0 && this.purchase == c9923l.purchase && AbstractC8576l.yandex(this.billing, c9923l.billing);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        long jDoubleToLongBits = Double.doubleToLongBits(this.crashlytics);
        int i = (iAdvert + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.amazon);
        return this.billing.hashCode() + ((((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.purchase) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptchaRequired(captchaSid=");
        sb.append(this.yandex);
        sb.append(", captchaImg=");
        sb.append(this.loadAd);
        sb.append(", captchaTs=");
        sb.append(this.crashlytics);
        sb.append(", captchaRatio=");
        sb.append(this.amazon);
        sb.append(", captchaAttempt=");
        sb.append(this.purchase);
        sb.append(", redirectUri=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }
}
