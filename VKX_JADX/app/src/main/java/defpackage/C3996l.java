package defpackage;

/* JADX INFO: renamed from: lٌَؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3996l extends AbstractC1211l {
    public final String amazon;
    public final long billing;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;

    public C3996l(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            C6541l.subs("Null rolloutId");
            throw null;
        }
        this.loadAd = str;
        if (str2 == null) {
            C6541l.subs("Null parameterKey");
            throw null;
        }
        this.crashlytics = str2;
        this.amazon = str3;
        if (str4 == null) {
            C6541l.subs("Null variantId");
            throw null;
        }
        this.purchase = str4;
        this.billing = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1211l)) {
            return false;
        }
        C3996l c3996l = (C3996l) ((AbstractC1211l) obj);
        return this.loadAd.equals(c3996l.loadAd) && this.crashlytics.equals(c3996l.crashlytics) && this.amazon.equals(c3996l.amazon) && this.purchase.equals(c3996l.purchase) && this.billing == c3996l.billing;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.loadAd.hashCode() ^ 1000003) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003;
        long j = this.billing;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.loadAd);
        sb.append(", parameterKey=");
        sb.append(this.crashlytics);
        sb.append(", parameterValue=");
        sb.append(this.amazon);
        sb.append(", variantId=");
        sb.append(this.purchase);
        sb.append(", templateVersion=");
        return AbstractC15560l.ads(this.billing, "}", sb);
    }
}
