package defpackage;

/* JADX INFO: renamed from: lٍِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4057l {
    public String loadAd;
    public C4258l yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4057l)) {
            return false;
        }
        C4057l c4057l = (C4057l) obj;
        return this.yandex.equals(c4057l.yandex) && AbstractC8576l.yandex(this.loadAd, c4057l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.yandex);
        sb.append(", typeFlexibilityId=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
