package defpackage;

/* JADX INFO: renamed from: lًؑؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7708l {
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C7708l(long j, long j2, long j3, long j4, long j5, long j6) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7708l)) {
            return false;
        }
        C7708l c7708l = (C7708l) obj;
        return C9735l.crashlytics(this.yandex, c7708l.yandex) && C9735l.crashlytics(this.loadAd, c7708l.loadAd) && C9735l.crashlytics(this.crashlytics, c7708l.crashlytics) && C9735l.crashlytics(this.amazon, c7708l.amazon) && C9735l.crashlytics(this.purchase, c7708l.purchase) && C9735l.crashlytics(this.billing, c7708l.billing);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.billing) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31);
    }
}
