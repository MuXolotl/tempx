package defpackage;

/* JADX INFO: renamed from: lَْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17889l implements InterfaceC7493l {
    public static final C0443l Companion = new C0443l();
    public final String amazon;
    public final int crashlytics;
    public final String loadAd;
    public final long yandex;

    public /* synthetic */ C17889l(int i, int i2, long j, String str, String str2) {
        this.yandex = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        this.crashlytics = (i & 4) == 0 ? 0 : i2;
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17889l)) {
            return false;
        }
        C17889l c17889l = (C17889l) obj;
        return this.yandex == c17889l.yandex && AbstractC8576l.yandex(this.loadAd, c17889l.loadAd) && this.crashlytics == c17889l.crashlytics && AbstractC8576l.yandex(this.amazon, c17889l.amazon);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.amazon.hashCode() + ((AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd) + this.crashlytics) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(userId=");
        sb.append(this.yandex);
        sb.append(", accessToken=");
        sb.append(this.loadAd);
        sb.append(", accessTokenExpiresIn=");
        sb.append(this.crashlytics);
        sb.append(", trustedHash=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }

    public C17889l(long j, String str, int i) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = "";
    }
}
