package defpackage;

/* JADX INFO: renamed from: lٍۚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9806l {
    public static final C16471l Companion = new C16471l();
    public final String amazon;
    public final int billing;
    public final C10399l crashlytics;
    public final C13892l loadAd;
    public final int purchase;
    public final String yandex;

    public /* synthetic */ C9806l(int i, String str, C13892l c13892l, C10399l c10399l, String str2, int i2, int i3) {
        if (55 != (i & 55)) {
            AbstractC11036l.isPro(i, 55, C1997l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = c13892l;
        this.crashlytics = c10399l;
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
        this.purchase = i2;
        this.billing = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9806l)) {
            return false;
        }
        C9806l c9806l = (C9806l) obj;
        return AbstractC8576l.yandex(this.yandex, c9806l.yandex) && AbstractC8576l.yandex(this.loadAd, c9806l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9806l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9806l.amazon) && this.purchase == c9806l.purchase && this.billing == c9806l.billing;
    }

    public final int hashCode() {
        return ((AbstractC12589l.advert((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31, 31, this.amazon) + this.purchase) * 31) + this.billing;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthInfoDto(authId=");
        sb.append(this.yandex);
        sb.append(", clientInfo=");
        sb.append(this.loadAd);
        sb.append(", deviceInfo=");
        sb.append(this.crashlytics);
        sb.append(", domain=");
        sb.append(this.amazon);
        sb.append(", expiresIn=");
        sb.append(this.purchase);
        sb.append(", flowType=");
        return AbstractC0653l.adcel(sb, this.billing, ')');
    }
}
