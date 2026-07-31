package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًۜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8272l {
    public final int amazon;
    public final int crashlytics;
    public final List loadAd;
    public final int purchase;
    public final List yandex;

    public C8272l(int i, int i2, int i3, List list, List list2) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8272l)) {
            return false;
        }
        C8272l c8272l = (C8272l) obj;
        return this.yandex.equals(c8272l.yandex) && AbstractC8576l.yandex(this.loadAd, c8272l.loadAd) && this.crashlytics == c8272l.crashlytics && this.amazon == c8272l.amazon && this.purchase == c8272l.purchase;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        List list = this.loadAd;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.crashlytics) * 31) + this.amazon) * 31) + this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb.append(this.yandex);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.loadAd);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.crashlytics);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.amazon);
        sb.append(", maxFpsForAllSizes=");
        return AbstractC0653l.adcel(sb, this.purchase, ')');
    }
}
