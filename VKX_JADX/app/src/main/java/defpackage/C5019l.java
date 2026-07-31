package defpackage;

/* JADX INFO: renamed from: lٜؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5019l {
    public final long amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final Object yandex;

    public C5019l(Object obj, int i, int i2, long j, int i3) {
        this.yandex = obj;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = j;
        this.purchase = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5019l)) {
            return false;
        }
        C5019l c5019l = (C5019l) obj;
        return this.yandex.equals(c5019l.yandex) && this.loadAd == c5019l.loadAd && this.crashlytics == c5019l.crashlytics && this.amazon == c5019l.amazon && this.purchase == c5019l.purchase;
    }

    public final int hashCode() {
        return ((((((((this.yandex.hashCode() + 527) * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + ((int) this.amazon)) * 31) + this.purchase;
    }

    public final boolean loadAd() {
        return this.loadAd != -1;
    }

    public final C5019l yandex(Object obj) {
        if (this.yandex.equals(obj)) {
            return this;
        }
        return new C5019l(obj, this.loadAd, this.crashlytics, this.amazon, this.purchase);
    }

    public C5019l(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C5019l(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C5019l(Object obj) {
        this(-1L, obj);
    }
}
