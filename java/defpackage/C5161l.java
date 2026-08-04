package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٜؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5161l extends AbstractC5909l {
    public final Boolean amazon;
    public final List billing;
    public final List crashlytics;
    public final List loadAd;
    public final int mopub;
    public final AbstractC1431l purchase;
    public final C0139l yandex;

    public C5161l(C0139l c0139l, List list, List list2, Boolean bool, AbstractC1431l abstractC1431l, List list3, int i) {
        this.yandex = c0139l;
        this.loadAd = list;
        this.crashlytics = list2;
        this.amazon = bool;
        this.purchase = abstractC1431l;
        this.billing = list3;
        this.mopub = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5909l)) {
            return false;
        }
        C5161l c5161l = (C5161l) ((AbstractC5909l) obj);
        if (!this.yandex.equals(c5161l.yandex)) {
            return false;
        }
        List list = c5161l.loadAd;
        List list2 = this.loadAd;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = c5161l.crashlytics;
        List list4 = this.crashlytics;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = c5161l.amazon;
        Boolean bool2 = this.amazon;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        AbstractC1431l abstractC1431l = c5161l.purchase;
        AbstractC1431l abstractC1431l2 = this.purchase;
        if (abstractC1431l2 == null) {
            if (abstractC1431l != null) {
                return false;
            }
        } else if (!abstractC1431l2.equals(abstractC1431l)) {
            return false;
        }
        List list5 = c5161l.billing;
        List list6 = this.billing;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.mopub == c5161l.mopub;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        List list = this.loadAd;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.crashlytics;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.amazon;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC1431l abstractC1431l = this.purchase;
        int iHashCode5 = (iHashCode4 ^ (abstractC1431l == null ? 0 : abstractC1431l.hashCode())) * 1000003;
        List list3 = this.billing;
        return this.mopub ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.yandex);
        sb.append(", customAttributes=");
        sb.append(this.loadAd);
        sb.append(", internalKeys=");
        sb.append(this.crashlytics);
        sb.append(", background=");
        sb.append(this.amazon);
        sb.append(", currentProcessDetails=");
        sb.append(this.purchase);
        sb.append(", appProcessDetails=");
        sb.append(this.billing);
        sb.append(", uiOrientation=");
        return AbstractC14814l.remoteconfig(this.mopub, "}", sb);
    }
}
