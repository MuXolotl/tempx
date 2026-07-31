package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؔٝۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2778l {
    public final C1410l amazon;
    public final String crashlytics;
    public final String loadAd;
    public final ArrayList purchase;
    public final String yandex;

    public C2778l(String str, String str2, String str3, C1410l c1410l, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = c1410l;
        this.purchase = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2778l)) {
            return false;
        }
        C2778l c2778l = (C2778l) obj;
        if (!AbstractC8576l.yandex(this.yandex, c2778l.yandex) || !AbstractC8576l.yandex(this.loadAd, c2778l.loadAd) || !AbstractC8576l.yandex(this.crashlytics, c2778l.crashlytics)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return AbstractC8576l.yandex(str, str) && this.amazon.equals(c2778l.amazon) && this.purchase.equals(c2778l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.yandex + ", versionName=" + this.loadAd + ", appBuildVersion=" + this.crashlytics + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.amazon + ", appProcessDetails=" + this.purchase + ')';
    }
}
