package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lٌؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8746l {
    public final boolean admob;
    public final String amazon;
    public final List billing;
    public final AbstractC15619l crashlytics;
    public final C17345l firebase;
    public final boolean isPro;
    public final List loadAd;
    public final List mopub;
    public final String purchase;
    public final boolean subs;
    public final boolean yandex;

    public C8746l(boolean z, AbstractC1186l abstractC1186l, AbstractC15619l abstractC15619l, String str, String str2, AbstractC1186l abstractC1186l2, AbstractC1186l abstractC1186l3, boolean z2, boolean z3, boolean z4, C17345l c17345l) {
        this.yandex = z;
        this.loadAd = abstractC1186l;
        this.crashlytics = abstractC15619l;
        this.amazon = str;
        this.purchase = str2;
        this.billing = abstractC1186l2;
        this.mopub = abstractC1186l3;
        this.admob = z2;
        this.subs = z3;
        this.isPro = z4;
        this.firebase = c17345l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8746l)) {
            return false;
        }
        C8746l c8746l = (C8746l) obj;
        return this.yandex == c8746l.yandex && AbstractC8576l.yandex(this.loadAd, c8746l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8746l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8746l.amazon) && AbstractC8576l.yandex(this.purchase, c8746l.purchase) && AbstractC8576l.yandex(this.billing, c8746l.billing) && AbstractC8576l.yandex(this.mopub, c8746l.mopub) && this.admob == c8746l.admob && this.subs == c8746l.subs && this.isPro == c8746l.isPro && AbstractC8576l.yandex(this.firebase, c8746l.firebase);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.yandex), this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, Boolean.valueOf(this.admob), Boolean.valueOf(this.subs), Boolean.valueOf(this.isPro));
    }

    public final String toString() {
        boolean z = this.yandex;
        int length = String.valueOf(z).length();
        List list = this.loadAd;
        int length2 = String.valueOf(list).length();
        AbstractC15619l abstractC15619l = this.crashlytics;
        int length3 = String.valueOf(abstractC15619l).length();
        String str = this.amazon;
        int length4 = String.valueOf(str).length();
        String str2 = this.purchase;
        int length5 = String.valueOf(str2).length();
        List list2 = this.billing;
        int length6 = String.valueOf(list2).length();
        List list3 = this.mopub;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.admob;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.subs;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.isPro;
        int length10 = String.valueOf(z4).length();
        C17345l c17345l = this.firebase;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(c17345l).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(abstractC15619l);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(c17345l);
        sb.append(")");
        return sb.toString();
    }
}
