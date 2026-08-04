package defpackage;

/* JADX INFO: renamed from: lٌٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8768l {
    public static final C7077l Companion = new C7077l();
    public final Boolean admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final boolean loadAd;
    public final Boolean mopub;
    public final String purchase;
    public final String yandex;

    public /* synthetic */ C8768l(int i, String str, boolean z, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C0942l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = z;
        this.crashlytics = str2;
        this.amazon = str3;
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str4;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str5;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8768l)) {
            return false;
        }
        C8768l c8768l = (C8768l) obj;
        return AbstractC8576l.yandex(this.yandex, c8768l.yandex) && this.loadAd == c8768l.loadAd && AbstractC8576l.yandex(this.crashlytics, c8768l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8768l.amazon) && AbstractC8576l.yandex(this.purchase, c8768l.purchase) && AbstractC8576l.yandex(this.billing, c8768l.billing) && AbstractC8576l.yandex(this.mopub, c8768l.mopub) && AbstractC8576l.yandex(this.admob, c8768l.admob);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31, 31, this.crashlytics), 31, this.amazon);
        String str = this.purchase;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billing;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.mopub;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.admob;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "AuthUserDto(firstName=" + this.yandex + ", has2fa=" + this.loadAd + ", lastName=" + this.crashlytics + ", photo200=" + this.amazon + ", deactivated=" + this.purchase + ", phone=" + this.billing + ", hasPassword=" + this.mopub + ", canUnbindPhone=" + this.admob + ')';
    }
}
