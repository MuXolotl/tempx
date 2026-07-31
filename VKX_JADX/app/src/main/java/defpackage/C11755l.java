package defpackage;

/* JADX INFO: renamed from: lَِۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11755l {
    public final C17163l amazon;
    public final String crashlytics;
    public final String loadAd;
    public final int purchase;
    public final String yandex;

    public C11755l(String str, String str2, String str3, C17163l c17163l, int i) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = c17163l;
        this.purchase = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11755l)) {
            return false;
        }
        C11755l c11755l = (C11755l) obj;
        String str = c11755l.yandex;
        String str2 = this.yandex;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c11755l.loadAd;
        String str4 = this.loadAd;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c11755l.crashlytics;
        String str6 = this.crashlytics;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        C17163l c17163l = c11755l.amazon;
        C17163l c17163l2 = this.amazon;
        if (c17163l2 == null) {
            if (c17163l != null) {
                return false;
            }
        } else if (!c17163l2.equals(c17163l)) {
            return false;
        }
        int i = c11755l.purchase;
        int i2 = this.purchase;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC5020l.firebase(i2, i);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.loadAd;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C17163l c17163l = this.amazon;
        int iHashCode4 = (iHashCode3 ^ (c17163l == null ? 0 : c17163l.hashCode())) * 1000003;
        int i = this.purchase;
        return iHashCode4 ^ (i != 0 ? AbstractC5020l.inmobi(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.yandex);
        sb.append(", fid=");
        sb.append(this.loadAd);
        sb.append(", refreshToken=");
        sb.append(this.crashlytics);
        sb.append(", authToken=");
        sb.append(this.amazon);
        sb.append(", responseCode=");
        int i = this.purchase;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
