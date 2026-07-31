package defpackage;

/* JADX INFO: renamed from: lٌؘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9114l {
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C9114l(String str, String str2, String str3) {
        if (str == null) {
            C6541l.subs("Null crashlyticsInstallId");
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9114l) {
            C9114l c9114l = (C9114l) obj;
            if (this.yandex.equals(c9114l.yandex)) {
                String str = c9114l.loadAd;
                String str2 = this.loadAd;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c9114l.crashlytics;
                    String str4 = this.crashlytics;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.crashlytics;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.yandex);
        sb.append(", firebaseInstallationId=");
        sb.append(this.loadAd);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC0653l.ads(sb, this.crashlytics, "}");
    }
}
