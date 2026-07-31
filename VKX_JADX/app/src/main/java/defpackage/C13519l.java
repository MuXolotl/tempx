package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: lْٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13519l {
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final int loadAd;
    public final String purchase;
    public final int yandex;

    public C13519l(int i, int i2, String str, String str2, String str3, String str4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = str;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13519l.class == obj.getClass()) {
            C13519l c13519l = (C13519l) obj;
            if (this.yandex == c13519l.yandex && this.loadAd == c13519l.loadAd && TextUtils.equals(this.crashlytics, c13519l.crashlytics) && TextUtils.equals(this.amazon, c13519l.amazon) && TextUtils.equals(this.purchase, c13519l.purchase) && TextUtils.equals(this.billing, c13519l.billing)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.yandex * 31) + this.loadAd) * 31;
        String str = this.crashlytics;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.amazon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.purchase;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.billing;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
