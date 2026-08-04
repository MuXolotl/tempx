package defpackage;

/* JADX INFO: renamed from: lًّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C12462l implements InterfaceC7493l {
    public static final C11158l Companion = new C11158l();
    public static final InterfaceC1220l[] mopub = {AbstractC9968l.crashlytics(2, new C5146l(0)), null, null, null, null, null};
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final EnumC9763l yandex;

    public /* synthetic */ C12462l(int i, EnumC9763l enumC9763l, String str, String str2, int i2, String str3, String str4) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C9532l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC9763l;
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = 4;
        } else {
            this.amazon = i2;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str3;
        }
        if ((i & 32) == 0) {
            this.billing = "";
        } else {
            this.billing = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12462l)) {
            return false;
        }
        C12462l c12462l = (C12462l) obj;
        return this.yandex == c12462l.yandex && AbstractC8576l.yandex(this.loadAd, c12462l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12462l.crashlytics) && this.amazon == c12462l.amazon && AbstractC8576l.yandex(this.purchase, c12462l.purchase) && AbstractC8576l.yandex(this.billing, c12462l.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + AbstractC12589l.advert((AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics) + this.amazon) * 31, 31, this.purchase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoFactorRequired(validationType=");
        sb.append(this.yandex);
        sb.append(", phoneMask=");
        sb.append(this.loadAd);
        sb.append(", maskedEmail=");
        sb.append(this.crashlytics);
        sb.append(", codeLength=");
        sb.append(this.amazon);
        sb.append(", deviceName=");
        sb.append(this.purchase);
        sb.append(", validationSid=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }
}
