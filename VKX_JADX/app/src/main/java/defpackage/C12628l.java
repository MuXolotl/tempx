package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12628l extends AbstractC11339l {
    public final AbstractC9941l admob;
    public final long amazon;
    public final String billing;
    public final AbstractC12734l crashlytics;
    public final Integer loadAd;
    public final long mopub;
    public final byte[] purchase;
    public final AbstractC11217l subs;
    public final long yandex;

    public C12628l(long j, Integer num, AbstractC12734l abstractC12734l, long j2, byte[] bArr, String str, long j3, AbstractC9941l abstractC9941l, AbstractC11217l abstractC11217l) {
        this.yandex = j;
        this.loadAd = num;
        this.crashlytics = abstractC12734l;
        this.amazon = j2;
        this.purchase = bArr;
        this.billing = str;
        this.mopub = j3;
        this.admob = abstractC9941l;
        this.subs = abstractC11217l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11339l) {
            AbstractC11339l abstractC11339l = (AbstractC11339l) obj;
            C12628l c12628l = (C12628l) abstractC11339l;
            if (this.yandex == c12628l.yandex) {
                Integer num = c12628l.loadAd;
                Integer num2 = this.loadAd;
                if (num2 != null ? num2.equals(num) : num == null) {
                    AbstractC12734l abstractC12734l = c12628l.crashlytics;
                    AbstractC12734l abstractC12734l2 = this.crashlytics;
                    if (abstractC12734l2 != null ? abstractC12734l2.equals(abstractC12734l) : abstractC12734l == null) {
                        if (this.amazon == c12628l.amazon) {
                            if (Arrays.equals(this.purchase, abstractC11339l instanceof C12628l ? ((C12628l) abstractC11339l).purchase : c12628l.purchase)) {
                                String str = c12628l.billing;
                                String str2 = this.billing;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.mopub == c12628l.mopub) {
                                        AbstractC9941l abstractC9941l = c12628l.admob;
                                        AbstractC9941l abstractC9941l2 = this.admob;
                                        if (abstractC9941l2 != null ? abstractC9941l2.equals(abstractC9941l) : abstractC9941l == null) {
                                            AbstractC11217l abstractC11217l = c12628l.subs;
                                            AbstractC11217l abstractC11217l2 = this.subs;
                                            if (abstractC11217l2 != null ? abstractC11217l2.equals(abstractC11217l) : abstractC11217l == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.loadAd;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC12734l abstractC12734l = this.crashlytics;
        int iHashCode2 = (iHashCode ^ (abstractC12734l == null ? 0 : abstractC12734l.hashCode())) * 1000003;
        long j2 = this.amazon;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.purchase)) * 1000003;
        String str = this.billing;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.mopub;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC9941l abstractC9941l = this.admob;
        int iHashCode5 = (i2 ^ (abstractC9941l == null ? 0 : abstractC9941l.hashCode())) * 1000003;
        AbstractC11217l abstractC11217l = this.subs;
        return iHashCode5 ^ (abstractC11217l != null ? abstractC11217l.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.yandex + ", eventCode=" + this.loadAd + ", complianceData=" + this.crashlytics + ", eventUptimeMs=" + this.amazon + ", sourceExtension=" + Arrays.toString(this.purchase) + ", sourceExtensionJsonProto3=" + this.billing + ", timezoneOffsetSeconds=" + this.mopub + ", networkConnectionInfo=" + this.admob + ", experimentIds=" + this.subs + "}";
    }
}
