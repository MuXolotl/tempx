package defpackage;

/* JADX INFO: renamed from: lٌؙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6777l {
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C6777l(int i, int i2, int i3, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6777l)) {
            return false;
        }
        C6777l c6777l = (C6777l) obj;
        return this.yandex == c6777l.yandex && this.loadAd == c6777l.loadAd && this.crashlytics == c6777l.crashlytics && this.amazon == c6777l.amazon;
    }

    public final int hashCode() {
        return (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    public final String toString() {
        StringBuilder sbSubscription = AbstractC14814l.subscription(this.yandex, this.loadAd, "InsetsValues(left=", ", top=", ", right=");
        sbSubscription.append(this.crashlytics);
        sbSubscription.append(", bottom=");
        sbSubscription.append(this.amazon);
        sbSubscription.append(")");
        return sbSubscription.toString();
    }
}
