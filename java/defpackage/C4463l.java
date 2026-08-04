package defpackage;

/* JADX INFO: renamed from: lٜؖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4463l extends AbstractC9034l {
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public C4463l(String str, String str2, String str3, String str4, String str5, String str6) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
        this.billing = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9034l) {
            C4463l c4463l = (C4463l) ((AbstractC9034l) obj);
            if (this.yandex.equals(c4463l.yandex) && this.loadAd.equals(c4463l.loadAd)) {
                String str = c4463l.crashlytics;
                String str2 = this.crashlytics;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c4463l.amazon;
                    String str4 = this.amazon;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c4463l.purchase;
                        String str6 = this.purchase;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = c4463l.billing;
                            String str8 = this.billing;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        String str = this.crashlytics;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.amazon;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.purchase;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.billing;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.yandex);
        sb.append(", version=");
        sb.append(this.loadAd);
        sb.append(", displayVersion=");
        sb.append(this.crashlytics);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.amazon);
        sb.append(", developmentPlatform=");
        sb.append(this.purchase);
        sb.append(", developmentPlatformVersion=");
        return AbstractC0653l.ads(sb, this.billing, "}");
    }
}
