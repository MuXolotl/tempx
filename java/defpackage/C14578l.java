package defpackage;

/* JADX INFO: renamed from: lَٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14578l {
    public static final C16396l Companion = new C16396l();
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final String purchase;
    public final int yandex;

    public /* synthetic */ C14578l(int i, int i2, int i3, int i4, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C10544l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i3;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0;
        } else {
            this.crashlytics = i4;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14578l)) {
            return false;
        }
        C14578l c14578l = (C14578l) obj;
        return this.yandex == c14578l.yandex && this.loadAd == c14578l.loadAd && this.crashlytics == c14578l.crashlytics && AbstractC8576l.yandex(this.amazon, c14578l.amazon) && AbstractC8576l.yandex(this.purchase, c14578l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC12589l.advert(((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31, 31, this.amazon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSetAuthCodeStatusResponseDto(status=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        sb.append(this.loadAd);
        sb.append(", pollingDelay=");
        sb.append(this.crashlytics);
        sb.append(", faqUrl=");
        sb.append(this.amazon);
        sb.append(", domain=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
