package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12606l {
    public final C12823l amazon;
    public final Function0 billing;
    public final Integer crashlytics;
    public final String loadAd;
    public final boolean mopub;
    public final C12823l purchase;
    public final String yandex;

    public C12606l(String str, String str2, Integer num, C12823l c12823l, C12823l c12823l2, Function0 function0, boolean z) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = num;
        this.amazon = c12823l;
        this.purchase = c12823l2;
        this.billing = function0;
        this.mopub = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12606l)) {
            return false;
        }
        C12606l c12606l = (C12606l) obj;
        return AbstractC8576l.yandex(this.yandex, c12606l.yandex) && AbstractC8576l.yandex(this.loadAd, c12606l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12606l.crashlytics) && AbstractC8576l.yandex(this.amazon, c12606l.amazon) && AbstractC8576l.yandex(this.purchase, c12606l.purchase) && AbstractC8576l.yandex(this.billing, c12606l.billing) && this.mopub == c12606l.mopub;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C12823l c12823l = this.amazon;
        int iHashCode4 = (iHashCode3 + (c12823l == null ? 0 : c12823l.hashCode())) * 31;
        C12823l c12823l2 = this.purchase;
        int iHashCode5 = (iHashCode4 + (c12823l2 == null ? 0 : c12823l2.hashCode())) * 31;
        Function0 function0 = this.billing;
        return ((iHashCode5 + (function0 != null ? function0.hashCode() : 0)) * 31) + (this.mopub ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notification(title=");
        sb.append(this.yandex);
        sb.append(", text=");
        sb.append(this.loadAd);
        sb.append(", iconRes=");
        sb.append(this.crashlytics);
        sb.append(", primaryButton=");
        sb.append(this.amazon);
        sb.append(", secondaryButton=");
        sb.append(this.purchase);
        sb.append(", actionOnTimeout=");
        sb.append(this.billing);
        sb.append(", neverHideAutomatically=");
        return AbstractC0653l.tapsense(sb, this.mopub, ')');
    }
}
