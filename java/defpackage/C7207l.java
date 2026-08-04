package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؚِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7207l extends AbstractC16800l {
    public final int amazon;
    public final long billing;
    public final int crashlytics;
    public final String loadAd;
    public final AbstractC16800l[] mopub;
    public final long purchase;

    public C7207l(String str, int i, int i2, long j, long j2, AbstractC16800l[] abstractC16800lArr) {
        super("CHAP");
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = j;
        this.billing = j2;
        this.mopub = abstractC16800lArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7207l.class != obj.getClass()) {
            return false;
        }
        C7207l c7207l = (C7207l) obj;
        return this.crashlytics == c7207l.crashlytics && this.amazon == c7207l.amazon && this.purchase == c7207l.purchase && this.billing == c7207l.billing && this.loadAd.equals(c7207l.loadAd) && Arrays.equals(this.mopub, c7207l.mopub);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((((((((527 + this.crashlytics) * 31) + this.amazon) * 31) + ((int) this.purchase)) * 31) + ((int) this.billing)) * 31);
    }
}
