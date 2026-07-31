package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1379l extends AbstractC5235l {
    public final String admob;
    public final int amazon;
    public final long billing;
    public final int crashlytics;
    public final String loadAd;
    public final long mopub;
    public final long purchase;
    public final List subs;
    public final int yandex;

    public C1379l(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = j;
        this.billing = j2;
        this.mopub = j3;
        this.admob = str2;
        this.subs = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5235l) {
            C1379l c1379l = (C1379l) ((AbstractC5235l) obj);
            if (this.yandex == c1379l.yandex && this.loadAd.equals(c1379l.loadAd) && this.crashlytics == c1379l.crashlytics && this.amazon == c1379l.amazon && this.purchase == c1379l.purchase && this.billing == c1379l.billing && this.mopub == c1379l.mopub) {
                String str = c1379l.admob;
                String str2 = this.admob;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c1379l.subs;
                    List list2 = this.subs;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics) * 1000003) ^ this.amazon) * 1000003;
        long j = this.purchase;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.billing;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.mopub;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.admob;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.subs;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.yandex + ", processName=" + this.loadAd + ", reasonCode=" + this.crashlytics + ", importance=" + this.amazon + ", pss=" + this.purchase + ", rss=" + this.billing + ", timestamp=" + this.mopub + ", traceFile=" + this.admob + ", buildIdMappingForArch=" + this.subs + "}";
    }
}
