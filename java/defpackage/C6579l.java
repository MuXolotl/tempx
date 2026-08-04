package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؙٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6579l {
    public final C2778l loadAd;
    public final String yandex;

    public C6579l(String str, C2778l c2778l) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.yandex = str;
        this.loadAd = c2778l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6579l)) {
            return false;
        }
        C6579l c6579l = (C6579l) obj;
        if (!AbstractC8576l.yandex(this.yandex, c6579l.yandex)) {
            return false;
        }
        String str = Build.MODEL;
        if (!AbstractC8576l.yandex(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return AbstractC8576l.yandex(str2, str2) && this.loadAd.equals(c6579l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((EnumC1615l.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC12589l.advert((((Build.MODEL.hashCode() + (this.yandex.hashCode() * 31)) * 31) + 48517563) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.yandex + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.4, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + EnumC1615l.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.loadAd + ')';
    }
}
