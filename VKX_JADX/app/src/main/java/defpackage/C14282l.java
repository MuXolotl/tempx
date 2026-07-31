package defpackage;

/* JADX INFO: renamed from: lٓٝؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14282l {
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C14282l(long j, long j2, long j3, long j4, long j5, long j6) {
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
        if (obj == null || !(obj instanceof C14282l)) {
            return false;
        }
        C14282l c14282l = (C14282l) obj;
        return C9735l.crashlytics(this.yandex, c14282l.yandex) && C9735l.crashlytics(this.loadAd, c14282l.loadAd) && C9735l.crashlytics(this.crashlytics, c14282l.crashlytics) && C9735l.crashlytics(this.amazon, c14282l.amazon) && C9735l.crashlytics(this.purchase, c14282l.purchase) && C9735l.crashlytics(this.billing, c14282l.billing);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.billing) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31);
    }

    public final C14282l yandex(long j, long j2, long j3, long j4, long j5, long j6) {
        return new C14282l(j != 16 ? j : this.yandex, j2 != 16 ? j2 : this.loadAd, j3 != 16 ? j3 : this.crashlytics, j4 != 16 ? j4 : this.amazon, j5 != 16 ? j5 : this.purchase, j6 != 16 ? j6 : this.billing);
    }
}
