package defpackage;

import java.util.Collection;

/* JADX INFO: renamed from: lٌؙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8622l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final Collection loadAd;
    public final boolean purchase;
    public final C6639l yandex;

    public C8622l(C6639l c6639l, Collection collection, int i) {
        this(c6639l, collection, c6639l.yandex == EnumC10249l.f20871l, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8622l)) {
            return false;
        }
        C8622l c8622l = (C8622l) obj;
        return AbstractC8576l.yandex(this.yandex, c8622l.yandex) && AbstractC8576l.yandex(this.loadAd, c8622l.loadAd) && this.crashlytics == c8622l.crashlytics && this.amazon == c8622l.amazon && this.purchase == c8622l.purchase;
    }

    public final int hashCode() {
        return ((((((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.yandex);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.loadAd);
        sb.append(", definitelyNotNull=");
        sb.append(this.crashlytics);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.amazon);
        sb.append(", preferQualifierOverSupertype=");
        return AbstractC0653l.tapsense(sb, this.purchase, ')');
    }

    public C8622l(C6639l c6639l, Collection collection, boolean z, boolean z2, boolean z3) {
        this.yandex = c6639l;
        this.loadAd = collection;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = z3;
    }
}
