package defpackage;

/* JADX INFO: renamed from: lٖٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17163l {
    public final int crashlytics;
    public final long loadAd;
    public final String yandex;

    public C17163l(long j, int i, String str) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17163l)) {
            return false;
        }
        C17163l c17163l = (C17163l) obj;
        String str = c17163l.yandex;
        String str2 = this.yandex;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.loadAd != c17163l.loadAd) {
            return false;
        }
        int i = c17163l.crashlytics;
        int i2 = this.crashlytics;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC5020l.firebase(i2, i);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.loadAd;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.crashlytics;
        return i ^ (i2 != 0 ? AbstractC5020l.inmobi(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.yandex);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.loadAd);
        sb.append(", responseCode=");
        int i = this.crashlytics;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
