package defpackage;

/* JADX INFO: renamed from: lؙِۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C12219l {
    public static final C2418l Companion = new C2418l();
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public /* synthetic */ C12219l(int i, String str, String str2, String str3, String str4, String str5) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C5804l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12219l)) {
            return false;
        }
        C12219l c12219l = (C12219l) obj;
        return AbstractC8576l.yandex(this.yandex, c12219l.yandex) && AbstractC8576l.yandex(this.loadAd, c12219l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12219l.crashlytics) && AbstractC8576l.yandex(this.amazon, c12219l.amazon) && AbstractC8576l.yandex(this.purchase, c12219l.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amazon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthUserDto(firstName=");
        sb.append(this.yandex);
        sb.append(", lastName=");
        sb.append(this.loadAd);
        sb.append(", phone=");
        sb.append(this.crashlytics);
        sb.append(", photo200=");
        sb.append(this.amazon);
        sb.append(", photo50=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
