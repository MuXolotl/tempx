package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12560l extends AbstractC4637l {
    public final Integer amazon;
    public final ArrayList billing;
    public final C4511l crashlytics;
    public final long loadAd;
    public final String purchase;
    public final long yandex;

    public C12560l(long j, long j2, C4511l c4511l, Integer num, String str, ArrayList arrayList) {
        EnumC16883l enumC16883l = EnumC16883l.f32935l;
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = c4511l;
        this.amazon = num;
        this.purchase = str;
        this.billing = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4637l)) {
            return false;
        }
        C12560l c12560l = (C12560l) ((AbstractC4637l) obj);
        if (this.yandex != c12560l.yandex || this.loadAd != c12560l.loadAd || !this.crashlytics.equals(c12560l.crashlytics)) {
            return false;
        }
        Integer num = c12560l.amazon;
        Integer num2 = this.amazon;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = c12560l.purchase;
        String str2 = this.purchase;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.billing.equals(c12560l.billing)) {
            return false;
        }
        Object obj2 = EnumC16883l.f32935l;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        Integer num = this.amazon;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.purchase;
        return ((this.billing.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ EnumC16883l.f32935l.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.yandex + ", requestUptimeMs=" + this.loadAd + ", clientInfo=" + this.crashlytics + ", logSource=" + this.amazon + ", logSourceName=" + this.purchase + ", logEvents=" + this.billing + ", qosTier=" + EnumC16883l.f32935l + "}";
    }
}
