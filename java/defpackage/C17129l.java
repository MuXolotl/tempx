package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: lّٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17129l {
    public final List amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String yandex;

    public C17129l(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.yandex = str;
        str2.getClass();
        this.loadAd = str2;
        this.crashlytics = str3;
        list.getClass();
        this.amazon = list;
        this.purchase = str4;
        this.billing = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.mopub = AbstractC9361l.advert(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.yandex + ", mProviderPackage: " + this.loadAd + ", mQuery: " + this.crashlytics + ", mSystemFont: " + this.purchase + ", mVariationSettings: " + this.billing + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.amazon;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
