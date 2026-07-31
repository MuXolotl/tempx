package defpackage;

/* JADX INFO: renamed from: lؒؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0840l {
    public int amazon;
    public int crashlytics;
    public int loadAd;
    public int yandex;

    public C0840l(int i, int i2, int i3, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840l)) {
            return false;
        }
        C0840l c0840l = (C0840l) obj;
        return this.yandex == c0840l.yandex && this.loadAd == c0840l.loadAd && this.crashlytics == c0840l.crashlytics && this.amazon == c0840l.amazon;
    }

    public final int hashCode() {
        return (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    public final String toString() {
        int i = this.yandex;
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        int i4 = this.amazon;
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Change(preStart=", ", preEnd=", ", originalStart=");
        sbSubscription.append(i3);
        sbSubscription.append(", originalEnd=");
        sbSubscription.append(i4);
        sbSubscription.append(")");
        return sbSubscription.toString();
    }
}
