package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: lؒٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1042l {
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String yandex;

    public C1042l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = AbstractC0875l.yandex;
        AbstractC1051l.firebase("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.loadAd = str;
        this.yandex = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
        this.billing = str6;
        this.mopub = str7;
    }

    public static C1042l yandex(Context context) {
        C13645l c13645l = new C13645l(context);
        String strLicense = c13645l.license("google_app_id");
        if (TextUtils.isEmpty(strLicense)) {
            return null;
        }
        return new C1042l(strLicense, c13645l.license("google_api_key"), c13645l.license("firebase_database_url"), c13645l.license("ga_trackingId"), c13645l.license("gcm_defaultSenderId"), c13645l.license("google_storage_bucket"), c13645l.license("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1042l)) {
            return false;
        }
        C1042l c1042l = (C1042l) obj;
        return AbstractC7236l.amazon(this.loadAd, c1042l.loadAd) && AbstractC7236l.amazon(this.yandex, c1042l.yandex) && AbstractC7236l.amazon(this.crashlytics, c1042l.crashlytics) && AbstractC7236l.amazon(this.amazon, c1042l.amazon) && AbstractC7236l.amazon(this.purchase, c1042l.purchase) && AbstractC7236l.amazon(this.billing, c1042l.billing) && AbstractC7236l.amazon(this.mopub, c1042l.mopub);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.loadAd, this.yandex, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub});
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        c13568l.loadAd(this.loadAd, "applicationId");
        c13568l.loadAd(this.yandex, "apiKey");
        c13568l.loadAd(this.crashlytics, "databaseUrl");
        c13568l.loadAd(this.purchase, "gcmSenderId");
        c13568l.loadAd(this.billing, "storageBucket");
        c13568l.loadAd(this.mopub, "projectId");
        return c13568l.toString();
    }
}
