package defpackage;

/* JADX INFO: renamed from: lٗؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16918l {
    public static final C16918l purchase = new C16918l(0, 0, 0, 0);
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C16918l(int i, int i2, int i3, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
    }

    public final int amazon() {
        return this.crashlytics - this.yandex;
    }

    public final long crashlytics() {
        return (((long) this.yandex) << 32) | (((long) this.loadAd) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16918l)) {
            return false;
        }
        C16918l c16918l = (C16918l) obj;
        return this.yandex == c16918l.yandex && this.loadAd == c16918l.loadAd && this.crashlytics == c16918l.crashlytics && this.amazon == c16918l.amazon;
    }

    public final int hashCode() {
        return (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    public final int loadAd() {
        return this.amazon - this.loadAd;
    }

    public final String toString() {
        StringBuilder sbSubscription = AbstractC14814l.subscription(this.yandex, this.loadAd, "IntRect.fromLTRB(", ", ", ", ");
        sbSubscription.append(this.crashlytics);
        sbSubscription.append(", ");
        sbSubscription.append(this.amazon);
        sbSubscription.append(")");
        return sbSubscription.toString();
    }

    public final long yandex() {
        return (((long) ((loadAd() / 2) + this.loadAd)) & 4294967295L) | (((long) ((amazon() / 2) + this.yandex)) << 32);
    }
}
