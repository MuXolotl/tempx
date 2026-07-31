package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0139l extends AbstractC10102l {
    public final C6990l amazon;
    public final AbstractC5235l crashlytics;
    public final AbstractC1377l loadAd;
    public final List purchase;
    public final List yandex;

    public C0139l(List list, C16172l c16172l, AbstractC5235l abstractC5235l, C6990l c6990l, List list2) {
        this.yandex = list;
        this.loadAd = c16172l;
        this.crashlytics = abstractC5235l;
        this.amazon = c6990l;
        this.purchase = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10102l)) {
            return false;
        }
        AbstractC10102l abstractC10102l = (AbstractC10102l) obj;
        List list = this.yandex;
        if (list == null) {
            if (((C0139l) abstractC10102l).yandex != null) {
                return false;
            }
        } else if (!list.equals(((C0139l) abstractC10102l).yandex)) {
            return false;
        }
        AbstractC1377l abstractC1377l = this.loadAd;
        if (abstractC1377l == null) {
            if (((C0139l) abstractC10102l).loadAd != null) {
                return false;
            }
        } else if (!abstractC1377l.equals(((C0139l) abstractC10102l).loadAd)) {
            return false;
        }
        AbstractC5235l abstractC5235l = this.crashlytics;
        if (abstractC5235l == null) {
            if (((C0139l) abstractC10102l).crashlytics != null) {
                return false;
            }
        } else if (!abstractC5235l.equals(((C0139l) abstractC10102l).crashlytics)) {
            return false;
        }
        C0139l c0139l = (C0139l) abstractC10102l;
        return this.amazon.equals(c0139l.amazon) && this.purchase.equals(c0139l.purchase);
    }

    public final int hashCode() {
        List list = this.yandex;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC1377l abstractC1377l = this.loadAd;
        int iHashCode2 = (iHashCode ^ (abstractC1377l == null ? 0 : abstractC1377l.hashCode())) * 1000003;
        AbstractC5235l abstractC5235l = this.crashlytics;
        return this.purchase.hashCode() ^ (((((abstractC5235l != null ? abstractC5235l.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.amazon.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.yandex + ", exception=" + this.loadAd + ", appExitInfo=" + this.crashlytics + ", signal=" + this.amazon + ", binaries=" + this.purchase + "}";
    }
}
