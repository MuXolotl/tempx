package defpackage;

/* JADX INFO: renamed from: lؘٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5737l {
    public static final C12506l Companion = new C12506l();
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C5737l(int i, int i2, String str, String str2) {
        this.yandex = (i & 1) == 0 ? 0 : i2;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5737l)) {
            return false;
        }
        C5737l c5737l = (C5737l) obj;
        return this.yandex == c5737l.yandex && AbstractC8576l.yandex(this.loadAd, c5737l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c5737l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkCertificate(id=");
        sb.append(this.yandex);
        sb.append(", hpkp=");
        sb.append(this.loadAd);
        sb.append(", cert=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
